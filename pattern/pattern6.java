public class pattern6 {
    public static void main(String[] args) {
        int n = 7;

        int spc = n/2;
        int str = 1;
        int count =1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            int temp  = count;
            for(int j=1;j<=str;j++){
                System.out.print(temp+++" ");
            }
            System.out.println();

            if(i<(n+1)/2){
                count++;
                spc--;
                str+=2;
            }else{
                count--;
                spc++;
                str-=2;
            }
        }
    }
    
}
