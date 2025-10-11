public class Ch6_StringBuilder { //  BTW note, StringBuilder is already a class, so we cant name this StringBuilder.java
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // These are mutable just like arrays. 
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch); 
        }   
    }
}
