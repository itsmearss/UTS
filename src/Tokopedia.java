import java.util.Scanner;

public class Tokopedia {
    public void login(){

    }
    public static void main(String[] args) {
        Keranjang cart = new Keranjang();
        Item[] ProdukTokped = new Item[3];
        ProdukTokped[0] = new Item("Sepatu Air Jordan", "Foto Sepatu Air Jordan", 200000, 10, "Tegal", 12, "Binatng * * * * *", """
                Barang Baru
                Merk: Nike
                Warna: Hitam, putih
                Ukuran: 33-45""");
        ProdukTokped[1] = new Item("Laptop ROG", "Foto Laptop ROG", 4000000, 20, "Tegal", 10, "Bintang * * * *", """
                Barang Baru
                Merk: Asus
                Warna: Hitam""");
        ProdukTokped[2] = new Item("Iphone 13", "Foto Iphone 13", 1000000, 50, "Tegal", 10, "Bintang * * * *", """
                Barang Baru
                Merk: Apple
                Tipe: Iphone 13  2022
                Warna: Biru, Merah, Pink""");

        System.out.println("TOKOPEDIA");
        System.out.println("---------------");
        ProdukTokped[0].tampilan();
        System.out.println();
        ProdukTokped[1].tampilan();
        System.out.println();
        ProdukTokped[2].tampilan();
        System.out.println();

        Scanner input = new Scanner(System.in);
        char pilihProduct = 0;
        do {
            System.out.println();
            System.out.println("Petunjuk");
            System.out.println("[1]Lihat Produk 1");
            System.out.println("[2]Lihat Produk 2");
            System.out.println("[3]Lihat Produk 3");
            System.out.println("[4]Chekout");
            System.out.println("   Keranjang : " + cart.items.size());
            System.out.println("[0]Exit");
            System.out.println("Pilih Perintah: ");
            pilihProduct = input.next().charAt(0);
            switch (pilihProduct) {
                case '1' -> {
                    System.out.println();
                    ProdukTokped[0].tampilanProduk();
                    char pilihan = 0;
                    do {
                        System.out.println("[1]Masukkan ke Keranjang   [2]Hapus dari Keranjang   [0]Exit dan Pilih Produk/Chekout");
                        System.out.println("Keranjang : " + cart.items.size());
                        System.out.println("Pilih Perintah (0, 1, 2): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                cart.addItem(ProdukTokped[0]);
                                System.out.println("Berhasil Dimasukkan ke Keranjang");
                            }
                            case '2' -> {
                                cart.removeItem(ProdukTokped[0]);
                                System.out.println("Berhasil Dihapus dari Keranjang");
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    System.out.println();
                    ProdukTokped[1].tampilanProduk();
                    char pilihan = 0;
                    do {
                        System.out.println("[1]Masukkan ke Keranjang   [2]Hapus dari Keranjang   [0]Exit dan Pilih Produk/Chekout");
                        System.out.println("Keranjang : " + cart.items.size());
                        System.out.println("Pilih Perintah (0, 1, 2): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                cart.addItem(ProdukTokped[1]);
                                System.out.println("Berhasil Dimasukkan ke Keranjang");
                            }
                            case '2' -> {
                                cart.removeItem(ProdukTokped[1]);
                                System.out.println("Berhasil Dihapus dari Keranjang");
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '3' -> {
                    System.out.println();
                    ProdukTokped[2].tampilanProduk();
                    char pilihan = 0;
                    do {
                        System.out.println("[1]Masukkan ke Keranjang   [2]Hapus dari Keranjang   [0]Exit dan Pilih Produk Lain/Chekout");
                        System.out.println("Keranjang : " + cart.items.size());
                        System.out.println("Pilih Perintah (0, 1, 2): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                cart.addItem(ProdukTokped[2]);
                                System.out.println("Berhasil Dimasukkan ke Keranjang");
                            }
                            case '2' -> {
                                cart.removeItem(ProdukTokped[2]);
                                System.out.println("Berhasil Dihapus dari Keranjang");
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '4' -> {
                    System.out.println();
                    Scanner myInput = new Scanner(System.in);
                    System.out.println("Masukkan Nama Penerima: ");
                    String nama1= myInput.nextLine();
                    System.out.println("Masukkan Alamat Pengiriman: ");
                    String alamat = myInput.nextLine();
                    System.out.println("Masukkan Metode Pembayaran");
                    String bayar = myInput.nextLine();
                    System.out.println();
                    System.out.println("TRANSAKSI BERHASIL");
                    System.out.println("-----------------");
                    System.out.println("Nama Pembeli        : " + nama1 + "\n" +
                            "Alamat Pengiriman   : " + alamat + "\n" +
                            "Metode Pembayaran   : " + bayar);
                    cart.pay(new Identity(nama1, alamat, bayar));
                }
                default -> {
                }
            }
        } while (pilihProduct != '0');
    }
}