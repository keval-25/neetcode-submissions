class Solution {

    /*
    The Car Fleet problem is about time, not movement. 
    For each car, compute the time it would take to reach the target:

    time=(target−position​)/speed
        
     - Sort cars by position in descending order (closest to the target first), 
        because a car can only be affected by cars in front of it. 
     - Then move from front to back while tracking the maximum (slowest) arrival time seen so far. 
     - If a car’s time is less than or equal to this max time, it catches up and becomes part of 
        the same fleet; if its time is greater, it can’t catch up and forms a new fleet.
     - Each time the arrival time increases, you’ve found a new fleet.
    */
    public int carFleet(int target, int[] position, int[] speed) {
        
        bubbleSort(position, speed);

        double maxTime = 0;
        int ans = 0;
        for(int i=0;i<position.length;i++){
            double time = (double)(target - position[i])/speed[i];

            if(time > maxTime){
                ans++;
                maxTime = time;
            }
        }

        /*
        int n = position.length;
        int ans = 0;
        int[][] cars = new int[n][2];
        double maxTime = 0;

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0] - a[0]); 
        for (int i = 0; i < n; i++) {
            double time = (double)(target - cars[i][0]) / cars[i][1];

            if (time > maxTime) {
                ans++;
                maxTime = time;
            }
        }
        */

        return ans;
    }

    public void bubbleSort(int[] position, int[] speed) {
        int n = position.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (position[j] < position[j + 1]) {
                    int temp = position[j];
                    position[j] = position[j + 1];
                    position[j + 1] = temp;
                    temp = speed[j];
                    speed[j] = speed[j + 1];
                    speed[j + 1] = temp;
                }
            }
        }
    }

}
