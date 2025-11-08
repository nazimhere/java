#include <iostream>
 using namespace std;
  
   int main ()
   {
    int a,b;
    cout <<"length of pattern";
    cin>>a;
    for (int i=0;i<=a;i++)
    {///cout<<"\t";
        for (int j=1;j<=a-i+1;j++)
         {
            cout<<" \t ";}
         cout<<"*";
    }cout<<"\n";
   }