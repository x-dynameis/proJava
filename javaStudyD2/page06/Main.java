import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
    bicycle1.printData();
    Scanner scanner = new Scanner(System.in);
    System.out.print("走る距離を入力してください：");
    int distance = scanner.nextInt();
    bicycle1.run(distance);
    System.out.println("走行距離："+bicycle1.getDistance()+"km");
  }
}