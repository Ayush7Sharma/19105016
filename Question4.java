import java.util.*;
public class Question4 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        System.out.println(k);
        while(k!=1){
            if(k%2==0)
                k=k/2;
            else
                k=3*k+1;
            System.out.println(k);
        }
    }
}
