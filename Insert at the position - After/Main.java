#include<iostream>
using namespace std;
struct node{
	int data;
  	node* next;
};
node *head=NULL;
int count=0;
void insert(int n,int pos=1,int flag=1){
	node *temp=new node();
  	temp->data=n;
  	temp->next=NULL;
  	if(pos==1&& flag==1){
      node* temp1=head;
      if(head==NULL){
      head=temp;
        count++;
        return;
      }
      while(temp1->next!=NULL)
        temp1=temp1->next;
      
      temp1->next=temp;
       count++;
      return;
    }
  
  	node* temp1=head;
  	for(int i=0;i<pos-1;i++)
      temp1=temp1->next;
  	
  	temp->next=temp1->next;
  	temp1->next=temp;
  
}
void print(){
	node*temp=head;
  	while(temp!=NULL){
    cout<<temp->data<<endl;
    temp=temp->next;
    }
}
int main()
{
  //type your code here
  int n;
  while(1){
  	cin>>n;
    if(n>0)
      insert(n);
    else
      break;
  }
  cout<<"Before inserting the value:"<<endl;
  print();
  cout<<"Enter the position and value to be inserted:"<<endl;
  cout<<"After inserting the value:"<<endl;
  int pos;
  cin>>pos;
  cin>>n;
  if(pos<=count)
    
  insert(n,pos,0);
  print();
  return 0;
}