package deMinhHoa;
import java.util.StringTokenizer;
import java.util.Scanner;

public class MyString {
    private String str;
    
    public MyString(){
        str="";
    }
    
    public void enterString(){
        Scanner in = new Scanner(System.in);
        this.str = in.nextLine();
    }
    
    // Đưa ra độ dài của xâu
    public int getLength(){
        return str.length();
    }
    
    // Đưa ra số câu của xâu
    public int numOfParagraph(){
        StringTokenizer token = new StringTokenizer(str, ".!?");
        return token.countTokens();
    }
}
