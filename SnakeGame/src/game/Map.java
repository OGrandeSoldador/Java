package game;

public class Map {
    String name;
    String[][] map;
    int width;
    int height;
    void setMap() {
        map = new String[width][height];
        for (int i = 0; i < width; i++) {
            System.out.println();
            for (int j = 0; j < height; j++) {
                map[i][j] = ".";
                System.out.print(map[i][j]);
            }
        }

    }
}

