public class Person{
  public static String fullName(String firstName,String lastName){
    return firstName + " " + lastName;
  }
  public static void printData(String name,int age,double height,double weight){
    System.out.println("名前は"+ name +"です");
    System.out.println("年齢は"+age +"歳です");
    if(adult(age)){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
    System.out.println("身長は"+height+"mです");
    System.out.println("体重は"+weight+"kgです");
    double bmi= bmi(height,weight);
    System.out.println("BMIは"+Math.round(bmi)+"です");
    if(isHealth(bmi)){
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }
    
  }
  public static boolean adult(int age){
    if(age >= 20){
      return true;
    }else{
      return false;
    }
  }
  public static double bmi(double height,double weight){
    return weight/height/height;
  }
  public static boolean isHealth(double bmi){
    if(bmi >= 18.5 && bmi < 25.0){
      return true;
    }else{
      return false;
    }
    
  }
}