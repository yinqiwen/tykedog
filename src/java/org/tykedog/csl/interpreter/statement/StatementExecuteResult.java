/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: StatementExecuteResult.java 
 *
 * @author qiying.wang [ Jun 11, 2010 | 2:36:54 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

/**
 *
 */
public class StatementExecuteResult
{
	public static enum StatementExecuteResultType
	{
		NEXT, BREAK, CONTINUE, RETURN
	}

	private StatementExecuteResult(StatementExecuteResultType type,
			Object attachment)
	{
		this.type = type;
		this.attachment = attachment;
	}

	public final StatementExecuteResultType		type;
	public final Object							attachment;

	public static final StatementExecuteResult	NEXT		= new StatementExecuteResult(
																	StatementExecuteResultType.NEXT,
																	null);
	public static final StatementExecuteResult	BREAK		= new StatementExecuteResult(
																	StatementExecuteResultType.BREAK,
																	null);
	public static final StatementExecuteResult	CONTINUE	= new StatementExecuteResult(
																	StatementExecuteResultType.CONTINUE,
																	null);
	
	public static StatementExecuteResult returnResult(Object result)
	{
		return new StatementExecuteResult(
				StatementExecuteResultType.RETURN,
				result);
	}
}
