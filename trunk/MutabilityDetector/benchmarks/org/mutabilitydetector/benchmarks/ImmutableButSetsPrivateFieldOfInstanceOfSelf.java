/*
 * Mutability Detector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * Further licensing information for this project can be found in 
 * 		license/LICENSE.txt
 */

package org.mutabilitydetector.benchmarks;

public class ImmutableButSetsPrivateFieldOfInstanceOfSelf {

	@SuppressWarnings("unused")
	private int myField = 0;
	
	public ImmutableButSetsPrivateFieldOfInstanceOfSelf setPrivateFieldOnInstanceOfSelf() {
		ImmutableButSetsPrivateFieldOfInstanceOfSelf i = new ImmutableButSetsPrivateFieldOfInstanceOfSelf();
		i.myField = 10;
		return i;
	}
	
}
