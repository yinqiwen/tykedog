/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: StringUtil.java 
 *
 * @author yinqiwen [ 2010-6-14 | 06:25:07PM ]
 *
 */
package org.tykedog.csl.util;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 */
public class StringUtil
{
	public static final String	ESC	= "\b\f\n\r\t";

	public static final String	CSE	= "bfnrt";

	private static char escapeToken(StringReader sr, char c) throws IOException
	{

		int i, j;

		if(c == '\\')
		{

			if((j = CSE.indexOf((char)(i = sr.read()))) >= 0)

				return ESC.charAt(j);

			if(i < 0)

				throw new IllegalArgumentException("" + c);

			c = (char)i;

			if(Character.isDigit(c) || c == 'u' || c == 'x')
			{

				int d, rad = 10, t = -1, p = 0;

				if(!Character.isDigit(c) && (i = sr.read()) < 0)

					throw new IllegalArgumentException("" + c);

				if(c == 'x')
				{

					rad = 16;

					t = 2;

				}
				else if(c == 'u')
				{

					rad = 16;

					t = 4;

				}
				else if(c == '0')
				{

					rad = 8;

					t = 4;

				}

				for(j = 0;

				(d = Character.digit((char)i, rad)) >= 0 && p++ != t;

				i = sr.read())

					j = rad * j + d;

				if(t > 0 && p != t)

					throw new IllegalArgumentException("" + d);

				return (char)j;

			}

		}

		return c;

	}

	public static String convertESC(String s)
	{
		StringReader sr = new StringReader(s);

		StringBuffer sb = new StringBuffer();

		try
		{
			for(int i = sr.read(); i >= 0; i = sr.read())
				sb.append(escapeToken(sr, (char)i));

		}
		catch(IOException ioe)
		{ /* not thrown */
		}

		return sb.toString();

	}
}
