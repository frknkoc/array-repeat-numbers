import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {-30, 12, 34, 99, 1, 56, 11, 34, -87, 34, 12, 1, -23, 56, 34, -87};
        int[] repeat = new int[list.length];
        int n = 0;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(repeat, list[i])) {
                        repeat[n++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int i : repeat) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n" + Arrays.toString(repeat));
    }

}