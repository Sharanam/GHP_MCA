#include<iostream.h>

void main()
{
	int x;
	float m;
	cout << " Input the graded membership of person (between & Including 0 & 1) : ";
	cin >>m;
	
	x = (m*20) + 60;

	if (x <= 60 ) // bcos 
	{
		cout<<" The broad category of person is between 0 to 60"<<endl;
	}
	else if( x > 60 && x <= 79)
	{
		cout<<" The broad category of person is between 60 to 79"<<endl;
	}
	else
	{
		cout<<" The broad category of person is greater than 79"<<endl;
	}
	
}
