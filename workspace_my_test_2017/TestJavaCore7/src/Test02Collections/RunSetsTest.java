package Test02Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RunSetsTest {

	public static void main(String[] args){
		new RunSetsTest().doTest();
	}
	
	private void doTest(){

		// String 
		Collection<String> base = Arrays.asList("6", "9", "2", "6", "5");
		
		Set<String> hashSet = new HashSet<String>(base);
		hashSet.add("7");
		System.out.println("hashSet.toString() - " + hashSet.toString());
		sysOutThroughIterator("hashSet", hashSet);
		
		Set<String> linkedHashSet = new LinkedHashSet<String>(base);
		linkedHashSet.add("7");
		System.out.println("linkedHashSet.toString() - " + linkedHashSet.toString());
		sysOutThroughIterator("linkedHashSet", linkedHashSet);
		
		Set<String> treeSet = new TreeSet<String>(base);
		treeSet.add("7");
		System.out.println("treeSet.toString() - " + treeSet.toString());
		sysOutThroughIterator("treeSet", treeSet);
		
		
		// Class
		Collection<CollectionTestClass> baseCl = Arrays.asList(
				new CollectionTestClass("1", 1),
				new CollectionTestClass("3", 3),
				new CollectionTestClass("1", 5),
				new CollectionTestClass("1", 4)
				);
		
		Set<CollectionTestClass> hashSetCl = new HashSet<CollectionTestClass>(baseCl);
		System.out.println("hashSet.toString() - " + hashSetCl.toString());
		sysOutThroughIterator("hashSet", hashSetCl);
		
		Set<CollectionTestClass> linkedHashSetCl = new LinkedHashSet<CollectionTestClass>(baseCl);
		System.out.println("linkedHashSet.toString() - " + linkedHashSetCl.toString());
		sysOutThroughIterator("linkedHashSet", linkedHashSetCl);
		
		Set<CollectionTestClass> treeSetCl = new TreeSet<CollectionTestClass>(baseCl);
		System.out.println("treeSet.toString() - " + treeSetCl.toString());
		sysOutThroughIterator("treeSet", treeSetCl);
	}
	
	private void sysOutThroughIterator(String title, Set<?> set){

		System.out.print(title + " iterator - ");
		
		Iterator<?> iter = set.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		System.out.println();
	}
	
}
