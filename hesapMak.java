import java.util.Scanner;
public class hesapMak {
    public static void main(String[] args){
        double no1,no2;
        int select;


        Scanner input=new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz=");
        no1=input.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz=");
        no2=input.nextDouble();
        System.out.println("Bir Sayı Giriniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam:"+(no1+no2));
                break;
            case 2:
                System.out.println("Çıkarma:"+(no1-no2));
                break;
            case 3:
                System.out.println("Çarpma:"+(no1*no2));
            break;
            case 4:
            if (no2!=0){
                System.out.println("Bölme:"+(no1/no2));}
            else System.out.println("Hİçbir Sayı 0'a Bölünemez!");

            break;
            default:
                System.out.println("Hatalı Seçim Yaptınız!");

        }
    }


}
