package main.ds.session3.main.test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.ds.session3.main.tree.MirrorCheck;
import main.ds.session3.utils.Node;

public class TestMirrorCheck {
	private Node<Integer> rootLeft;
	private Node<Integer> rootRight;
	private MirrorCheck<Integer> ct;
	
	public TestMirrorCheck() {
		ct = new MirrorCheck<Integer>();
	}
	
	@Test
	public void testMirrorTreeSuccess() {
		rootLeft = new Node<>(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new Node<>(10);
		rootRight.addItemReverse(30);
		rootRight.addItemReverse(6);
		rootRight.addItemReverse(31);
		rootRight.addItemReverse(28);
		rootRight.addItemReverse(8);
		rootRight.addItemReverse(4);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	@Test
	public void testNotMirrorTreesSuccess() {
		rootLeft = new Node<>(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new Node<>(10);
		rootRight.addItemReverse(30);
		rootRight.addItemReverse(6);
		rootRight.addItemReverse(31);
		rootRight.addItemReverse(28);
		rootRight.addItemReverse(8);
		assertFalse(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	
	@Test
	public void testNullTreesSuccess() {
		rootLeft = new Node<>((Integer) null);
		rootRight = new Node<>((Integer) null);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	

}
