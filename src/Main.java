import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        int c;


        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Tam Sayı Değerini Giriniz :");
        a = input.nextDouble();

        System.out.print("İkinci Tam Sayı Değerini Giriniz :");
        b = input.nextDouble();

        System.out.print("(1)-Toplama     (2)-Çıkarma\n(3)-Çarpma     (4)-Bölme\n");
        System.out.print("Yukarıda ki Operatör Numaralarından Birini Giriniz :");
        c = input.nextInt();

        switch (c){
            case 1:
                System.out.println("Toplama İşleminin Sonucu = " + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu = " + (a-b));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu = " + (a*b));
                break;
            case 4:
                System.out.println("Bölme İşleminin Sonucu = " + (a/b));
                break;
            default:
                System.out.println("Geçersiz Bir Operatör Girişi Yaptınız.");
        }

    }
}