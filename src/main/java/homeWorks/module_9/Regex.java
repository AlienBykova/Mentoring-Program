package homeWorks.module_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

//        String telephoneRegexBase = "(\\+38(\\s{0,1}\\d{3}){2}(\\s{0,1}\\d{2}){2})|(\\+38(-{0,1}\\d{3}){2}(-{0,1}\\d{2}){2})";
//        Pattern telephonePattern = Pattern.compile(telephoneRegexBase);
//        System.out.println(getMathcResult(word, telephonePattern));

//        String urlRegex = "^(ttp)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
//        Pattern urlPattern = Pattern.compile(urlRegex);
//        System.out.println(getMathcResult(word, urlPattern));

        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        System.out.println(getMathcResult(word, emailPattern));

    }

    public static boolean getMathcResult(String word, Pattern pattern) {
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}
