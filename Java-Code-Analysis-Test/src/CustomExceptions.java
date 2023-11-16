
public class CustomExceptions extends Exception
{
    public CustomExceptions() 
    {
        super();
    }

    public CustomExceptions(String message) 
    {
        super(message);
    }

    public CustomExceptions(String message, Throwable cause) 
    {
        super(message, cause);
    }

    public CustomExceptions(Throwable cause) 
    {
        super(cause);
    }
}
