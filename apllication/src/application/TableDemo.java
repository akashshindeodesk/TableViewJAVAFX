package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.Stage;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableDemo extends Application {

    private static ObservableList<Item> items = FXCollections.observableArrayList();

        public static void updateItems() {

        }
        public static void initTable(Stage stage) {
            //Create table and columns
            TableView<Item> table_items = new TableView<>();
            TableColumn<Item, Boolean> column_selected = new TableColumn<>();
            TableColumn<Item, String> column_name = new TableColumn<>("Name");
            TableColumn<Item, Integer> column_quantity = new TableColumn<>("Quantity");
            TableColumn<Item, Double> column_price = new TableColumn<>("Price");
            //Create checkbox
            CheckBox select_all = new CheckBox();
            //Create scene
            Scene scene = new Scene(table_items);

            //Add items to ObservableList
            items.addAll(new Item("Knife", 10, 20),
                    new Item("Fork", 10, 25),
                    new Item("Pork", 3, 100));

            //Make table editable
            table_items.setEditable(true);

            //Make one column use checkboxes instead of text
            column_selected.setCellFactory(CheckBoxTableCell.forTableColumn(column_selected));

            //Change ValueFactory for each column
            
            column_selected.setCellValueFactory(new PropertyValueFactory<>("selected"));
            column_price.setCellValueFactory(new PropertyValueFactory<>("averagePrice"));
            column_quantity.setCellValueFactory(new PropertyValueFactory<>("volume"));
            column_name.setCellValueFactory(new PropertyValueFactory<>("name"));

            //Use box as column header
            column_selected.setGraphic(select_all);

            //Select all checkboxes when checkbox in header is pressed
            select_all.setOnAction(e -> selectAllBoxes(e));

            //Add columns to the table
            table_items.getColumns().addAll(column_selected, column_name, column_quantity, column_price);

            table_items.setItems(items);
            stage.setScene(scene);


        }

        public static void selectAllBoxes(ActionEvent e) {

            //Iterate through all items in ObservableList
            for (Item item : items) {
                //And change "selected" boolean
                item.setSelected(((CheckBox) e.getSource()).isSelected());
            }

        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        initTable(primaryStage);
        primaryStage.show();
    }

    public static class Item {
    	 private BooleanProperty selected = new SimpleBooleanProperty(false);
         final private String name;
         final private double averagePrice;
         final private int volume;

         Item(String name, double averagePrice, int volume) {

             this.name = name;
             this.averagePrice = averagePrice;
             this.volume = volume;
         }

         public BooleanProperty selectedProperty() {
             return selected;
         }

         public void setSelected(boolean selected) {
             this.selected.set(selected);
         }

         public boolean isSelected() {
             return selected.get();
         }

         public String getName() {
             return name;
         }

         public double getAveragePrice() {
             return averagePrice;
         }

         public int getVolume() {
             return volume;
         }

        }
}