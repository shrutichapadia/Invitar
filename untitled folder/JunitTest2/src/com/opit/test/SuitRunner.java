package com.opit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	 TestSecond.class,
	 FirstTest.class,
	 ParameterizedTest.class
})
public class SuitRunner {


}
