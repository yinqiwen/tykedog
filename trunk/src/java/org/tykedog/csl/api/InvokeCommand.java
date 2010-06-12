/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: InvokeCommand.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 4:09:00 PM ]
 *
 */
package org.tykedog.csl.api;

/**
 *
 */
public interface InvokeCommand
{
	public String getName();
	public Object execute(Object[] args);
}
