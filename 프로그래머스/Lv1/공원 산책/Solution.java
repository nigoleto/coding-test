class Solution {
    public int[] solution(String[] park, String[] routes) {        
        int[] location = {};

        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                if(park[i].split("")[j].equals("S")) {location = new int[] {i, j};}
            }
        }

        for(int i = 0; i < routes.length; i++) {
            String routeDirection = routes[i].split(" ")[0];
            int routeDistance = Integer.parseInt(routes[i].split(" ")[1]);

            switch(routeDirection) {
                case "E": if(location[1] + routeDistance < park[0].length()) {
                            boolean isExistHurdle = park[location[0]]
                                .substring(
                                location[1], location[1] + routeDistance + 1
                                )
                                .contains("X");
                            if(!isExistHurdle)
                            location[1] += routeDistance;
                            }
                            break;
                case "W": if(location[1] - routeDistance >= 0) {
                            boolean isExistHurdle = park[location[0]]
                                .substring(
                                location[1] - routeDistance, location[1]
                                )
                                .contains("X");
                            if(!isExistHurdle)
                            location[1] -= routeDistance; 
                            }
                            break;
                case "S": if(location[0] + routeDistance < park.length) {
                            boolean isExistHurdle = false;
                            for(int j = 1; j <= routeDistance; j++) {
                                if(park[location[0] + j].split("")[location[1]].equals("X")) isExistHurdle = true;
                            }
                            if(!isExistHurdle)
                            location[0] += routeDistance; 
                            }
                            break;
                case "N": if(location[0] - routeDistance >= 0) {
                            boolean isExistHurdle = false;
                            for(int j = 1; j <= routeDistance; j++) {
                                if(park[location[0] - j].split("")[location[1]].equals("X")) isExistHurdle = true;
                            }
                            if(!isExistHurdle)
                            location[0] -= routeDistance; 
                            }
                            break;
            }
        }
        
        return location;
    }
}






// park는 String배열
// split -> charAt()로 변경가능
// indexOf() 로 String 내의 인덱스 바로 찾을 수 있음 (이중 for문 사용안해도 됨)
// for문 안에 switch문 안에 for문 코드 정리 필요할듯
