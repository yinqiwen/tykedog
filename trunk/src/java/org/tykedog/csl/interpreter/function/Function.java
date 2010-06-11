/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: Function.java 
 *
 * @author yinqiwen [ 2010-6-10 | ÏÂÎç09:36:57 ]
 *
 */
package org.tykedog.csl.interpreter.function;

import java.util.ArrayList;
import java.util.List;

import org.tykedog.csl.interpreter.statement.Statement;

/**
 *
 */
public class Function
{
	public void setName(String name)
	{
		this.name = name;
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
	
	
	public void execute(Object[] args)
	{
		for(Statement s:stats)
		{
			s.execute();
		}
	}
	
}
