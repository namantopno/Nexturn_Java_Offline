public class LargeElement {
    public static void main(String[] args) {
        int[] a= {1,2,33,23,44,11,3,1211};
        int l = a.length;
        int b=a[0];
        int s=0;
        for (int i = 0; i < l; i++) {
            s+=a[i];
            if(a[i]>b)
            {
                b=a[i];
            }
        }
        System.out.println("Largest element in array : "+b);
        System.out.println("Sum of array: "+s);
    }
}
