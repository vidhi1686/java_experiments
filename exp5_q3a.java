public class Box {
    float width, height, depth;
    public Box() {
        width = height = depth = 0;
    }
    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }
    public float getVolume() {
        return width * height * depth;
    }
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }
}
