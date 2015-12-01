package fr.synapsegaming.statistiques;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.synapsegaming.commons.dao.AbstractDaoTest;
import fr.synapsegaming.statistiques.service.StatistiquesService;

public class StatistiquesServiceTest extends AbstractDaoTest {
	
	@Autowired
	StatistiquesService statistiquesService;
	
	@Test
	public void testgetClazzMostPlayed() {
		assertTrue(CollectionUtils.isNotEmpty(statistiquesService.getClazzMostPlayed()));
	}
	
	@Test
	public void testgetRaceMostPlayed() {
		assertTrue(CollectionUtils.isNotEmpty(statistiquesService.getRaceMostPlayed()));
	}
	
	@Test
	public void testgetSpecializationMostPlayed() {
		assertTrue(CollectionUtils.isNotEmpty(statistiquesService.getSpecializationMostPlayed()));
	}
	
	
	
}
