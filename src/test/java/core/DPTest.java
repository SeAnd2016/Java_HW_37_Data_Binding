package core;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.*;

public class DPTest {
	@DataProvider(name = "data")
	public static Object[][]data_provider() {
		return new Object[][] {
			{"TC-01.01 (Summary of 1 and 2 equals 3)", "1", "2", "3"},
			{"TC-01.02 (Summary of 3 and 4 equals 7)", "3", "4", "7"},
			{"TC-01.03 (Summary of 5 and 6 equals 11)", "5", "6", "11"},
			{"TC-01.04 (Summary of 7 and 8 equals 15)", "7", "8", "15"}
		};
	}
	@Test(dataProvider = "data")
	
	public void test(String a, String b, String c, String d) {
		System.out.println(a + "," + b + "," + c + "," + d);
		assertThat(Integer.parseInt(b) + Integer.parseInt(c), is(Integer.parseInt(d)));
	}
}
