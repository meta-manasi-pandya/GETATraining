package main.oops.oops3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.oops.oops3.Event;
import main.oops.oops3.State;
import main.oops.oops3.Transition;
import main.oops.oops3.Workflow;

public class TestWorkflow {

	Workflow work = new Workflow("MetaCube hiring process");

	@Before
	public void beginWorkflow(){
		
		State startState = new State("start");
		work.addState(startState);
		State hrReviewstate = new State("hr Review");
		work.addState(hrReviewstate);
		State l1_Interview_State = new State("l1 Interview");
		work.addState(l1_Interview_State);
		State l2_Interview_State = new State("l2 Interview");
		work.addState(l2_Interview_State);
		State management_Interview_State = new State("management Interview");
		work.addState(management_Interview_State);
		State offer_state = new State("offer");
		work.addState(offer_state);
		work.setCurrentState();
		
	}
	@Test
	public void testSelectedSuccess() {
		Event event1 = new Event("hr process");
		
		work.transition_step(event1);
		Event event2 = new Event("hr ok");
		work.transition_step(event2);
		Event event3 = new Event("l1 ok");
		work.transition_step(event3);
		Event event4 = new Event("l2 ok");
		work.transition_step(event4);
		Event event5 = new Event("management ok");
		work.transition_step(event5);
		List<Transition> actual_object = work.getTransitionList();
		List<String> actual = new ArrayList<String>() ;
		actual.add("Selected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList("Selected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewmanagement Interviewl2 ok" , 
				 "management Interviewoffermanagement ok"));
		assertEquals(expected,actual);
		
		
	}

	
	@Test
	public void testRejectSuccess() {
		Event event1 = new Event("hr process");
		work.transition_step(event1);
		Event event2 = new Event("hr ok");
		work.transition_step(event2);
		Event event3 = new Event("l1 ok");
		work.transition_step(event3);
		Event event4 = new Event("l2 reject");
		work.transition_step(event4);
		
		List<Transition> actual_object = work.getTransitionList();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList("rejected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewmanagement Interviewl2 reject"));
		assertEquals(expected,actual);	
	}
	
	@Test
	public void testRejectFailure() {
		Event event1 = new Event("hr process");
		work.transition_step(event1);
		Event event2 = new Event("hr ok");
		work.transition_step(event2);
		Event event3 = new Event("l1 ok");
		work.transition_step(event3);
		Event event4 = new Event("l2 reject");
		work.transition_step(event4);
		
		List<Transition> actual_object = work.getTransitionList();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList());
		assertNotEquals(expected,actual);
		
		
	}
	@Test(expected=NullPointerException.class)
	public void testException() {
		Event event1 = new Event(null);
		work.transition_step(event1);
		Event event2 = new Event("hr ok");
		work.transition_step(event2);
		Event event3 = new Event("l1 ok");
		work.transition_step(event3);
		Event event4 = new Event("l2 reject");
		work.transition_step(event4);
		
		List<Transition> actual_object = work.getTransitionList();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList());
		assertNotEquals(expected,actual);
		
		
	}
	
}
