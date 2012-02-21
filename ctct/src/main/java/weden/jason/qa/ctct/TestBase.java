package weden.jason.qa.ctct;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    private static final Logger LOG = LogManager.getLogger(TestBase.class);
    protected HttpConnector httpConn;

    @BeforeClass(description = "Setting up http connection object")
    public void setup() throws Exception {
        httpConn = new HttpConnector();
        httpConn.initialize();
    }


    @AfterClass(description = "Gracefully shut down http connection")
    public void tearDown() throws Exception {
        httpConn.clientTeardown();
    }


}

