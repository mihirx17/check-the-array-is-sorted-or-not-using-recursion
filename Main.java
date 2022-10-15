public class Main {
    public static boolean is_sorted(int a[], int i)
    {
        if(i==a.length-1)
        {
            return  true;
        }
if (a[i]>a[i+1])
{
    return false;
}
return is_sorted(a,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,1,5,6,7,8};
        System.out.println(is_sorted(a,0));
        System.out.println("Hello world!");
    }
}