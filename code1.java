import java.util.Arrays;
import java.io.*;
class Main {
  public static void operation(int[]arr, int n, int m, int p, int k ) {
    Arrays.sort(arr);
    if (k > arr.size() || p > arr.size()) {
      System.out.println("Not Possible");
    } else {
      arr[k - 1] = 6;
      if (arr[p - 1] < arr[k - 1] && m > n ) {
        System.out.println("Not Possible");
      }
      else {
        int count = 0;
        int i = 0;
        while (i < arr.length) {

          // If current element is
          // not at the right position
          if (arr[i] != i + 1) {

            while (arr[i] != i + 1) {
              int temp = 0;

              // Swap current element
              // with correct position
              // of that element
              temp = arr[arr[i] - 1];
              arr[arr[i] - 1] = arr[i];
              arr[i] = temp;
              count++;
            }
          }

          // Increment for next index
          // when current element is at
          // correct position
          i++;
        }
        System.out.println(count);
      }

    }
  }
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test_cases = Integer.parseInt(br.readLine());
    int v = Integer.parseInt(br.readLine());
    for (int i = 0; i < v; i++) {
      String[] parts = br.readLine().split(" ");
      int n = Integer.parseInt(parts[0]);
      int m = Integer.parseInt(parts[1]);
      int p = Integer.parseInt(parts[2]);
      int k = Integer.parseInt(parts[3]);
    }
    int x = Integer.parseInt(br.readLine());
    for (int i = 0; i < x; i++) {
      String[] strings = br.readLine().split(" ");

    }
    int[] arr = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

  }
}
