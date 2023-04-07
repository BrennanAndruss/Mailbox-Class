import java.util.ArrayList;

public class Mailbox 
{
    private ArrayList<Letter> letters;
    private boolean newLetters;

    public Mailbox()
    {
        letters = new ArrayList<Letter>();
        newLetters = false;
    }

    /**
     * Gets number of letters in mailbox
     * @return numLetters
     */
    public int getNumLetters() 
    {
        return letters.size();
    }

    /**
     * Add letter to mailbox
     * @param letter
     */
    public void addLetter(Letter letter)
    {
        letters.add(letter);
        newLetters = true;
    }

    /**
     * Reports whether there are any new letters in mailbox
     * @return 
     */
    public boolean checkNewLetters()
    {
        return newLetters;
    }

    /**
     * Prints all letters from given sender and removes those letters from mailbox
     * @param sender
     */
    public void readLetter(String sender)
    {
        if (letters.size() == 0) 
        {
            System.out.println("There are no letters in your mailbox.");
        }
        else
        {
            boolean letterFound = false;
            for (int i = 0; i < letters.size(); i++) {
                if (letters.get(i).getSender().equals(sender))
                {
                    letterFound = true;
                    System.out.println(letters.get(i).getMessage());
                    letters.remove(i);
                    i--;
                }
            }
            if (!letterFound)
            {
                System.out.println("There are no letters from " + sender + " in your mailbox.");
            }
        }
        newLetters = false;
    }

    public void readLetter()
    {
        if (letters.size() == 0)
        {
            System.out.println("There are no letters in your mailbox.");
        }
        else
        {
            System.out.println(letters.get(0).getMessage());
            letters.remove(0);
        }
        newLetters = false;
    }
}