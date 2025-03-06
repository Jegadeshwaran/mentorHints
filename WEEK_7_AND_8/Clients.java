package WEEK_7_AND_8;
interface APIClient{
	String get(String URL);
	String post(String URL,String data);
}

class HTTPClients implements APIClient{
	public String get(String URL) {
		return "HTTP:get request sent to "+URL;
		
	}
	public String post(String URL,String data) {
		return "HTTP:post request sent to "+URL+" with "+data;
	}
}

class MockClients implements APIClient{
	public String get(String URL) {
		return "MOCK:get request sent to "+URL;
	}
	public String post(String URL,String data) {
		return "MOCK:post request sent to "+URL+" with "+data;
	}
}
public class Clients {

	public static void main(String[] args) {
		APIClient http = new HTTPClients();
		APIClient mock = new MockClients();
        System.out.println(http.get("https:/mentorhints.com/user"));
        System.out.println(http.post("https:/mentorhints.com/user","jega"));
        System.out.println(mock.get("https:/mentorhints.com/user"));
        System.out.println(mock.post("https:/mentorhints.com/user","jega"));
	}

}
