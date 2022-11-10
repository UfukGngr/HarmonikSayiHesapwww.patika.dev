import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=1;
        double h=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Harmonik hesaplaması yapılacak sayıyı giriniz: ");
        n=scan.nextInt();

        for(int i=1; i<=n;i++){//int i double a da çevrilerek bu sorun ortadan kaldırılabilir.
            h+=(1.0/i);
        }
        System.out.println(h);

    }
}