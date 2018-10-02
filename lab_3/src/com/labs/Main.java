package com.labs;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        String fileName = "expresie_matem.txt";

        String line = null;

        String result = "";

        String start_parantheses = "";

        String end_parantheses = "";

        StringBuilder sb = new StringBuilder(start_parantheses);

        System.out.println(System.getProperty("user.dir"));

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '" + fileName + "'");
        }

        System.out.println(result);

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(') {
                start_parantheses += result.charAt(i);
                sb = new StringBuilder(start_parantheses);
            }
            if (result.charAt(i) == ')') {
                if (start_parantheses.equals("")) {
                    System.out.println("expression is not valid");
                    return;
                } else {
                    sb.deleteCharAt(start_parantheses.length() - 1);
                    start_parantheses = sb.toString();
                }
            }
        }

        if (!start_parantheses.equals("")){
            System.out.println("expression is not valid");
        }
    }

}
