/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: BlockStatement.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 5:37:03 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import java.util.List;

import org.tykedog.csl.interpreter.CallStack;

/**
 *
 */
public class BlockStatement extends Statement
{
	public BlockStatement(List<Statement> sl)
	{
		
		this.sl = sl;
	}

	private List<Statement> sl;

	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		for(Statement s:sl)
		{
			StatementExecuteResult result = s.execute(callstack);
			switch (result.type)
			{
				case RETURN:
				{	
					return result;
				}
				case BREAK:
				case CONTINUE:
				{
					if(callstack.inLoopStatement > 0)
					{
						return result;
					}
					break;
				}
			}
		}
		return StatementExecuteResult.NEXT;
	}
	

}
