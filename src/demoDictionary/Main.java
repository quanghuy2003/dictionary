package demoDictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary myDictionary = new Dictionary();
        System.out.println(myDictionary.getDictionary());
        myDictionary.addWord("           cake","    Bánh NGỌT      ");
        System.out.println(myDictionary.getDictionary());
        System.out.println(myDictionary.translate("        HOUse       "));
        System.out.println(myDictionary.translate("ngôi nhà"));
    }

}
