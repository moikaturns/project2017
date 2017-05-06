package com.tutorial.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count {

	String word;
	int count = 0;

	@SuppressWarnings("unused")
	private Count() {
		super();
	}

	public Count(String _word) {
		this.word = _word;
		if (this.word.length() == 0) {
			count = 0;
		} else {
			String[] ar = this.word.split("");
			List<String> list = Arrays.asList(ar);
			Set<String> s = new HashSet<String>(list);
			count = s.size() - 1;
		}
	}

	public int getCount() {
		return count;
	}

}
