import java.util.Date;
import com.google.android.gms.maps.model.LatLng;

public class Game {

    enum GameType {BASKETBALL, BASEBALL, SOCCER};
    enum Visibility {PUBLIC, PRIVATE};
    public String name;
    public String host;
    public GameType type;
    public Visibility visibility;
    public LatLng location;
    public Date until;

}

