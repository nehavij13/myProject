import java.util.*;

public class MinSumIndex {

    public static void findRestaurant(String[] list1, String[] list2) {
        /*ArrayList<String> lis = new ArrayList<>(Arrays.asList(list1));
        ArrayList<String> lis2 = new ArrayList<>(Arrays.asList(list2));
        //List<String> list = Arrays.asList(list2);
       boolean b = lis.retainAll(lis2);
        if(b){
            for(int i=0;i<list1.length;i++){

            }
        }*/
        Map<String,Integer> map1 = new HashMap<String,Integer>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
        }
        System.out.println(map1);
        System.out.println(map2);

        Set<String> hset = new HashSet<String>();


    }
    public static void main(String[] args){
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        //System.out.println(findRestaurant(list1,list2));
        findRestaurant(list1,list2);
        //uniqueOccurrences(nums);

    }
}
