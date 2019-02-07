package helper;

public class CityMap {

    public static final float averageSpeed=40;
    public enum City{
        AddisAbaba("Addis Ababa",12.00f,12.00f),
        BahirDar("Bahir Dar",12.00f,12.00f),
        Adama("Adama",12.00f,12.00f),
        DireDawa("Dire Dawa",12.00f,12.00f);


        private final String name;
        private double lat;
        private double lon;

        public double getLat() {
            return lat;
        }

        public double getLon() {
            return lon;
        }

        City(String s, float lat, float lon){
            this.name=s;
            this.lat=lat;
            this.lon=lon;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public int getTimeRequired(City city1, City city2){
        double lat1= city1.getLat();
        double lon1= city1.getLon();
        double lat2= city2.getLat();
        double lon2= city2.getLat();

        ///TODO CHECK FORMULA
        double distance= Math.sqrt((lat1-lat2)*(lat1-lat2) +(lon1-lon2)*(lon1-lon2));
        return (int) Math.ceil(distance/averageSpeed);

    }


}
