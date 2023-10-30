package stringsdemo.com;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String literals--SCP
        String s="nucot";    
        String s1="nucot";
        String s2="Nucot";
        System.out.println(s==s1);//true
        System.out.println(s==s2);//false
        
        //String objects with new keyword
        String obj=new String("nucot");
        String obj1=new String("nucot");
        String obj3=new String("nucot");
        
        
        //here address are verified
        System.out.println(s==obj);//false
        
        System.out.println(s.equals(obj));//true
        
        
        System.out.println(obj==obj1);
        System.out.println(obj.equals(obj1));
        
        
        
        
        
    }



	}


