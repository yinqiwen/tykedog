/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: Comarator.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 2:27:42 PM ]
 *
 */
package org.tykedog.csl.api;

/**
 *
 */
public interface Comparator<T> extends java.util.Comparator<T>
{
	/**
	 * Operator "~="
	 * @param opra
	 * @param oprb
	 * @return
	 */
	public boolean match(T opra, T oprb);
}
