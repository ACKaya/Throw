import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws ArithmeticException{
    try{
        checkAge();
    }
    catch (Exception e) {
        System.out.println(e.toString());
    }

    }
    public static void checkAge()throws ArithmeticException{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age= scan.nextInt();
        if(age<18){
            throw new ArithmeticException("yanlis deger girdiniz");
        }
        System.out.println(age);
    }
}
