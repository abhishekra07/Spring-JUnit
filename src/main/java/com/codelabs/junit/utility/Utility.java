package com.codelabs.junit.utility;

import org.springframework.stereotype.Component;

@Component
public class Utility {

	public boolean checkForNullValueOrEmptyString(String name) {
		return name == null || name.isEmpty();
	}
}
