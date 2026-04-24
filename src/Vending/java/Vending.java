package Vending.java;
import java.util.Scanner;
public class Vending{
	    static int total=0,trayNo;
	    public static void main(String[] args) {
	        do{
	        System.out.println("Tray1 | bevarages");
	        System.out.println("Tray2 | Snacks");
	        System.out.println("Tray3 | Chocolates");

	        System.out.println("Select your tray by using(1/2/3/0(Exit))");

	        Scanner sc=new Scanner(System.in);
	        trayNo=sc.nextInt();
	        char stay;
	        switch(trayNo){
	            case 1:
	                {
	                    do{
	                    System.out.println("a. Coca Cola 20");
	                    System.out.println("b. Sprit 30");
	                    System.out.println("c. Maaza 40");
	                    System.out.println("d. Monster 50");
	                    System.out.println("Item to purchase(a/b/c/d)");
	                    char prod=sc.next().charAt(0);

	                    if(prod=='a'){
	                        total+=20;
	                    }
	                    else if(prod=='b'){
	                        total+=30;
	                    }
	                    else if(prod=='c'){
	                        total+=40;
	                    }else{
	                        total+=50;
	                    }
	                    
	                    System.out.println("Stay on the same tray(y/n)");
	                 
	                    stay= sc.next().charAt(0);
	                }while(stay!='n');
	                break;
	            }
	                case 2:
	                {
	                    do{
	                    System.out.println("a. Lays 20");
	                    System.out.println("b. puffins 30");
	                    System.out.println("c. Bread 40");
	                    System.out.println("d. Haldiram 50");
	                    System.out.println("Item to purchase(a/b/c/d)");
	                    char prod=sc.next().charAt(0);

	                    if(prod=='a'){
	                        total+=20;
	                    }
	                    else if(prod=='b'){
	                        total+=30;
	                    }
	                    else if(prod=='c'){
	                        total+=40;
	                    }else{
	                        total+=50;
	                    }
	                    
	                    System.out.println("Stay on the same tray(y/n)");
	                    stay= sc.next().charAt(0);
	                }while(stay!='n');
	                break;
	                }
	                case 3:
	                {
	                    do{
	                    System.out.println("a. Dairy-Milk 20");
	                    System.out.println("b. Kit-kat 30");
	                    System.out.println("c. Munch 40");
	                    System.out.println("d. Silk 50");
	                    System.out.println("Item to purchase(a/b/c/d)");
	                    char prod=sc.next().charAt(0);

	                    if(prod=='a'){
	                        total+=20;
	                    }
	                    else if(prod=='b'){
	                        total+=30;
	                    }
	                    else if(prod=='c'){
	                        total+=40;
	                    }else{
	                        total+=50;
	                    }
	                    
	                    System.out.println("Stay on the same tray(y/n)");
	                 
	                    stay= sc.next().charAt(0);
	                }while(stay!='n');
	                break;
	                }
	            default:
	                break;
	        }
	    }while(trayNo!=0); 
	    System.out.println("Total amount :"+total);

	    }
	}


