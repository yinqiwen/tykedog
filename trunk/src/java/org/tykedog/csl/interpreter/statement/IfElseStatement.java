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

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

import org.tykedog.csl.interpreter.CallStack;

/**
 *
 */
public class IfElseStatement extends Statement
{

	private ChoiceStatement ifStatement;
	private List<ChoiceStatement> elifStats = new ArrayList<ChoiceStatement>();
	private BlockStatement elseBlock;
	
	public void setIfStatement(ChoiceStatement ifStatement)
	{
		this.ifStatement = ifStatement;
	}
	public void setElseBlock(BlockStatement elseBlock)
	{
		this.elseBlock = elseBlock;
	}
	public void addElifStatement(ChoiceStatement elifStatement)
	{
		elifStats.add(elifStatement);
	}
	
	@Override
	public StatementExecuteResult execute(CallStack callstack)
	{
		Boolean choice = (Boolean) ifStatement.expression.execute(callstack);
		if(choice)
		{
			return ifStatement.block.execute(callstack);
		}
		else
		{
			for(ChoiceStatement elif:elifStats)
			{
				choice = (Boolean) elif.expression.execute(callstack);
				if(choice)
				{
					return elif.block.execute(callstack);
				}
			}
			if(null != elseBlock)
			{
				return elseBlock.execute(callstack);
			}
		}
		return StatementExecuteResult.NEXT;
	}

}
