//you are given variation per day in the price of a stock. find the no. of consegative days for which price<=todays price.
import java.util.*;
public class StockSpan {
    public static void stockSpan(int Stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        s.push(0);
        span[0]=1;
        for(int i=1;i<Stocks.length;i++){
            while(Stocks[i]>Stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();
                s.push(i);
            }
        }
    }
    public static void main(String[] args) {
        int Stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[Stocks.length];

        stockSpan(Stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}
