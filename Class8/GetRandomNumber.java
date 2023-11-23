package yao.zongbin.cn;
import java.util.*;
public class GetRandomNumber {
    public static int[] getRandomNumber(int max,int amount) {
        int [] result = new int[amount];
        int [] a = new int[max];
        Random random = new Random();
        for(int i=0;i<a.length;i++){
            a[i]=i+i;
        }
        for(int i =0;i<amount;i++){
            int index = random.nextInt(a.length);
            result[i] = a[index];
            int [] b = Arrays.copyOfRange(a,0,index);
            int [] c = Arrays.copyOfRange(a,index+1,a.length);
            a = new int[b.length+c.length];
            for(int k=0;k<a.length;k++){
                if(k<b.length){
                    a[k] = b[k];
                }else {
                    a[k] = c[k-b.length];
                }
            }
        }
        return result;
    }

}
