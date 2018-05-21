package main.ds.session4.question2.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import main.ds.session4.question2.main.Hotel;
import main.ds.session4.question2.main.Person;

public class TestRooms {
	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	private Hotel hotel;
	private Map<Integer, String> actual;
	private Map<Integer, String> expected;
	@Before
	public void setUp() throws Exception {
		p1 = new Person(82, "abc1");
		p2 = new Person(78, "abc2");
		p3 = new Person(62, "abc3");
		p4 = new Person(92, "abc4");
		hotel = new Hotel(7);
		actual = new HashMap<>();
		expected = new HashMap<>();
		hotel.allotRooms(p1);
		hotel.allotRooms(p2);
		hotel.allotRooms(p3);
		hotel.allotRooms(p4);
	}

	@Test
	public void test() {
		actual = hotel.display();
		expected.put(1, "abc2");
		expected.put(2, "abc4");
		expected.put(5, "abc1");
		expected.put(6, "abc3");
		assertEquals(expected,actual);
	}

}
