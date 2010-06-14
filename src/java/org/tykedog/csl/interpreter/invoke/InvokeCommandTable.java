/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: InvokeCommandTable.java 
 *
 * @author yinqiwen [ 2010-6-14 | 04:44:38PM ]
 *
 */
package org.tykedog.csl.interpreter.invoke;

import java.util.HashMap;
import java.util.Map;

import org.tykedog.csl.api.InvokeCommand;

/**
 *
 */
public class InvokeCommandTable
{
	private Map<String, InvokeCommand>	commands					= new HashMap<String, InvokeCommand>();
	
	public void addInvokeCommand(InvokeCommand func)
	{
		commands.put(func.getName(), func);
	}
	
	public InvokeCommand getCommand(String name)
	{
		return commands.get(name);
	}
}
