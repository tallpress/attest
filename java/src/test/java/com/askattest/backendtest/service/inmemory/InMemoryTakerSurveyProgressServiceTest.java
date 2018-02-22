package java.com.askattest.backendtest.service.inmemory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryTakerSurveyProgressServiceTest {

    private com.askattest.backendtest.service.inmemory.InMemoryTakerSurveyProgressService inMemoryTakerSurveyProgressService;

    @Before
    public void setUp() {
        inMemoryTakerSurveyProgressService = new com.askattest.backendtest.service.inmemory.InMemoryTakerSurveyProgressService();
    }

    @Test
    public void checkReturn() throws Exception {
        Assert.assertEquals(null, inMemoryTakerSurveyProgressService.getTakerSurveyProgressForTakerIdAndSurveyId(300,201));
    }


}