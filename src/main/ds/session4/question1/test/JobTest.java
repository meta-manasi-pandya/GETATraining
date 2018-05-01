package main.ds.session4.question1.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.ds.session4.main.entities.*;
import main.ds.session4.main.service.Printer;

import org.junit.Before;
import org.junit.Test;

public class JobTest {

	private DepartmentChair dcEntity;
	private Professors pEntity;
	private Graduates gEntity;
	private UnderGraduates ugEntity;
	private List<String> actualList;
	private List<String> expectedList;
	@Before
	public void setUp(){
		dcEntity = new DepartmentChair("This is from department chair");
		pEntity = new Professors("This is from professors");
		gEntity = new Graduates("This is from grad students");
		ugEntity = new UnderGraduates("This is from uder grad students");
		ugEntity.sendToPrinter();
		dcEntity.sendToPrinter();
		dcEntity.sendToPrinter();
		gEntity.sendToPrinter();
		pEntity.sendToPrinter();
		actualList = new ArrayList<>();
		expectedList = new ArrayList<>();
		
	}
	@Test
	public void test() {
		actualList = Printer.getInstance().print();
		expectedList.add("This is from department chair");
		expectedList.add("This is from department chair");
		expectedList.add("This is from professors");
		expectedList.add("This is from grad students");
		expectedList.add("This is from uder grad students");
		assertEquals(expectedList, actualList);
	}

}
