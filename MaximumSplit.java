import java.util.ArrayList;
import java.util.List;

public class MaximumSplit {
    public static List<Long> maximumEvenSplit(long finalSum) {
        List<Long> out = new ArrayList<>();
        if(finalSum%2 != 0){
            return out;
        }
        long i = 2;
        while(finalSum>0){
            if(finalSum>=i){
                finalSum -= i;
                out.add(i);
            }else {
                out.set(out.size()-1, out.get(out.size()-1)+finalSum);
                finalSum = 0;
            }
            i += 2;
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(maximumEvenSplit(28));
    }
}
