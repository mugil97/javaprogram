class Looping_practice
{
public static void main(String[] args)
{
Looping_practice lp = new Looping_practice();
//lp.print_reverse(9697);
//lp.find_count_of_digit(23456);
//lp.find_sum_of_digits(87642);
lp.reverse_a_no(1234);
//lp.palindrome(1234321);
}
void palindrome(int cake) //1234
{
    int no2 = cake;
    int reverse = 0;
    while(cake>0)   //123>0 12>0    1>0 
    {
    int rem = cake%10; //1
    reverse = (reverse * 10) + rem; //4 43  432 4321
    cake = cake/10; //0
     }
     System.out.println(reverse);
      System.out.println(cake);
     if(reverse == no2)
     {
     System.out.println("palindrome");
     }
     else
     {
     System.out.println("not palindrome");
     }
//System.out.println("Reverse is " + reverse);
}
void reverse_a_no(int cake) //1234
{
    int reverse = 0;
    while(cake>0)   //123>0 12>0    1>0 
    {
    int rem = cake%10; //1
    reverse = (reverse * 10) + rem; //4 43  432 4321
    cake = cake/10; //0
     }
System.out.println("Reverse is " + reverse);
}
void find_sum_of_digits(int cake)
{
int sum = 0;
while (cake>0)
{
System.out.println(cake%10);
sum = sum + cake%10;
cake = cake /10;
}
System.out.println("sum of digits is " + sum);
}


void find_count_of_digit(int cake)
{
int count = 0;
while (cake>0)
{
System.out.println(cake%10);
count = count + 1;
cake = cake /10;
}

System.out.println("count of digits is " + count);
}
void print_reverse(int cake)
{
while (cake>0)
{
System.out.println(cake%10);
cake = cake /10;
}

}

}
