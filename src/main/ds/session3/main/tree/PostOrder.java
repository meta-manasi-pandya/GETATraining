package main.ds.session3.main.tree;

import java.util.ArrayList;
import java.util.List;

import main.ds.session3.utils.Node;

/**
 * returns the traversed nodes in post ordered traversal using recursive calling
 * @author Manasi Pandya
 *
 */
public class PostOrder<T> {
	private List<T> traversedPath;
	
	public PostOrder() {
		traversedPath = new ArrayList<>();
	}
	public List<T> postOrder(Node<T> root) {
		/*Visits the left subtree recursively*/
		if(root.left!=null) {
			postOrder(root.left);
		}
		/*Visits the right subtree recursively*/
		if(root.right!=null) {
			postOrder(root.right);
		}
		/*Adds the current node data*/
		traversedPath.add(root.data);
		return traversedPath;
	}
}
