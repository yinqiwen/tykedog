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
public class GreaterEqualThanExpression extends Expression
{
	private Expression opra;
	private Expression oprb;
	
	public GreaterEqualThanExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		this.opra = opra;
		this.oprb = oprb;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		Object a = opra.execute(callstack);
		Object b = oprb.execute(callstack);
		return callstack.comparator.compare(extractVarValue(a), extractVarValue(b)) >= 0;
	}

}
