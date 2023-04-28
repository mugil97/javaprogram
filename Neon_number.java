class Neon_number
{
public static void main (String [] args)
{
Neon_number ne = new Neon_number();
int power = ne.find_neon(9,2);
//System.out.println(power);
int sum = ne.find_neon_2(81);
if(power== sum)
 System.out.println("given no is  neon no");
}
int find_neon(int base, int power)
{
int box = 1;
while(power>0)
{
box = box * base;
power = power - 1;
}
return box;
}
int find_neon_2(int no)
{
int sum = 0;
while (no>0)
{
int rem = no%10;
sum = sum + rem; //1 //8 1+8=9
no = no/10;
}
return sum;

}

}
