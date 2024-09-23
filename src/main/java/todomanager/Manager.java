package todomanager;

import java.util.*;

public class Manager
{
    Map<Integer,User> map=new LinkedHashMap<>();

    public void addTask(int index,String name,String descrip,String date)
    {
        map.put(index,new User(name,descrip,date));
    }

    public void removeTask(int index)
    {
        if(!map.containsKey(index))
            throw new TaskNotFoundException();
        map.remove(index);
    }

    public void showTask()
    {
        Set<Integer> keys=map.keySet();
        for(int key : keys)
        {
            System.out.println(key +" "+map.get(key));
        }
    }
}
