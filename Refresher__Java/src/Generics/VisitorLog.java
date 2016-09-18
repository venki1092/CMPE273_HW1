package Generics;

public class VisitorLog<T> {
	Object[] list ;
	int count = 0; 
	int currentSize = 50;
	public VisitorLog()
	{
		list =  new Object[50];
	}
	public void addVisitor(T t)
	{
		if(count >= currentSize)
		{
			currentSize += 50;
			Object[] lTemp = new Object[currentSize];
			System.arraycopy(list, 0, lTemp, 0, count);
			list = lTemp;
		}
		list[count++] = t;
	}
	@SuppressWarnings("unchecked")
	public T getVisitor(int index)
	{
		return (T)list[index];
	}
	@SuppressWarnings("unchecked")
	public void  printVisitor()
	{
		for(int i = 0 ; i < currentSize ; i++){
			System.out.println((T)list[i]);
		}
	}
	public int getSize()
	{
		return count;
	}
	
}
