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
void reverse(){

node *current,*prev,*next;
  current=head;
  prev=NULL;
  while(current!=NULL){
    next=current->next;
    current->next=prev;
    prev=current;
    current=next;
    
}
  head=prev;
  
  

}
int main()
{
  int n;
  while(1){
  	cin>>n;
    if(n>0)
      insert(n);
    else{
    break;}
  }
  cout<<"Before Reversing the list:"<<endl;
  print();
  reverse();
  cout<<"After Reversing the list:"<<endl;
  print();
  
  return 0;
}