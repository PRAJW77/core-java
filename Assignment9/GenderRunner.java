class GenderRunner{
	public static void main(String[] args){
		
		String[] genders = new String[3];
		Gender gender = new Gender(genders);
		gender.save("Male");
		gender.save("Female");
		gender.save("Others");
		System.out.println("===\n===");
		
		gender.printInfo();
		System.out.println("===\n===");
		
		gender.sortAscending();
		System.out.println("Sorting in Ascending order");
        gender.printInfo();
		
		System.out.println("===\n===");

		gender.sortDescending();
		System.out.println("Sorting in descending order ");
        gender.printInfo();
	}
}