class Car{
  public String name;
  public String color;
  public int distance =0;
  public Car(String name, String color){
    this.name = name;
    this.color = color;
  }
    public void printData(){
    System.out.println("【車の情報】");
    System.out.println("名前："+ this.name);
    System.out.println("色："+ this.color);
    System.out.println("走行距離："+this.distance+"km");
    //System.out.println("-----------------");
  }
  public void run(int distance){
    this.distance = distance;
    System.out.println(distance +"km走ります");
  }
  public int getDistance(){
    return this.distance;
  }
}