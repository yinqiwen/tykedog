/**
 * This file is part of the tykedog project.
 * Copyright (c) 2010, Yin QiWen <yinqiwen@gmail.com>. All rights reserved.
 *
 * Description: CSL.java 
 *
 * @author qiying.wang [ Jun 12, 2010 | 4:06:33 PM ]
 *
 */
package org.tykedog.csl.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.tykedog.csl.api.Calculator;
import org.tykedog.csl.api.Comparator;
import org.tykedog.csl.interpreter.function.Function;
import org.tykedog.csl.interpreter.statement.Statement;
import org.tykedog.csl.parser.CSLLexer;
import org.tykedog.csl.parser.CSLParser;
import org.tykedog.csl.parser.TreeCSL;

/**
 *
 */
public class CSL
{
	public static class Builder
	{	
		public static CSL build(String file) throws FileNotFoundException, IOException, RecognitionException
		{
			return build(new FileInputStream(file));
		}
		
		public static CSL build(File file) throws FileNotFoundException, IOException, RecognitionException
		{
			return build(new FileInputStream(file));
		}
		
		public static CSL build(InputStream is) throws IOException, RecognitionException
		{
			CSLLexer lexer = new CSLLexer(new ANTLRInputStream(is));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CSLParser parser = new CSLParser(tokens);
			CommonTree tree = (CommonTree)(parser.language().getTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			return new TreeCSL(nodes).language();
		}
	}

	private Calculator				calculator;
	private Comparator				comparator;
	private List<Statement>			globalStats	= new ArrayList<Statement>();
	private Map<String, Function>	funcs		= new HashMap<String, Function>();

	public void addStatement(Statement st)
	{
		globalStats.add(st);
	}

	public void addFunction(Function func)
	{
		funcs.put(func.getName(), func);
	}

	public CSL setCalculator(Calculator calculator)
	{
		this.calculator = calculator;
		return this;
	}

	public CSL setComparator(Comparator comparator)
	{
		this.comparator = comparator;
		return this;
	}
}
