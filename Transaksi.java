public class Transaksi {
    double biayaPenyediaJasa;
    double biayaJasaAlat;
    double biayaBahan;
    double biayaTransport;
    
    public Transaksi(double biayaPenyediaJasa, double biayaJasaAlat, double biayaBahan, double biayaTransport) {
        this.biayaPenyediaJasa = biayaPenyediaJasa;
        this.biayaJasaAlat = biayaJasaAlat;
        this.biayaBahan = biayaBahan;
        this.biayaTransport = biayaTransport;
    }

    public double getTotal() {
        return biayaPenyediaJasa + biayaBahan + biayaJasaAlat + biayaTransport;
    }
}
