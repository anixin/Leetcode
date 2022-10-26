class Solution {
    private void floodFillUtil(int[][] image, int sr, int sc, int originalClr, int newcolor) {
        if(image[sr][sc] == originalClr) {
            image[sr][sc] = newcolor;
            
            if(sr > 0) {
                floodFillUtil(image, sr-1, sc, originalClr, newcolor);
            }
            if(sc > 0) {
                floodFillUtil(image, sr, sc-1, originalClr, newcolor);
            }

            if(sr < image.length - 1 ) {
                floodFillUtil(image, sr+1, sc, originalClr, newcolor);
            }

            if(sc < image[0].length - 1) {
                floodFillUtil(image, sr, sc+1, originalClr, newcolor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalClr = image[sr][sc];
        if(originalClr != color) {
            // image[sr][sc] = color;

            floodFillUtil(image, sr, sc, originalClr, color);

        }
        return image;
    }
}
