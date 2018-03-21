package main.ds.session3.main.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import main.ds.session3.main.tree.PostOrder;
import main.ds.session3.utils.Node;


public class PostOrderTest {
	private Node<Integer> root;
	private PostOrder<Integer> postorderTraverse;
	private List<Integer> actualTraversedPath;
	private List<Integer> expectedTraversedPath;
	
	public PostOrderTest() {
		actualTraversedPath = new ArrayList<>();
		expectedTraversedPath = new ArrayList<>();
	}
	@Test
	public void testBalancedB() {
		root = new Node<>(10);
		root.addItem(6);
		root.addItem(45);
		root.addItem(8);
		root.addItem(23);
		root.addItem(54);
		root.addItem(60);
		root.addItem(4);
		postorderTraverse = new PostOrder<>();
        actualTraversedPath = postorderTraverse.postOrder(root);
        expectedTraversedPath.add(4);
        expectedTraversedPath.add(8);
        expectedTraversedPath.add(6);
        expectedTraversedPath.add(23);
        expectedTraversedPath.add(60);
        expectedTraversedPath.add(54);
        expectedTraversedPath.add(45);
        expectedTraversedPath.add(10);
        assertEquals(expectedTraversedPath, actualTraversedPath);
	}

	@Test
	public void testRightSkewTreeSuccess() {
		root = new Node<>(22);
		root.addItem(25);
		root.addItem(45);
		root.addItem(80);
		postorderTraverse = new PostOrder<>();
        actualTraversedPath = postorderTraverse.postOrder(root);
        expectedTraversedPath.add(80);
        expectedTraversedPath.add(45);
        expectedTraversedPath.add(25);
        expectedTraversedPath.add(22);
        assertEquals(expectedTraversedPath, actualTraversedPath);
	}
	
	@Test
	public void testLeftSkewTreeSuccess() {
		root = new Node<>(22);
		root.addItem(20);
		root.addItem(4);
		root.addItem(0);
		postorderTraverse = new PostOrder<>();
        actualTraversedPath = postorderTraverse.postOrder(root);
        expectedTraversedPath.add(0);
        expectedTraversedPath.add(4);
        expectedTraversedPath.add(20);
        expectedTraversedPath.add(22);
        assertEquals(expectedTraversedPath, actualTraversedPath);
	}
	
	@Test
	public void testNullTreeSuccess() {
		root = new Node<>((Integer) null);
		postorderTraverse = new PostOrder<>();
        actualTraversedPath = postorderTraverse.postOrder(root);
        expectedTraversedPath.add(null);
        assertEquals(expectedTraversedPath, actualTraversedPath);
	}

}
