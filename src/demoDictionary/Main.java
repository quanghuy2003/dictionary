package demoDictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary myDictionary = new Dictionary();
        System.out.println(myDictionary.getDictionary());
        myDictionary.addWord("cake","bánh ngọt");
        System.out.println(myDictionary.getDictionary());
        System.out.println(myDictionary.translate("house"));
        System.out.println(myDictionary.translate("wall"));
    }

}
