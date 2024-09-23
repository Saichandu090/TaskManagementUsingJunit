package todomanager;

import java.time.LocalDate;

public class User
{
    private String name;
    private String description;
    private String dueDate;

    User(String name,String description,String dueDate)
    {
        this.name=name;
        this.description=description;
        this.dueDate=dueDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String  getDueDate() {
        return dueDate;
    }

    public void setDueDate(String  dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return " -> [" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", DueDate=" + dueDate +
                ']';
    }

}
