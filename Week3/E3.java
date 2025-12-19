class MyCircularQueue {

    int arr[];
     int front;
     int rear;
     int size;
    public MyCircularQueue(int k) 
    {
        arr=new int[k];
        front=-1;
        rear=-1;
        this.size=k;
    }
    
    public boolean enQueue(int value) 
    {
          if(isFull())
          return false;

          if(isEmpty())
          {
            front=0;
            rear=0;
          }
          else
          {
            rear=(rear+1)%size;
          }
          arr[rear]=value;
          return true;
     }
    
    public boolean deQueue()
     {
           if(isEmpty())
           return false;
           else
           {
             if(front==rear)
             {
                front=rear=-1;
             }
             else
             {
                front=(front+1)%size;
             }
             return true;
           }
     }
    
    public int Front() {
        if(isEmpty())
        return -1;
        else
        return arr[front];
    }
    
    public int Rear() 
    {
        if(isEmpty())
        return -1;
        else
        return arr[rear];
    }
    
    public boolean isEmpty() 
    {
        if(front==-1)
        return true;
        else
        return false;
    }
    
    public boolean isFull() 
    {
        return(rear+1)%size==front;
        
    }
}
//https://leetcode.com/problems/design-circular-queue/description/
