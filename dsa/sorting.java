
public class sorting {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int[] merge = mergeArrays(a, b);
        for (int num : merge) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        int l = a.length;
        int m = b.length;
        int[] merge = new int[l + m];

            while (p1 < l && p2 < m) {
                if (a[p1] < b[p2]) {
                    merge[k++] = a[p1++];
                } else {
                    merge[k++] = b[p2++];
                }
            }
            while (p1 < l) {
                merge[k++] = a[p1++];
            }
            while (p2 < m) {
                merge[k++] = b[p2++];
            }
            return merge;

        }
}
