/**
 * Lab 828 Homework
 *
 * @author (Grace Jau)
 * @version (828)
 */
import java.util.Scanner;
public class Homework828
{
    public static void main(){// instance variables - replace the example below with your own
    
        for(int i = 1; i<=5; i++){
            for(int m = i-1; m>0; m-=1){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        for(int i = 1; i<=7; i+=2){
            for(int spaces = (7-i)/2; spaces>0; spaces-=1){
                    System.out.print(" ");
                }
            for(int m = i; m>0; m-=1){
            System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i<=5; i+=2){
            for(int spaces = i/2+1; spaces>0; spaces-=1){
                    System.out.print(" ");
                }
            for(int m = 6-i; m>0; m-=1){
            System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int i = 0; i<=99; i++){
            System.out.print("i:"+i+"   ");
            if(i%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ((reader.nextInt())/2)*2;
        reader.close();
        int total = 0;
        for(int integer = num; integer>=2; integer-=2){
            total += integer;
        }
        System.out.println(total);
        System.out.println(((num+2)*(num/2))/2);

    }
}


