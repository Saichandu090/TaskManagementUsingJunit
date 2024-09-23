package todomanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest
{
    Manager m=new Manager();

    @Test
    public void sadAddingTask()
    {
        m.addTask(1,"Sai chandu"," ","2025-09-24"); //Empty description Exception
        m.addTask(2,"Jenny","Study","20256-10-24"); //Invalid Date Exception
    }

    @Test
    public void happyAddingTask()
    {
        m.addTask(1,"Sai chandu","Study man","2024-09-23");
        m.addTask(2,"Jenny","Studying sql","2025-10-24");
    }

    @Test
    public void sadRemoving()
    {
        m.addTask(1,"Sai chandu","Study man","2024-09-23");
        m.addTask(2,"Jenny","Studying sql","2025-10-24");
        m.removeTask(3);//  TaskNotFoundException
    }

    @Test
    public void happyRemoving()
    {
        m.addTask(1,"Sai chandu","Study man","2024-09-23");
        m.addTask(2,"Jenny","Studying sql","2025-10-24");
        m.removeTask(1);
        System.out.println(m.map);
    }

    @Test
    public void sadTaskViewing()
    {
        Assertions.assertFalse(m.map.isEmpty());
        m.showTask();
    }

    @Test
    public void happyTaskViewing()
    {
        m.addTask(1,"Sai chandu","Study man","2024-09-23");
        m.addTask(2,"Jenny","Studying sql","2025-10-24");

        Assertions.assertFalse(m.map.isEmpty());
        m.showTask();
    }


}