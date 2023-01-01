import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
    bicycle1.printData();
    Scanner scanner = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int distance = scanner.nextInt();
    bicycle1.run(distance);
    System.out.println("=================");
    //System.out.println("走行距離："+bicycle1.getDistance()+"km");
    Car car1 = new Car("フェラーリ","赤");
    car1.printData();
    System.out.print("走る距離を入力してください：");
    distance = scanner.nextInt();
    car1.run(distance);
    System.out.println("=================");
    System.out.print("給油する量を入力してください：");
    int gus = scanner.nextInt();
    car1.charge(gus);
  }
}