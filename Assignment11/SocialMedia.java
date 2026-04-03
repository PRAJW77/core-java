class SocialMedia extends Reel{

    SocialMedia(String platform, int duration, String creator){
        super(platform,duration,creator);
    }

    SocialMedia(){
        super("Instagram",10,"Ajay");
    }

    SocialMedia(String platform) {
        super(platform, 40, "Manasa");
    }
}