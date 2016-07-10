
public class AdvancedStringBuilder {

    StringBuilder S = new StringBuilder();
    StringBuilder SS;

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
        SS = new StringBuilder(string);

    }

    void clear() {
        S.setLength(0);
    }

    public String toString() {
        return S.toString();
    }


    public void leftAppend(String string) {
        S = new StringBuilder(string).append(S);
    }

    public void rightAppend(String string) {
        S = S.append(string);
    }

}
