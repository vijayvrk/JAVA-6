/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import  java.util.*;
class UserMainCode
{
                public int digitSum(int input1){
                                int neg=input1;
                                if(input1<0)
                                {
                                                input1*=-1;
                                }
                                int len=Integer.toString(input1).length();
                                if(len==1)
                                {
                                                if(neg<0)
                                                return input1*-1;
                                                else
                                                                return input1;
                                }
                                else
                                {
                                                int sum=0;
                                while(input1!=0)
                                {
                                                int rem=input1%10;
                                                sum+=rem;
                                                input1/=10;
                                }
                                                if(neg<0)
                                                                return digitSum(sum*-1);
                                                else
                                                                return digitSum(sum);
                }}
}
