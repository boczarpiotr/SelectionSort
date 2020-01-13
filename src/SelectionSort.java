public class SelectionSort {

    public static void main(String[] args) {

        int[] tab = {2, 8, 5, 10, 1, 7};


        for (int y = 0; y < tab.length; y++) {

            for (int i = y + 1; i < tab.length; i++) {
                int min = tab[y];
                if (tab[i] < min) {
                    min = tab[y];
                    tab[y] = tab[i];
                    tab[i] = min;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + " " + tab[i]);
        }
    }
}
