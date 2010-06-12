/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
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
public class ContinueStatement extends Statement
{

	/* (non-Javadoc)
	 * @see org.tykedog.csl.interpreter.statement.Statement#execute(org.tykedog.csl.interpreter.function.CallStack)
	 */
	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		return StatementExecuteResult.CONTINUE;
	}

}
