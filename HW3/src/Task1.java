public class Task1 {
    public static void main(String[] args) {
        String test = "I like Java and practise it every day!";
        String sec = "I like Java!!!";
        //check if the string starts with prefix "like"
        System.out.println(test.startsWith("like"));

        //find the position of the word "Java" in the second string
        System.out.println(sec.indexOf("J"));


    }
}