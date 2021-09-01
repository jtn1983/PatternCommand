import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Scanner scanner = new Scanner(System.in);

        List<FrogCommand> commands = new ArrayList<>();


        int curCommand = -1;

        while (true) {
            System.out.println("Input command");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (input.equals("<<")) {
                if (curCommand < 0) {
                    System.out.println("Nothing undo");
                } else {
                    commands.get(curCommand).undo();
                    curCommand--;
                }
            } else if (input.equals(">>")) {
                if (curCommand == commands.size() - 1) {
                    System.out.println("Nothing redo");
                } else {
                    curCommand++;
                    commands.get(curCommand).doit();
                }
            } else {
                if (curCommand != commands.size() - 1) {

                }
                FrogCommand cmd = FrogCommands.jumpCommand(frog, Integer.parseInt(input));
                curCommand++;
                commands.add(cmd);
                cmd.doit();
            }

            System.out.println(frog);


        }


    }
}
