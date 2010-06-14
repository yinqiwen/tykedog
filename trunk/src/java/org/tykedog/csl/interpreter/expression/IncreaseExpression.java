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
public class IncreaseExpression extends Expression
{
	private Expression opr;
	
	public IncreaseExpression(Expression opr, int line)
	{
		super(line);
		this.opr = opr;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		Object value = opr.execute(callstack);
		Object ret = callstack.calculator.increase(extractVarValue(value));
		writeVar(value, ret);
		return ret;
	}

}
