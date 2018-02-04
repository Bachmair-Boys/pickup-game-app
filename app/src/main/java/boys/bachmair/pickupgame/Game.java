package boys.bachmair.pickupgame;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

public class Game implements Parcelable {

    enum GameType {BASKETBALL, BASEBALL, SOCCER};
    enum Visibility {PUBLIC, PRIVATE};
    public String name;
    public String host;
    public GameType type;
    public Visibility visibility;
    public LatLng location;
    public Date until;

    public Game(){
        ;
    }

    public Game(Parcel in){
        readFromParcel(in);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(host);
        parcel.writeDouble(location.latitude);
        parcel.writeDouble(location.longitude);
        parcel.writeLong(until.getTime());
    }

    public void readFromParcel(Parcel in){
        name = in.readString();
        host = in.readString();
        double latitude = in.readDouble();
        double longitude = in.readDouble();
        location = new LatLng(latitude,longitude);
        until = new Date(in.readLong());
    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Game createFromParcel(Parcel in) {
                    return new Game(in);
                }

                public Game[] newArray(int size) {
                    return new Game[size];
                }
            };



}

