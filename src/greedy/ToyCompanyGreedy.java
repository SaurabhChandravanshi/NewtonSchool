package greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
Priyanka works for an international toy company that ships by container.
Her task is to the determine the lowest cost way to combine her orders for shipping.
She has a list of item weights.
The shipping company has a requirement that all items loaded in a container
must weigh less than or equal to 4 units plus the weight of the minimum weight item.
All items meeting that requirement will be shipped in one container.

What is the smallest number of containers that can be contracted to ship the
items based on the given list of weights?

Input
The first line contains an integer N, the number of orders to ship.
The next line contains N space- separated integers, w[1], w[2]., w[N]
representing the orders in a weight array.

Sample Input
9
1 2 3 4 5 10 11 12 13

Sample Output
2

 */
public class ToyCompanyGreedy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minNumberOfContainers(arr));
    }

    public static int minNumberOfContainers(int[] arr) {
        Arrays.sort(arr);
        int container = 1;
        int capacity = arr[0] + 4;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > capacity) {
                container++;
                capacity = arr[i] + 4;
            }
        }
        return container;
    }
}
