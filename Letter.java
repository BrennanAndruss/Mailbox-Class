public class Letter 
{
    private String message;
    private String sender;

    public Letter(String m, String s)
    {
        message = m;
        sender = s;
    }

    /**
     * Gets the message of the letter
     * @return message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Gets the sender of the letter
     * @return sender
     */
    public String getSender()
    {
        return sender;
    }

    /**
     * Returns the letter
     * @return message, sender
     */
    public String toString()
    {
        return message + "\nFrom, " + sender;
    }
}
