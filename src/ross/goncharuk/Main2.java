package ross.goncharuk;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {

        Employee karl;
        try {
            FileInputStream fis = new FileInputStream("karl.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            karl =(Employee) ois.readObject();
            System.out.println(karl);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
