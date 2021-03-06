package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class  Stringr {
	
	String ccz="sri";
	
	public  Stringr(){
		
		this.ccz="kant";
	}
	
	
	
	
	
	
	
	
	public static void strrev() {
		
		String xx ="Srikanth";
		String cc = "";
		
		for(int i=xx.length()-1;i>=0;i--) {
			
		cc=cc+xx.charAt(i);
			
		}
		
	System.out.print(cc);
	}
	
	
	
	public static void  revnum() {
		
		int x =1234 , rev =0;
		
		
		while(x!=0) {
			
			int dig = x%10;
			
			rev=rev*10+dig;
			x /=10;	
			
		}
		
		System.out.print(rev);
	}
	
	public static void prime() {
		
		int aa=29;
		boolean flag=false;;
		
		for(int i=2;i<aa/2;i++) {
			
			
			if(aa%i==0) {
				flag=true;
			}
			
		}
		
		if(flag=true) {
			System.out.print("Prime");
		}else {
			System.out.print("Not Prime");
		}
		
	}
		public static void stringocc () {
			
			
			String xx ="ssriiikann";
			HashMap <Character, Integer> hMap = new HashMap<>();
			
			for (int i =xx.length()-1;i>=0;i--) {
				
				  if (hMap.containsKey(xx.charAt(i))) {
					  
					  int count = hMap.get(xx.charAt(i));
					  
					  System.out.print(count);
					  
			            hMap.put(xx.charAt(i), ++count);
					  
				  } else {
			            hMap.put(xx.charAt(i),1);
			         }
			}
			 System.out.println(hMap);		
					
					
		
	}
		
		public static void sep() {
			
			String xx ="zcabc895123";
			
			List<Character> s =new ArrayList<>();
			
			List<Character> s1 =new ArrayList<>();
			
			
			for(int i=0;i<=xx.length()-1;i++) {
				
				if((xx.charAt(i) >= 'A' && xx.charAt(i) <= 'Z') || (xx.charAt(i) >= 'a' && xx.charAt(i) <= 'z')) {
					
					
			s.add(xx.charAt(i));
			
			} else if(xx.charAt(i) >= '0' && xx.charAt(i) <= '9') {
				
				s1.add(xx.charAt(i));
				
			}
				    
				
			}
			
			
			Collections.sort(s);
			Collections.sort(s1);
			
			System.out.print(s);
			System.out.print(s1);
			
		}
		
		
		public static void m2() {
			
			String xx = "sri kanth";
		
			if(xx=="sri kanth") {
				System.out.print("hel");
			}
			
			
		}
	
		
		public static void largeNumArray() {
			

			int[] arr={8,3,15,9,17,4,23,2};
			
			int x=arr[0];
			
			
			for(int i=0;i<=arr.length-1;i++) {
				
				if(arr[i] > x){
					x=arr[i];
				}
				
			}
			
			System.out.println("Largest value in the Given Array is "+ x);

			

		}
		
		
		
		
		public static void duplicate() {
			
			String str = "ssrikaap";
		      char[] carray = str.toCharArray();
		      System.out.println("The string is:" + str);
		      System.out.print("Duplicate Characters in above string are: ");
		      for (int i = 0; i < str.length(); i++) {
		         for (int j = i + 1; j < str.length(); j++) {
		            if (carray[i] == carray[j]) {
		               System.out.print(carray[j] + " ");
		               break;
		            }
		         }
		      }
			
		}
		
public static void main(String arg[]) {
	//Stringr n = new Stringr();
	//	//n.largeNumArray();
		//Stringr.strrev();
		//Stringr.revnum();
		//Stringr.prime();
		//Stringr.stringocc();
	//Stringr.sep();
		Stringr.duplicate();
		
	//System.out.print(n.ccz);

	}
	

}
