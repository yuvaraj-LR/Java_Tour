package src.javaBasics;

public class stringDataType {
    public static void main(String[] args) {
        String s1 = "Fly above the sky.";
        String s2 = "Uv";
        String s3 = "Jana";
        String s4 = "";
        String s5 = "  ";

        //toUpperCase(), toLowerCase() --> Capitalize, Small the words.
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        //length() --> Finding the length.
        System.out.println(s2.length());

        //charAt() --> Finding the character's place.
        System.out.println(s3.charAt(2));

        //indexOf(), lastIndexOf() --> Finding the index's place.
        System.out.println(s3.indexOf('a'));
        System.out.println(s3.lastIndexOf('a'));

        //concat() --> Adding two strings.
        System.out.println(s2.concat(" Uv"));

        //isEmpty() --> Check for empty word.
        System.out.println(s4.isEmpty());


        //isBlank() --> Check for spaces.
        System.out.println(s5.isBlank());
    }


}
