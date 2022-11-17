import java.text.NumberFormat;
import java.util.Locale;

public class GoodStudent
{

    //instance variables
    private final String firstName;
    private final String lastName;
    private int idNum;
    private double gpa;
    private final boolean inCS;

    //Constructors

    public GoodStudent(String firstName, String lastName, int idNum, double gpa, boolean inCS)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpa = gpa;
        this.inCS = inCS;
    } // end full constructor

    public GoodStudent(boolean myCS, String myFirst, String myLast, int myNum, double myGPA )
    {
        this.firstName = myFirst;
        this.lastName =  myLast;
        this.idNum = myNum;
        this.gpa = myGPA;
        this.inCS = myCS;
    }

    public GoodStudent()
    {
        this.firstName = "John";
        this.lastName = "Doe";
        this.idNum = 0;
        this.gpa = 0.0;
        this.inCS = false;
    }


    //Getters (Nishinoya)

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getID()
    {
        return idNum;
    }

    public double getGPA()
    {
        return gpa;
    }

    public boolean getCSStatus()
    {
        return inCS;
    }

    //end Getters

    //Setters (Oikawa)

    public void setIdNum (int myID)
    {
        idNum = myID;
    }

    public void setGPA (double myGPA)
    {
        gpa = myGPA;
    }

    //end Setters

    //BRAIN METHODS!!!
    //createID
    public String createID()
    {
        String firstLetter = firstName.toLowerCase();
        int lastThree = idNum % 1000;
        firstLetter = firstLetter.substring(0,1);

        return firstLetter + lastName.toLowerCase() + lastThree;

    }

    //CSGPA

    public String CSGPA()
    {
        if (inCS) {
            double newGPA = gpa * 1.15;
            NumberFormat fmt = NumberFormat.getInstance(Locale.US);
            fmt.setMaximumFractionDigits(2);

            return firstName + "'s boosted GPA is " + fmt.format(newGPA);
        }
        else
            return firstName + "'s GPA is not boosted and it is " + gpa;

    }

    //toString

    public String toString()
    {
        String result = "Student Information of " +
                firstName +  " " + lastName + ":"+
                "\nID#: " + idNum +
                "\nUnboosted GPA:" + gpa +
                "\nIn Computer Science? : " +  inCS;
        return result;
    }

}//end class GoodStudent
