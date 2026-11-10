import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i : nilaiAkhir) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int j : nilaiAkhir) {
            String status = (nilaiAkhir[j] > 70) ? "LULUS" : "TIDAK LULUS";
            if (status == "LULUS") {
                System.out.println("Mahasiswa ke-" + (j + 1) + ": " + nilaiAkhir[j] + " (" + status + ")");
            }
        }
    }
}
