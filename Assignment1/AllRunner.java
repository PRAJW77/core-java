class AllRunner{
	
	 public static void main(String...args)
	 {
		ZooCreator.getZoo();
		ZooCreator.getZoo("Elephant");
		ZooCreator.getZoo("Lion",3);
		
		MuseumCreator.getMuseum();
		MuseumCreator.getMuseum("Civic Museum");
		MuseumCreator.getMuseum("Memorial Museum",80);
		
		StadiumCreator.getStadium();
		StadiumCreator.getStadium("indoor");
		StadiumCreator.getStadium("chinnaswamy",10);
		StadiumCreator.getStadium("kantirava",6,true);
	 }
}