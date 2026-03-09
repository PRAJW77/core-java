class MuseumCreator{
	
	static void getMuseum()
	{
	System.out.println("creating Museum");
	Museum museum=new Museum("international");
	System.out.println("Museum name:"+museum.name);
    System.out.println("Museum is creacted successfully...");	
	System.out.println("=======================");
	
	}
	
	static void getMuseum(String name)
	{
	System.out.println("creacting anonther Museum")	;
	Museum museum = new Museum(name);
	System.out.println("museum name:"+museum.name);
	System.out.println("creacting Museum using name");
	System.out.println("=======================");
	
	}
	
	
	static void getMuseum(String name,int price)
	{
		
		System.out.println("again museumuseum creacted");
		Museum museum=new Museum(name,price);
		System.out.println("museum name:"+ museum.name+ "museummentry price:"+museum.price);
		System.out.println("creacted Museum using name,price");
	}
	
	
	
}