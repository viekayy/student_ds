import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        int n = 7;
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        print(n);
    }
    static void print(int n){
        
        for(int i=1;i<=n;i++){
            char ch = 65;  // 'A'
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;                
            }
            System.out.println();
        }
    }
}
