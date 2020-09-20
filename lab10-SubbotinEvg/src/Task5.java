import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = Solution.newHashMap("привет", "hi");
        hashMap.put("пока", "bye");
        System.out.println(hashMap);

        ArrayList<Integer> arrayList = Solution.newArrayList(1);
        arrayList.add(2);
        System.out.println(arrayList);

        HashSet<Double> hashSet = Solution.newHashSet(3.14);
        hashSet.add(3.1415);
        hashSet.add(3.1415);
        System.out.println(hashSet);
    }
}
