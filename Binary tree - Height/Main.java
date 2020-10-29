#include<iostream>
using namespace std;
struct node{
	int data;
  	node* left;
  	node* right;
};
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
int max(int a,int b){
	if(a>b)
      return a;
  else
    return b;
}
int height(node* root){
	if(root==NULL)
      return 0;
  	int left,right;
  left=height(root->left);
  right=height(root->right);
  return max(left,right)+1;
}
int main()
{
  node* root=NULL;
  int n;
  while(1){
  	cin>>n;
    if(n<0)
      break;
    root=insert(root,n);
  }
  cout<<"Height of the tree is "<<height(root);
  return 0;
}