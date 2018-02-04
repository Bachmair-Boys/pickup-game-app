package boys.bachmair.pickupgame;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

public class Game {

    enum GameType {BASKETBALL, BASEBALL, SOCCER};
    enum Visibility {PUBLIC, PRIVATE};
    public String name;
    public String host;
    public GameType type;
    public Visibility visibility;
    public LatLng location;
    public Date until;

    @Override
    public String toString() {
        return name + ";" + host + ";" + type + ";" + ""
    }
}

