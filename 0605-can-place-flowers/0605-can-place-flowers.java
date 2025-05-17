class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length<=2){
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==1 && n>0){
                    return false;
                }
                else if(flowerbed.length==2 && i==0)
                {
                    if(flowerbed[i]==0 && flowerbed[i+1]==0 && n>1){
                    return false;
                    }
                }

            }
                
            
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i+1]==0 && flowerbed[i]==0)
                {
                    n--;
                    flowerbed[i]=1;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i-1]==0 && flowerbed[i]==0){
                    n--;
                    flowerbed[i]=1;
                }
            }
            else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1)
            {
                n--;
                flowerbed[i]=1;
            }

        }
        
        if(n==0 || n<0){
            return true;

        }
        else{
            return false;

        }

    }
          

    
}