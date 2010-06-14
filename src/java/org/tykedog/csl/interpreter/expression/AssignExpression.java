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
import org.tykedog.csl.interpreter.var.Variable;

/**
 *
 */
public class AssignExpression extends Expression
{
	private Expression opra;
	private Expression oprb;
	
	public AssignExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		this.opra = opra;
		this.oprb = oprb;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		Object target = opra.execute(callstack);
		if(target instanceof Variable)
		{
			Object value = extractVarValue(oprb.execute(callstack));
			((Variable)target).setValue(value);
			return value;
		}
		throw new IllegalStateException("Can not assign value to non var.");
		
	}

}
