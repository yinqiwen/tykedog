/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: Function.java 
 *
 * @author yinqiwen [ 2010-6-10 | 09:36:57 PM ]
 *
 */
package org.tykedog.csl.interpreter.function;

import java.util.ArrayList;
import java.util.List;

import org.tykedog.csl.interpreter.CallStack;
import org.tykedog.csl.interpreter.statement.Statement;
import org.tykedog.csl.interpreter.statement.StatementExecuteResult;
import org.tykedog.csl.interpreter.statement.StatementExecuteResult.StatementExecuteResultType;

/**
 *
 */
public class Function
{
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void addArg(String arg)
	{
		this.args.add(arg);
	}
	public void addStatment(Statement stat)
	{
		this.stats.add(stat);
	}
	private String name;
	private List<String> args = new ArrayList<String>();
	private List<Statement> stats = new ArrayList<Statement>();
	
	
	public Object execute(Object[] args)
	{
		CallStack callstack = new CallStack();
		for(Statement s:stats)
		{
			StatementExecuteResult result = s.execute(callstack);
			if(result.type.equals(StatementExecuteResultType.RETURN))
			{
				return result.attachment;
			}
		}
		return null;
	}
	
}
