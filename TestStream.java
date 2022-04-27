import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStream {
    public static List<Double> prices = new ArrayList<Double>();
    public static Double[] price2 = {20.45,30.1,33.33,10.15,20.4};
    public static void main(String[] args) {
        prices.add(2.75);
        prices.add(10.75);
        prices.add(20.75);
        prices.add(5.75);

        // filterWithOutstream(prices);
        filterWithOutstream(Arrays.asList(price2));
    }
    public static void filterWithOutstream(List<Double> list) {
        // for(int i = 0 ; i < prices.size() ; i++){
        // if (prices.get(i)< 10){
        // System.out.println(prices.get(i));
        // }
        // }
        list.stream()
        .filter((e)-> e >10)
        .forEach(e->System.out.println(e));

    }
    
}