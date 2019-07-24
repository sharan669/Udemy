public class BinarySearch {

    public void binarySearchImplementation() {

        int[] a = {1, 3, 5, 7, 22, 98, 102};

        int pos = sort(a, 0, a.length, 5);
        if (pos == -1)
            System.out.println("The number is not found");
        else
            System.out.println("The element is found in " + (pos + 1));


    }

    public int sort(int[] a, int start, int end, int n) {

        if ((end - start < 2) && (a[start] != n)) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (a[mid] == n) {
            return mid;
        } else if (n < a[mid]) {
            return sort(a, start, mid, n);
        } else {
            return sort(a, mid + 1, end, n);
        }


    }


}
