class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
      /*  int max=Integer.MIN_VALUE;
       for(int i=0;i<points.length; i++){
           int j=i+1;
           while((j<points.length)&&points[j][0]-points[i][0]<=k){
               max=Math.max(max,(points[j][0]-points[i][0]+points[j][1]+points[i][1]));
               j++;
           }

       }
       return max;*/
        PriorityQueue<Pair<Integer, Integer>> pq =  
                              new PriorityQueue<>((a, b) -> b.getKey() - a.getKey()); 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<points.length;i++){
            while((!pq.isEmpty())&&(points[i][0]-pq.peek().getValue())>k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                max=Math.max(max,pq.peek().getKey()+points[i][0]+points[i][1]);
            }
            pq.offer(new Pair<Integer,Integer>(points[i][1]-points[i][0],points[i][0]));
        }
        return max;
    }
}
