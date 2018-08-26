package edu.string;

public class Reci {

	public static void main(String[] args) {
		
		String s1="Tehnicki fakultet Mihalo Pupin";
        String s2="Zrenjanin se nalazi u Srednjem Banatu ";
        
        int count=1,digit_count=0,upper_count=0,lowwer_count=0,vocal=0;
        /*
         * Funkcija koja nam pokazuje da li su stringovi  jednaki ili ne 
         */
        if(s1.equals(s2)){
        	System.out.println("Stringovi su  isti ");
        }
        else {
        	System.out.println("Stringovi su  razliciti ");
        }
        /*
         * Funkcija koja broji koliko ima reci u stringu
         */
        for(int i=0;i<s1.length();i++){
        	if (s1.charAt(i) == ' ' )
			{
				count++;
 
			}
        }
        System.out.println("Broj reci je : "+count);
        /*
         * Funkcija koja broji koliko slova ima u stringu ,koliko ima velikih slova i koliko ima malih slova
         */
       for(int j=0; j<s2.length();j++){
    	   if(Character.isLetter(s2.charAt(j))){
    		   digit_count++;
    	   }
    	   if (Character.isUpperCase(s2.charAt(j))){
    		   upper_count++;
    		   
    	   }
    	   if (Character.isLowerCase(s2.charAt(j))){
    		   lowwer_count++;
    		   
    	   }
    	  
       }
       
       System.out.println("Broj slova je : "+digit_count);
       System.out.println("Broj velikih slova je : "+upper_count);
       System.out.println("Broj malih slova je :"+lowwer_count);
       /*
        * Funkcija koja nam pokazuje koliko ima samoglasnika u stringu
        */
       for (int m=0;m<s2.length();m++){
    	   if (s2.charAt(m)=='a'|| s2.charAt(m)=='A'||s2.charAt(m)=='e'||s2.charAt(m)=='E'||s2.charAt(m)=='i'||s2.charAt(m)=='I'||
    			   s2.charAt(m)=='o'||s2.charAt(m)=='O'||s2.charAt(m)=='u'||s2.charAt(m)=='U'){
    		   vocal++;
    	   }
       }
       System.out.println("Samoglasnika je : "+vocal);
	}
	
		/*
	String str = "ONCE UPON a time";
    char ch;
    int uppercase=0,lowercase=0;
    for(int i=0;i<str.length();i++)
    {
        ch = str.charAt(i);
        int asciivalue = (int)ch;
        if(asciivalue >=65 && asciivalue <=90){
            uppercase++;
        }
        else if(asciivalue >=97 && asciivalue <=122){
            lowercase++;
        }
    }
    System.out.println("No of lowercase letter : " + lowercase);
    System.out.println("No of uppercase letter : " + uppercase);
	*/
	

}

