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
public class MinusExpression extends Expression
{
	private Expression opra;
	private Expression oprb;
	
	public MinusExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		this.opra = opra;
		this.oprb = oprb;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		Object a = opra.execute(callstack);
		if(null != oprb)
		{
			Object b = oprb.execute(callstack);
			return callstack.calculator.sub(extractVarValue(a), extractVarValue(b));
		}
		return callstack.calculator.sub(0, extractVarValue(a));
	}

}
