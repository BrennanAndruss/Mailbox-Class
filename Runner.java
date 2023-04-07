public class Runner 
{
    public static void main(String[] args) 
    {
        Mailbox m = new Mailbox();
        System.out.println(m.checkNewLetters());
        m.readLetter();

        Letter l1 = new Letter("Hi John,\nthe IRS is coming for you.", "IRS");
        m.addLetter(l1);
        System.out.println(m.checkNewLetters());
        System.out.println("There is " + m.getNumLetters() + " letter in your mailbox.");

        Letter l2 = new Letter("Dear John,\nunfortunately, we were unable to offer you admission to Havard University", "Havard");
        m.addLetter(l2);
        System.out.println("There are " + m.getNumLetters() + " letters in your mailbox.");
        m.readLetter();
        System.out.println(m.checkNewLetters());
        System.out.println("There is " + m.getNumLetters() + " letter in your mailbox.");
        
        Letter l3 = new Letter("Hi John,\nyour Brooks PR socks are in the mail", "Brooks");
        m.addLetter(l3);
        System.out.println(m.checkNewLetters());
        
        Letter l4 = new Letter("Dearest John,\nI really miss you", "Grannie Jojo");
        m.addLetter(l4);
        System.out.println("There are " + m.getNumLetters() + " letters in your mailbox.");
        m.readLetter("Grannie Jojo");
        System.out.println(m.checkNewLetters());
        System.out.println("There are " + m.getNumLetters() + " letters in your mailbox.");
    }
}
