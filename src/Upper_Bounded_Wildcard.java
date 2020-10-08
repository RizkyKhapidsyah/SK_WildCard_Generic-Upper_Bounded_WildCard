import com.rizkykhapidsyah.GenericSaya;

/* Created by Rizky Khapidsyah */

public class Upper_Bounded_Wildcard {
    public static void tampilkanData(GenericSaya<? extends Number> Daftar) {
        while (!Daftar.apakahKosong()) {
            System.out.println(Daftar.pop());
        }
    }

    public static void main(String[] args) {
        GenericSaya<Integer> AngkaAngka = new GenericSaya<Integer>();
        AngkaAngka.Dorong(73);
        AngkaAngka.Dorong(41);
        AngkaAngka.Dorong(90);

        tampilkanData(AngkaAngka);

        /* Kode program ini akan error

        GenericSaya<String> BuahBuahan = new GenericSaya<String>();
        BuahBuahan.Dorong("Jeruk");
        BuahBuahan.Dorong("Manggis");
        BuahBuahan.Dorong("Kiwi");

        tampilkanData(BuahBuahan); ==> Akan Error
        */
    }
}
