import java.util.Scanner;

public class BMI_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, kilo, BMI;

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo= input.nextDouble();

        BMI= kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz: "+BMI);

        if(BMI>0 && BMI<=18.4){
            System.out.println("Zayıf!");
        }

        else if (BMI>=18.5 && BMI<=24.9) {
            System.out.println("Normal!");
        }

        else if (BMI>=25 && BMI<=29.9) {
            System.out.println("Fazla kilolu!");
        }

        else if (BMI>=30 && BMI<=34.9) {
            System.out.println("Birinci derece obezite!");
        }

        else if (BMI>=35 && BMI<=44.9) {
            System.out.println("İkinci derece obezite!");
        }

        else if (BMI>=45) {
            System.out.println("Aşırı Şişman. Üçüncü derece obezite!");
        }

        else{
            System.out.println("Geçersiz değer girilmiştir. Değerlerinizi kontrol ediniz.");
        }
    }
}
