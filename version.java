/*
//LoveBabbar Question 6 Reverse The Array
package my.solution;
public class version
{
    static void traversal(int []arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void rotate(int []arr,int size)
    {
        int temp,start=0,end=size-1;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Size Of The Array");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        traversal(arr,size);
        System.out.println("");
        rotate(arr,size);
        traversal(arr,size);
    }
}
//Question 7  minimum and maximum elements
package my.solution;
public class version
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }


    static void check_min(int arr[],int n)
    {
        int min=0;
        for (int i=1;i<n;i++)
        {

            if(arr[i-1] <= arr[i])
            {
//                System.out.println(arr[i] +" is smaller than "+arr[0]);
                min = arr[i-1];

            }
            else{
//                System.out.println(arr[i]+" is greater than "+arr[0]);
                min = arr[i];
            }
        }
        System.out.println(min+" is the minimum in the array");
    }

    static void check_max(int arr[],int n)
    {
        int max=0;
        for (int i=1;i<n;i++)
        {

            if(arr[i-1] >= arr[i])
            {
//                System.out.println(arr[i] +" is smaller than "+arr[0]);
                max = arr[i-1];

            }
            else{
//                System.out.println(arr[i]+" is greater than "+arr[0]);
                max= arr[i];
            }
        }
        System.out.println(max + " is te maximum in the array");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //             0, 1. 2, 3, 4, 5, 6
        int arr[]  = {10,20,30,40,05,02,100,0001,20000000,-1};
        int n = arr.length;
        traversal(arr,n);
        System.out.println("");
        check_min(arr,n);
        check_max(arr,n);
    }
}
*/
//Question 8
package my.solution;
public class version
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static void sort(int arr[],int n,int k)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
//                   Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The kth Maximum Element is "+arr[k-1]);
    }
    public static void main(String [] args)
    {
        //           0 ,1,2,3
        int arr[] = {11,21,3,40,00002,10000,-7};
        int n = arr.length;
        int k = 2;
        System.out.println("Unsorted Array:");
        traversal(arr,n);
        System.out.println("\nsorted Array:");
        sort(arr,n,k);
        traversal(arr,n);

    }
}
/*

package my.solution;
public class version
{
    static void traversal(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String [] args)
    {
        int [][] arr = {{10,20,30},
                {40,50,60}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[i][j]);
//                arr[i][j];
            }
        }

    }
}
//Question 9
package my.solution;
public class version
{
    static  void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void separate(int arr[],int n)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                zero++;
            }
            if(arr[i] == 1)
            {
                one++;
            }
            else if(arr[i] == 2)
            {
                two++;
            }
        }
        System.out.println("\nNumber of Zero is "+zero);
        System.out.println("Number of One is "+one);
        System.out.println("Number of two is "+two);

        for(int z = 0;z<zero;z++)
        {
            System.out.print(0);
            System.out.print(" ");
        }
        for(int o = 0;o<one;o++)
        {
            System.out.print(1);
            System.out.print(" ");
        }
        for(int t = 0;t<two;t++)
        {
            System.out.print(2);
            System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        int []arr={1,2,1,0,1,2};
        int n = arr.length;
        traversal(arr,n);
        System.out.println();
        separate(arr,n);

    }
}
//Question 10
package my.solution;
public class version
{
    static  void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void separate_negative(int arr[],int n)
    {
        int negative = 0;
        int positive = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < 0)
            {
                negative++;
                System.out.print(arr[i]);
                System.out.print(" ");
            }
//            else
//            {
//                positive++;
//                System.out.println(arr[i]+" is positive");
//            }

//            System.out.print("\n"+negative);
//            System.out.println(positive);
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                negative++;
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }
//        System.out.println(positive);
//        System.out.print("Number of Negative Is "+negative);
//        System.out.println(" ");
//        System.out.print("Number Of Positive Is "+positive);

//        for(int p = 0;p<negative;p++)
//        {
//            System.out.println(negative);
//        }
//        for(int p = 0;p<positive;p++)
//        {
//            System.out.println(positive);
//        }
    }
    public static void main(String[] args)
    {
        int []arr={-1,2,1,1,-2};
        int n = arr.length;
        traversal(arr,n);
        System.out.println();
        separate_negative(arr,n);

    }
}
//Question 11
package my.solution;
public class version
{
    static  void traversal(int arr[],int brr[],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]);
            System.out.print(" ");
        }
    }

    static void union(int arr[],int brr[],int crr[],int n,int m,int o)
    {
        if(n > m)
        {
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (arr[i] == brr[j])
                    {
                        count++;
                    }
                }
            }
            int res = count + (n - m);
            System.out.println(res);

        }
        else
        {
            int count = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(arr[i] == brr[j])
                    {
                        count++;
                        System.out.print(brr[j]);
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
            int res = count + (m-n);
            System.out.println(res);
        }
    }
    public static void main(String[] args)
    {
        int []arr={1,2,4,5};
        int []brr={4,5};
        int []crr={0,0,0,0,0,0};
        int n = arr.length;
        int m = brr.length;
        int o = crr.length;
        traversal(arr,brr,n,m);
        System.out.println();
        union(arr,brr,crr,n,m,o);

    }
}

//Question 13
package my.solution;
public class version  {
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static int kadanes(int arr[],int n)
    {
        //  0, 1, 2, 3, 4
        // {1,-4,-1, 2, 4}
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<n;i++)
        {
            currsum = currsum + arr[i];
            if(maxsum < currsum )
            {
                maxsum = currsum;
            }
            if(currsum < 0)
            {
                currsum = 0;
            }
        }
        System.out.println("\nThe Largest Subarray will be "+maxsum);
        return maxsum;
    }
    public static void main(String[] args)
    {
        int [] arr = {1,-4,-1,2,4};
        int n= arr.length;
        traversal(arr,n);
        kadanes(arr,n);

    }
}



//Question 14 minimize the height
package my.solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void min_height(int arr[],int []brr,int n,int m,int k)
    {
        int res;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < k)
            {
                res = arr[i] + k;
            }
            else
            {
                res = arr[i] - k;
            }

            brr[i] = res;
            System.out.print(res);
            System.out.print(" ");
        }
        System.out.println("\nEnding");
        int min=0;
//        for(int i=0;i<m;i++)
//        {
////          3,4,21,7,1,9
//            System.out.print(brr[i]);
//            System.out.print(" ");
//
//        }
        Arrays.sort(brr);
        System.out.print(Arrays.toString(brr));
        System.out.print(" ");
        System.out.print("\n"+brr[0]);
        System.out.print(" ");
        System.out.print("\n"+brr[m-1]);
        System.out.print(" ");
        System.out.println("\nDifference Between The Largest And Shortest height Will be "+(brr[m-1]-brr[0]));


    }
    public static void main(String[] args)
    {
        int [] arr = {3,4,21,7,1,9};
        int [] brr = {0,0,0,0,0,0};
        int n= arr.length;
        int m= brr.length;
        int k = 3;
        traversal(arr,n);
        System.out.println("");
        min_height(arr,brr,n,m,k);

    }
}


package my.solution;
public class version  {
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static int addition(int arr[],int add[],int n)
    {
        for(int i=0;i<n;i++)
        {
            add[i] = arr[i] + 1;
            System.out.print(add[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            System.out.print(add[i]);
            System.out.print(" ");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int [] arr = {3,4,1,7,1,9};
        int [] add = new int[10];
        int n= arr.length;
        traversal(arr,n);
        System.out.println("");
//        addition(arr,add,n);
        jump(arr,add,n);
    }
}

//Question No. 16
package my.solution;
public class version  {
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    static void duplicate(int arr[],int n)
    {
        for(int i=0;i<n;i++)   //3,4,3,7,1,9
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate Of "+arr[i]+" Is Present In This Given Array");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {3,4,3,7,1,9,1,9};
        int [] add = new int[10];
        int n= arr.length;
        traversal(arr,n);
        System.out.println("");
        duplicate(arr,n);
    }
}

//Question 17  [Merge 2 sorted array without using extra space]
 package my.solution;

import java.util.Arrays;

public class version  {
    static void traversal(int arr[],int n,int brr[],int m)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]);
            System.out.print(" ");
        }

    }


    static void sorted(int arr[],int brr[],int n,int m)
    {

//        int [] arr = {0,1,2,7};
//        int [] brr = {5,3,6,8,9};
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i] > brr[j])
                {
                    //swapping occured
                    temp = arr[i];
                    arr[i] = brr[j];
                    brr[j] = temp;
                }
            }
        }
        Arrays.sort(brr);
        traversal(arr,n,brr,m);

    }
    public static void main(String[] args)
    {
        int [] arr = {1,3,5,7};
        int [] brr = {0,2,6,8,9};
        int n= arr.length;
        int m= brr.length;
        traversal(arr,n,brr,m);
        System.out.println("");
        sorted(arr,brr,n,m);
    }
}

//Question No. 18  [Kadane's Algorithm]
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void kadanes(int arr[],int n)
    {
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<n;i++)   //1,2,3,-2,5
        {
            currsum = currsum+arr[i];
            if(currsum > maxsum)
            {
                maxsum = currsum;
            }
            if(currsum < 0)
            {
                currsum = 0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args)
    {
        int arr[] = {-1,2,-3,-4,5};
        int n = arr.length;
        traversal(arr,n);
        kadanes(arr,n);
    }
}

//Question No. 23 [count pairs With Given Sum]
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void sum(int arr[],int n)
    {
        int k=2;
        int pair= 0;
        for(int i=0;i<n;i++)//           1,5,7,1
        {
            for(int j=i;j<n;j++)
            {
                int sum = (arr[i]+arr[j]);
                    if(sum == k)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        pair ++;
                    }

            }
        }
        System.out.println();
        System.out.println(pair);
    }
    public static void main(String[] args)
    {
        int arr[]= {1,1,1,1};
        int n = arr.length;
//        int k=6;
        traversal(arr,n);
        sum(arr,n);

    }
}


//Question No. 24 find Common element in 3 sorted array
//arr = [1,2,4,5]
//brr = [2,6,7,8]
//crr = [2,3,5,7]

package my.solution;
public class version
{
    static void traversal(int arr[],int brr[],int crr[],int n,int m,int o)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        for(int j=0;j<m;j++)
        {
            System.out.print(brr[j]);
            System.out.print(" ");
        }
        System.out.println();
        for(int k=0;k<o;k++)
        {
            System.out.print(crr[k]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void sort_Array(int arr[],int brr[],int crr[],int n,int m,int o )
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
//                if(arr[i] == brr[j])
//                {
//                    System.out.println(arr[i] +" is matching with "+brr[j]);
//                }
                for(int k=0;k<o;k++)
                {
                    if(arr[i] == brr[j] && brr[j] == crr[k])
                    {
                        System.out.println(arr[i]+" ,"+brr[j] +" and"+crr[k]+" are matched");
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,6};
        int brr[] = {4,5,6,8};
        int crr[] = {0,4,6,9,10};
        int n = arr.length;
        int m = brr.length;
        int o = crr.length;
        traversal(arr,brr,crr,n,m,o);
        sort_Array(arr,brr,crr,n,m,o);
    }
}


//Question No. 22 Stock
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void stock(int arr[],int n)
    {
        int min=0;
        int max=0;
        for(int i=0;i<n;i++)   //8,2,4,1,3,9
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[j] < arr[i])
                {
                    min = arr[j];
                }
                else{
                     min = arr[i];
                }
            }
        }
//        System.out.println(min);
        for(int i=0;i<n;i++)   //8,2,4,1,3,9
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] > arr[i])
                {
                    max = arr[j];
                }
                else{
                     max = arr[i];
                }
            }
        }
//        System.out.println(max);

        int max_profit = max-min;
        System.out.println("Maximum Profit will be "+max_profit);
    }

    public static void main(String[]args)
    {
        int arr[] = {8,2,4,1,3,9};
        int n=arr.length;
        traversal(arr,n);
        stock(arr,n);
    }
}

//Question No. 27 factorial
package my.solution;
public class version {
    static int factorial(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
        return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(factorial(n));

    }
}

//Question No. 28
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void subArray_mult(int arr[],int n)
    {
        int currSum =1;
        int maxSum = 1;                     //1,2,4,-1,-4
        for(int i=0;i<n;i++)
        {
            currSum = currSum*arr[i];
            if(currSum > maxSum)
            {
                maxSum = currSum;
            }
            if(currSum < 0)
            {
                currSum = 0;
            }
        }
        System.out.println(maxSum+" is the highest multiplication of subArray");

    }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,-1,-4};
        int n = arr.length;
        traversal(arr,n);
        subArray_mult(arr,n);
    }
}
//Question No. 29  Longest Consecutive SubArray
package my.solution;
import java.lang.reflect.Array;
import java.util.Arrays;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void longest(int arr[],int n)
    {
        Arrays.sort(arr);
        traversal(arr,n);
        for(int i=0;i<n-1;i++)                //1 2 3 4 5 9
        {
            if((arr[i]-arr[i]) == 1)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2,3,1,5,4,9};
        int n = arr.length;
        traversal(arr,n);
        longest(arr,n);

    }
}
//Question 13  Cyclic rotate the array by one
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void rotate(int arr[],int n)
    {
        int x = arr[n-1];
        System.out.println(x+" is store in the x");
        for(int i=n-1;i>0;i--)          //1,2,3,4,5
        {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        traversal(arr,n);

    }
    public static void main(String [] args)
    {
        int arr[] = {1,2,3,4,5};
        int n=arr.length;
        traversal(arr,n);
        rotate(arr,n);
    }
}
package my.solution;
public class version
{
    static void traversal(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    static void twiceStock(int arr[],int n)
    {
        int res = 0;
        if(arr[1]>arr[0])
        {
            res = arr[1] - arr[0];
            System.out.println("Buy The Stock's At Rs"+arr[0]+" And Sold At Rs"+arr[1] +"\nProfit Will Be Rs"+res);
        }

        int min = arr[2];
        for(int i=2;i<n;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);

        int max= 0;
        for(int i=2;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
        
        int ress = max-min;
        int sum = res+ress;
        System.out.println(sum);

    }
    public static void main(String [] args)
    {
        int arr[] = {1,20,3,40,50};
        int n=arr.length;
        traversal(arr,n);
        twiceStock(arr,n);
    }
}*/












