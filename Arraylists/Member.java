package Arraylists;

public class Member {
    private int handicap;
    private String name;

    public Member(String name, int handicap) {
        this.handicap = handicap;
        this.name = name;
    }
    // getters and setters

    public String getName() {
        return this.name;
    }

    public int getHandicap() {
        return this.handicap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public int compareTo(Member other) {
        if (this.handicap < other.handicap) {
            return -1;
        } else if (this.handicap == other.handicap) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "Handicap: " + getHandicap();
    }
}
