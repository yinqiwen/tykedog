/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: CallStack.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 2:47:30 PM ]
 *
 */
package org.tykedog.csl.interpreter;

import org.tykedog.csl.api.Calculator;
import org.tykedog.csl.api.Comparator;
import org.tykedog.csl.interpreter.invoke.InvokeCommandTable;
import org.tykedog.csl.interpreter.var.Variable;
import org.tykedog.csl.interpreter.var.VariableManager;

/**
 *
 */
public class CallStack
{
	public final VariableManager	localVarManager	= new VariableManager();

	private VariableManager			globalVarManager;
	private InvokeCommandTable invokeCommandTable;

	public InvokeCommandTable getInvokeCommandTable()
	{
		return invokeCommandTable;
	}

	public void setInvokeCommandTable(InvokeCommandTable invokeCommandTable)
	{
		this.invokeCommandTable = invokeCommandTable;
	}

	public void setGlobalVarManager(VariableManager globalVarManager)
	{
		this.globalVarManager = globalVarManager;
	}

	public int	inLoopStatement	= 0;

	public CallStack(Calculator calculator, Comparator comparator)
	{
		this.calculator = calculator;
		this.comparator = comparator;
	}

	public Variable getVariable(String id)
	{
		Variable var = null;
		if(null != globalVarManager)
		{
			var = globalVarManager.getVariable(id);
		}
		if(null == var)
		{
			var = localVarManager.getVariable(id);
		}
		if(null == var)
		{
			var = localVarManager.createVariable(id);
		}
		return var;

	}

	public final Calculator	calculator;
	public final Comparator	comparator;
}
