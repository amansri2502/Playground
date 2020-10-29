#include<iostream>
using namespace std;
struct node{

	int data;
  	node *next;
};
node *head=NULL;
int insertion=0;
void insert(int n){

  	node* temp=new node();
	temp->data=n;
  	temp->next=NULL;
  	if(head==NULL){
    	head=temp;
      insertion++;
    }
  	else{
    	node* temp1=head;
      while(temp1->next!=NULL){
      temp1=temp1->next;
      }
      temp1->next=temp;
      insertion++;
    }
}
void print(){
	node* temp=head;
  	while(temp!=NULL){
    	cout<<temp->data<<endl;
      	temp=temp->next;
    }
}
void delet(){
	node *temp=head;
  
  if(temp->next==NULL){
    head=NULL;
  cout<<"No value to delete";}
	for(int i=0;i<insertion-2;i++)
      temp=temp->next;
  node* q=temp->next;
  temp->next=NULL;
  	delete q;

}
int main()
{
  int n,count=1;
  while(1){
  	cin>>n;
    if(n>0){
    insert(n);
    }
    else{
    break;
    }
  }
  cout<<"Before deletion:"<<endl;
  print();
  while(insertion>0){
  	cout<<"After "<<count<<" deletion:"<<endl;
  	delet();
    print();
    count++;
    insertion--;
  }
  
   
  
  return 0;
}