/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: ConstantExpression.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 10:53:54 AM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

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
	public Object execute()
	{
		return value;
	}

}
