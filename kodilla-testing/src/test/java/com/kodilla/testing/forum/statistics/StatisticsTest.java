package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {
    private Statistics statistics;
    private ForumStat forumstat;

    @Before
    public void beforeTest() {
        statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for(int n =0; n<50; n++){
            list.add("user");
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);

    }

    @Test
    public void testWithNoPosts(){
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        forumstat.calculateAdvStatistics(statistics);
        //Then

        assertEquals(0,forumstat.getCommentsAvgPost(),0.01);
        assertEquals(0,forumstat.getCommentsAvgUser(),0.01);
    }

}
