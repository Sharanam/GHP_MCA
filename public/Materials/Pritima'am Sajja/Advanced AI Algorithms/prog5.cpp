#include<iostream.h>

void main()
{
	double r[3][3] = { {1,0.8,0.4},{0.8,1,0.8},{0.4,0.8,1}};
	double s[3][3] = { {0,0.6,0.8},{0.6,0,0.6},{0.8,0.6,0}};
	double rints[3][3] = { {0,0,0},{0,0,0},{0,0,0}};
	double runis[3][3] = { {0,0,0},{0,0,0},{0,0,0}};
	int i,j;

	cout<< " The Relation R is defined as follows "<<endl<<endl;

	cout<<"    1         2         3"<<endl<<endl;
	for(i=0;i<3;i++) // The Relation R
	{
			cout<<i+1<<"  ";
		for(j=0;j<3;j++)
		{
			cout <<r[i][j] <<"         ";
		}
		cout<<endl;
	}

	cout<<endl<<endl;
		cout<< " The Relation S is defined as follows "<<endl<<endl;

	cout<<"    1         2         3"<<endl<<endl;
	for(i=0;i<3;i++) // The Relation s
	{
			cout<<i+1<<"  ";
		for(j=0;j<3;j++)
		{
			cout <<s[i][j] <<"         ";
		}
		cout<<endl;
	}


	for(i=0;i<3;i++) 
	{
			
		for(j=0;j<3;j++)
		{
			if (r[i][j] < s[i][j]) //Minimum of two
				rints[i][j] = r[i][j];
			else
				rints[i][j] = s[i][j];
		}
		
	}

	for(i=0;i<3;i++) 
	{
			
		for(j=0;j<3;j++)
		{
			if (r[i][j] > s[i][j]) // Maximum of two
				runis[i][j] = r[i][j];
			else
				runis[i][j] = s[i][j];
		}
		
	}

		cout<<endl<<endl;
		cout<< " The Relation R intersection S is defined as minimum of two relations "<<endl<<endl;

	cout<<"    1         2         3"<<endl<<endl;

	for(i=0;i<3;i++) // The Relation s
	{
			cout<<i+1<<"  ";
		for(j=0;j<3;j++)
		{
			cout <<rints[i][j] <<"         ";
		}
		cout<<endl;
	}

	cout<<endl<<endl;
		cout<< " The Relation R union S is defined as maximum of two relations "<<endl<<endl;

	cout<<"    1         2         3"<<endl<<endl;

	for(i=0;i<3;i++) // The Relation s
	{
			cout<<i+1<<"  ";
		for(j=0;j<3;j++)
		{
			cout <<runis[i][j] <<"         ";
		}
		cout<<endl;
	}

	cout<<endl;
}