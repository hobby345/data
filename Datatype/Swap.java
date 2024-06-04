package dataTypeVar;

public class Swap {
    
    public static void main(String[] args) {
        int number = 78;
        int anothernumber =32;

       int temp = anothernumber;
        anothernumber =number;
        number=temp;
        System.out.println(number);
         System.out.println(anothernumber);
    }
}
