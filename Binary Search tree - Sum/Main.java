#include<iostream>
using namespace std;
struct node{
	int data;
  	node* left;
  	node* right;
};
int sum=0;
void inorder( node* temp){
if(temp==NULL){
	return;
}
  inorder(temp->left);
  sum=sum+temp->data;
  inorder(temp->right);
}
node* insert(node* root,int x){
	node* temp=new node();
  	temp->data=x;
  	temp->left=NULL;
  	temp->right=NULL;
  	if(root==NULL){
    root=temp;
    }
  else if(x<root->data){
  	root->left=insert(root->left,x);
  }
  else{
   	root->right=insert(root->right,x);
  }
    return root;
}
int main()
{
  node* root=NULL;
  int n;
  while(1){
  cin>>n;
    if(n<0)
      break;
  	else{
    root=insert(root,n);
    }
   
      
  }
  inorder(root) ;
  cout<<"Sum of all nodes are "<<sum;
  return 0;
}