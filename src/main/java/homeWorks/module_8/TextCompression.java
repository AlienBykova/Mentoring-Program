package homeWorks.module_8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCompression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String compressedWord = zip(word);
        System.out.println(compressedWord);
        String w = unzip(compressedWord);
        System.out.println(w);
    }

    private static String zip(String word) {

        Pattern pattern = Pattern.compile("(.)\\1{0,8}");
        Matcher matcher = pattern.matcher(word);

        String result = "";

        while (matcher.find()) {
            String tmp = matcher.group(1);
            int length = matcher.group().length();
            if (tmp.matches("(\\d)")) {
                for (int i=0; i<length; i++) {
                    result += 1 + tmp;
                }
            } else if (length > 1 && tmp.matches("(\\w+)")) {
                result += tmp + length;
            } else result += matcher.group();
        }
        return result;
    }

    private static String unzip(String word) {
        Pattern pattern1 = Pattern.compile("1\\d");
        Matcher matcher1 = pattern1.matcher(word);

        Pattern pattern2 = Pattern.compile("(\\w[2-9])");
        Matcher matcher2 = pattern2.matcher(word);

        String tmp;
        List<String> l =new ArrayList<>();
        while (matcher1.find()) {
            String letter = matcher1.group(0).substring(1);
            l.add(letter);
            word = word.replace(matcher1.group(0), letter);
        }

        while (matcher2.find()) {
            tmp = "";
            String letter = matcher2.group(0).substring(0, 1);
            int numberOfLetters = Integer.valueOf(matcher2.group(0).substring(1));
            for (int i = 0; i < numberOfLetters; i++)
                tmp += letter;
            word = word.replaceFirst("(\\D[2-9])", tmp);
        }
        return word;
    }
}
