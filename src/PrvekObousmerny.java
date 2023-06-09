public class PrvekObousmerny {
    int hodnota;
    PrvekObousmerny dalsi;
    PrvekObousmerny predchozi;

    public PrvekObousmerny (int hodnota, PrvekObousmerny dalsi, PrvekObousmerny predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }
}
