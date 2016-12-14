package devops;

import org.junit.*;

public class FizzBuzzTests {
	private FizzBuzz fizzBuzz ;
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz() ;
	}

	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "1", fizzBuzz.play( 1 ) ) ;
	}
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "2", fizzBuzz.play( 2 ) ) ;
	}
	
	@Test
	public void numberThreeReturnsFizz() {
	}

}
