package qa.SampleProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class QAsampleAppTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		QAsampleApp qasampleapp = new QAsampleApp();
		assertEquals(2, qasampleapp.sampleFunc(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void sampleFunc(int first, int second, int expectedResult) {
		QAsampleApp qasampleapp = new QAsampleApp();
		assertEquals(expectedResult, qasampleapp.sampleFunc(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
}
