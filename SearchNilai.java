import java.util.Scanner;

public class SearchNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak Elemen Array: ");
        int banyak = input.nextInt();
        int[] nilai = new int[banyak];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Array ke-"+(i+1)+": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai "+ key +" ditemukan pada indeks ke-"+i);
                ditemukan = true;
                break;
            }
        }        
        if (!ditemukan) {
            System.out.println("Nilai "+ key +" tidak ditemukan");
        }
    }
}
