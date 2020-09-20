import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static <K, V> HashMap<K, V> newHashMap(K key, V value){
        HashMap<K, V> hashMap= new HashMap<>();
        hashMap.put(key, value);
        return hashMap;
    }

    public static <T> ArrayList<T> newArrayList(T element) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(element);
        return arrayList;
    }

    public static <T> HashSet<T> newHashSet(T element) {
        HashSet<T> hashSet = new HashSet<>();
        hashSet.add(element);
        return hashSet;
    }
}
