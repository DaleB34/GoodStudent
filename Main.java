public class Main
{
    public static void main(String args[])
    {

        GoodStudent Alan = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent Florence = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent Grace = new GoodStudent(true, "Grace", "Hopper", 190692, 3.99);
        GoodStudent blank = new GoodStudent();

        System.out.println(Alan.toString());
        System.out.println(Alan.createID());
        System.out.println(Alan.CSGPA() + "\n");

        Florence.setIdNum(95366);
        Florence.setGPA(3.92);
        System.out.println(Florence.getID());
        System.out.println("Florence's gpa is : " + Florence.getGPA());
        System.out.println(Florence.createID() + "\n");

        System.out.println(Grace.getFirstName() + "\nIn Computer Science? :" + Grace.getCSStatus());
        System.out.println("Grace's gpa is : " + Grace.getGPA());
        System.out.println(Grace.createID());

    }//end method main

}//end class Main
