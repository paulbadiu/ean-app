package test.api;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.api.autocomplete.RegionCenterCoordinates;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Paul Badiu
 */
@RunWith(MockitoJUnitRunner.class)
public class AutocompleteControllerIntegrationTest {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final JavaType RCC_LIST_TYPE
            = mapper.getTypeFactory().constructCollectionType(List.class, RegionCenterCoordinates.class);

    private static final String AUTOCOMPLETE_URL = "http://localhost:8080/auto?term=cluj";
    private static final RegionCenterCoordinates EXPECTED_REGION_CENTER_COORDINATES
            = new RegionCenterCoordinates(860, "Cluj-Napoca, Romania", 46.745455, 23.590637);

    private static HttpClient client = HttpClientBuilder.create().build();
    private HttpResponse autocompleteleResponse;

    @Before
    public void setup() {
        HttpGet autocompleteRequest = new HttpGet(AUTOCOMPLETE_URL);
        try {
            autocompleteleResponse = client.execute(autocompleteRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAutocompleteResponse() {
        HttpEntity entity = autocompleteleResponse.getEntity();
        List<RegionCenterCoordinates> actualRCCList = null;
        try {
            actualRCCList = mapper.readValue(entity.getContent(), RCC_LIST_TYPE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(EXPECTED_REGION_CENTER_COORDINATES, actualRCCList.get(0));
    }
}
