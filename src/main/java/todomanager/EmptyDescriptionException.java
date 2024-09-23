package todomanager;

public class EmptyDescriptionException extends RuntimeException
{
    private String message;

    EmptyDescriptionException(String message)
    {
        this.message=message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
