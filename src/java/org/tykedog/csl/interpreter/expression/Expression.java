/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: Expression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:34:04 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

/**
 *
 */
public abstract class Expression
{
	protected int line;
	
	protected Expression(int line)
	{
		this.line = line;
	}
	
	public int getLine()
	{
		return line;
	}
	
	public abstract Object execute();
}
