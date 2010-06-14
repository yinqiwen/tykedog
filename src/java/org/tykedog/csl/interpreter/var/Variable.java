/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: Variable.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 11:19:46 AM ]
 *
 */
package org.tykedog.csl.interpreter.var;

/**
 *
 */
public class Variable
{
	public Object getValue()
	{
		return value;
	}
	public void setValue(Object value)
	{
		this.value = value;
	}
	public Variable(String name, Object value)
	{
		this.name = name;
		this.value = value;
	}
	private final String name;
	private Object value;
	
}
