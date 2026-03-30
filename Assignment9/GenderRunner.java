class GenderRunner{
	public static void main(String[] args){
		
		String[] genders = new String[3];
		Gender gender = new Gender(genders);
		gender.save("Male");
		gender.save("Female");
		gender.save("Others");
		System.out.println("#################");
		
		gender.Display();
		System.out.println("#################");
		
		gender.sortAscending();
		System.out.println("Sort Ascending order");
        gender.Display();
		
		System.out.println("#################");

		gender.sortDescending();
		System.out.println("Sort descending order ");
        gender.Display();
	}
}