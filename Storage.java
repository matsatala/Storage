package pl.zaawansowanajava.excercise.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, ArrayList<String>> map = new HashMap<>();

    public Storage() {}
    public void addToStorage(String key,String value){
        if (map.containsKey(key)){
            map.get(key).add(value);
        }
        else {
            ArrayList<String> values = new ArrayList<>();
            values.add(value);
            map.put(key,values);

        }
    }
    public void printValues(String key){
        System.out.println(map.get(key));
    }
    public void findValue(String value){
        for (String key : map.keySet()){
            if (map.get(key).contains(value)){
                System.out.println(key);
            }
        }
    }


}
