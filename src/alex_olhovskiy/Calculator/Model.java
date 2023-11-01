package alex_olhovskiy.Calculator;

import java.util.ArrayList;

public class Model {
	public String getString(String str) {
		System.out.println("String from model "+str);
		return "Answer String from model";
	}
	
//	public static char findChar(String str) {
//		char[]arr=str.toCharArray();
//		char[]firstNum;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(((int)arr[i]>=48)&&((int)arr[i]<58))
//			{
//				
//			}
//		}
//		return '!';
//	}
	
//	public <T> getNum(ArrayList<Character> list){
//		boolean isDouble=false;
//		for(Character c:list)
//		{
//			if(c=='.')
//			{
//				isDouble=true;
//			}
//		}
//		if(isDouble)
//		{
//			char[]arr=list.toArray();
//		}
//		return num;
//	}
//	
//	public static char findChar(String str) {
//		char[]arr=str.toCharArray();
//		ArrayList<Character>firstNumList=new ArrayList<>();
//		ArrayList<Character>secondNumList=new ArrayList<>();
//		int action=0;
//		boolean first=true;
//		for(int i=0;i<arr.length;i++)
//		{
//			if((((int)arr[i]>=48)&&((int)arr[i]<=58))||((int)arr[i]==46))
//			{
//				if(first)
//				{
//					firstNum.add(arr[i]);
//				}
//				else
//				{
//					secondNum.add(arr[i]);
//				}
//			}
//			else
//			{
//				first=false;
//				action=(int)arr[i];
//			}
//		}
//		
//				switch(action)
//				{
//					case 42://*
//						
//						break;
//					case 43://+
//						break;
//					case 45://-
//						break;
//					case 46://.
//						break;
//					case 47:///
//						break;
//					case 99://c
//						break;
//					case 97://a
//						break;
//					case 115://s
//						break;
//					case 98://b
//						break;
//					case 116://t
//						break;
//					case 100://d
//						break;
//					case 94://^
//						break;
//				}
//			
//		
//		return '!';
//	}
}
