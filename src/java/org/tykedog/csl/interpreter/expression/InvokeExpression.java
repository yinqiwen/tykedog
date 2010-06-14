/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: InvokeExpression.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 10:51:19 AM ]
 *
 */
package org.tykedog.csl.interpreter.expression;

import java.util.List;

import org.tykedog.csl.api.InvokeCommand;
import org.tykedog.csl.interpreter.CallStack;


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

	@Override
	public Object execute(CallStack callstack)
	{
		InvokeCommand command = callstack.getInvokeCommandTable().getCommand(funcId);
		Object[] argValues = null;
		if(null != args)
		{
			argValues = new Object[args.size()];
			for(int i = 0; i < argValues.length; i++)
			{
				argValues[i] = extractVarValue(args.get(i).execute(callstack));
			}
		}
		return command.execute(argValues);
	}

}
