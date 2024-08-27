public class DrumBuilder implements Builder {
    private String type;
    private String color;
    private int diameter;
    private double depth;
    private String shellType;

    public DrumBuilder type(String type) {
        this.type = type;
        return this;
    }

    public DrumBuilder color(String color) {
        this.color = color;
        return this;
    }

    public DrumBuilder diameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public DrumBuilder depth(double depth) {
        this.depth = depth;
        return this;
    }

    public DrumBuilder shellType(String shellType) {
        this.shellType = shellType;
        return this;
    }

    public Drum build() {
        return new Drum(type, color, diameter, depth, shellType);
    }
}
