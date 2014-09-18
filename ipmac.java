package ipmac;
import java.util.*;
import java.net.*;
import java.io.*;
public class Ipmac 
{
    public static void main(String[] args)
    {    
        InetAddress ip;
        String Str = new String();
        try
        {
            ip = InetAddress.getLocalHost();
            System.out.println("Host Machine : " + ip);
            Str=ip.getHostAddress();
            System.out.println("IP address : " + ip.getHostAddress());
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            System.out.print("MAC address : ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) 
            {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
            }
            System.out.println(sb.toString());
                    
        }
        catch (Exception e) 
        {
        }
        int a=Integer.parseInt(Str.substring(0,3));
        System.out.println(a);
        if(a>=0&&a<=127)
            System.out.println("Class A "+a);
        else if(a>=128 && a<=191)
               System.out.println("Class B " +a);
        else if(a>=192 && a<=223)
                System.out.println("Class C " +a);
        else if(a>=224 && a<=239)
                System.out.println("Class D "+a);
        else if(a>=240 && a<=255)
                System.out.println("Class E "+a);
        else System.out.println("Error");
    }
}
