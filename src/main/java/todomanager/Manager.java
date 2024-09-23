package todomanager;

import java.util.*;

public class Manager
{
    Map<Integer,User> map=new LinkedHashMap<>();

    public void addTask(int index,String name,String descrip,String date)
    {
        if(!descrip.matches("^[a-zA-Z0-9]+[a-zA-Z0-9 _]{0,100}$"))
            throw new EmptyDescriptionException();
        if(!date.matches("^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"))
            throw new InvalidDateFormatException();
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
