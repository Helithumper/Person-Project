public class Cell{
	//Instance Fields
	//String [] Contacts = new String [8];
	private String Manufacturer;
	private String Model;
	private String Carrier;
	private double priceUnlocked;
	//Address address1 = new Address();
	//Person person1 = new Person();
	
	
	//Constructor
	public Cell() {}
	
	//Assessors
	public String getManufacturer() {return Manufacturer;}
	public String getModel() {return Model;}
	public String getCarrier() {return Carrier;}
	public double getpriceUnlocked() {return priceUnlocked;}
	
	//Mutators
	public void setManufacturer(String m) {Manufacturer = m;}
	public void setModel(String mo) {Model = mo;}
	public void setCarrier(String c) {Carrier = c;}
	public void setpriceUnlocked(double pu) {priceUnlocked = pu;}
	//Methods
	public String ring() {
		return "Ring, Ring";
	}

	//toString();
	public String toString() {
		setManufacturer("Apple");
		setModel("IPhone 6+ 128 GB");
		setCarrier("NONE");
		setpriceUnlocked(940.00);
		return "###########################################\n" + "Manufacturer: " + getManufacturer() + "\nModel: " + getModel() + "\nCarrier: " + getCarrier() + "\nPriceUnlocked: $" + getpriceUnlocked() + "\n###########################################";
	}
}
