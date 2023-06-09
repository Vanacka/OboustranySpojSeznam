import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        PrvekObousmerny hlava = null;
        Scanner sc = new Scanner(System.in);
        FileInputStream f = new FileInputStream("soubor.dat");
        ObjectInputStream in = new ObjectInputStream(f);
        try {
            hlava = (PrvekObousmerny) in.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            hlava = null;
        }

        for(;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;
            PrvekObousmerny novy = new PrvekObousmerny(vstup, hlava, null);

            if(hlava != null) {
                hlava.predchozi = novy;
            }
            hlava = novy;
        }
        FileOutputStream f2 = new FileOutputStream("soubor.dat");
        ObjectOutputStream out = new ObjectOutputStream(f2);
        out.writeObject(hlava);
        out.close();
    }
}