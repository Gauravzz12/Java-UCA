package Concepts.IOStreams;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        DataOutputStream out = null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("DataOut")));

            double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
            int[] units = { 12, 8, 13, 29, 50 };
            String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"
            };

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            System.out.println("Data writing is completed.");
            out.close();

            // Reading data from the file
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("DataOut")));

            double total = 0;
            try {
                while (true) { // Loop until EOFException is caught
                    double price = in.readDouble();
                    int unit = in.readInt();
                    String desc = in.readUTF();
                    System.out.println(price + " - " + unit + " - " + desc);
                    total += unit * price;
                }
            } catch (EOFException eof) {
                // End of file reached, no more data to read
                System.out.println("Data reading is completed.");
            }

            System.out.println("Total: " + total);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
