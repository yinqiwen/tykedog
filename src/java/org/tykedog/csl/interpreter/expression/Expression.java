/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: Expression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:34:04 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import org.tykedog.csl.interpreter.CallStack;

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
	
	public abstract Object execute(CallStack callstack);
}
