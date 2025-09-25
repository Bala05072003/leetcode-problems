int maxProfit(int* prices, int pricesSize) {

    int temp=prices[0];
    int diff=0;
    int profit=0;
    for(int i=1;i<pricesSize;i++){
        if(prices[i]-temp<0){
            temp=prices[i];
        }
        else{
            diff=prices[i]-temp;
            if(profit>diff){
                profit=profit;
            }
            else{
                profit=diff;
            }
        }
    }
    
    return profit;
    
}