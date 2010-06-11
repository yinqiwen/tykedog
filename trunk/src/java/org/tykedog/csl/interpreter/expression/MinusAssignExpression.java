/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: AssignExpression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:48:25 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

/**
 *
 */
public class MinusAssignExpression extends Expression
{
	private Expression opra;
	private Expression oprb;
	
	public MinusAssignExpression(Expression opra, Expression oprb, int line)
	{
		super(line);
		this.opra = opra;
		this.oprb = oprb;
	}
	
	@Override
	public Object execute()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
