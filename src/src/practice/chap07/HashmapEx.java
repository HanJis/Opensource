//실습7-6
package src.practice.chap07;

import java.util.*;

class Location{
    String cityname;
    int Latitude, Longitude;
    public Location(String cityname, int Latitude, int Longitude){
        this.cityname= cityname;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
    }

    public int getLatitude() {
        return Latitude;
    }

    public int getLongitude() {
        return Longitude;
    }

    public String getCityname() {
        return cityname;
    }
}
public class HashmapEx {
    public static void main(String[] args) {
        HashMap<String, Location> city = new HashMap<String, Location>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i=0;i<4;i++){
            System.out.print(">>");
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");
            String cityname = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());
            city.put(cityname, new Location(cityname, longitude, latitude));
        }
        Set<String> keys = city.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println("------------------");
        while (it.hasNext()) {
            String name = it.next();
            Location LL = city.get(name);
            System.out.println(name + "  " + LL.getLatitude()+ "  "+LL.getLongitude() );
        }
        System.out.println("------------------");
        while (true){
            System.out.print("도시 이름 >>");
            String searchcity = scanner.nextLine();
            if(searchcity.equals("그만"))break;

            Location location= city.get(searchcity);
            if(location == null)
                System.out.println(searchcity+"는 없습니다.");
            else
                System.out.println(location.getCityname()+"  "+location.getLatitude()+"  "+location.getLongitude());
        }
        scanner.close();
    }
}
