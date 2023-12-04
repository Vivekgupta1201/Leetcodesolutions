class Solution {
    public String largestGoodInteger(String num) {
        String s="";
         int Sum=0;
         for(int i=0;i<num.length()-2;i++){
         
             if(((num.charAt(i)-'0')==(num.charAt(i+1)-'0'))&&((num.charAt(i)-'0')==(num.charAt(i+2)-'0'))){
             Sum=((num.charAt(i)-'0')+(num.charAt(i+1)-'0')+(num.charAt(i+2)-'0'));
             /*  if(Sum>=max){
                     max=Sum;
                     s=  num.substring(i,i+3);

}*/
              max=Math.max(max,Sum);
              }
         }
       
         char y=(char)(max/3+'0');
         
          for (int i = 0; i < 3; i++) {
           s+=y;
        }
       if(max==-1){
           return "";
       }
        return s;
    }
}
