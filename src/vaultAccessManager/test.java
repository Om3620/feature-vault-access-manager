package vaultAccessManager;

import java.util.Scanner;

public  class test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implemntation i=new implemntation();
Scanner sc= new Scanner(System.in);

System.out.println("________________________________________________________________________________________________");
while(true) {
	
System.out.println("\n1)New user/register \n\n2)logIn \n\n3)logOut\n\n4)exite");
System.out.println("_____________________________________________________________________________________________________");
System.out.println("\nplease entre your choice");

int ch =sc.nextInt();
switch(ch) {
    case 1:
    	System.out.println("------------------------------------------------------------------------------------------------");
    	try{i.createAcc();
    	
    	}catch(NumberFormatException e) {
    		System.out.println("please enter numbers only");
    	}
    	System.out.println("------------------------------------------------------------------------------------------------");
break;
    case 2:
    	System.out.println("------------------------------------------------------------------------------------------------");
  i.logIn() ;
  System.out.println("------------------------------------------------------------------------------------------------");
    break;
    case 3:
    	System.out.println("------------------------------------------------------------------------------------------------");
    	i.logOut();
    	System.out.println("------------------------------------------------------------------------------------------------");
    break;
    case 4:
    	System.out.println("------------------------------------------------------------------------------------------------");
    	System.out.println("you are exited successfully");
    	System.exit(0);
    	System.out.println("------------------------------------------------------------------------------------------------");
    default:
    	System.out.println("plz enter right choie code");


}
}	}

	
	
}

