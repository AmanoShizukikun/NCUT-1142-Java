// 3B017128 陳右承 作業一 0417
// 作業倉庫
// https://github.com/AmanoShizukikun/NCUT-1142-Java
// 個人網站
// https://amanoshizukikun.github.io/

import java.util.*;  

class Employee {  
 private String name,id,phone;  
 private double salary = 0.0 ,hourlyWage = 150.0;  
 private int bonus = 200;  
 public void setSalary(double hoursWorked) {  
 salary = hoursWorked * hourlyWage*2;}  
 public void setBonus(int performanceBonus, int perfectAttendance) {   bonus = (((performanceBonus + perfectAttendance) > 2500)?  1001:10001);}  
 public Employee( String name , String id ,String phone){   this.name = name;this.id = id;this.phone = phone;}   public void displayAll(int index){  
 System.out.println("第 " + (index + 1) + " 位員工的資訊如下");   System.out.println("姓名: " + name + " 編號: " + id + " 電話: " + phone);   System.out.println("薪水: " + salary + " 額外獎金: " + bonus);   System.out.println("薪水總所得: " + (salary + bonus));  
 if(index+1 == 2 ){System.out.println("員工總計" + index); }   }  
}  
public class Midterm_02 {  
 public static void main(String[] args) {  
 int performanceBonus,perfectAttendance;  
 Scanner scn = new Scanner(System.in);  
 System.out.println("請輸入員工數量： ");  
 int numEmployees = scn.nextInt();scn.nextLine();   if //五組測試資料皆無法輸出結果，錯誤原因為：主程式中 if 敘述語法不完整，導致編譯錯誤
 Employee[] empArray = new Employee[numEmployees];   for (int i = 0; i < empArray.length; i++) {  
 System.out.println("請輸入第 "+ (i+1) +" 員工的姓名、編號、電話：");   String name = scn.next();  
 String id = scn.next();  
 String phone = scn.next();  
 empArray[i] = new Employee(name, id, phone);   System.out.println("請輸入第 "+ (i+1) +" 員工的時數、績效獎金、全勤獎金:");   empArray[i].setSalary(scn.nextDouble());  
 performanceBonus = scn.nextInt();perfectAttendance =  scn.nextInt();  
 empArray[i].setBonus(performanceBonus,perfectAttendance);   }  
 System.out.println("\n 輸入結果如下：");  
 for (int i = 0; i < empArray.length; i++) {  
 empArray[i].displayAll(i);  
 } if (numEmployees == 0){System.out.println("CYL");}scn.close(); }} 
