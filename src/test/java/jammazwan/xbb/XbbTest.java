package jammazwan.xbb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jammazwan.entity.TextData;

public class XbbTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}

	@Test
	public void testXslt() throws Exception {

		File file = new File("myDerivedCatalog.html");
		if(file.exists()){
			file.delete();
		}
		Thread.sleep(1000); //give time to delete file first
		MockEndpoint mock = getMockEndpoint("mock:assert");
		mock.expectedFileExists("myDerivedCatalog.html");
		mock.expectedMessageCount(1);
		mock.assertIsSatisfied();
		
	}

}
