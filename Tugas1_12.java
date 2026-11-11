import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Masukkan jumlah mahasiswa: ");
        int banyak = input.nextInt();
        int[] nilai = new int[banyak];
        int total = 0;
        int rata2;
        int lulus=0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) +" : ");
            nilai[i] = input.nextInt();
            total += nilai[i];
            if (nilai[i] > 70) {
                lulus++;
            }
        }
        rata2 = total / nilai.length;
        System.out.println("Total nilai: "+total);
        System.out.println("Rata-rata: "+ rata2);
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i]; 
            if (nilai[i] < terendah) terendah = nilai[i];    
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
            
    }
}
