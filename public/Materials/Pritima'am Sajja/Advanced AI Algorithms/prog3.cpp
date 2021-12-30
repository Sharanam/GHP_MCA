#include<iostream.h>

void main()
{
	int x;
	float m;
	cout << " Input the age of the person: ";
	cin >>x;
	if (x > 0 && x<= 59)
	{
		m=0;
			}
	else if( x > 59 && x <= 79)
	{
		m = (float)(x-60)/20;
	}
	else
	{
		m=1;
	}
	cout<<" The complement graded membership function M is : " <<1-m <<endl;
}
