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
public class PlusAssignExpression extends Expression
{
	private Expression opra;
	private Expression oprb;
	
	public PlusAssignExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		this.opra = opra;
		this.oprb = oprb;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		Object value = new PlusExpression(opra, oprb, line).execute(callstack);
		Expression opr = new ConstantExpression(value, line);
		AssignExpression assign = new AssignExpression(opra, opr, line);
		return assign.execute(callstack);
	}

}
