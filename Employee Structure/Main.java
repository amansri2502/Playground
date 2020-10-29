#include<iostream>
#include<string>
using namespace std;
struct emp{
	string name;
 
  int id;
  int age;
  string des;
  int salary;
  
};
int main()
{
  struct emp r;
  
  cout<<"Enter name:"<<endl;
  cin>>r.name;
  cout<<"Enter ID:"<<endl;
  cin>>r.id;
    cout<<"Enter age:"<<endl;
  cin>>r.age;
  cout<<"Enter designation:"<<endl;
  cin>>r.des;
  cout<<"Enter Salary:"<<endl;
  cin>>r.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee"<<" : "<<r.name<<endl;
  cout<<"ID of the Employee"<<" : "<<r.id<<endl;
  cout<<"Age of the Employee"<<" : "<<r.age<<endl;
  cout<<"Designation of the Employee"<<" : "<<r.des<<endl;
  cout<<"Salary of the Employee"<<" : "<<r.salary<<endl;
    
 
}