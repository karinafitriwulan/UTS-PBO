
/**
 *  Nama    : Karina Fitriwulandari Ilham.
 *  Stb     : 13020180137
 *  Kelas   : B2
 *  waktu   : 28 April 2020
 */

//UTS nomor 4
//Konversi cm ke inch
import java.util.Scanner;
public class uts4 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int cm; float inch;
        System.out.print("masukan ukuran dalam cm : ");
        cm = masuk.nextInt();
        inch = cm/2.54f;
        System.out.println("Hasil dari "+cm+" cm = "+inch+" inch");
    }
}
