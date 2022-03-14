public class Swap {
    public static void main(String[] args) {
        Integer x=100,y=200;
        System.out.println("Before swapping");
        System.out.println("x=" +x);
        System.out.println("y=" +y);
        Integer temp = x;
        x=y;
        y=temp;
        System.out.println("After swapping");
        System.out.println("x=" +x);
        System.out.println("y=" +y);
    }
}
