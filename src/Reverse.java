public class Reverse {
    public static void main(String[] args) {
        Integer num=4321, reverse = 0;
        while (num!=0)
        {
            Integer rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse=" +reverse);


    }
}
