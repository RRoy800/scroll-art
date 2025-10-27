import java.util.Random;

public class AsciiArtWithClasses {

    static final int WIDTH = 120;
    static final Random rand = new Random();
    static final int ROCKET_HEIGHT = 15;
    static final int ROCKET_WIDTH = 12;
    static final int LLAMA_HEIGHT = 9;
    static final int LLAMA_WIDTH = 19;
    static final int CAR_HEIGHT = 8;
    static final int CAR_WIDTH = 16;

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int choice = rand.nextInt(3);
            char[][] img;
            int height;
            int width;

            if (choice == 0) {
                img = buildLlama();
                height = LLAMA_HEIGHT;
                width = LLAMA_WIDTH;
            } else if (choice == 1) {
                img = getRocket();
                height = ROCKET_HEIGHT;
                width = ROCKET_WIDTH;
            } else {
                img = GEM();
                height = CAR_HEIGHT;
                width = CAR_WIDTH;
            }

            int spaces = rand.nextInt(WIDTH);
            for (int y = 0; y < height; y = y + 1) {
                System.out.print(" ".repeat(spaces));
                for (int x = 0; x < width; x = x + 1) {
                    System.out.print(img[y][x]);
                }
                System.out.println();
            }

            Thread.sleep(200);
        }
    }

    private static char[][] buildLlama() { //made by maria
        char[][] llama = new char[LLAMA_HEIGHT][LLAMA_WIDTH];
        for (int i = 0; i < llama.length; i++) {
            for (int j = 0; j < llama[i].length; j++) {
                llama[i][j] = ' ';
            }
        }

        llama[0][1] = '/';
        llama[0][2] = '^';
        llama[0][3] = '-';
        llama[0][4] = '-';
        llama[0][5] = '-';
        llama[0][6] = '^';
        llama[0][7] = '\\';
        llama[1][1] = '|';
        llama[1][3] = '.';
        llama[1][5] = '.';
        llama[1][7] = '|';
        llama[2][1] = '\\';
        llama[2][4] = '`';
        llama[2][7] = '/';
        llama[2][12] = 'M';
        llama[2][13] = 'S';
        llama[3][1] = '/';
        llama[3][2] = '=';
        llama[3][3] = '=';
        llama[3][4] = '=';
        llama[3][5] = '=';
        llama[3][6] = '=';
        llama[3][7] = '\\';
        llama[3][8] = '_';
        llama[3][9] = '_';
        llama[3][10] = '_';
        llama[3][11] = '_';
        llama[3][12] = '_';
        llama[3][13] = '_';
        llama[3][14] = '_';
        llama[3][15] = '_';
        llama[3][16] = '_';
        llama[4][0] = '/';
        llama[4][17] = '\\';
        llama[5][0] = '\\';
        llama[5][17] = '/';
        llama[6][1] = '-';
        llama[6][2] = '-';
        llama[6][3] = '-';
        llama[6][4] = '-';
        llama[6][5] = '-';
        llama[6][6] = '-';
        llama[6][7] = '-';
        llama[6][8] = '-';
        llama[6][9] = '-';
        llama[6][10] = '-';
        llama[6][11] = '-';
        llama[6][12] = '-';
        llama[6][13] = '-';
        llama[6][14] = '-';
        llama[6][15] = '-';
        llama[6][16] = '-';
        llama[7][1] = '|';
        llama[7][3] = '|';
        llama[7][5] = '|';
        llama[7][7] = '|';
        llama[7][10] = '|';
        llama[7][12] = '|';
        llama[7][14] = '|';
        llama[7][16] = '|';
        llama[8][1] = '[';
        llama[8][2] = '|';
        llama[8][3] = ']';
        llama[8][5] = '[';
        llama[8][6] = '|';
        llama[8][7] = ']';
        llama[8][10] = '[';
        llama[8][11] = '|';
        llama[8][12] = ']';
        llama[8][14] = '[';
        llama[8][15] = '|';
        llama[8][16] = ']';
        return llama;
    }


    static char[][] getRocket() { //made by Rayden
        char[][] img = new char[ROCKET_HEIGHT][ROCKET_WIDTH];
        for (int y = 0; y < ROCKET_HEIGHT; y++) {
            for (int x = 0; x < ROCKET_WIDTH; x++) {
                img[y][x] = ' ';
            }
        }

        img[0][5] = '/';
        img[0][6] = '\\';
        img[1][4] = '/';
        img[1][7] = '\\';
        img[2][3] = '/';
        img[2][8] = '\\';
        img[3][2] = '/';
        img[3][9] = '\\';
        img[4][1] = '|';
        img[4][10] = '|';
        img[5][1] = '|';
        img[5][10] = '|';
        img[6][1] = '|';
        img[6][5] = 'R';
        img[6][6] = 'W';
        img[6][10] = '|';
        img[7][1] = '|';
        img[7][10] = '|';
        img[8][1] = '|';
        img[8][10] = '|';
        img[9][1] = '|';
        img[9][10] = '|';
        img[10][1] = '\\';
        img[10][10] = '/';
        img[11][2] = '\\';
        img[11][9] = '/';
        img[12][3] = '|';
        img[12][4] = '|';
        img[12][5] = '_';
        img[12][6] = '_';
        img[12][7] = '|';
        img[12][8] = '|';
        img[13][3] = '|';
        img[13][4] = '|';
        img[13][7] = '|';
        img[13][8] = '|';
        img[14][3] = '|';
        img[14][4] = '|';
        img[14][7] = '|';
        img[14][8] = '|';

        return img;
    }


    static char[][] GEM() { //made by myself
        char[][] img = new char[CAR_HEIGHT][CAR_WIDTH];
        for (int y = 0; y < CAR_HEIGHT; y++) {
            for (int x = 0; x < CAR_WIDTH; x = x +1 ) {
                img[y][x] = ' ';
            }
        }

        img[0][5] = '_';
        img[0][6] = '_';
        img[0][7] = '_';
        img[0][8] = '_';
        img[0][9] = '_';
        img[0][10] = '_';

        img[1][2] = '_';
        img[1][3] = '_';
        img[1][4] = '/';
        img[1][5] = '[';
        img[1][6] = ']';
        img[1][8] = '[';
        img[1][9] = ']';
        img[1][11] = '\\';
        img[1][12] = '_';
        img[1][13] = '_';
        img[1][14] = '_';

        img[2][1] = '|';
        img[2][4] = 'R';
        img[2][5] = 'O';
        img[2][6] = 'H';
        img[2][7] = 'A';
        img[2][8] = 'N';
        img[2][14] = '|';

        img[3][1] = '|';
        img[3][2] = '_';
        img[3][3] = '_';
        img[3][4] = '_';
        img[3][5] = '_';
        img[3][6] = '_';
        img[3][7] = '_';
        img[3][8] = '_';
        img[3][9] = '_';
        img[3][10] = '_';
        img[3][11] = '_';
        img[3][12] = '_';
        img[3][13] = '_';
        img[3][14] = '|';

        img[4][1] = '(';
        img[4][2] = ')';
        img[4][12] = '(';
        img[4][13] = ')';

        img[5][0] = '=';
        img[5][1] = '=';
        img[5][2] = '=';
        img[5][3] = '=';
        img[5][4] = '=';
        img[5][5] = '=';
        img[5][6] = '=';
        img[5][7] = '=';
        img[5][8] = '=';
        img[5][9] = '=';
        img[5][10] = '=';
        img[5][11] = '=';
        img[5][12] = '=';
        img[5][13] = '=';
        img[5][14] = '=';
        img[5][15] = '=';

        img[6][2] = '-';
        img[6][3] = '-';
        img[6][6] = '-';
        img[6][7] = '-';
        img[6][10] = '-';
        img[6][11] = '-';
        img[6][14] = '-';
        img[6][15] = '-';

        img[7][0] = '=';
        img[7][1] = '=';
        img[7][2] = '=';
        img[7][3] = '=';
        img[7][4] = '=';
        img[7][5] = '=';
        img[7][6] = '=';
        img[7][7] = '=';
        img[7][8] = '=';
        img[7][9] = '=';
        img[7][10] = '=';
        img[7][11] = '=';
        img[7][12] = '=';
        img[7][13] = '=';
        img[7][14] = '=';
        img[7][15] = '=';
        return img;
    }
}
