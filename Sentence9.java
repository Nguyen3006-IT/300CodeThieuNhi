import java.util.Arrays;

public class Sentence9 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int heigh = image.length;
        int width = image[0].length;
        
        fill(image, sr, sc, heigh, width, image[sr][sc],color);
        return image;   
    }

    public static void fill(int[][] image, int sr, int sc, int heigh, int width, int orginal,int color){
        if (sr < 0 || sc < 0 || sr > heigh-1 || sc > heigh-1) 
            return;

        if(orginal != image[sr][sc])
            return;
        
        image[sr][sc] = color;
        fill(image, sr - 1, sc, heigh, width, orginal, color);
        fill(image, sr, sc - 1, heigh, width, orginal, color);
        fill(image, sr + 1, sc, heigh, width, orginal, color);
        fill(image, sr, sc + 1, heigh, width, orginal, color);


    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] image2 = floodFill(image, sr, sc, color);
        for (int i = 0; i < image2.length; i++) {
            System.out.println(Arrays.toString(image2[i]));
        }

    }
}


