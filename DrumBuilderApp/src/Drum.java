public class Drum {
    private String type;
    private final String color;
    private final int diameter;
    private final double depth;
    private final String shellType;

    Drum(String type, String color, int diameter, double depth, String shellType) {
        this.type = type;
        this.color = color;
        this.diameter = diameter;
        this.depth = depth;
        this.shellType = shellType;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", diameter=" + diameter +
                ", depth=" + depth +
                ", shellType='" + shellType + '\'' +
                '}';
    }
}
