import java.util.Scanner;

class ArrayMenu
{
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[100];
    static int n;

    public static void main(String[] args)
    {
        int choice;

        do
        {
            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    insert();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    linearSearch();
                    break;

                case 4:
                    binarySearch();
                    break;

                case 5:
                    System.out.println("Program Exited...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        }while(choice != 5);
    }

    static void insert()
    {
        System.out.print("Enter number of elements : ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    static void display()
    {
        if(n==0)
        {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.println("Array Elements:");

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void linearSearch()
    {
        if(n==0)
        {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element Found at Position : " + (i+1));
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("Element Not Found.");
        }
    }

    static void binarySearch()
    {
        if(n==0)
        {
            System.out.println("Array is Empty.");
            return;
        }

        // Sorting (Bubble Sort)
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                System.out.println("Element Found at Position : " + (mid+1));
                found = true;
                break;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(!found)
        {
            System.out.println("Element Not Found.");
        }
    }
}