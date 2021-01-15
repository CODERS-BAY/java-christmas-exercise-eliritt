package controller;

import model.Child;

public class ChildUtil {
	public static void toChildrenArray(Child child) {
		Child.children.add(child);
	}
}