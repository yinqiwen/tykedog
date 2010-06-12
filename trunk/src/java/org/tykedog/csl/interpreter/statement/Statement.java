/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, BigBand Networks Inc. All rights reserved.
 *
 * Description: Statement.java 
 *
 * @author qiying.wang [ Jun 10, 2010 | 4:45:31 PM ]
 *
 */
package org.tykedog.csl.interpreter.statement;

import org.tykedog.csl.interpreter.CallStack;

/**
 *
 */
public abstract class Statement
{
	public abstract StatementExecuteResult execute(CallStack callstack);
}
