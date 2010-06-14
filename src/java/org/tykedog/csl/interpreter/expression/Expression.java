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
import org.tykedog.csl.interpreter.var.Variable;

/**
 *
 */
public abstract class Expression
{
	protected int line;
	
	protected Object extractVarValue(Object value)
	{
		if(value instanceof Variable)
		{
			return ((Variable)value).getValue();
		}
		return value;
	}
	
	protected void writeVar(Object var, Object value)
	{
		if(var instanceof Variable)
		{
			((Variable)var).setValue(value);
		}
	}
	
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
