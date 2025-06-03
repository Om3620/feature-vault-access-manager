package vaultAccessManager;

import java.util.UUID;

public   class implemntation extends user {

	 public static void createAcc() {
			System.out.println("\nplease entre your name");
	      name= s.next();
	     
	      
		//to check Adhar number is valid or not
			System.out.println("\nplease entre your adhar number");
		
			 id= s.next();
			  String rege="\\d{12}";
			 
			while(id.matches(rege)==false) {
			 System.out.println("\n\t\t ----------Oops-------- \nYOUR ADHAR NUMBRE IS WRONG\n\tPLEASE ENTRE RIGHT ADHAR NUMBER...");
				System.out.println("please Renter your Adhar number");
			  id=s.next();
			
			 }
			
			// to check no is valid or not
			
			System.out.println("\nplease enter mobile number");
		
			mo=s.next();
			String regex= "\\d{10}";
			
				while(mo.matches(regex)==false) {
				System.out.println("\n\t\t ----------Oops-------- \nYOUR MOBLE NUMBER IS NOT VALID");
				System.out.println("MESSAGE:- PLEASE ENTER 10 DIGIT NUMBER ONLY");
				System.out.println("please press **ENTER BUTTON** to Renter number");
				mo=s.next();
				
			}
			System.out.println(" **90%completed**");
			System.out.println(" you should be add minimum 500$ Rupees don't worry this amount will add in your saving account");
			balance =s.nextInt();
			System.out.println("----------your account is successfully created--------------");
			 username();
			 password(); 
			}
		public static void username() {
		StringBuffer sf=new StringBuffer(name);
			String userName= ""+sf.append("@")+mo.substring(0, 4);
			System.out.println("USERNAME :- "+userName);
			
			verifyusername=userName;
		}
		
		public static void password() {
			
			UUID u= UUID.randomUUID();
			
		     if(name.length()>5) {
		    
		    	char first=	name.charAt(0);
		    		String s=""+first;
		    		s.toUpperCase();
		    		String str=name.substring(1, 5);
		    		StringBuffer sf1=new StringBuffer(str);
		    		 String pass= s.toUpperCase()+sf1.insert( 4, "@")+u.toString();
		    			password = pass.substring(0, 8);
		    		
		    	System.out.println("PASSWORD :- "+password);
		     }else 
		     {
		    	 
		     char first=name.charAt(0);
	 		String s=""+first;
	 		s.toUpperCase();
	 		String str=name.substring(1);
	 		StringBuffer sf=new StringBuffer(str);

			String pass = s.toUpperCase()+sf.insert(sf.length(),"@")+u.toString();
			password= pass.substring(0, 8);
			System.out.println("PASSWORD :- "+password);
		}
		     }
		public static void logIn() 
		{  
			
			System.out.println("\nplease enter user name");
			String user=s.next();
		
			if(user.equals(verifyusername)) {
				
			       System.out.println("\nplease enter your password");
					
				 String pass= s.next();
					
				  if(pass.equals(password)) {
					System.out.println("logged in Successfull");
					 m1();
					
					
				}
				  else {
					  while(pass.equals(password)==false) {
						  System.out.println("*****Oops*****");
					  System.out.println("please Renter pasword");
					  pass= s.next();
				  }
				  m1();
				  }
				  
				  }
				  else if(verifyusername==null) {
						System.out.println("\n**USERNAME NOT FOUND**");
					System.out.println("\nYou Haven't Created account ");
					System.out.println("\n\t\tPLEASE CREATE ACCOUNT FIRST");
					createAcc();
					}
				
			  else {
					 
						  System.out.println("\n\t\t******Oops****** \nUsername Mismatch ");
					  System.out.println("please re enter username");
					System.out.println("press 2 ");

					  }
					  }
		
		
			public static void m1() { 
				
			System.out.println("\n1) Deposite money" +"\n\n2) Withdraw money "+ "\n\n3) Check balance" +"\\nn4) Exite");
			while(true) {
			System.out.println("enter operation you want to perform");
			
			int choice=s.nextInt();
			
			switch(choice) {
			case 1:
				 Deposite();
				 System.out.println("-------------------------------------------------------------------");
				break;
			case 2:
				Withdraw();
				 System.out.println("-------------------------------------------------------------------");
				break;
			case 3:
				cheakbalance();
				 System.out.println("-------------------------------------------------------------------");
				break;
			case 4:
				logOut();
				System.exit(0);
				 System.out.println("-------------------------------------------------------------------");
				break;
			 default:
			    	System.out.println("plz enter right choie code");
			}
			}
			}
		
		public static void logOut() {
			if(verifyusername==null) {
				System.out.println("you are not loggedIn");
			}
			else {
				
				System.out.println("logged out succesfully");
			       
			}
				
			       
		}
		
		public static void Deposite() {
			System.out.println("plz Enter ur money");
			int mon= s.nextInt();
			balance=balance+mon;
			System.out.println("Your money is successfully deposited" +"\nyour current balance is" + balance);
			
		}
	
		public static void Withdraw() {
			System.out.println("plz enter a amount you want withdraw");
			int with=s.nextInt();
			if(balance<with) {
				System.out.println("your account has not sufficient balance to withdraw please cheak your balance");
			}
			else {
				balance=balance-with;
			System.out.println("your money withdraw successfully" + "\nyour current balance would be" + balance );
			
		}}
		
		public static void cheakbalance() {
			
	         System.out.println("your balance is " + balance);	
		}
       
       }
		
	    
