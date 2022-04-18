class Identity implements PaymentStrategy{

    private String nama;
    private String alamat;
    private String pembayaran;

    public Identity(String nama, String alamat, String pembayaran){
        this.nama = nama;
        this.alamat = alamat;
        this.pembayaran = pembayaran;
    }

    public void printIdentity(){
        System.out.println("Nama Pembeli        : " + this.nama + "\n" +
                           "Alamat Pengiriman   : " + this.alamat + "\n" +
                           "Metode Pembayaran   : " + this.pembayaran);
    }


    @Override
    public void pay(double amount) {
        System.out.format("+------------------------+-----------+%n");
        System.out.format("|         TOTAL          | "+ amount + "   |%n");
        System.out.format("+------------------------+-----------+%n");
    }
}
