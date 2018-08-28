import java.util.Collections;

class Kata_Mumbling {
    public static String accum(String s) {
        String separator = "-";
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String character = Character.toString(s.charAt(i));
            builder.append(character.toUpperCase());
            builder.append(String.join("", Collections.nCopies(i, character.toLowerCase())));
            if(i != s.length()-1)
                builder.append(separator);
        }
        return builder.toString();
    }
}