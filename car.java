import java.util.Random;


public class Scroll {


    static final int WIDTH = 120;
    static final int CAR_WIDTH = 18;
    static final int CAR_HEIGHT = 9;
    static final Random rand = new Random();

   




    public static void main(String[] args) throws InterruptedException {
        while(true){
            char[][] img = GEM();
            int spaces = rand.nextInt(WIDTH);
            for (int y = 0; y < CAR_HEIGHT; y = y + 1){
                System.out.print(" ".repeat(spaces));
                for (int x = 0; x < CAR_WIDTH; x = x + 1){
                    System.out.print(img[y][x]);
                }
                System.out.println();
            }
            Thread.sleep(200);

        }
    }
       static char[][] GEM () {
        char[][] img = new char[CAR_HEIGHT][CAR_WIDTH];
        for (int y = 0; y < CAR_HEIGHT; y = y + 1) {
            for (int x = 0; x < CAR_WIDTH; x = x + 1) {
                img[y][x] = ' ';
            }
        }
    img[0][5]  = '_';
    img[0][6]  = '_';
    img[0][7]  = '_';
    img[0][8]  = '_';
    img[0][9]  = '_';
    img[0][10] = '_';

    img[1][2]  = '_';
    img[1][3]  = '_';
    img[1][4]  = '/';
    img[1][5]  = '[';
    img[1][6]  = ']';
    img[1][8]  = '[';
    img[1][9]  = ']';
    img[1][11] = '\\';
    img[1][12] = '_';
    img[1][13] = '_';
    img[1][14] = '_';

    img[2][1]  = '|';
    img[2][4]  = 'R';
    img[2][5]  = 'O';
    img[2][6]  = 'H';
    img[2][7]  = 'A';
    img[2][8]  = 'N';
    img[2][14] = '|';

    img[3][1]  = '|';
    img[3][2]  = '_';
    img[3][3]  = '_';
    img[3][4]  = '_';
    img[3][5]  = '_';
    img[3][6]  = '_';
    img[3][7]  = '_';
    img[3][8]  = '_';
    img[3][9]  = '_';
    img[3][10] = '_';
    img[3][11] = '_';
    img[3][12] = '_';
    img[3][13] = '_';
    img[3][14] = '|';

    img[4][1]  = 'O';
    img[4][13] = 'O';

    img[5][0]  = '=';
    img[5][1]  = '=';
    img[5][2]  = '=';
    img[5][3]  = '=';
    img[5][4]  = '=';
    img[5][5]  = '=';
    img[5][6]  = '=';
    img[5][7]  = '=';
    img[5][8]  = '=';
    img[5][9]  = '=';
    img[5][10] = '=';
    img[5][11] = '=';
    img[5][12] = '=';
    img[5][13] = '=';
    img[5][14] = '=';
    img[5][15] = '=';

    img[6][2]  = '-';
    img[6][3]  = '-';
    img[6][6]  = '-';
    img[6][7]  = '-';
    img[6][10] = '-';
    img[6][11] = '-';
    img[6][14] = '-';
    img[6][15] = '-';

    img[7][0]  = '=';
    img[7][1]  = '=';
    img[7][2]  = '=';
    img[7][3]  = '=';
    img[7][4]  = '=';
    img[7][5]  = '=';
    img[7][6]  = '=';
    img[7][7]  = '=';
    img[7][8]  = '=';
    img[7][9]  = '=';
    img[7][10] = '=';
    img[7][11] = '=';
    img[7][12] = '=';
    img[7][13] = '=';
    img[7][14] = '=';
    img[7][15] = '=';

        return img;
    }
}