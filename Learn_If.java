class Learn_If
{
public static void main(String[] args)
{
Learn_If li = new Learn_If();
li.find_highest_scorer (90,90);

}
void find_highest_scorer(int vk,int msd)
{
//int vk=90;
//int msd = 90;
if(vk>msd)
{
System.out.println("virat");
}
else if (msd>vk)
{
System.out.println("dhoni");
}
else
{
System.out.println("dhoni + virat");
//System.out.println(vk + msd);
//System.out.println(vk);
//System.out.println(msd);
}
}
}
