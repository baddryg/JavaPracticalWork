package practicalwork01;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int Sum = 0;
        for (int i = 0; i < array.length; i++) {
            Sum = Sum + array[i];
        }
        System.out.println(Sum);
        Sum = 0;
        int i = 0;
        while (i < array.length){
            Sum = Sum + array[i];
            i++;
        }
        System.out.println(Sum);
        Sum = 0;
        i = 0;
        do {
            Sum = Sum+array[i];
            i++;
        }
        while (i<array.length);
        System.out.println(Sum);
    }
}
