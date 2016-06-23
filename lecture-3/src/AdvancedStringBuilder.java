/**
 * Created by admin on 23.06.2016.
 */
public class AdvancedStringBuilder {

    StringBuilder S=new StringBuilder();

    public static void main(String[] args) {
        AdvancedStringBuilder asb = new AdvancedStringBuilder();
        System.out.println(asb.toString());
        asb.rightAppend("abacaba");
        System.out.println(asb.toString());
        asb.leftAppend("xyz");
        System.out.println(asb.toString());
        asb = new AdvancedStringBuilder("bbb");
        asb.leftAppend("aaa");
        System.out.println(asb.toString());
    }

    public AdvancedStringBuilder() {

    }

    public AdvancedStringBuilder(String string) {
        S = new StringBuilder(string);
    }

    void clear() {
       S.setLength(0);
    }

    public String toString() {

        return S.toString();
    }

    public void leftAppend(String string) {
        StringBuilder sb = new StringBuilder(string);
        S = sb.append(S);
    }

    public void rightAppend(String string) {
        StringBuilder sb = new StringBuilder(string);
        S = sb.insert(0, S);
    }

}
