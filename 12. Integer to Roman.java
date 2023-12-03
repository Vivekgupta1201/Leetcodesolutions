class Solution {
    public String intToRoman(int nums) {
        StringBuilder sb=new StringBuilder();
       String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
       String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String M[]={"","M","MM","MMM"};
int i=0;
      while(nums>0){
          int digit=nums%10;//(Math.pow(10,i))*
          if(i==0){
              sb.append(I[digit]);
          }
           if(i==1){
              sb.insert(0,X[digit]);
          }
           if(i==2){
              sb.insert(0,C[digit]);
          }
           if(i==3){
              sb.insert(0,M[digit]);
          }
          i++;
          nums=nums/10;

      }
        // sb.reverse();
        return sb.toString();
    }
}
