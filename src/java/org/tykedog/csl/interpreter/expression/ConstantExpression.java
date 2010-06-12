/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: ConstantExpression.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 10:53:54 AM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import org.tykedog.csl.interpreter.CallStack;


/**
 *
 */
public class ConstantExpression extends Expression
{
	private Object value;
	public ConstantExpression(Object value,int line)
	{
		super(line);
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.tykedog.csl.interpreter.expression.Expression#execute()
	 */
	@Override
	public Object execute(CallStack callstack)
	{
		return value;
	}

}
