public class Person {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//instance Fields
	private String name = "";
	private String gender = "";
	public String [] MaleNames = {"Thomas", "Tim", "Bill", "Colby", "Dennis", "Phil", "Chuck Norris", "Scoots"};
	public String [] FemaleNames = {"Kate", "Phyllis", "Kim", "Billie", "Sarah", "Courtney" };
	private String [] Degrees = {"No High School Diploma", "High School Diploma Only", "College Degree"};
	private String [] Race = {"White" ,"Black", "Latino", "Asian", "Other"};
	private int age;
	private boolean hasChildren = false;
	private Address address1 = new Address();
	private String [] Transport = {"Drives Car to Work", "Rides in a Car to Work", "Uses Public Transit", "Walks/Bikes", "Other"};
	//private String [] zodiac = {"Happy", "Sad","Greedy"};
	private String [] Parties = {"Democat", "Republican"};
	



	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Constructors
	public Person() {}
	
	public Person(String n) {
		name = n;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Assessors
	public String getResult() { return name; }
	public int getAge() {return age;}
	public Boolean getHasChildren() {return hasChildren;}
	public Address getAddress1() {
		return address1;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Mutators
	public void setResult(String r) { name = r; }
	public void setAge(int a) { age = a; }
	public void setHasChildren(Boolean h) {hasChildren = h;}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Algorithms
	//http://quickfacts.census.gov/qfd/states/00000.html
	//Gets gender based upon a dice roll where if it lands on any number less than or equal to 50.8, the person is female
	public String getGender() {
		double genderInt = (Math.random() * 100);
		//System.out.println(genderInt);
		if (genderInt <= 50.8) {
			gender = "Female";
			
		}
		else if (genderInt > 50.8) {
			gender = "Male";
			
		}
		return gender;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Gets name based upon a random position in an array that is based off of the gender of the person
	public String getName() {
		//sets # of items in [names]
		String n = "";
		int index1 = (int)(Math.random() * 8);
		int index2 = (int)(Math.random() * 6);
		if (gender == "Male") {
			n = MaleNames[index1];
			
		}
		else if (gender == "Female") {
			n = FemaleNames[index2];
			
		}
		return n;
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*public String getZodiac() {
		//Sets # of items in [emotions]
		int x = 3;
		int index2 = (int) (Math.random() * x);
		String e = zodiac[index2];
		return e;
	}*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Write a method that randomly determines a person's age
	public int guessAge() {
		//How to properly use Math.random()
		int age = (int) (Math.random() * 100);
		return age;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean isMarried() {
		int ans = (int)(Math.random() * 100);
		if(age < 20 && ans < 5) {return true; }
		else if((age > 20 && age < 50) && ans <= 30) {return true; }
		else {return false;}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean hasChildren() {
		int ans = (int)(Math.random() * 100);
		if((age < 18 && age >=5) && ans <= 5) {
			return true;
		}
		else if ((age >= 18 && age < 24) && (ans > 0 && ans < 14)) {
			return true;
		}
		else if ((age >= 24 && age < 45) && (ans > 0 && ans < 62)) {
			return true;
		}
		else if ((age >= 45) && (ans > 0 && ans < 84)) {
			return true;
		}
		else {return false;}
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Returns education level based upon statistics from http://quickfacts.census.gov/qfd/states/00000.html
	public String getEducation() {
		String dg = null;
		if(age >= 18) {
			int ans = (int)(Math.random()*100);
			if(ans <= 14.3) { 
				dg = Degrees[0];
			}
			else if(ans >14.3 && ans <= 71.5) {
				dg =  Degrees[1];
			}
			else if(ans > 71.5) {
				dg =  Degrees[2];
			}
		}
		else {dg = Degrees[0];}
		return dg;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Returns Race based upon statistics from http://www.designinfographics.com/social-media-infographics/us-facebook-demographic-study
	public String getRace() {
		String r = null;
		int ans = (int)(Math.random()*100);
		if(ans <= 70) { 
			r = Race[0];
		}
		else if(ans >70 && ans <= 80) {
			r =  Race[1];
		}
		else if(ans > 80 && ans <= 90) {
			r =  Race[2];
		}
		else if(ans > 90 && ans <= 97) {
			r =  Race[3];
		}
		else {r = Race[4];}
		return r;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Returns a social security number
	public String getSSN() {
		return (100 + (int)(Math.random() * ((999 - 100) + 1))) + "-" + (10 + (int)(Math.random() * ((99 - 10) + 1))) + "-" + (1000 + (int)(Math.random() * ((9999 - 1000) + 1)));
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Returns a mode of Transport based on data from: www.investtoronto.ca/Quality-of-Life/Transportation.aspx
	public String getTransport() {
		
		String t = "";
		int i = 1;
		while(i==1){
			int ans = (int) (Math.random() * 100);
			if((ans <=64)&& age>=16) {//By Driving a Car
				t= Transport[0];
				i++;
			}
			else if(ans>64 && ans <=71) {//By Riding in a car
				t= Transport[1];
				i++;
			}
			else if(ans>71 && ans <= 93) {//Public Transport
				t= Transport[2];
				i++;
			}
			else if(ans>93 && ans <=99) {//Walks/Bikes
				t= Transport[3];
				i++;
			}
			else if(ans==100) {//Other?
				t= Transport[4];
				i++;
			}
			
		}
		return t;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Returns the Political Affiliations of the person using data from www.gallup.com/poll/15370/party-affiliation.aspx
	private String getAffiliaton() {
		int ans = (int)(Math.random() * 89);
		String t = "";
		if(ans>=47) {
			t = Parties[0];
		}
		else{
			t = Parties[1];
		}
		return t;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//toString()
	public String toString() {
		return "###########################################\n" + "Name: " + getName() + "\n" + "Gender: " + gender + "\n" + "Age: " + guessAge() + "\n" + "Has Children: " + hasChildren() + "\n" + "Is Married: " + isMarried() + "\n" + "Education: "+getEducation() + "\n" + "Race: " + getRace() + "\n" + address1.toString() + "\n" + "Social Security #: " + getSSN() + "\n" + "Mode of Transportation: " + getTransport() + "\n" + "Political Affiliation: " + getAffiliaton() + "\n###########################################";
	}
}
