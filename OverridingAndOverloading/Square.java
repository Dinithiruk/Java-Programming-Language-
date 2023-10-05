package OverridingAndOverloading;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String name){
        System.out.println("I am a " + name);
    }
}
