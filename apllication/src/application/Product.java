package application;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Product {
	private BooleanProperty selected = new SimpleBooleanProperty(false);


	private String date;
	private String Destination;
	private String partyId;
	private String partyName;
	private boolean place;
	private String ServiceProvider;

	 public BooleanProperty selectedProperty() {
         return selected;
     }

     public void setSelected(boolean selected) {
         this.selected.set(selected);
     }

     public boolean isSelected() {
         return selected.get();
     }
	
	public String getServiceProvider() {
		return ServiceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		ServiceProvider = serviceProvider;
	}

	

	@Override
	public String toString() {
		return "Product [selected=" + selected + ", date=" + date + ", Destination=" + Destination + ", partyId="
				+ partyId + ", partyName=" + partyName + ", place=" + place + ", ServiceProvider=" + ServiceProvider
				+ "]";
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public boolean getPlace() {
		return place;
	}

	public void setPlace(boolean b) {
		this.place = b;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public Product(String partyId, String partyName, boolean place, String date) {
		this.partyId = partyId;
		this.partyName = partyName;
		this.place = place;
		this.date = date;

	}
}
