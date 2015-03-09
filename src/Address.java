
public class Address{

	//Instance Fields
	
	//House #
	private int houseNumber;
	
	//Street Name
	private String [] StreetName = {"Nut Trace","Long View Escape","West Hitherfield Terrace","North Achorn Dell","North Loraine Road","South Morton Avenue","Northwest Tam O Shanter","West Romeo Passage","Glenmeadow Cove West","South Eastern Arterial","Great Sutton Rise","Hearn Gate"};
	
	//City
	private String [] City = {"Janhurst","Eribourne","Magepond","Goldmere","Southedge","Violetmaple","Highness","Freycliff","Eastness","Appledale","Bluebeach","Clearmeadow","Linmeadow","Lightwald"};
	
	//State
	private String [] State = {"Alabama","Alaska" ,"Arizona" ,"Arkansas" ,"California","Colorado" ,"Connecticut" ,"Delaware" ,"Florida","Georgia" ,"Hawaii" ,"Idaho" ,"Illinois"," Indiana" ,"Iowa" ,"Kansas" ,"Kentucky" ,"Louisiana" 
								,"Maine" ,"Maryland" ,"Massachusetts" ,"Michigan" ,"Minnesota" ,"Mississippi" ,"Missouri" ,"Montana", "Nebraska" ,"Nevada" ,"New Hampshire" ,"New Jersey" ,"New Mexico" ,"New York" ,"North Carolina" ,
								"North Dakota" ,"Ohio" ,"Oklahoma" ,"Oregon" ,"Pennsylvania", "Rhode Island" ,"South Carolina" ,"South Dakota" ,"Tennessee" ,"Texas" ,"Utah" ,"Vermont" ,"Virginia" ,"Washington" ,"West Virginia" 
								,"Wisconsin" ,"Wyoming"};
	//Zip Code
	private int zipCode;
		
	//Phone Number Area Code
	private int [] areaCode = {205,907,480,479,209,303,203,302,239,229,671,808,208,217,219,319,316,270,225,207,240,339,231,218,228,314,406,308,702,603,201,505,212,252,701,216,405,458,215,401,803,605,423,210,385,802,340,276,206,304,262,307};
	
	//State-Area Connector:
	
	private int sac;
	//Constructor
	public Address() {}
	

	//Assessors
	public int getHouseNumber() {
		return houseNumber;
	}

	public int getZipCode() {
		return zipCode;
	}

	//Mutators
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setSAC(int sa) {this.sac = sa;}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	//Algorithms
	//Generates Random Zip Code
	public int randomZipCode() {
		int zc = (int)(10000 + (int)(Math.random() * ((99999 - 10000) + 1)));
		setZipCode(zc);
		return zc;
	}
	
	//Generates Random House Number
	public int randomHouseNumber() {
		int hn = (int)(Math.random() * 999);
		setHouseNumber(hn);
		return hn;
	}
	
	//Gets a random Street name from StreetName Array
	public String retrieveStreetName() {
		int index = (int)(Math.random() * 12);
		String sn = StreetName[index];
		return sn;
	}
	//Gets a random state from State Array
	public String retrieveState() {
		int index = (int)(Math.random() * 50);
		String s = State[index];
		setSAC(index);
		return s;
	}
	//Gets a random City from City Array
	public String retrieveCity() {
		int index = (int)(Math.random() * 14);
		String c = City[index];
		return c;
	}
	//sets phone number
	public String retrievePhoneNum() {
		int a = areaCode[sac];
		return "(" + a + ")"  + (100 + (int)(Math.random() * ((999 - 100) + 1))) + "-" + (1000 + (int)(Math.random() * ((9999 - 1000) + 1)));
	}
	//toString()
	public String toString() {
		return "Address: " + randomHouseNumber() + " " + retrieveStreetName() + ", " + retrieveCity() + " " + retrieveState() + ", " + randomZipCode() + "\nPhone Number " + retrievePhoneNum();
	}
}
