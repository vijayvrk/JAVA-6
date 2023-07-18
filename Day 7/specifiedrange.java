/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int k=2;   
           int d=input1,i,c=0; 
           int p=0;
           int cou=0;
// Read only region end

while(d<=input2){
    for(i=2;i<d;i++)
    {
        if(d%i==0)
    {
        c++; 
    }
    }
        if(c==0)
        {
            cou++;
            System.out.println(d);
            }
            d++;
            c=0;
            }
            return cou;
            }
}

