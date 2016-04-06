package ross.goncharuk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Employee karl = new Employee();
        karl.setName("Karl");
        karl.setAddress("N/A");
        karl.setSSN(1234567);
        karl.setNumber(1);

        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("karl.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(karl);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
