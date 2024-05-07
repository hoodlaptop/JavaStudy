package Chapter7;

import java.util.Iterator;
import java.util.Vector;

public class EX_07_04
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> it = v.iterator();
        int sum = 0;

        while (it.hasNext())
        {
            int n = it.next();
            System.out.println(n);
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
