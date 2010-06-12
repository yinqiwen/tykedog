/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: BreakStatement.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 3:35:32 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.CallStack;

/**
 *
 */
public class BreakStatement extends Statement
{

	/* (non-Javadoc)
	 * @see org.tykedog.csl.interpreter.statement.Statement#execute(org.tykedog.csl.interpreter.function.CallStack)
	 */
	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		return StatementExecuteResult.BREAK;
	}

}
