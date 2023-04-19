
package prova;

public class Prova {

    public static void main(String[] args) {
         int v0 = 3; //4 
         int v1 = v0++;//4
         int v2 = ++v1;//4
v1 += v0;
v2 += --v1;

         System.out.println(v0);
         System.out.println(v1);
         System.out.println(v2);
         
}
    
}
