package BLL;

public class Sorting {
    
    public String[] bubblesort(String[] a, boolean b) {
        String temp;
        boolean sorting = true;
        while (sorting) {
            sorting = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (b) {
                    if (a[i].compareToIgnoreCase(a[i + 1]) > 0) {
                        temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        sorting = true;
                    }
                }
                else {
                    if (a[i].compareToIgnoreCase(a[i + 1]) < 0) {
                        temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        sorting = true;
                    }
                }
            }
        }
        return a;
    }
    
    public String[] selectionsort(String[] a, boolean b) {
        int min;
        String temp;
        for (int index = 0; index < a.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < a.length; scan++) {
                if (b) {
                    if (a[scan].compareToIgnoreCase(a[min]) < 0) {
                        min = scan;
                    }
                }
                else {
                    if (a[scan].compareToIgnoreCase(a[min]) > 0) {
                        min = scan;
                    }
                }
            }

            temp = a[min];
            a[min] = a[index];
            a[index] = temp;
        }
        return a;
    }
}
