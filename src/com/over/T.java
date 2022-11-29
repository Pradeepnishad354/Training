package com.over;

 class Bank {
	
	int getRateOfIntrest() {
		return 0;
	}
}
	class SBI extends Bank{
		
		int getRateOfIntrest() {
			return 3;
			
		}
	}
		class ICICI extends Bank{
			
			
			int getRateOfIntrest() {
				
				return 4;
			}
		}
			class Axis extends Bank{
				
				int getRateOfIntrest() {
					
					return 5;
				}
			}			
			
	class T{
		
		
		public static void main(String[] args) {
			
			SBI s=new SBI();
			ICICI i=new ICICI();
			Axis a=new Axis();
			
			
			System.out.println("SBI rate of intrest:"+s.getRateOfIntrest());
			
			System.out.println("ICICI rate of intrest:"+i.getRateOfIntrest());
			System.out.println("Axis rate of intrest:"+a.getRateOfIntrest());
			
		}
	}
		
		
	


