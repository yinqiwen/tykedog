/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: ChoiceStatement.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 3:01:06 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.expression.Expression;


/**
 *
 */
public class ChoiceStatement
{
	public ChoiceStatement(Expression expression, BlockStatement block)
	{
		this.expression = expression;
		this.block = block;
	}
	Expression expression;
	BlockStatement block;
}
