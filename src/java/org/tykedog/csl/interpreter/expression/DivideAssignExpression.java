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
public class DivideAssignExpression extends Expression
{
	
	private Expression composite;
	
	public DivideAssignExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		DivideExpression divide = new DivideExpression(opra, oprb, line);
		AssignExpression assign = new AssignExpression(opra, divide, line);
		composite = assign;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		return composite.execute(callstack);
	}

}
