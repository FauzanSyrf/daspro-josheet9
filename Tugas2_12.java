import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        System.out.println("Daftar Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.print("\nCari menu makanan/minuman: ");
        String cariMenu = input.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                System.out.println("Menu '" + menu[i] + "' tersedia dengan harga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu '" + cariMenu + "' tidak tersedia di kafe.");
        }
        System.out.print("Masukkan jumlah menu makanan/minuman yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();
        String[] namaPesanan = new String[jumlahPesanan];
        int[] menuDipesan = new int[jumlahPesanan];
        int[] totalPerMenu = new int[jumlahPesanan];
        int totalHarga=0;
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            boolean valid = false;
            String namaMenu = "";
            while (!valid) {
                System.out.print("Masukkan nama menu yang ingin dipesan: ");
                namaMenu = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaMenu)) {
                        namaMenu = menu[j];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak ada dalam daftar, coba lagi.");
                }
            }
            System.out.print("Masukkan porsi/gelas untuk " + namaMenu + ": ");
            int porsi = input.nextInt();
            input.nextLine();

            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaMenu)) {
                    hargaSatuan = harga[j];
                    break;
                }
            }  
            namaPesanan[i] = namaMenu;
            menuDipesan[i] = porsi;
            totalPerMenu[i] = hargaSatuan * porsi;
            totalHarga += totalPerMenu[i];  

        }
        System.out.println("\nDetail Pesanan");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("- " + namaPesanan[i] + " (" + menuDipesan[i] + ") : Rp " + totalPerMenu[i]);
        }
        System.out.println("Total harga pesanan : Rp " + totalHarga);

    }
}
