package alex_olhovskiy.Calculator;

import java.util.ArrayList;

public class Model {
	public String getString(String str) {
		//System.out.println("String from model "+str);
		return Double.toString(findChar(str));//"Answer String from model";
	}
	
	public double findChar(String str) {
		char[]arr=str.toCharArray();
		ArrayList<String>firstNumList=new ArrayList<>();
		ArrayList<String>secondNumList=new ArrayList<>();
		int action=0;
		boolean first=true;
		boolean firstNumDouble;
		boolean secondNumDouble;
		for(int i=0;i<arr.length;i++)
		{
			if((((int)arr[i]>=48)&&((int)arr[i]<=58))||((int)arr[i]==46))
			{
				if(first)
				{
					firstNumList.add(""+arr[i]);
				}
				else
				{
					secondNumList.add(""+arr[i]);
				}
			}
			else
			{
				first=false;
				action=(int)arr[i];
			}
		}
		
		
		double numOne=Double.parseDouble(String.join("",firstNumList));
		double numTwo=0;
		if(secondNumList.size()>0)
		{
			numTwo=Double.parseDouble(String.join("",secondNumList));
		}
		double res=0;
		switch(action)
		{
			case 42://*
				res=numOne*numTwo;
				break;
			case 43://+
				res=numOne+numTwo;
				break;
			case 45://-
				res=numOne-numTwo;
				break;
			case 46://.
				break;
			case 47:///
				res=numOne/numTwo;
				break;
			case 99://c
				res=Math.cos(numOne);
				break;
			case 97://a
				res=Math.acos(numOne);
				break;
			case 115://s
				res=Math.sin(numOne);
				break;
			case 98://b
				res=Math.asin(numOne);
				break;
			case 116://t
				res=Math.tan(numOne);
				break;
			case 100://d
				res=Math.atan(numOne);
				break;
			case 94://^
				res=Math.pow(numOne,numTwo);
				break;
		}
		
		return res;
	}
}
