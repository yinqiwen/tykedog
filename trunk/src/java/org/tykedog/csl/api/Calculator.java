/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: Calculator.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 2:21:41 PM ]
 *
 */
package org.tykedog.csl.api;

/**
 *
 */
public interface Calculator
{
	public Object add(Object opra, Object oprb);
	public Object sub(Object opra, Object oprb);
	public Object multiply(Object opra, Object oprb);
	public Object divide(Object opra, Object oprb);
	public Object mod(Object opra, Object oprb);
	public Object increase(Object opr);
	public Object decrease(Object opr);
	
	public boolean logicOr(Object opra, Object oprb);
	public boolean logicAnd(Object opra, Object oprb);
	
}
