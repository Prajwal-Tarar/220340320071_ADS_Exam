class Stack{
	
	int a[]=new int[10];
	int Top1=-1;
	int Top2=10;
	int data;
void push1(int data){
	Top1++;
	a[Top1]=data;
}

void push2(int data){
	Top2--;
	a[Top2]=data;
}

void pop1(){
	
	System.out.println("Popped element from stack1 is "+a[Top1]);
	Top1--;
}

void pop2(){
	
	System.out.println("Popped element from stack2 is "+a[Top2]);
	Top2++;
}


public static void main(String args[]){
	Stack S=new Stack();
	S.push1(5); 
	S.push2(10); 
	S.push2(15); 
	S.push1(11); 
	S.push2(7); 
	S.push2(40);
	S.pop1();
	S.pop2();
}
}
	
	
	
	
	