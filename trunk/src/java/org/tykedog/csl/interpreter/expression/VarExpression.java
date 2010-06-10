/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: VarExpression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:49:30 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

/**
 *
 */
public class VarExpression extends Expression
{

	private String id;
	
	public VarExpression(String id)
	{
		this.id = id;
	}
	
	@Override
	public Object execute()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
