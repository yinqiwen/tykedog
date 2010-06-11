/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: InvokeExpression.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 10:51:19 AM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import java.util.List;

/**
 *
 */
public class InvokeExpression extends Expression
{
	private String funcId;
	private List<Expression> args;
	
	public InvokeExpression(String id, List<Expression> args,int line)
	{
		super(line);
		this.args = args;
		this.funcId = id;
	}

	/* (non-Javadoc)
	 * @see org.tykedog.csl.interpreter.expression.Expression#execute()
	 */
	@Override
	public Object execute()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
