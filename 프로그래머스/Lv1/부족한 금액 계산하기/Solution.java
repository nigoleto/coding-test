class Solution {
    public long solution(int price, int money, int count) {
        long lngMoney = (long) money;
        
        for(int i = 1; i <= count; i++) {
            lngMoney -= (long) (price * i);
        }
        
        if(lngMoney > 0) {
            return 0;
        } else {
            return lngMoney * -1;
        }
    }
}