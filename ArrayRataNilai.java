import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMHS = new int[10];
        int total = 0;
        double rata2;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) +" : ");
            nilaiMHS[i] = input.nextInt();
            total += nilaiMHS[i];
        }
        rata2 = (double) total / nilaiMHS.length;
        System.out.println("Total nilai: "+total);
        System.out.println("Rata-rata: "+ rata2);
        int tertinggi = nilaiMHS[0];
        int terendah = nilaiMHS[0];
        for (int i = 1; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > tertinggi) tertinggi = nilaiMHS[i]; 
            if (nilaiMHS[i] < terendah) terendah = nilaiMHS[i];    
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
            
        for (int i = 0; i < nilaiMHS.length; i++) {       
            if (nilaiMHS[i] >= 85) {
                System.out.println("Nilai mahasiswa ke-"+i+" = "+nilaiMHS[i]+" SANGAT BAIK");
            }else if (nilaiMHS[i] >=75) {
                System.out.println("Nilai mahasiswa ke-"+i+" = "+nilaiMHS[i]+" BAIK");
            }else {
                System.out.println("Nilai mahasiswa ke-"+i+" = "+nilaiMHS[i]+" PERLU PENDAMPINGAN");
        }
        }
    }
}
