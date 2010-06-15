/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: ReturnStatement.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 3:48:13 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.CallStack;
import org.tykedog.csl.interpreter.expression.Expression;

/**
 *
 */
public class ReturnStatement extends Statement
{
	private Expression expr;
	
	
	public void setExpr(Expression expr)
	{
		this.expr = expr;
	}


	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		Object result = null;
		if(null != expr)
		{
			result = expr.execute(callstack);
		}
		return StatementExecuteResult.returnResult(Expression.extractVarValue(result));
	}

}
