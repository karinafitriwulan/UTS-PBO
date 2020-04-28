public class runGPS {

	public static void main(String[] args){
		GPSLoc_13020180137 gps = new GPSLoc_13020180137();
		GPSLoc_13020180137 data = new GPSLoc_13020180137("Hi, nama saya Karina." , "Saya mahasiswi semester 4.");
		System.out.println(data.nama + ", " + data.deskripsi);
		System.out.println("Lokasi awal saya : ");
		System.out.println("Latitude : "+ gps.latitude + " dan Longitude : "+ gps.longitude);
		System.out.println("Lokasi saya saat ini : ");
		gps.moveTo(40,55);
	}
}