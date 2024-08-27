public class Main {
    public static void main(String[] args) {
        DrumBuilder builder = new DrumBuilder();
        builder.type("snare drum")
                .color("pink")
                .diameter(14)
                .depth(5.5)
                .shellType("maple");
        System.out.println(builder.build());
    }
}