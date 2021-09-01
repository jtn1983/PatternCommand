public class FrogCommands {
    public static FrogCommand jumpCommand(Frog frog, int steps) {
        return new FrogCommand() {
            @Override
            public boolean doit() {
                return frog.jump(steps);
            }

            @Override
            public boolean undo() {
                return frog.jump(-steps);
            }
        };
    }
}
