# 关于 #

  * tykedog是一个简单可扩展的脚本语言，可以嵌入到实际软件产品中(目前仅支持Java)
  * tykedog基于antlr3开发实现，可以看成是解释型脚本语言，但和实际解释型有略有不同
  * tykedog可应用于多种场景，但设计tykedog的原始目的在于在一些场景下将复杂多变的业务逻辑从配置，以及具体代码实现中抽象出来，用tykedog脚本语言代替
  * tykedog的设计原则是尽量简单，因此默认情况下是不能完成任何功能的，需要用户来扩展实现遗留的基本语言功能支持，如加减乘除运算，逻辑判断，IO等
  * tykedog在运行过程冲可以和具体实现（如JAVA）进行交互

# 结构语法 #
  * 语言结构
> > tykedog语言结构非常简单，只有三个基本构成:
    * expression
> > > 表达式，如加减乘除运算，方法调用等
    * statement
> > > 用于程序流控制，如if/while/return/break等控制程序运行轨迹
    * function
> > > 方法，简单的模块化控制实现
  * 语法
    * 变量
> > > 以“$"开头，作用域分为两种，全局以及函数，在方法总定义的作用域为方法本身，在非方法中定义则是全局变量， eg:
```
         $address="127.0.0.1:9050";
```
    * expresion
> > > 以“；”作为结束标志，目前支持以下运算符:
```
          +， -， *, /, %, +=, -=, *=, /=, %=,
          >, <, >=, <=, ~=, ==, !=, ++(前置)， --(前置)
```
> > > eg：
```
         $contentLength = int(getHeader($headers, "content-length"));
         $result = 3-5*5-9;
```
    * statement
> > > 支持以下statement:
```
         ##if-elif-else:
         if ...
         {
            ....
         }
         elif ...  ##可多个
         {
           ....
         }
         else
         {
           ...
         }
         ## 注意if-elif-else后面的代码块必须包含在"{" "}"中
```
```
         ##while
         while ...
         {
             ....
         }
         ## 注意while后面的代码块必须包含在"{" "}"中
```
```
         ##break/continue, 只在while中有效
         while ...
         {
             ....
             break;
             .....
             continue;
         }
```
```
          ##return, 返回
          ....
          return 1;
```
    * function
> > > tykedog支持定义方法function，方法定义的语法如下：
```
         ##hello为方法名， name为参数，可以定义多个
         def hello(name)
         {
           ....
         }
```

# 示例 #

> 参考 [sample](http://code.google.com/p/tykedog/source/browse/trunk/sample/hello.csl)

# 用法 #
> 由于是嵌入到具体实现中，因此tykedog不能单独运行，需要外部具体实现来调用， eg:
```
     //解析脚本文件
     CSL csl = CSL.Builder.build("sample/hello.csl");
     //设置运算实现
     csl.setCalculator(new DefaultApi());
     //设置比较实现
     csl.setComparator(new DefaultApi());
     //注入外部命令
     csl.addFunction(....);
     
     //调用hello方法，参数为40，30
     Object ret = csl.invoke("hello", new Object[]{40, 30});
```

# 自定义扩展 #
> 默认情况下，tykedog不能完成任何功能，用户需要实现一些基本语言特性才能让自定义的脚本运行起来。用户需要实现的语言特性包括：
```
   ##运算符， 用户需要实现此接口
   package org.tykedog.csl.api;
   public interface Calculator
   {
        // “+”
        public Object add(Object opra, Object oprb);
        // “-”
        public Object sub(Object opra, Object oprb);
        // “*”
        public Object multiply(Object opra, Object oprb);
        // “/”
        public Object divide(Object opra, Object oprb);
        // “%”
        public Object mod(Object opra, Object oprb);
        // “++”
        public Object increase(Object opr);
        // “--”
        public Object decrease(Object opr);     
        // “&&”
        public boolean logicOr(Object opra, Object oprb);
        // “||”
        public boolean logicAnd(Object opra, Object oprb);
    }
```
```
    ##比较， 用户需要实现此接口
    package org.tykedog.csl.api;
    public interface Comparator
    {
        /**
         * Operator "~="
         * @param opra
         * @param oprb
         * @return
         */
        public boolean match(Object opra, Object oprb);
        /**
         * Operator ">", "<", "==", ">=", "<=", "!="
         * @param opra
         * @param oprb
         * @return
         */
        int compare(Object opra, Object oprb);
      }
```
> 此外，用户也可以注入一些外部方法供tykedog在脚本中调用， eg:
```
    //注入“println"方法，则在脚本中可以调用“println”了
    csl.addFunction(new InvokeCommand()
    {           
        @Override
        public String getName()
        {
             return "println";
        }       
        @Override
        public Object execute(Object[] args)
        {
             System.out.println(args[0]);
             return null;
        }
     });
```

# 当前状态 #
  * 已经可以稳定运行，但由于文档缺乏以及语法细则可能会调整，暂不直接发布，有需要的朋友可以直接取代码自行编译
  * 项目[snova](http://code.google.com/p/snova/)已经利用本项目完成类PAC的功能