package fr.synapsegaming.user.dao;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.synapsegaming.commons.dao.AbstractDaoTest;

public class SpecializationDaoTest extends AbstractDaoTest {

    private static final int CLASS_ID_GETTING_SPECS = 1;

	private static final int MOST_PLAYED = 5;

    @Autowired
    SpecializationDao specializationDao;
    
    @Test
    public void testListMostPlayed(){
		assertTrue(CollectionUtils.isNotEmpty(specializationDao.listMostPlayed(MOST_PLAYED)));
    }

    @Test
    public void testListSpecsForClass() {
        assertTrue(CollectionUtils.isNotEmpty(specializationDao.listSpecsForClass(CLASS_ID_GETTING_SPECS)));
    }

}
