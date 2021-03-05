package Project;

import org.junit.Test;

import java.util.regex.Matcher;
import static org.hamcrest.CoreMatchers.containsString;

import static org.junit.Assert.*;

public class MainTest {
    Calculator c = new Calculator();
    @Test
    public void demoTest(){
        assertThat("demotest","myvalue", containsString("myvalue"));
    }

    @Test
    public void rootTest(){
        assertThat("RootTest",c.calculateRoot(25.0), containsString(String.valueOf(5.0)));
    }
    @Test
    public void factorialTest(){

        assertThat("FactorialTest",c.calculateFactorial(5), containsString(String.valueOf(120)));
    }
    @Test
    public void logTest(){
        assertThat("LogTest",c.calculateLog(1.0), containsString(String.valueOf(0.0)));
    }
    @Test
    public void powerTest(){
        assertThat("PowerTest",c.calculatePower(5.0,2.0), containsString(String.valueOf(25.0)));
    }
}
