public class Player {

    private String nickname;
    private int points;


    public Player(String nickname, int points) {
        this.nickname = nickname;
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
