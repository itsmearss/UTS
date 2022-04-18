public class Item {
    private String nama;
    private String foto;
    private double price;
    private int stok;
    private String lokasi;
    private int terjual;
    private String rating;
    private String deskripsi;

    public Item(String namaBarang, String fotoBarang, double priceBarang, int stokBarang, String lokasiToko, int barangTerjual, String ratingBarang, String deskripsiBarang){
        this.nama = namaBarang;
        this.foto = fotoBarang;
        this.price = priceBarang;
        this.stok = stokBarang;
        this.lokasi = lokasiToko;
        this.terjual = barangTerjual;
        this.rating = ratingBarang;
        this.deskripsi = deskripsiBarang;
    }

    public void tampilan(){
        System.out.println(nama + "\n" +
                foto + "\n" +
                "Price   : " + price + "\n" +
                "Stock   : " + stok + "\n" +
                "Locate  : " + lokasi + "\n" +
                "Selling : " + terjual + "\n" +
                "Rating  : " + rating);
    }

    public void tampilanProduk(){
        System.out.println(nama + "\n" +
                           foto + "\n" +
                           "Price   : " + price + "\n" +
                           "Stock   : " + stok + "\n" +
                           "Locate  : " + lokasi + "\n" +
                           "Selling : " + terjual + "\n" +
                           "Rating  : " + rating + "\n" +
                           "Deskripsi: " + "\n" + deskripsi);
    }

    public void petunjukProduk(){
        System.out.println("[4]Checkout   [0]Exit");
    }
    public String getNama(){
        return String.format("| %-12s      | %.1f   |%n", nama, price);
    }

    public double getPrice(){
        return price;
    }
}
