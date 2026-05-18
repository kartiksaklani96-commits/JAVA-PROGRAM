import java.io.*;

class factorial {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
      
      	// default 16
        System.out.println(sb.capacity()); 
        sb.append("Hello");
      
      	// now 16
        System.out.println(sb.capacity()); 
        sb.append("java is my favourite language");
        
      	// (oldcapacity*2)+2
      	System.out.println(sb.capacity());
        System.out.println(sb.capacity()*2);
    }
}