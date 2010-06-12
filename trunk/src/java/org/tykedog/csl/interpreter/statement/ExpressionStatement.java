/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: ExpressionStatement.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 3:37:40 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.CallStack;
import org.tykedog.csl.interpreter.expression.Expression;

/**
 *
 */
public class ExpressionStatement extends Statement
{
	private Expression expr;
	
	public ExpressionStatement(Expression expr)
	{
		this.expr = expr;
	}

	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		expr.execute(callstack);
		return StatementExecuteResult.NEXT;
	}

}
