class Solution {
    public int maxArea(int[] heights) {
        //game plan : Area = height x width 
        // the width is index of last - index of first
        // the height is the min of the left and the right heights
        //since the left and the right matters we can use two pointer system
        int maxArea = 0;
        int leftWallIndex = 0;    
        int rightWallIndex = heights.length - 1;

        while(leftWallIndex < rightWallIndex){
            int width = rightWallIndex - leftWallIndex;
            int height = Math.min(heights[leftWallIndex], heights[rightWallIndex]);
            int area = width * height; 

            if(area > maxArea){
                maxArea = area;
            }
            
            if(heights[leftWallIndex] < heights[rightWallIndex]){
                leftWallIndex++;
            }else{
                rightWallIndex--;
            }
        }

        return maxArea;
        
    }
}
