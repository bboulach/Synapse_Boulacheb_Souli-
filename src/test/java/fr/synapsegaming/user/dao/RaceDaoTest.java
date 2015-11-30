package fr.synapsegaming.user.dao;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RaceDaoTest {

	private static final int MOST_PLAYED = 5;

    @Autowired
    RaceDao raceDao;
    
    @Test
    public void testListMostPlayed(){
		assertTrue(CollectionUtils.isNotEmpty(raceDao.listMostPlayed(MOST_PLAYED)));
    }
	
}
