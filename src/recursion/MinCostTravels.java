package recursion;

public class MinCostTravels {
    public static void main(String[] args)
    {
        int cost[][]={{0,10,75,94},{-1,0,35,50},{-1,-1,0,80},{-1,-1,-1,0}};
        int s=0;
        int d=3;
        System.out.println(calculateMinCost(cost,s,d));
    }
    static int calculateMinCost(int[][] cost,int s,int d)
    {
        if(s==d||s==d-1)
        {
            return cost[s][d];
        }
        int minCost=cost[s][d];
        for(int i=s+1;i<d;i++)
        {
            int temp=calculateMinCost(cost,s,i)+calculateMinCost(cost,i,d);
            if(temp<minCost)
            {
                minCost=temp;
            }
        }
        return minCost;

    }
}
