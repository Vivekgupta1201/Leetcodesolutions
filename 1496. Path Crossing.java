Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

 

Example 1:


Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.
Example 2:


Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
 

Constraints:

1 <= path.length <= 104
path[i] is either 'N', 'S', 'E', or 'W'.



  <--code-->

  class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair > Visitedlocation=new HashSet<>();
        Visitedlocation.add( new Pair<>(0,0));
        int xaxis=0 , yaxis=0;
        for(int i=0;i<path.length();i++){
           
            if(path.charAt(i)=='N'){
                yaxis++;
            }
            else  if(path.charAt(i)=='S'){
                yaxis--;
            }
            else  if(path.charAt(i)=='E'){
                xaxis++;
            }
            else  if(path.charAt(i)=='W'){
                xaxis--;
            }

             Pair position=new Pair<>(xaxis,yaxis);
            
            if(Visitedlocation.contains(position)){
            return true;

            }
            else{
                Visitedlocation.add(position);
            }

        }
       return false; 
    }
}
