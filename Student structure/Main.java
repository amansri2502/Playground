#include<iostream>
using namespace std;
struct student{
	int rn,s1,s2,s3,s4,s5,avg,grade;
};
  
int main()
{
  int n,i,j;
  struct student s[10];
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  for(i=0;i<n;i++){
  	cin>>s[i].rn>>s[i].s1>>s[i].s2>>s[i].s3>>s[i].s4>>s[i].s5;
  }
  for(i=0;i<n;i++){
  s[i].avg=(s[i].s1+s[i].s3+s[i].s2+s[i].s4+s[i].s5)/5;
   if(s[i].avg>70){
   	s[i].grade=1;
   }else if(s[i].avg<=70 && s[i].avg>50){
   	s[i].grade=2;
   }else{
   s[i].grade=3;
   }
  }
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(i=0;i<n;i++){
  	cout<<s[i].rn<<" "<<s[i].s1<<" "<<s[i].s2<<" "<<s[i].s3<<" "<<s[i].s4<<" "<<s[i].s5<<" "<<s[i].avg<<" "<<s[i].grade<<endl;
  }
  
}