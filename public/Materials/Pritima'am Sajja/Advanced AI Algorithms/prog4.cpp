#include<iostream.h>

void main()
{
	double comfort[3][3] = { {1.0,0.4,0.7}, {0.8,1.0,0.6}, {0.7,0.6,1.0} };

	int i,j,m,p;
	double im;

// The comfort Matrix
	cout<<"    m1         m2         m3"<<endl;
	for(i=0;i<3;i++)
	{
			cout<<"p"<<i+1<<"  ";
		for(j=0;j<3;j++)
		{
			cout <<comfort[i][j] <<"         ";
		}
		cout<<endl;
	}
	cout<<endl;
	cout<<" Enter the machine identification M : ";
	cin >>m;
	cout<<" Enter the person identification P  :";
	cin >>p;
	cout<<endl;
	cout << " The degree of comfort of Person "<<p <<" with Machine "<<m<< " is " <<comfort[p-1][m-1]<<endl;

	for(i=0;i<3;i++) // i represents person & j represents machine
	{
		im=0.0;
		for(j=i;j<3;j++)
		{
			if (im < comfort[i][j])
			{
				im = j+1; // bcos we want ideal machine
			}
			
		}
		cout<<endl;
		cout<< " The ideal machine for person "<<i+1<<" is " << im<<endl;
		cout<<endl;
		
	}
}