class Car{
  private String name;
  private String color;
  private int distance =0;
  private int fuel = 100;
  
  public Car(String name, String color){
    this.name = name;
    this.color = color;
  }
    public void printData(){
    System.out.println("【車の情報】");
    System.out.println("名前："+ this.name);
    System.out.println("色："+ this.color);
    System.out.println("走行距離："+this.distance+"km");
    System.out.println("ガソリン量："+this.fuel +"L");
    System.out.println("-----------------");
  }
  public void run(int distance){
    System.out.println(distance +"km走ります");
   
    if(this.fuel < distance){
      System.out.println("ガソリンが足りません");
    }else{
       
       this.distance = distance;
       this.fuel -= this.distance;
    }
    System.out.println("走行距離："+this.distance+"km");
    System.out.println("ガソリン量："+this.fuel+"L");
    
  }
  public int getDistance(){
    return this.distance;
  }
  public void charge(int gus){
    System.out.println(gus+"L給油します");
    if(gus<=0){
      System.out.println("給油できません");
    }else if(gus + this.fuel >100){
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    }else{
      this.fuel += gus;
    }
    System.out.println("ガソリン量："+this.fuel+"L");
  }
}