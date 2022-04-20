import java.util.*;
import java.io.*;
import java.lang.*;

public class s2 {
    static ArrayList<String>spacestring(String str)
    {
        ArrayList<String> strs=new ArrayList<String>();
        if(str.length()==1)
        {
            strs.add(str);
            return strs;
        }
        ArrayList<String> strtemp=spacestring(str.substring(1,str.length()));
        for(int i=0;i<strtemp.size();i++)
        {
            strs.add(str.charAt(0)+strtemp.get(i));
            strs.add(str.charAt(0)+" "+strtemp.get(i));
        }
        return strs;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        ArrayList<String> strs=spacestring(str);
        for(int i=0;i<strs.size();i++)
        {
            System.out.println(strs.get(i));
        }
    }
}
