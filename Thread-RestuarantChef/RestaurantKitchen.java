package Thread;

public class RestaurantKitchen {
    public static void main(String[] args) {
        //cookingtime is in miliseconds (1000=1ms)
        Chef chef1 = new Chef("Chef Timothee ","Fish Curry",5000);
        Chef chef2 = new Chef("Chef Barbara", "Egg Noodle" , 4000);
        Chef chef3 = new Chef("Chef Tanya","Dhal Curry",6000);

        chef1.start();
        chef2.start();
        chef3.start();

        try {
            chef1.join();
            chef2.join();
            chef3.join();
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        System.out.println("All the dishes are ready.");
    }
}
