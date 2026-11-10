import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Masukkan jumlah mahasiswa: ");
        int banyakMHS = input.nextInt();
        int[] nilaiMHS = new int[banyakMHS];
        int total = 0;
        double rata2;
        int lulus=0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) +" : ");
            nilaiMHS[i] = input.nextInt();
            total += nilaiMHS[i];
            if (nilaiMHS[i] > 70) {
                lulus++;
            }
        }
        rata2 = (double) total / nilaiMHS.length;
        System.out.println("Total nilai: "+total);
        System.out.println("Rata-rata: "+ rata2);
        System.out.println("Mahasiswa lulus: "+lulus);
        int tertinggi = nilaiMHS[0];
        int terendah = nilaiMHS[0];
        for (int i = 1; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > tertinggi) tertinggi = nilaiMHS[i]; 
            if (nilaiMHS[i] < terendah) terendah = nilaiMHS[i];    
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        if (rata2 >= 85) {
            System.out.println("Predikat kelas SANGAT BAIK");
        }else if (rata2 >= 75){
            System.out.println("Predikat kelas BAIK");
        }else{
            System.out.println("Predikat kelas PERLU PENDAMPINGAN");
        }
        
    }
}
