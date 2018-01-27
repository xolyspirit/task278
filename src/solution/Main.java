package solution;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
	    main.dnkTest();
    }

    private void dnkTest() throws IOException {
        BufferedReader reader  = new BufferedReader(new FileReader("INPUT.TXT"));
        char[] parent = reader.readLine().toCharArray();
        char[] child = reader.readLine().toCharArray();

        FileWriter writer = new FileWriter("OUTPUT.TXT");

        if(searching(parent,child)){
            writer.write("YES");
        }
        else{
            writer.write("NO");
        }
        writer.close();
    }
    //searching for matches
    private boolean searching(char[] parent, char[] child){
        int j = 0;
        for (char c : child) {
            if (j < parent.length && parent[j] == c) {
                if (j == parent.length - 1) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
