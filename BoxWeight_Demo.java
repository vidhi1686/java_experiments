public class BoxWeight_Demo {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal, 24csu324");
        Box b = new Box(2, 3, 4);
        b.displayVolume();
        BoxWeight bw = new BoxWeight(2, 3, 4, 10);
        bw.displayVolume();
        bw.displayWeight();
        BoxWeight bw2 = new BoxWeight(bw);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}