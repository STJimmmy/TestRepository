package RecruitmentTasks;

import java.util.ArrayList;
import java.util.Arrays;


public class LongestString {
    public static void main(String[] args) {

        String string1 = "Some random text which is longer than the previous one and is the longest";
        String string2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String string3 = "Some random text which is longer than the previous one and is the longest, even longer than the longest one";
        String string4 = "Some random text which is longer than the previous one and is the longest, even longer than the longest one ever";
        String string5 = "Some random text which is longer than the original one";

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(string1, string2, string3, string4, string5));
        System.out.println(getLongestMessage(stringList));
    }

    public static String getLongestMessage(ArrayList<String> stringList) {
        int counter = 0;
        String longestMessage = "default";
        for (String string : stringList) {

            if (string.length() > counter) {
                counter = string.length();
                longestMessage = stringList.get(stringList.indexOf(string));

            }

        }
        return longestMessage;
    }
}




