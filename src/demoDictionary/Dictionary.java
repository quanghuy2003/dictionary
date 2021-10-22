package demoDictionary;

import java.util.HashMap;
import java.util.Locale;

public class Dictionary {
    private HashMap<String,String> dictionary;

    public Dictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary() {
        this.dictionary=new HashMap<>();
        this.dictionary.put("cat", "mèo");
        this.dictionary.put("dog", "chó");
        this.dictionary.put("house", "ngôi nhà");
        this.dictionary.put("run", "chạy");
        this.dictionary.put("boat", "thuyền");
        this.dictionary.put("bow", "cây cung");
        this.dictionary.put("tiger", "con hổ");
        this.dictionary.put("elephant", "con voi");
        this.dictionary.put("car", "oto");
        this.dictionary.put("plane", "máy bay");
    }
    public String fixWord(String word){
       return word.trim().toLowerCase(Locale.ROOT);
    }
    public void addWord(String key, String value){
        this.dictionary.put(fixWord(key), fixWord(value));
        System.out.println("Đã thêm thành công");
    }
    public String translate(String key){
        String fixedWord = fixWord(key);
        boolean isContainKey = this.dictionary.containsKey(fixedWord);
        if(isContainKey){
            return "Nghĩa của từ " + fixedWord + " là " + this.dictionary.get(fixedWord);
        }else return "không tìm thấy từ này";
    }
    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
}
