package Thread;

public class Chef extends Thread{
    private String name;
    private String dish;
    private int cookingTime;

    public Chef(String name,String dish,int cookingTime){
        this.name=name;
        this.dish=dish;
        this.cookingTime=cookingTime;
    }
    
    public void run(){
        System.out.println(name + " is preapring the " + dish + " dish");

        //try catch bloack for exception handling 
        try {
            Thread.sleep(cookingTime);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " has finished preparing the " + dish);
    }
}
