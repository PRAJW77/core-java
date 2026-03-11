class Printer{

    String[] tasks;
    PrinterItem[] printers;

    Printer(String[] tasks, PrinterItem[] printers){
        this.tasks = tasks;
        this.printers = printers;
    }

    void printInfo(){

        System.out.println("=====Printer details=====");

        if(this.tasks != null){
            System.out.println("Tasks length: " + this.tasks.length);

            for(String task : this.tasks){
                System.out.println("Task: " + task);
            }
        }

        if(this.printers != null){
            System.out.println("Printers length: " + this.printers.length);

            for(PrinterItem printer : this.printers){
                printer.getInfo();
            }
        }
    }
}