package com.varsity.practicalassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class SeriesTest {

    private Series series;

    @BeforeEach
    void setUp() {
        series = new Series();
        series.model.add(new SeriesModel("01", "Flash", "13", "21"));
        series.model.add(new SeriesModel("02", "Doctor who", "7", "14"));
    }

    @Test
    void testAgerestriction_validAge() {
        String result = series.agerestriction("11");
        assertEquals("age restiction is valid", result);
    }

    @Test
    void testAgerestriction_invalidAge() {
        String result = series.agerestriction("29");
        assertEquals("you have entered an incorrect series age!!! \n please re enter the series age", result);
    }

    @Test
    void testSearchSeries_found() {
        String simulatedInput = "01\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String result = series.searchseries();

        assertTrue(result.contains("seriesid: 01"));
        assertTrue(result.contains("series name: Flash"));
    }

    @Test
    void testSearchSeries_notFound() {
        String simulatedInput = "19\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String result = series.searchseries();

        assertTrue(result.contains("series with series id: 19 not found"));
    }

    @Test
    void testUpdateseries_foundAndUpdated() {
        String simulatedInput = "02\nThe Flash\n13\n23\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String result = series.updatesries();

        assertEquals(" record updated successfully. ", result);
        assertEquals("The Flash", series.model.get(1).getSeriesname());
        assertEquals("13", series.model.get(1).getSeriesage());
        assertEquals("23", series.model.get(1).getSeriesnumberofepisodes());
    }

    @Test
    void testUpdateseries_idNotFound() {
        String simulatedInput = "19\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String result = series.updatesries();

        assertEquals(" there is no record related to the given ID ", result);
    }


    
    @Test
void testDeleteseries_emptyList() {
    series.model.clear(); // ensure it's empty

    String result = series.deleteseries();

    assertEquals(" there is no series to delete, it is empty ", result);
}

@Test
void testDeleteseries_notFound() {
    String simulatedInput = "19\n"; // non-existing ID
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    String result = series.deleteseries();

    assertEquals("series not found", result);
}

@Test
void testDeleteseries_foundAndDeleted() {
    String simulatedInput = "01\ny\n"; // confirm deletion
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    String result = series.deleteseries();

    assertTrue(result.contains("series with series id: 01 WAS deleted"));
    assertEquals(1, series.model.size()); // one series was removed
}

//@Test
//void testDeleteseries_foundButNotDeleted() {
//    String simulatedInput = "S002\nn\n"; // decline deletion
//    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
//
//    String result = series.deleteseries();
//
//    assertEquals("series not found", result);
//    assertEquals(2, series.model.size()); // nothing removed
//}
@Test
void testDeleteseries_seriesFoundButNotDeleted() {
    // Provide input: valid ID (S002), then 'n' to cancel deletion
    String simulatedInput = "02\nn\n";
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    String result = series.deleteseries();

    assertEquals("record is not deleted", result);
    assertEquals(2, series.model.size()); // Nothing should be removed
    assertTrue(series.model.stream().anyMatch(s -> s.getSeriesid().equals("02")));
    }

}
//        code attribution
//        these unit tests were partially helped by ChatGPT 
//        https://openai.com/
//        ChatGPT