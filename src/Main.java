import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // task1
    System.out.println("Task 1 \n Enter number");
    isTheNumberEvenOrNot(scanner.nextInt());
    scanner.nextLine();

    // task2
    System.out.println("Task 2 \n Enter word");
    String str = scanner.nextLine();
    System.out.print("Toggle case: ");
    str = toggleCase(str.toCharArray());
    System.out.println(str);

    // task3
    System.out.print("Task 3 \n ");
    singleDigit(new int[]{1, 1, 4, 2, 3, 9, 2, 3, 4});

    // task4
    System.out.println("Task 4 \n Enter number");
    System.out.println(getFirstSetBitPos(scanner.nextInt()));

  }

  //  task 1.Create method that check if a number is even
  static void isTheNumberEvenOrNot(int number) {
    if ((number ^ 1) == number + 1) {
      System.out.println("Number is even !!! ");
    } else {
      System.out.println("Number is odd !!! ");
    }
  }

  // task 2. Create method that convert given string characters to uppercase or lowercase
  static String toggleCase(char[] a) {
    for (int i = 0; i < a.length; i++) {
      // Bitwise EXOR with 32
      a[i] ^= 32;
    }
    return new String(a);
  }

  // task 3. Create method that find the element in an array that is not repeated.
  static void singleDigit(int array[]) {
    int result = array[0];
    for (int i = 1; i < array.length; i++) {
      result = result ^ array[i];
    }
    System.out.println("single digit is --> " + result);
  }

  // task 4. Create method that find the position of the first set-bit (1) from the right.
  static int getFirstSetBitPos(int n) {
    return (int) ((Math.log10(n & -n)) / Math.log10(2)) + 1;
  }

}
