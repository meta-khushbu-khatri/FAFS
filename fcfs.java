
public class fcfs
{
    public static void waitingTime(int processes[], int n, int bt[], int wt[])
     {
     wt[0]=0;
     for (int i=1;i<n;i++)
       {
        wt[i]=bt[i-1]+wt[i-1];
       }   
     }
    public static void turnAround(int processes[],int n, int bt[], int wt[],int ta[])
    {
       for(int i=0;i<n;i++) 
       {
        ta[i] = bt[i] + wt[i];  
       }  
   }
   static void avgTime(int processes[], int n, int bt[]) {
    int wt[] = new int[n], ta[] = new int[n];
    int total_wt = 0, total_ta = 0;
    waitingTime(processes, n, bt, wt);
    turnAround(processes, n, bt, wt, ta);
    System.out.printf("Processes Burst time Waiting"
                   +" time Turn around time\n");
    for (int i = 0; i < n; i++) {
        total_wt = total_wt + wt[i];
        total_ta = total_ta + ta[i];
        System.out.printf(" %d ", (i + 1));
        System.out.printf(" %d ", bt[i]);
        System.out.printf(" %d", wt[i]);
        System.out.printf(" %d\n", ta[i]);
    }
    float s = (float)total_wt /(float) n;
    int t = total_ta / n;
    System.out.printf("Average waiting time = %f", s);
    System.out.printf("\n");
    System.out.printf("Average turn around time = %d ", t);
}
  public static void main(String[] args)
  {
      int processes[]={1,2,3,4};
      int arr[]={0,6,60,110};
      int bustt[]={10,20,10,5};
      int n = processes.length;
      avgTime(processes, n, bustt); 
     }

}
