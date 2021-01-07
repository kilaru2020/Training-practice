package practice;

public class Main{
    
    //instance initializer
    {
        System.out.println("Inside instance initializer");
    }
     
    //constructor
    public Main()       
    {
        System.out.println("Inside constructor");
    }
     
    public static void main(String[] args) {
        new Main();
    }
}
