int numWaterBottles(int numBottles, int numExchange) {
    int total = numBottles; 

    while (numBottles >= numExchange) {
        int new = numBottles / numExchange;  
        int rem = numBottles % numExchange;   
        total += new;             
        numBottles = new + rem;
    }

    return total;
}
