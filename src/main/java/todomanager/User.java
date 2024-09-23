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
        if(!description.matches("^[a-zA-Z0-9]+[a-zA-Z0-9 _]{1,100}$"))
            throw new EmptyDescriptionException();
        this.dueDate=dueDate;
        if(!dueDate.matches("^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"))
            throw new InvalidDateFormatException();
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
        return "User [" +
                "Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", DueDate=" + dueDate +
                ']';
    }

}
