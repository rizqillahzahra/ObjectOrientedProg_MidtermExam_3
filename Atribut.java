public class Atribut {
    String[] Jasa = {"Setrika", "Cuci Baju", "Bersih - bersih"};
    String[] penyediaJasa = {"Hariaty", "Novrianti", "Febriana"};

    public void displayJasa() {
        System.out.println("*Jenis Jasa*");
        for (int i = 0; (i < Jasa.length); i++) {
            System.out.println((i+1) + "." + Jasa[i]);
        }
    }   

    public void displayPenyediaJasa() {
        System.out.println("*Nama Penyedia Jasa*");
        for (int i = 0; (i < penyediaJasa.length); i++) {
            System.out.println((i+1) + "." + penyediaJasa[i]);
        }
    }

    public String[] getJasa() {
        return Jasa;
    }

    public String[] getPenyediaJasa() {
        return penyediaJasa;
    }

}
