/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: VariableManager.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 1:59:08 PM ]
 *
 */
package org.tykedog.csl.interpreter.var;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class VariableManager
{
	private Map<String, Variable> vars = new ConcurrentHashMap<String, Variable>();
	
	public Variable getVariable(String name)
	{
		return vars.get(name);
	}
	
	public Variable createVariable(String name)
	{
		return createVariable(name, null);
	}
	
	public Variable createVariable(String name, Object value)
	{
		Variable var = new Variable(name, value);
		vars.put(name, var);
		return var;
	}
}
