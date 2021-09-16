import java.util.StringTokenizer;

public class Tokenizer{
    public static void main(String[] args){
        String myString="12, RutherFord Building,Lake Street,Chicago-29";
        StringTokenizer st= new StringTokenizer(myString);
        System.out.println("total tokens:"+st.countTokens());
    }
}