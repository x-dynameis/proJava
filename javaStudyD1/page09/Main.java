import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("何人分の情報を入力しますか：");
    
    int i = scanner.nextInt();
    int ii = 1;
    while(i>0){
    System.out.println(ii+"人目");
    System.out.print ("名前：");
    String firstName = scanner.next();
    System.out.print("名字：");
    String lastName = scanner.next();
    System.out.print("年齢：");
    int age = scanner.nextInt();
    System.out.print("身長(m)：");
    double height = scanner.nextDouble();
    System.out.print("体重(kg)：");
    double weight = scanner.nextDouble();
   
    String names = Person.fullName(firstName,lastName);
   
    Person.printData(names,age,height,weight);
     i--;
     ii++;
    }
    
    
  }
}
