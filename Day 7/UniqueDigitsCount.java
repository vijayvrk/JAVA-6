/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String str = Integer.toString(input1);

int len=str.length();   

int count=0;

for(int i=0;i<len-1;i++){           

for(int j=i+1;j<len;j++){               

if(str.charAt(i)==str.charAt(j)) {           

count++;                     
break;                 
}} 
 }       
  return len-count;   
	
            }
}

