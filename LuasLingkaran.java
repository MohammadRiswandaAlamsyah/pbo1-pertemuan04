import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner lingkaran = new Scanner(System.in);
        double nilai;
        Scanner panjang = new Scanner(System.in);
        int rd;

        System.out.println("Masukkan Nilai: "); 
        nilai = lingkaran.nextDouble();

        System.out.println("Panjang Jari-Jari (1)/Panjang Diameter (2):"); 
        rd = panjang.nextInt();

        double luas;

        if (rd==1) {
            luas = 3.14 * nilai * nilai;
            System.out.println("Luas Lingkaran dengan panjang jari-jari (r) = "+nilai+" Cm adalah = "+luas+" Cm2");
        }else if (rd==2) {
            luas = 0.25 * 3.14 * nilai * nilai;
            System.out.println("Luas Lingkaran dengan panjang diameter (d) = "+nilai+" Cm adalah = "+luas+" Cm2");
        }else{
            System.out.println("Maaf, Menu Pilihan Tidak Ada.");
        }
    }

}