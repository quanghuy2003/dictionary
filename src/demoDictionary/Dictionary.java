package demoDictionary;

import java.util.HashMap;

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
    public void addWord(String key, String value){
        this.dictionary.put(key, value);
        System.out.println("Đã thêm thành công");
    }
    public String translate(String key){
        boolean isContainKey = this.dictionary.containsKey(key);
        if(isContainKey){
            return "Nghĩa của từ " + key + " là " + this.dictionary.get(key);
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
