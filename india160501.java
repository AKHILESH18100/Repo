import java.util.*;
class rdec extends Exception{
    rdec(String msg){
        super(msg);
    }
}
public class india160501 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            int a= sc.nextInt();
        int b= sc.nextInt();
        if(a+b !=7){
            throw new Exception("luckey seven ");

        }
        else{
            System.out.println("you won ");
        }
    }
    catch(Exception e){
        System.out.println("you lose");
    }
    }
}

