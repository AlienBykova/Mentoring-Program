package homeWorks.module_8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCompression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(zip(word));
        String w = unzip(word);
        System.out.println(w);
    }

    private static String zip(String word) {

        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher matcher = pattern.matcher(word);

        String result = "";

        while (matcher.find()) {
            String tmp = matcher.group(1);
            int length = matcher.group().length();
            if (tmp.matches("(\\d)") && length == 1) {
                result += length + tmp;
            } else if (length > 1 && tmp.matches("(\\D+)")) {
                result += tmp + length;
            } else result += matcher.group();
        }
        return result;
    }

    private static String unzip(String word) {
        Pattern pattern1 = Pattern.compile("1\\d[2-9]");
        Matcher matcher1 = pattern1.matcher(word);

        Pattern pattern2 = Pattern.compile("(\\D[2-9])");
        Matcher matcher2 = pattern2.matcher(word);

        String tmp;
        while (matcher1.find()) {
            tmp = "";
            String letter = matcher1.group(0).substring(1);
            tmp = letter;
            word = word.replaceFirst("1\\d[2-9]", tmp);
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
