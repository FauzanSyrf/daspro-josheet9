import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiAkhir[i] = input.nextInt();
        }
        int lulus=0;
        int galulus=0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            if (status == "LULUS") {
                lulus++;
            }else{
                galulus++;
            }
        }
        System.out.println("mahasiswa lulus = "+lulus+"\nmahasiswa tidak lulus = "+galulus);
        }
}
