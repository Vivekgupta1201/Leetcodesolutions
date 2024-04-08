class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeros=0;
        int ones=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zeros++;
            }
            else
            ones++;

        }


        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(zeros==0){
                    return sandwiches.length-i;
                }
                else{
                    zeros--;
                }
            }
            else{
               
                if(ones==0){
                    return sandwiches.length-i;
                }
                else{
                    ones--;
                }
            
            }
        }

        return 0;
    }
}
