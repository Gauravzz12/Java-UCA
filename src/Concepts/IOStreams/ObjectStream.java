package Concepts.IOStreams;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        String[] companies = {"Audi", "Mercedes", "Porsche", "Ferrari"};

        /* Output to file */
        try {
            out = new ObjectOutputStream(new FileOutputStream("objectSource.txt"));

            out.writeObject(companies);

            out.close();

            in = new ObjectInputStream(new FileInputStream("objectSource.txt"));

            String[] readCars = (String[]) in.readObject();
            System.out.println("Companies: ");
            for (String car : readCars) {
                System.out.println(car);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
