public class Exit {
    public Exit() throws  InterruptedException{
        System.out.print("Exiting");
        int i = 5;
        while(i>0){
            System.out.print(".");
            try {
                Thread.sleep(450);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }
        System.out.println("\nThanks for using Hotel Management System😊");
    }
}
