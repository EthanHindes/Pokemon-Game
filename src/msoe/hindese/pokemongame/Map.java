package msoe.hindese.pokemongame;

public class Map {

    private char[][] map;
    private int x = 0;
    private int y = 0;
    private int width;
    private int height;
    private char charAt;

    public Map(char[][] map) {
        this.map = map;
        this.width = map.length;
        this.height = map[0].length;
        this.charAt = map[0][0];
        map[0][0] = '@';
    }

    public String updateMap(char movement) {
        map[x][y] = charAt;
        updatePosition(movement);
        charAt = map[x][y];
        map[x][y] = '@';
        return mapToString();
    }

    private void updatePosition(char movement) {
        switch (movement) {
            case 'w':
                if (y - 1 >= 0) {
                    y--;
                }
                break;
            case 's':
                if (y + 1 < this.height) {
                    y++;
                }
                break;
            case 'a':
                if (x - 1 >= 0) {
                    x--;
                }
                break;
            case 'd':
                if(x + 1 < this.width) {
                    x++;
                }
                break;
        }
    }

    public String mapToString() {
        String mapString = "";
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                mapString += "  " + Character.toString(this.map[x][y]);
            }
            mapString += "  \n\n";
        }
        return mapString;
    }
}
