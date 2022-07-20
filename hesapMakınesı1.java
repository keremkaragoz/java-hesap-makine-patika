import java.util.Scanner;


public class hesapMakınesı1 {
    public static void main(String[] args) {
        int n1, n2, selecet;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("Ikinci Sayiyi giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciniz : ");
        selecet = inp.nextInt();

        switch (selecet) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Sonuc : "+(n1 / n2));
                }else {
                    System.out.println("Sayi 0'a Bolunemez.Lutfen Tekrar Deneyiniz.");

                }
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");

        }

    }

}
