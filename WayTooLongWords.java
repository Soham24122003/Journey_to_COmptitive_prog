import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            String st = sc.next();
            int x = st.length();
            if(x>10){
                System.out.println(st.charAt(0)  + (x-2)+  st.charAt(x-1));
            }
            else{
                System.out.println(st);
            }
            n--;
        }

    }
}
