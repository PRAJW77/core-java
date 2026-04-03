class Task11Runner{
	public static void main (String [] args){
	System.out.println("\n------Reel Using All Arguments in Constructor-----");
        SocialMedia reel1=new SocialMedia("Instagram",10,"Ajay");
        System.out.println("Platform:"+ reel1.platform);
        System.out.println("Duration:"+ reel1.duration);
        System.out.println("Creator:"+ reel1.creator);

        System.out.println("\n------Reel Using No Arguments in Constructor-----");
        SocialMedia reel2=new SocialMedia();
        System.out.println("Platform:"+ reel2.platform);
        System.out.println("Duration:"+ reel2.duration);
        System.out.println("Creator:"+ reel2.creator);

        System.out.println("\n------Reel Using 1 Argument in Constructor-----");
        SocialMedia reel3=new SocialMedia("YouTube");
        System.out.println("Platform:"+ reel3.platform);
        System.out.println("Duration:"+ reel3.duration);
        System.out.println("Creator:"+ reel3.creator);
}
}