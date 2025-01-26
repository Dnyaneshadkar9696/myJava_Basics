import java.util.Scanner;
public class INPUTINJAVA {
    public static void main(String[] args){
//         Take the number from the user and check if it is divisibele 67by 2
        Scanner ti = new Scanner(System.in);
        System.out.println("Enter the numeric value : ");
        int a = ti.nextInt();
        if( a%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is ODD");
        }

    }
}
