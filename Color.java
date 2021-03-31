public class Color {
    public static void color(String colorId) {
        colorId = colorId.toLowerCase();
        switch (colorId) {
            case "red" -> System.out.print("\u001B[38;5;9m");
            case "orange" -> System.out.print("\u001B[38;5;208m");
            case "yellow" -> System.out.print("\u001B[38;5;220m");
            case "green" -> System.out.print("\u001B[38;5;82m");
            case "cyan" -> System.out.print("\u001B[38;5;44m");
            case "blue" -> System.out.print("\u001B[38;5;26m");
            case "purple" -> System.out.print("\u001B[38;5;93m");
            case "gray" -> System.out.print("\u001B[38;5;240m");
            case "light gray" -> System.out.print("\u001B[38;5;248m");
            case "brown" -> System.out.print("\u001B[38;5;94m");
            case "tan" -> System.out.print("\u001B[38;5;137m");
            case "charcoal" -> System.out.print("\u001B[38;5;235m");
            case "pink" -> System.out.print("\u001B[38;5;199m");
            case "crimson", "blood" -> System.out.print("\u001B[38;5;88m");
            case "red-orange" -> System.out.print("\u001B[38;5;202m");
            case "diamond" -> System.out.print("\u001B[38;5;195m");
            case "emerald" -> System.out.print("\u001B[38;5;156m");
            default -> System.out.print("\u001B[38;5;255m");
        }
    }

    public static void color(int colorId) {
        System.out.print("\u001B[38;5;" + colorId + "m");
    }

    public static void printAll() {
        int[] ids = {9, 208, 220, 82, 44, 26, 93, 240, 248, 94, 137, 235, 199, 88, 202, 195, 156};
        String[] names = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple", "Gray", "Light Gray", "Brown", "Tan", "Charcoal", "Pink", "Blood", "Red-Orange", "Diamond", "Emerald"};
        for (int i = 0; i < ids.length; i++) {
            color(ids[i]);
            System.out.println(names[i]);
        }
        color(255);
    }
}
