package dataTypeVar;

public class Fib {
    public static void main(String[] args) {
        int first =0, second=1,next;
        for(int i=0;i<10;i++){
            next = first + second;
            first=second;
            second =next;
            System.out.println(next);
        }

    }
}
