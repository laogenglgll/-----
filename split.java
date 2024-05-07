public class split{
    public static void main(String [] args){
        String str = "abc|efg|hij";
        String[] s = str.split("|");
        System.out.println(s.length);
    }
}