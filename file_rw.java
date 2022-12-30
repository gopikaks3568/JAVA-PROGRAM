import java.io.*;

class Test {
    public static void main(String args[]) {
        try {
            FileReader fin = new FileReader("output.txt");
            FileWriter fout = new FileWriter("copy.txt");
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}