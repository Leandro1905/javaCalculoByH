/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Alumnos
 */
public class Miguel {

    public boolean esMiguelito(long n) {
        boolean v = true;

        if (n < 100) {
            v = false;
        }

        String[] vec = String.valueOf(n).split("");
        int pd = Integer.parseInt(vec[0]);
        int ud = Integer.parseInt(vec[vec.length - 1]);

        System.out.println(pd);

        System.out.println(ud);
        
        int i;
        int suma=0;
        for (i=1;i<vec.length-2;i++){
        suma=suma+Integer.parseInt(vec[i]);
        
        
        }
        
        

        /*
        String d1= String.valueOf(n);
        String d2=d1.substring(2,4);
        System.out.println(d1) ;
        System.out.println(d2);
        
      /*   String d1="Juan,20-40401476-6";
        String[] d2=d1.split(",");
        System.out.println(d2[1]);
        
        
     /*   String [] dato = String.valueOf(n).split("");
        System.out.println(dato[0]);
        System.out.println(dato[1]);
     
    /*String s= String.valueOf(n);
    
      /*  System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));*/
        return pd*ud==suma;


    }
    public void analizarPalabra(String p)
    {
   // String [] vec= p.split("");
    
     //   System.out.println(vec[5]);
    
    
    
    }    
    public void probar(){
    int n=1234;
    int d1=1234/100;
    
        System.out.println(d1);
            
    
    
    }
    
    
}
