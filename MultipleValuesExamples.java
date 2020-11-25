import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultipleValuesExamples {
    /*public MultipleValuesExamples(){

    }*/
    public static void main(String[] args){
        HashMap<Integer, ArrayList<Integer>> map= new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        //map.put(1,new ArrayList<Integer>());
        //ArrayList<Integer> list=map.get(1);
        for(int i=0;i<=5;i++){
            ls.add(i);
        }
        map.put(1,ls);
        map.put(2,ls);
        //System.out.println(map);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            //Integer key=entry.getKey();
            //ArrayList<Integer> value=entry.getValue();
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
