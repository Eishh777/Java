//finding minimum and maximum values by entered values

import java.util.*;

public class minmax{
    int a,b,c;
    public void minmax(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
    }
    public void find(){
        int min= Math.min(a, Math.min(b,c));
        int max=Math.max(a, Math.max(b,c));

        System.out.println("minimum value"+min);
        System.out.println("maximum value: "+max);


    }
    public static void main(String[] args) {
        minmax m =new minmax();
        m.minmax();
        m.find();
        

    }
}
