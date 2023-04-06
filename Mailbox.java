import java.util.ArrayList;

public class Mailbox {
    private ArrayList<Letter> letters;
    private boolean newLetters;

    public Mailbox()
    {
        letters = new ArrayList<Letter>();
        newLetters = false;
    }

    /**
     * Gets number of letters in mailbox
     * @return 
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
    }

    /**
     * Prints all letters from given sender and removes those letters from mailbox
     * @param sender
     */
    public void readLetter(String sender)
    {
        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i).getSender().equals(sender))
            {
                System.out.println(letters.get(i).getMessage());
                letters.remove(i);
                i--;
            }
        }
    }
}