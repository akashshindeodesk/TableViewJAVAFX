package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TableViewSample extends Application {

	private TableView table = new TableView();
	public static CheckBox select_all;

	public static void main(String[] args) {
		launch(args);
	}

	private String selectedTopDate = null;
	static ObservableList<Product> criteriaList = null;

	@Override
	public void start(Stage stage) {

		Scene scene = new Scene(new Group());
		stage.setTitle("Table View Sample");
		stage.setWidth(500);
		stage.setHeight(500);

		final Label label = new Label("Address Book");
		label.setFont(new Font("Arial", 20));
		table.setMinWidth(400);

		table.setEditable(true);

		
		

		
		
		TableColumn firstNameCol = new TableColumn("Check Box");
		TableColumn lastNameCol = new TableColumn("Last Name");
		TableColumn datePicker = new TableColumn("DatePicker");

		//Step 1 // declare selectdate String
		//Sep 2 add listener to selecta all
		// Date Picker top issue
		DatePicker dp = new DatePicker();
		dp.setOnAction(event -> {
			selectedTopDate = dp.getValue().toString();
			for (Product item : criteriaList) {
				new UpdateDateCtrl("sdc");
			}
			table.refresh();
		});
		
		
		datePicker.setCellFactory(new Callback<TableColumn<Product, Product>, TableCell<Product, Product>>() {
			public TableCell<Product, Product> call(TableColumn<Product, Product> param) {
				return new UpdateDateCtrl("Update");
			}
		});

		firstNameCol.setMinWidth(100);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("Destination"));

		TableColumn<Customers, Boolean> checkColumn = new TableColumn<Customers, Boolean>("Check");
		checkColumn.setCellValueFactory(new PropertyValueFactory<>("selected"));

		checkColumn.setMinWidth(0);
		checkColumn.setMaxWidth(30);
		 checkColumn.setCellFactory(CheckBoxTableCell.forTableColumn(checkColumn));
		/*checkColumn.setCellFactory(CheckBoxTableCell.forTableColumn(new Callback<Integer, ObservableValue<Boolean>>() {
			public ObservableValue<Boolean> call(Integer param) {
				System.out.println("clicked");
				if (select_all.isSelected()) {
					desSelectdCheckbos();
				}
				return criteriaList.get(param).getPlace();
			}
		}));
*/
		select_all = new CheckBox("Select all");
		select_all.setOnAction(e -> selectAllBoxes(e));

		criteriaList = FXCollections.observableArrayList(new Product("adadsa", "asda", false, "12,12,12"), new Product("adadsa", "asda", false, "12,12,12"),new Product("adadsa", "asda", false, "12,12,12"),
				new Product("adadsa", "asda", false, "12,12,12"));

		table.setEditable(true);
		firstNameCol.setEditable(true);
		lastNameCol.setEditable(true);

		table.getColumns().addAll(checkColumn, firstNameCol, lastNameCol, datePicker);

		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));

		Button saveButton = new Button("save");
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				table.setItems(criteriaList);
				ObservableList<Product> data = table.getItems();
				System.out.println("Table Data size: " + table.getItems().size());
				for (int i = 0; i < data.size(); i++) {
					System.out.println(data.get(i).toString());
					data.get(i).isSelected();
					System.out.println(data.get(i).isSelected());
				}
			}
		});
		vbox.getChildren().addAll(dp, select_all, saveButton, label, table);
		((Group) scene.getRoot()).getChildren().addAll(vbox);

		stage.setScene(scene);
		stage.show();
	}

	public static void selectAllBoxes(ActionEvent e) {
		// Iterate through all items in ObservableList
		for (Product item : criteriaList) {
			item.setSelected(((CheckBox) e.getSource()).isSelected());
			System.out.println(item.isSelected());
		}

	}

	public static void desSelectdCheckbos() {
		System.out.println("deselecte");
		select_all.setSelected(false);
		boolean isSelected  = false;
		
		for (Product item : criteriaList) {
			if(item.isSelected()){
				isSelected = true;
			}else{
				isSelected = false;
			}
			
			System.out.println(item.isSelected());
		}
	}

	public static final LocalDate LOCAL_DATE(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		return localDate;
	}

	private class UpdateDateCtrl extends TableCell<Product, Product> {
		private DatePicker cellButton;

		UpdateDateCtrl(String text) {
			cellButton = new DatePicker();

			cellButton.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					cellButton.setStyle(" -fx-base :lightgreen;");
					cellButton.setUserData(new Date());
					Product customers = getTableView().getItems().get(getIndex());
					customers.setDate(cellButton.getValue().toString());
				}
			});
		}

		@Override
		protected void updateItem(Product alarmConfig, boolean empty) {
			super.updateItem(alarmConfig, empty);
			if (!empty) {
				setGraphic(cellButton);
				cellButton.setVisible(true);
				if (selectedTopDate != null) {
					cellButton.setValue((LOCAL_DATE(selectedTopDate)));
					Product customers = getTableView().getItems().get(getIndex());
					customers.setDate(selectedTopDate);
				} else {
					cellButton.setValue(cellButton.getValue());
				}
				cellButton.setStyle("-fx-base: green;");
			}
		}
	}

}