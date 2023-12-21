class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] ar=new int[points.length];
        int diff=Integer.MIN_VALUE;

        for(int i=0;i<points.length;i++){
             ar[i]=points[i][0];
        }
        Arrays.sort(ar);
        for(int j=ar.length-1;j>0;j--){
           diff=Math.max(diff,ar[j]-ar[j-1]);
        }
        return diff;
    }
}
