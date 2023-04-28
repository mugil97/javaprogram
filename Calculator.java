class Calculator
{
    public static void main(String[]abcd)
    {
    Calculator calc = new Calculator(); //Constructor
    calc.add();//Method Calling Statement
    calc.sub();
    calc.multiply(10,20);
    }
    void add()
    { //Method Body / Method Definition
    System.out.println(10+20);
    }
    void sub()
    {
    System.out.println(20-10);
    }
    void multiply(int no1,int no2)
    {
    System.out.println(no1*no2);
    }
}
