package PartOf29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartOf<T> {
    public ArrayList<T> partOf(T[] genericArray, Predicate<Integer> predicate) {
        ArrayList<T> arrayList = new ArrayList<>();
        for(int i = 0; i < genericArray.length; i++){
            if(predicate.test(i)){
                arrayList.add(genericArray[i]);
            }
        }

        return arrayList;
    }
}
