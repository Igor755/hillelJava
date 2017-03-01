/**
 * Created by Sonikpalms on 28.02.2017.
 */
public class Container {
    private Object[] array;

    public Container() {
        this.array = new Object[0];
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public boolean contains(Object object) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containsAll(Container collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getObject(j).equals(array[i])) {
                    count++;
                }
            }
        }
        if (count >= collection.size()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(Object object) {
        Object[] extendedArray = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            extendedArray[i] = array[i];
        }
        extendedArray[extendedArray.length - 1] = object;
        array = extendedArray;
    }

    public void addAll(Container collection) {
        int mergedLength = array.length + collection.size();
        Object[] mergedArrayList = new Object[mergedLength];
        for (int i = 0; i < array.length; i++) {
            mergedArrayList[i] = array[i];
        }
        for (int i = 0; i < collection.size(); i++) {
            mergedArrayList[array.length + i] = collection.getObject(i);
        }
        array = mergedArrayList;
    }

    public void remove(Object object) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                count++;
            }
        }
        Object[] newArray = new Object[array.length - count];
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            if (!object.equals(array[i])) {
                newArray[i - index] = array[i];
                index++;
            }
        }
        array = newArray;
    }

    public void removeAll(Container collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getObject(j).equals(array[i])) {
                    array[i] = null;
                    count++;
                }
            }
        }
        Object[] newArray = new Object[array.length - count];
        if (count > 0) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    index++;
                } else {
                    newArray[i - index] = array[i];
                }
            }
        }
        array = newArray;
    }

    public Object getObject(int index) {
        return array[index];
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public void retainAll(Container collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getObject(j).equals(array[i])) {
                    count++;
                }
            }
        }
        Object[] newArray = new Object[count];
        if (count > 0) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                index++;
                for (int j = 0; j < collection.size(); j++) {
                    if (collection.getObject(j).equals(array[i])) {
                        newArray[i - index + 1] = array[i];
                        index--;
                    }
                }
            }
        }
        array = newArray;
    }
}