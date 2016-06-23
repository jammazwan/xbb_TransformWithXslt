package jammazwan.xbb;

import org.apache.camel.builder.RouteBuilder;

public class XbbRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		Thread.sleep(1000); // give test time to delete file first
		from("file://../jammazwan.shared/src/main/resources/data/xml/?noop=true&fileName=catalog.xml")
				.to("xslt:catalog.xsl").log("${body}").to("file://./?fileName=myDerivedCatalog.html").to("mock:assert");

	}
}
