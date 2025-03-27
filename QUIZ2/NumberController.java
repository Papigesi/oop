package Quiz2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberController {
    int[] array = new int[20];

    public NumberController() {
        Scanner file = null;
        int i = 0;

        try {
            file = new Scanner(new FileInputStream("Numbers.txt"));
        } catch (FileNotFoundException var4) {
            System.out.println("Error!");
            System.exit(0);
        }

        while(file.hasNextInt()) {
            this.array[i] = file.nextInt();
            ++i;
        }

        bubbleSort(this.array);
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public boolean searchBinary(int number) {
        int minimumIndex = 0;
        int maximumIndex = this.array.length - 1;

        while(minimumIndex <= maximumIndex) {
            int mid = minimumIndex + (maximumIndex - minimumIndex) / 2;
            int value = this.array[mid];
            if (value < number) {
                minimumIndex = mid + 1;
            } else {
                if (value <= number) {
                    return true;
                }

                maximumIndex = mid - 1;
            }
        }

        return false;
    }

    public boolean searchSequential(int number2) {
        for(int i = 0; i < this.array.length; ++i) {
            if (this.array[i] == number2) {
                return true;
            }
        }

        return false;
    }
}