import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        double kenar1 = input.nextDouble();
        System.out.println("2.kenarı giriniz");
        double kenar2 = input.nextDouble();
        System.out.println("3.kenarı giriniz");
        double kenar3 = input.nextDouble();
        double u=(kenar1+kenar2+kenar3)/2;
        double alan=(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("u degeri="+u);
        System.out.println("Alan ="+alan);

    }
    }


