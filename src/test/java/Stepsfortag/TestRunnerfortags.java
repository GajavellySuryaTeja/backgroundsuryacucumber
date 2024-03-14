package Stepsfortag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\tagsfeatures\\tag.feature",
glue ="Stepsfortag" ,
dryRun = false,
monochrome=true,
//tags="@Test2"
//tags="@Test1 and  @Test2"
//tags="@Test1 or  @Test2"
//tags="(@Test1 or  @Test2) and @Test3"
//tags="@Test1 and not @Test2"
//tags="not @Test1"//skip
//tags="not @Test1 and not @Test4"
//tags="@allrun"
//tags="@allrun and @Test1"
tags="@allrun and (@Test1 or @Test2)"
//tags="@allrun and not(@Test3 or @Test4)"
		)


 class TestRunnerfortags {

}
