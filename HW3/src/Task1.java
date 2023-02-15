public class Task1 {
    public static void main(String[] args) {
        String test = "I like Java and practise it every day!";
        String sec = "I like Java!!!";
        //check if the string starts with prefix "like"
        System.out.println(test.startsWith("I like"));

        //find the position of the word "Java" in the second string
        System.out.println(sec.indexOf("J"));
        //replacing all 'a' characters on 'o'
        System.out.println(sec.replace('a', 'o'));

        //changing string to upper case
        System.out.println(sec.toUpperCase());

        //changing string to lower case
        System.out.println(sec.toLowerCase());

        //taking only Java
        System.out.println(sec.substring(7, 11));



    }
}