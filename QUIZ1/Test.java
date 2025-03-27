package Quiz ;

import java.io.FileInputStream ;
import java.io.FileNotFoundException ;
import java.util.Scanner ;

public class Test {

    public static void main(String[] args) {

        Scanner file = null;
        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        try {
            file = new Scanner(new FileInputStream("girdiQuiz1.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }

        Employee e1;
        String row;
        int no;
        String[] info = null;

        while (file.hasNextLine()) {
            row = file.nextLine();
            switch (row) {
                case "Default":
                    e1 = new Employee("", 9999, "", "");
                    System.out.println(e1);
                    break ;
                case "default":
                    e1 = new Employee("", 9999, "", "");
                    System.out.println(e1);
                    break ;
                default:
                    info = row.split(",");
                    no = Integer.parseInt(info[1]);
                    e1 = new Employee(info[0], no, info[2], info[3]);
                    System.out.println(e1);
            }
        }
    }
}