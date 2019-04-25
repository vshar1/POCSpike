package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TupleUtils {

    public static int getMaxTupleMaxDepth(int[] array){
        int arrayLength=array.length;
        int longestTupleLength=1;

        List<Integer> tuplesDepths = new ArrayList<Integer>();

        for (int index=0; index<arrayLength;index++){
            int nextCounter=index+1;

            if(nextCounter<arrayLength){
                {
                    int currentValue = array[index];
                    int nextValue = array[nextCounter];
                    if (currentValue<nextValue){
                        longestTupleLength=longestTupleLength+1;
                    }
                    else{
                        tuplesDepths.add(longestTupleLength);
                        longestTupleLength=1;
                    }
                }
            }

        }
        Collections.sort(tuplesDepths, Collections.reverseOrder());
        return tuplesDepths.get(0).intValue();
    }
}
