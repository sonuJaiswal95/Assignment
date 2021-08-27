import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost(){
		
		Object[][] data = new Object[2][3];
		data[0][0] = "Albert";
		data[0][1] = "Einstein";
		data[0][2] = 2;
		
		data[1][0] = "Thomas";
		data[1][1] = "Edison";
		data[1][2] = 1;
		
		return data;
		
	}
	
	@Test(dataProvider = "DataForPost" )
		public void test_1_post(String firstName, String lastName, int subjectId) {

			
			JSONObject request = new JSONObject();

			request.put("firstName",firstName);
			request.put("lastName",lastName);
			request.put("subjectId",subjectId);
			System.out.println(request);

			given().
			header("content-type", "application/json").
			body(request.toJSONString()).
			when().
			post("https://reqres.in/api/users").
			then().
			statusCode(201).
			log().all();
		}


}
