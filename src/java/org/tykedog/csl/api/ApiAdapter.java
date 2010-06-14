/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: CSLAdapter.java 
 *
 * @author yinqiwen [ 2010-6-14 | 04:19:27PM ]
 *
 */
package org.tykedog.csl.api;

import org.tykedog.csl.api.Calculator;
import org.tykedog.csl.api.Comparator;

/**
 *
 */
public abstract class ApiAdapter implements Calculator, Comparator
{

	@Override
	public Object add(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object decrease(Object opr)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object divide(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object increase(Object opr)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logicAnd(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logicOr(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object mod(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object multiply(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object sub(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compare(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean match(Object opra, Object oprb)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
