package classesMethodsObjectsExamples;
public class QueueDemo {  
 private static final int capacity = 3;  
 int arr[] = new int[capacity];  
 int size = 0;  
 int front = -1;  
 int rear = 0;  
  
 public void enqueue(int enElement) {  
  if (front < capacity - 1) {  
	  front++;  
   arr[front] = enElement;  
   System.out.println("Element " + enElement     + " is pushed to Queue !");  
   display();  
  } else {  
   System.out.println("Overflow Queue Capacity Reached !");  
  }  
  
 }  
  
 public void dequeue() {  
  if (front >= rear) {  
   rear++;  
   System.out.println("dequeue operation done !");  
   display();  
  } else {  
   System.out.println("No element in Queue !");  //Underflow
  }  
 }  
  
 public void display() {  
  if (front >= rear) {  
   System.out.println("Elements in Queue : ");  
   for (int i = rear; i <= front; i++) {  
    System.out.println(arr[i]);  
   }  
  }  
 }  
  
 public static void main(String[] args) {  
  QueueDemo queueDemo = new QueueDemo();  
  queueDemo.dequeue();  
  queueDemo.enqueue(23);  
  queueDemo.enqueue(2);  
  queueDemo.enqueue(73);  
  queueDemo.enqueue(21);  
  queueDemo.dequeue();  
  queueDemo.dequeue();  
  queueDemo.dequeue();  
  queueDemo.dequeue();  
 }  
}
