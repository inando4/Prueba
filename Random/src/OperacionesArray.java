public class OperacionesArray {
    public static <T> int search(T x, T[] arr) {
        int id = -1;
        for (int i = 0; i < arr.length; i++) {
            if(x.equals(arr[i]))
                id = i;
        }
        return id;
    }
    public static <T> void remove(T x, T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(x.equals(arr[i])) {
                for (int j = i; j < arr.length; j++) {
                    if(j != arr.length - 1)
                        arr[j] = arr[j+1];
                    else
                        arr[j] = null;
                }
            }
        }
    }
}

