package median;

import java.util.*;

public class MedianOfRunningStream {
	
	PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> min=new PriorityQueue<>();
	
	public void insertNum(int num)
	{
		if(max.isEmpty()||max.peek()>=num)
		{
			max.add(num);
		}else {
			min.add(num);
		}
		if(max.size()>min.size()+1)
		{
			min.add(max.poll());
		}else if(max.size()<min.size())
		{
			max.add(min.poll());
		}
	}
	public double findMedian()
	{
		if(max.size()==min.size())
		{
			return max.peek()/2.0+min.peek()/2.0;
		}
		return max.peek();
	}

	public static void main(String[] args) {
		
		MedianOfRunningStream md=new MedianOfRunningStream();
		md.insertNum(3);
		md.insertNum(1);
		System.out.println("Median of running stream: "+md.findMedian());
		md.insertNum(5);
		System.out.println("Median of running stream: "+md.findMedian());
		md.insertNum(4);
		System.out.println("Median of running stream: "+md.findMedian());

	}
	

}
