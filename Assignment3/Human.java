class Human{
	String brain;
	boolean isWorking;
	
	Human(){
		System.out.println("no args const");
	}
	
	Human(String brain){
		this.brain=brain;
	}
	
	static void read(int age){
		System.out.println("Hello Human"+age);
	}
	

	void monitor(String name){
		System.out.println("Running Instance Method"+name);
	}
}