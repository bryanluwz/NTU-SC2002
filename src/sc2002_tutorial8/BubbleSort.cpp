#include <iostream>

using namespace std;

class BubbleSort
{
public:
    BubbleSort(){};
    ~BubbleSort(){};

    int *a;
    int n;

    void bubble() const
    {
        int i, j, t;
        for (i = n - 2; i >= 0; i--)
        {
            for (j = 0; j <= i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    void setSize(int b)
    {
        n = b;
        a = (int *)malloc(sizeof(int) * n);
    }

    void setArrayValue(int index, int value)
    {
        if (index >= n)
            return;
        a[index] = value;
    }

    void printArray() const
    {
        cout << "Final sorted array is: ";
        for (int i = 0; i < n; i++)
            cout << a[i] << " ";
        cout << endl;
    }
};

void bubble(int a[], int n)
{
    int i, j, t;
    for (i = n - 2; i >= 0; i--)
    {
        for (j = 0; j <= i; j++)
        {
            if (a[j] > a[j + 1])
            {
                t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
} // end function.

int main()
{
    BubbleSort bs;

    int tmp;

    cout << "Enter number of Integer elements to be sorted: ";
    cin >> tmp;
    bs.setSize(tmp);

    for (int i = 0; i <= bs.n - 1; i++)
    {
        cout << "Enter integer value for element no. " << i + 1 << ": ";
        cin >> tmp;
        bs.setArrayValue(i, tmp);
    }

    bs.bubble();
    bs.printArray();
}