/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: WhileStatement.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 3:24:54 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.CallStack;
import org.tykedog.csl.interpreter.expression.Expression;
import org.tykedog.csl.interpreter.statement.StatementExecuteResult.StatementExecuteResultType;

/**
 *
 */
public class WhileStatement extends Statement
{
    public WhileStatement(Expression whileExpression, BlockStatement whileBlock)
	{
		this.whileExpression = whileExpression;
		this.whileBlock = whileBlock;
	}


	private Expression whileExpression;
    private BlockStatement whileBlock;
    
	
	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		try
		{
			callstack.inLoopStatement++;
			while(Boolean.TRUE.equals(whileExpression.execute(callstack)))
			{
				StatementExecuteResult result = whileBlock.execute(callstack);
				if(result.type.equals(StatementExecuteResultType.BREAK))
				{
					break;
				}
				else if(result.type.equals(StatementExecuteResultType.RETURN))
				{
					return result;
				}
			}
			
			return StatementExecuteResult.NEXT;
		}
		finally
		{
			callstack.inLoopStatement--;
		}
		
	}

}
