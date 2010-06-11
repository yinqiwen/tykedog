/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: IfElseStatement.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 2:05:11 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

/**
 *
 */
public class IfElseStatement extends Statement
{

	/* (non-Javadoc)
	 * @see org.tykedog.csl.interpreter.statement.Statement#execute()
	 */
	@Override
	public StatementExecuteResult execute()
	{
		return StatementExecuteResult.NEXT;
	}

}
