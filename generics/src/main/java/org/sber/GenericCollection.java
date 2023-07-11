package org.sber;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericCollection {
    public static <T extends Number> int countElements(Collection<T> collection) {
        int count = 0;
        for (T element : collection) {
            if (element.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void swapElements(List<?> collection, int index1, int index2) {
        if (index1 >= 0 && index1 < collection.size() && index2 >= 0 && index2 < collection.size()) {
            Collections.swap(collection, index1, index2);
        }
    }
}
