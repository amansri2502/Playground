
#include<iostream>
using namespace std;
struct node{
	int data;
  	node* left;
  	node* right;
};
void postorder( node* temp){
if(temp==NULL){
	return;
}
  postorder(temp->left);
  postorder(temp->right);
  cout<<temp->data<<" ";
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
  cout<<"Post order Traversal:"<<endl;
  postorder(root);
  return 0;
}