/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: VarExpression.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:49:30 PM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import org.tykedog.csl.interpreter.CallStack;


/**
 *
 */
public class VarExpression extends Expression
{
	private String id;
	
	public VarExpression(String id, int line)
	{
		super(line);
		this.id = id;
	}
	
	@Override
	public Object execute(CallStack callstack)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
