public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Ban kính là:"+c1.getRadius()+"Diện tích là: "+c1.getArea()+"Màu sắc:"+ c1.getColor());
        Circle c2 = new Circle(2.0);
        System.out.println("Bán kính là: "+c2.getRadius()+"Diện tích là: "+c2.getArea()+"mau sac: "+c2.getColor());

    }
}