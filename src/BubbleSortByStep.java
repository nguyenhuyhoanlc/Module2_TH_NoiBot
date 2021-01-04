import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        BubbleSortByStep ob = new BubbleSortByStep();
        int list[] = {1,3,8,4};
        System.out.println("Mảng ban đầu:");
        ob.printList(list);
        ob.bubbleSortByStep(list);
        System.out.println("Mảng sau khi sắp xếp: ");
        ob.printList(list);
    }

    public static void bubbleSortByStep(int[] list){
        int n = list.length;
        for (int i = 0; i < n -1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public void printList(int list[]){
        int n = list.length;
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + "");
            System.out.println();
        }
    }
}
