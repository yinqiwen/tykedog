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
import org.tykedog.csl.interpreter.var.VariableManager;

/**
 *
 */
public class CallStack
{
	private VariableManager	localVarManager	= new VariableManager();

	public int				inLoopStatement	= 0;
	
	public Calculator calculator;
	public Comparator comparator;
}
