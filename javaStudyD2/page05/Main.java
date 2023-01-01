class Main {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
    bicycle1.printData();
    bicycle1.run(10);
    System.out.println("走行距離："+bicycle1.getDistance()+"km");
  }
}