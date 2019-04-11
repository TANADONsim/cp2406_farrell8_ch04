public class FormLetterWriter
{
    public static void main(String args[])
    {
        /* Declaring First and Last names */
        String fName = "Leonard";
        String lName = "Sim";

        /* Testing only Last name */
        displaySalutation(lName);
        System.out.println("Thank you for your recent order");

        /* Testing both First and Last name */
        displaySalutation(fName, lName);
        System.out.println("Thank you for your recent order");
    }

    private static void displaySalutation(String lName)
    {
        System.out.println("Dear Mr. or Ms. " + lName);

    }

    private static void displaySalutation(String fName, String lName) {
        System.out.println("Dear " + fName + " " + lName);
    }
}
