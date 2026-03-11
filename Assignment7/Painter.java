class Painter{
    String[] works;
    Paint[] paints;

    Painter(String[] works, Paint[] paints) {
        this.works = works;
        this.paints = paints;
    }

    void printInfo() {
        System.out.println("\n=====Painter details=======");
        if (this.works != null) {
            System.out.println("Works length: " + this.works.length);
            for (String work : works){
				System.out.println("Work: "+work);
			}
        }
        if (this.paints != null) {
            System.out.println("Paints length: " + this.paints.length);
            for (Paint paint : this.paints){
				paint.getInfo();
			}
        }
    }
}