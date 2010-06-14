/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: AssignExpression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:48:25 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import org.tykedog.csl.interpreter.CallStack;


/**
 *
 */
public class MultiplyAssignExpression extends Expression
{
	private Expression composite;
	
	public MultiplyAssignExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		MultiplyExpression multiply = new MultiplyExpression(opra, oprb, line);
		composite = new AssignExpression(opra, multiply, line);
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		return composite.execute(callstack);
	}

}
