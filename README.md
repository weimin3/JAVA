<!-- TOC -->
  * [1. JAVA 基础知识](#1-java-)
    * [1.1 CMD常见命令（windows操作系统）](#11-cmdwindows)
    * [1.2 Java 基础语法](#12-java-)
      * [1.2.1 Java 入门](#121-java-)
      * [1.2.2 小概念](#122-)
    * [1.3 Idea和运算符](#13-idea)
      * [1.3.1 IDEA](#131-idea)
      * [1.3.2 运算符](#132-)
    * [1.4 流程控制语句](#14-)
      * [1.4.1 顺序结构](#141-)
      * [1.4.2 分支结构](#142-)
        * [1.4.2.1 if](#1421-if)
        * [1.4.2.2 switch](#1422-switch)
      * [1.4.3 循环结构](#143-)
    * [1.5 数组](#15-)
    * [1.6 方法](#16-)
    * [1.7 练习题](#17-)
    * [1.8 二维数组：数组中存放数组](#18-)
    * [1.8 面向对象](#18-)
    * [1.9 API](#19-api)
    * [1.10 字符串](#110-)
    * [1.11 集合](#111-)
    * [1.12 综合应用](#112-)
    * [1.13 面向对象进阶](#113-)
  * [2. JAVA 进阶知识](#2-java-)
<!-- TOC -->
---
## 1. JAVA 基础知识
### 1.1 CMD常见命令（windows操作系统）
- 盘符名称+冒号：盘符切换

  例如：E:回车，切换到E盘
- dir:查看当前路径下的内容，隐藏文件夹也会被显示
- cd目录：进入单级目录
- cd ..：回退到上一级目录
- cd 目录1\目录2\...:进入多级目录
- cd \:回退到盘符目录
- cls:清屏
- exit:退出命令提示符窗口
### 1.2 Java 基础语法
#### 1.2.1 Java 入门
Jdk安装后的重要文件夹：bin中的javac进行编译，是JDK提供的编译工具，可以把文件编译成class文件，
java运行.class文件
```Java
public class HelloWorld{
  public static void main(String[] args){
    System.out.println("hello world!");
  }
}
```
* 常见问题：
>   - 标点符号：必须是英文
>   - 单词拼写错误：注意大小写

* Java版本：
  - Java SE: 标准版，用于桌面应用的开发
  - Java ME: 小型版，用于嵌入式电子设备或小型移动设备
  - Java EE: 企业版， web方向的开发

* Java主要特征：
  - 面向对象
  - 多线程
  - 开源
  - 跨平台（操作系统）：通过虚拟机实现，不同的平台安装不同的虚拟机

* JVM, JDK,JRE之间的关系：
  - JVM:Java 虚拟机
  - JDK = JVM + 核心类库 + 开发工具
  - JRE = JVM + 核心类库 + 运行工具

#### 1.2.2 小概念
* 注释：解释说明代码
> - 单行注释： // 注释信息
> - 多行注释： /* 注释信息 */
> - 文档注释： /** 注释信息 */

* 关键字：被Java赋予了特定涵义的英文单词
> - 关键字的字母全部小写
> - 代码编辑器中，对关键字有特殊颜色标记
> - class:用于创建/定义 一个类，类是Java最基本的组成单元

* 字面量（常量）：

| 字面量类型 |          说明           |                 举例                  |
|:-----:|:---------------------:|:-----------------------------------:|
| 整数类型  |       不带小数点的数字        |               666，-88               |
| 小数类型  |        带小数点的数字        |                13.14                |
| 字符串类型 |    用 *双引号* 括起来的内容     |            "hello world"            |
| 字符类型  | 用 *单引号* 括起来的，*内容只有一个* |                 'A'                 |
| 布尔类型  |         表示真假          |             true false              |
|  空类型  |       一个特殊的值，空值       | 值为：null *不可单独打印，用字符串格式进行打印，即"null"* |

*  特殊字符类型字面：
> - \t 制表符： 在打印的时候，把前面字符串的长度补齐到8，或8的倍数。打印时用于对齐
 
*  变量：在程序执行过程中，值可能变化的量 
>  1. 定义格式： 数据类型 变量名 = 数据值 ; 例如 ``` int a = 18;```
> 
>  2. 变量的使用方式 ： 
>    - 1） 输出打印 
> ``` Java
> int a = 1;
> System.out.println(a);

>    - 2）参与计算
> ```Java
> int a = 1;
> int b = 2;
> System.out.println(a+b);

>    - 3） 修改记录的值
> ```Java
> int a = 1;
> System.out.println(a);
> a = 2;
> System.out.println(a);

> 3. 变量的注意事项：
> - 只能存一个值；
> - 变量名称不能重复定义；
> - 一条语句可以定义多个变量；
> - 变量在使用之前一定要进行赋值；
> - 变量的作用域范围。
> 
> >变量的练习：
> > 一辆公交车从始发站出发，车上没有乘客，在第一站上来1位乘客；第二站上来2位乘客，下去1位乘客；
> > 第三站上来2位乘客，下去1位乘客；第四站下去1位乘客；第五站上去1位乘客。
> >
> > 问：到终点，初司机外车上共有多少人？
> > ```Java
> > public class Passenger{
> >    public static void main(String[] args){
> >        int num =0; // 初始站没有乘客
> >        num = num + 1; //第一站上来1位乘客
> >        num = num + 2 -1; // 第二站上来2位乘客，下去1位乘客
> >        num = num + 2 -1; //第三站上来2位乘客，下去1位乘客
> >        num = num - 1; //第四站下去1位乘客
> >        num = num + 1; //第五站上来1位乘客
> >        //输出终点站乘客数量
> >        System.out.println(num);
> >    }
> > }

> 数据类型：
> - 基本数据类型
> 
> |数据类型 | 关键字         | 取值范围                                                                 |
> |------|-------------|----------------------------------------------------------------------|
> | 整数   | byte        | -128 ～ 127                                                           |
> |      | short       | -32768 ～ 32767                                                       |
> |      | int (默认)    | -2147483648 ～ 2147483647（10位数）                                       |
> |      | long        | 19位数 （如果定义long类型的变量，在数据值的后面需要加***L*** 作为后缀）                          |
> | 浮点型  | float       | -3.401298e-38 ~ 3.401298e-38 （如果定义float类型的变量，在数据值的后面需要加***F*** 作为后缀） |
> |      | double （默认） | -4.9000000e-324 ~ 1.797693e+308                                      |
> | 字符型  | char        | 0-65535                                                              |
> | 布尔   | boolean     | true, false                                                          |
>
> 
>整数和小数取值范围大小关系：
> double > float > long > int > short > byte
> > 练习：输出个人信息：
> > 姓名：张三
> > 年龄：18
> > 性别：男
> > 身高：180.1
> > 婚否：否
> >```java
> >public class PersonalInfo{
> >     public static void main(String[] args){
> >         String name = "张三";
> >         int age = 18 ;
> >         char gender = 'male'
> >         double height = 180.1;
> >         boolean single = true;
> >         System.out.println(name);
> >         System.out.println(age);
> >         System.out.println(gender);
> >         System.out.println(height);
> >         System.out.println(single);
> >}
> >
> >}

> - 引用数据类型
>
> >标识符: 给类，方法，变量等起的名字。
> >- 由数字，字母，下划线(_)和美元符($)组成
> >- 不能以数字开头
> >- 不能是关键字
> >- 区分大小写
> >- 小驼峰命名法：*** 方法、变量*** 。 标识符是一个单词的时候，全部小写；多个单词时，第一个单词首字母小写，其他单词首字母大写。```firstName``
> >- 大驼峰命名法：*** 类名 *** 标识符是一个单词的时候，首字母大写 ```Student```, 由多个单词组成时，每个单词的首字母大写，```GoodStudent```
> >- 见名知意
>
> >键盘录入
> >
> > 第一步：导包 ```import java.util.Scanner;```
> >
> > 第二步：创建对象 ```Scanner sc = new Scanner(System.in);```
> >
> > 第三步：接收数据 ```int i = sc.nextInt();```
> > 
> > 练习：键盘输入两个整数，求出它们的和并打印
> > ```java
> > import java.util.Scanner;
> > public class SumNum{
> >       public static void main(String[] args){
> >             //对象创建一次可多次用
> >             Scanner sc = new Scanner(System.in);
> >             int i = sc.nextInt();
> >             int j = sc.nextInt();
> >             int k = i + j;
> >             System.out.println(k);
> > }
> > }

> 计算机的存储

### 1.3 Idea和运算符

#### 1.3.1 IDEA
项目结构：
- project
  1) 关闭项目：file - close project
  2) 新建项目：new project - empty project
- model 
  1) 新建模块：file-project structure - model - + -New model- java
  2) 删除模块
  3) 修改模块
  4) 导入模块
- package
- class:
  1) 新建类：点对应的package,new - java class
  2) 修改类名: 点对应点class-refactor-rename
  3) 删除类:点对应的class - delete
#### 1.3.2 运算符
- 运算符和表达式

   1）运算符：对字面量或变量进行操作的符号 ``` + , - ```

   2）表达式：用运算符把字面量或变量连接起来，符合Java语法的式子 ``int c = a + b``
> - 算术运算符
> 
>  | 符号  |   作用   |   说明    |
>  |:------:|:-------:|:--------:|
>  | +   |   加    | 3+2 =5  |
>  | -   |   减    |  5-2=3  |
>  | *   |   乘    |  3*2=6  |
>  | /   |   除    |  5/2=2  |
>  | %   | 取模，取余  |  5%2=1  |
> 
> 
> 整数参与计算，结果只能是整数
> 
> 如果有小数参与计算，结果可能不精确。 例如： ``` 1.1+ 1.1 =2.110000003```
> 
> 除：如果要完整显示结果，需有小数参与计算。例如 ```10/3=3; 10.0/3=3.3333333333  ```
> 
> 取模的应用：
> - 1. 用于判断A是否可以被B整除；``` 10 % 3 = 1```
> - 2. 用于判断一个是是否是偶数, A % 2 =0,A 是偶数，如果是1，则为奇数；
> > 练习1：数值拆分 【[CODE](A-Operator/src/Demo1/Exercise1.java)】
> >
> > 键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台。

> "+" 操作的三种情况：
> - 1. 数字相加：数据类型不一样，不能进行计算，需转成一样才能进行计算 
> 
>     隐式转换：取值范围小的数值转换为取值范围大的数值。``` int a = 10; double b = a;```
>     * byte, short, char 三种类型的数据在运算的时候，都会直接先提升为int, 然后再进行运算。
> 
>     强制转换：取值范围大的数值转换为取值范围小的数值。很可能导致数据错误
>     * 格式：目标数据类型 变量名 = （目标数据类型）被强转的数据；``` double a = 12.3; int b = (int) a;```
>
> - 2. 字符串相加： 连接符，进行字符串的拼接。 ``` "123" + 123 = "123123" ```
>     * 从左到右逐个执行： ``` 1 + 99 + "新年好"+ 99 + 1 = "100新年好991" ```
>  
> - 3. 字符相加：通过ASCII码表查询到对应的数字再进行计算
> 

> - 自增自减运算符
> - 1) 自增运算符：++ ，变量的值加1；``` int a = 10; a++; System.out.println(a)```  a的值是11
> - 2) 自减运算符：-- ，变量的值减1。 
> 
> 应用场景：
> - 变量值加1或减1；
> - 购物车商品数量增减
> - 统计
> - 参与计算：
>  - ```int a = 10; int b = a++;``` 先用后加，结果为：b=10, a = 11;
>  - ``` int a = 10; int b = ++a;``` 先加后用，结果： b= 11, a= 11;

> - 赋值运算符
> 
> | 符号  | 作用  |   说明  |
> |-----|-----|-----|
> | =   |   赋值  |  int a = 10, 将10赋值给变量a |
> | +=   |   加后赋值  |  a+=b, 将a+b的值给a   |
> |  -=   | 减后赋值    |  a-=b, 将a-b的值给a   |
> |  *=   |  乘后赋值   |   a * = b, 将a * b 的值给a |
> |  /=   |   除后赋值  |  a /= b, 将a / b 的值给a |
> |  %= |  取余后赋值   |  a %= b, 将a %b 的值给a  |

> - 关系运算符
> 
> | 符号    |  说明   |
> |-----|-----|
> | ==    | a==b,判断a和b是否相等    |
> | !=    |  a != b， 判断a和b是否不相等   |
> | &gt;  |   大于  |
> | &gt;= |   大于等于  |
> | <     |  小于   |
> | <=    | 小于等于|

> - 逻辑运算符
> 
> 短路逻辑运算符：
> && 和 || 效率较普通逻辑运算符高，效果相同，因此常用。
> 
| 符号  |  作用   | 说明               |
|-----|-----|------------------|
| &   | 与    | 两边都为真，结果为真       |
| ｜   |  或   | 两边都为假，结果为假       |
| ^   |  异或 | 相同为false,不同为true |
| ！   | 非    | 取反               |
> 练习2： 数字6 【[CODE](A-Operator/src/Demo1/Exercise2.java)
> 
> 键盘录入两个整数，如果其中一个为6，最终结果输出为true; 如果它们的和为6的倍数，最终结果输出true,其他情况都是false.

> - 三元运算符: 根据判断结果得到不同结果
>   - 格式： 关系表达式？表达式1：表达式2;   （说明：关系表达式为真，选择表达式1，否则选择表达式2）
>   - **注意**：三元表达式结果一定要用，可以赋值，可以直接打印
>   - 范例： ```int max = 10>20 ? 10 : 20; ```
>   
> 练习3：三个人身高分别是150cm, 210cm, 165cm, 获取最高身高 【[CODE](A-Operator/src/Demo1/Exercise3.java)】
>
**运算符优先级: "( )" 优先于所有**

### 1.4 流程控制语句
#### 1.4.1 顺序结构
按代码顺序，从上到下依次执行。

#### 1.4.2 分支结构 
##### 1.4.2.1 if
if 语句用来判断。

有3种格式：
> 格式1：关系表达式值为true,则执行语句体，为false,则不执行语句体。 继续执行后面的语句
> 
> ``` 
> if(关系表达式){
> 语句体
> }
> ```
> - 如果对一个布尔类型的变量进行判断，不要用 == 号
> 
> ```java
> boolean flag = false;
> //（flag）表示 flag== true
> if(flag){
>  System.out.println("flag is true")
> }
> ```
> 
> > 练习：自动驾驶 【[CODE](B-IF/src/Demo1/Exercise1.java)】
> > 
> > 自动驾驶车遇红灯停止，遇绿灯行驶，遇黄灯减速


> 格式2：关系表达式值为true,则执行语句体1， 为false,则执行语句体2。
> 
> ```java
> if(关系表达式){
>    语句体1；
> } else {
>   语句体2；
> }
> ```
> > 练习：【[CODE](B-IF/src/Demo1/Exercise2.java)】
> > 
> > 键盘录入一个整数，表示钱包里的钱。如果大于等于100元，吃烧烤；否则吃米粉
>
> 
> > 练习： 电影院选座 【[CODE](B-IF/src/Demo1/Exercise3.java)】
> > 
> > 某电影院售卖100张票，序号1-100，奇数票号坐左侧，偶数票号坐右侧；键盘录入一个整数表示票号，如果为奇数，打印坐左边；偶数打印坐右边。

> 格式3：
> ```java
> if(关系表达式){
>    语句体1；
> } else if {
>   语句体2；
> }
> ...
> else {
>   语句体n+1；
> }
> ```
##### 1.4.2.2 switch 
格式：
- 先计算表达式的值
- 表达式的值与case值比对，执行相关语句体，如对不上，则执行default里的语句体。break结束整个switch
```java
switch(表达式){
    case 值1:
        语句体1;
        break;
    case 值2:
        语句体2;
        break;
    ... 
    default:
        语句体n+1;
        break;
        }
```

练习：运动计划 【[CODE](C-Switch/src/Demo/Exercise1.java)】

键盘录入星期数，显示当天的运动项目。

周一：跑步

周二：游泳

周三：慢走

周四：动感单车

周五：拳击

周六：爬山

周日：休息

1. default 的位置和省略

- 位置：可在任意位置，但建议写在最下面

- 省略：可以省略，但不建议
2. case穿透

- 由于语句体中未写break导致；
- 应用场景：多个case的语句体重复

3. switch新属性
- JDK12及以上版本可用
范例：
```java
int num = 1;
switch(num){
    case 1 -> {
        System.out.println("一");
        }
        //仅有一行代码，可省略大括号
    case 2 -> System.out.println("二");
    default ->System.out.println("输入错误");
        }
```
4. switch 和 if 第三种格式各自的使用场景
- switch: 把有限个数据一一列举除了，仍选其一；
- if的第三种格式：用于对范围的判断

> 练习：休息日和工作日 【[CODE](C-Switch/src/Demo/Exercise2.java)】
> 
> 键盘录入星期输，输出工作日、休息日。（1-5）工作日，（6-7）休息日。
> 

> 练习：预定电话选择  【[CODE](C-Switch/src/Demo/Exercise3.java)】
> 
> 拨打机票预定电话，语音提示：
> - 1 机票查询
> - 2 机票预定
> - 3 机票改签
> - 4 退出服务
> - 其他按键也退出服务

#### 1.4.3 循环结构
1. for循环

> 格式：
> 
> for(初始化语句；条件判断语句；条件控制语句){
>    循环体语句；
> }

> 练习： 打印1-5，正着打印一遍，反着打印一遍 【[CODE](D-For/src/Demo/Exercise1.java)】

> 练习：求1-100之间的和 【[CODE](D-For/src/Demo/Exercise2.java)】
>
> -注意：累加求和的变量定义在循环外面

> 练习：求1-100之间的偶数和 【[CODE](D-For/src/Demo/Exercise3.java)】

> 练习：键盘录入两个数字，表示一个范围，统计这个范围内既能被3整除，又能被5整除的数字个数。【[CODE](D-For/src/Demo/Exercise4.java)】


2. while循环

> 格式：
>```
> 初始化语句；
> while(条件判断语句){
>     循环体语句；
>     条件控制语句；
> }
> ```

for 循环和 while 循环的对比：
- 相同点： 运行规则相同
- 不同点：
-  1. for循环：知道循环次数或循环范围
-  2. while循环：不知道循环次数和范围，只知道循环的结束条件

> 练习：打印折纸次数【[CODE](E-While/src/Demo/Exercise1.java)】
> 
> 珠穆朗玛峰8844430毫米，一张纸厚度0.1毫米，这张纸折多少次能达到珠峰的高度？

> 练习： 回文数 【[CODE](E-While/src/Demo/Exercise2.java)】
> 
> 键盘录入一个整数X，如果X是回文，打印true,否则打印false。
> 
> 回文是正序和倒序读都一样的整数。例如：121 1221


> 练习： 求商和余数 【[CODE](E-While/src/Demo/Exercise3.java)】
> 
> 给定两个正整数，被除数和除数，将两数相除得到商和余数。要求不使用乘法，除法和%运算符

3. do...while循环（不常用）
> 格式：
> 
> ```
> 初始化语句；
> do{
>   循环体语句；
>   条件控制语句；
> } while(条件判断语句)；
> ```

4. 循环的综合练习
- 无限循环：循环无法停止

    - 1. for(;;){
  
           循环体语句；
  
           }

    - 2. while(true){
  
          循环体语句；
      }

         
5. 跳转控制语句

- 1. continue:结束本次循环，继续下次循环
- 2. break： 结束整个循环


6. 练习

> 练习：逢7过 【[CODE](E-While/src/Practical1/Practical1.java)】
> 
> 从任意一个数字开始报数，当报当数字是包含7或者7的倍数时，则过。 使用程序打印1-100之间满足逢7必过规则的数据。

> 练习：求平方根 【[CODE](E-While/src/Practical1/practical2.java)】
> 
> 键盘录入一个大于等于2的整数x，计算并返回X的平方根。结果只保留整数部分，小数部分被舍去。

> 练习： 求质数 【[CODE](E-While/src/Practical1/Practical3.java)】 【[优化代码](E-While/src/Practical1/practical4.java)】
> 
> 键盘录入一个正整数，判断该整数是否是一个质数。质数是只能被1和其本身整除的数。


> 练习：猜数字游戏 【[CODE](E-While/src/Practical1/Practical5.java)】
> 
> 程序自动生成1-100之间的随机数，使用程序实现猜出这个数字是多少？
> > - 获取随机数的步骤：
> >  1. 导包：``` import java.util.Random;```
> > 
> >  2. 创建对象：``` Random r = new Random();```
> > 
> >  3. 生成随机数 ``` int num = r.nextInt(随机数范围)；```
> > 
> > *注意：* 随机数范围是从0开始，到 随机数范围-1 结束， 即：包头不包尾，包左不包右
> 
> > - 用来生成任意数到任意数之间的随机数，例如 7- 15
> >
> >   1. 让这个范围头尾都减去一个值，让这个范围从0开始， -7 -> 0-8
> >   2. 尾巴 +1。 8+1=9
> >   3. 最终结果再加上第一步减去的值。 0-9 +7 -> 7-16



### 1.5 数组
1. 数组介绍

数组是一种容器，用来存储同种数据类型的多个值。结合隐式转换考虑。

建议保持容器类型和存储数据类型一致。

2. 数组的定义与静态初始化
- 数组有两种定义格式：
> 格式1：
> 
> 数据类型[ ] 数组名
> 
> int [ ] array

> 格式2：
> 
> 数据类型 数组名[ ]
> 
> int array[ ]
> 
- 数组的静态初始化

初始化是在内存中，为数组容器开辟空间，并将数据存入容器中的过程。
> 完整格式：
> 
> 数组类型[ ] 数组名=new 数据类型[ ] {元素1，元素2，元素3...}；
> 
> int[ ] array = new int [ ]{11,22,33}；

> 简化格式（常用格式）：
> 
> 数组类型[ ] 数组名 = {元素1，元素2，元素3...}；
>
> int[ ] array = {11,22,33}；


3. 数组元素访问
> 格式： 数组名[索引]
> 
> 索引：即下标，角标。从0开始，逐个+1增长，连续不间断。

> 把数据存储到数组中：
> * 一旦覆盖，原数据将不存在。
> 
> 格式：
> 
> 数据名 [索引] =具体数据/变量；

4. 数组遍历
数组遍历：将数组中所有的内容取出来，取出来之后可以打印，求和，判断...

> 练习： 遍历数组并求和 【[CODE](F-Array/src/Demo/Exercise1.java)】
> 
> 定义一个数组，存储1，2，3，4，5， 遍历数组得到每一个元素，求数组中所有数据的和。

> 练习： 统计个数 【[CODE](F-Array/src/Demo/Exercise2.java)】
> 
> 定义一个数组，存储1-10，统计数组中能被3整除的数字个数。

> 练习： 变化数据 【[CODE](F-Array/src/Demo/Exercise3.java)】
> 
> 定义一个数组，存储1-10，遍历数组中每一个元素，如果是奇数，将当前数字扩大两倍；如果是偶数，将当前数字变为二分之一
> - *一个循环尽量只做一件事。

5. 数组动态初始化

动态初始化时只指定数组长度，由系统为数组分配初始值

> 格式：
> 数据类型[] 数组名 = new 数据类型[数组长度]；
> 
> int arr = new int[3];

- 动态初始化和静态初始化的区别：

  1. 动态初始化：手动指定数组长度，由系统给出默认初始化值
  
  2. 静态初始化：手动指定数组元素，系统根据元素个数，计算出数组的长度。

6. 数组内存图
- 栈： main 
- 堆： new 来创建的
- 方法区
- 本地方法栈
- 寄存器

7. 数组常见问题
- 索引越界异常： 访问来数组中不存在的索引；

8. 数组常见操作
- 求最值
> 练习： 【[CODE](F-Array/src/Demo/Exercise4.java)】
> 
> 已知数组元素为{33，5，22，44，55}，找出最大值打印在控制台

- 求和
> 练习： 【[CODE](F-Array/src/Demo/Exercise5.java)】
> 
> 生成10个1-100之间的随机数存入数组。
> 
> 1） 求所有数据的和
> 2）求所有数据的平均数
> 3）统计有多少个数据比平均值小
>
- 交换数据
> 练习：【[CODE](F-Array/src/Demo/Exercise6.java)】
> 
> 定义一个数组，存入1，2，3，4，5,按要求交换对应的索引。
> 
> 交换前： 1，2，3，4，5
> 
> 交换后：5，4，3，2，1
> 

- 打乱数据
> 练习：【[CODE](F-Array/src/Demo/Exercise7.java)】
> 
> 定义一个数组，存入1-5，打乱数组中所有数据的顺序。
>
### 1.6 方法
1. 什么是方法（method）：程序中最小的执行单元
2. 应用方法的场景：重复的代码，具有独立功能的代码可以抽取到方法中
3. 方法的作用：
    
    1）提高代码的复用性
 
    2）提高代码的可维护性
4. 方法的格式
   1) 方法的定义 与 方法的调用：
   > 最简单的方法定义
   > 
   > 格式：
   > 
   > > public static void 方法名(){
   > >  
   > > 方法体
   > >
   > > }
   > 
   > 方法的调用
   > 
   > 格式：
   > 
   > > 方法名();
   > 
   
   > 带参数的方法定义与调用
   > 
   > 定义：
   > 
   > 格式：
   > > public static void 方法名（参数1，参数2，...）{...}
   > 
   > 调用：
   > 
   > > 方法名(参数1，参数2，....)
   > 
   > * 注意： 方法调用时，参数的数量与类型必须与方法定义中小括号里面的变量一一对应
   > 
   > 形参与实参：
   > - 形参：方法定义中的参数
   > - 实参：方法调用中的参数
   > 
   > > 练习：求长方形的周长 【[CODE](G-Method/src/Demo/Exercise1.java)】
   > >
   > > 定义一个方法，求长方形的周长，将结果在方法中进行打印。

   > 带返回值方法定义
   > 
   > 定义格式：
   > > public static 返回值类型 方法名（参数）{
   > >
   > > 方法体；
   > >
   > > return 返回值；
   > > }
   > 
   >  调用格式：
   > > 1. 直接调用：方法名(实参);
   > > 2. 赋值调用： 整数类型 变量名 = 方法名(实参);
   > > 3. 输出调用：```system.out.println(方法名（实参）)；```
   >  
   >  > 练习：定义方法，比较两个长方形的面积 【[CODE](G-Method/src/Demo/Exercise2.java)】
   
5. 方法的重载
- 在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能
- 每个方法具有不同的参数类型或参数个数，这些同名的方法，构成重载关系
* 即： 同一个类中，方法名相同，参数不同的方法。与返回值无关

> 练习： 数组遍历 【[CODE](G-Method/src/Demo/Exercise3.java)】
> 
> 设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]

> 练习： 数组最大值 【[CODE](G-Method/src/Demo/Exercise4.java)】
> 
> 设计一个方法求数组的最大值，并将最大值返回


> 练习：判断是否存在 【[CODE](G-Method/src/Demo/Exercise5.java)】
> 
> 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处。
> 

> 练习： 复制数组 【[CODE](G-Method/src/Demo/Exercise6.java)】
> 
> 定义一个方法copyOfRange(int[] arr, int from, int to)
> 
> 将数组arr中从索引from（包含from）开始，到索引to 结束（不包含to）的元素复制到新数组中，将新数组返回。
> * 注意代码中错误示范

6. 方法的内存
- 基本数据类型和引用数据类型
- 1. 基本数据类型：数据值存储在自己的空间中
- 2. 引用数据类型: 数据值存储在其他空间，自己空间存储的是其他空间的地址值

### 1.7 练习题
> 练习：买机票 【[CODE](G-Method/src/Practical1/Practical1.java)】
> 
> 机票价格根据淡旺季，头等舱和经济舱不同；
> 
> 输入机票原价，月份和仓位类别计算出机票价格
> 
> 旺季（5-10月）头等舱9折，经济舱8.5折；淡季（11-来年4月） 头等舱7折，经济舱6.5折。
> 
> ** control + alt +m自动抽取方法

> 练习：找质数 【[CODE](G-Method/src/Practical1/Practical2.java)】
> 
> 判断101-200之间有多少质数，并输出所有质数。
>

> 练习：开发验证码 【[CODE](G-Method/src/Practical1/Practical3.java)】
> 
> 定义方法随机生成一个5位验证码。
> 
> 验证码格式：
> - 长度5；
> - 前四位是大写字母或小写字母
> - 最后一位是数字
> 
> *重点： 如何生成a-z A-Z字母表


> 练习：数组元素的复制 【[CODE](G-Method/src/Practical1/Practical4.java)】
> 
> 将一个数组中的元素复制到另一个新数组中
>

> 练习：评委打分 【[CODE](G-Method/src/Practical1/Practical5.java)】
> 
> 在歌唱比赛中，有6位评委给选手打分，分数范围是1-100之间的整数；
> 
> 选手最后得分是：去掉最高分、最低分后的4个评委的平均分。
> 
> 请完成上述过程并计算出选手的得分

> 练习：数字加密 【[CODE](G-Method/src/Practical1/Practical6.java)】
> 
> 某系统的数字密码大于0，比如1983，采用加密方式进行传输。
> 
> 规则如下：
> 
> 先得到每位数，然后每位数加上5，再对10求余，最后将所有数字反转，得到一串新数。
> 
> 数字解密 【[CODE](G-Method/src/Practical1/Practical7.java)】
> 
> 加密的数据解密出来。8346--> 1983

> 练习： 抢红包 【[CODE](G-Method/src/Practical1/Practical8.java)】【[优化代码](G-Method/src/Practical1/practical9.java)】
> 
> 有5个现金红包{2，588，888，1000，10000}，代码模拟抽奖，打印每个奖项，奖项出现顺序随机且不重复。
> 
 
> 练习：模拟双色球 【[CODE](G-Method/src/Practical1/Practical10.java)】
> 
> 投注号码有两部分组成：6个红球和1个蓝球，红球从1-33中选择，蓝球从1-16中选择。
> 
> 中奖规则：
> 
> 一等奖：6红+1蓝
> 
> 二等奖：6红+0蓝
> 
> 三等奖：5红+1蓝
> 
> 四等奖：4红+1蓝 或 5红+0蓝
> 
> 五等奖：3红 + 1蓝 或 4红+0蓝
> 
> 六等奖：2红+1蓝 或 1红+1蓝  或 0红+1蓝
>

### 1.8 二维数组：数组中存放数组

1. 应用场景：数据需要分组存储时.

2. 初始化：
 - 静态初始化：
>  数据类型[][] 数组名 = new 数据类型[][]{{元素1，元素2},{元素1，元素2}}；``` int[][] arr= new int[][]{{11,22},{33,44}};```
> 
>  简化格式：数据类型[][] 数组名 = {{元素1，元素2},{元素1，元素2}}；``` int[][] arr= {{11,22},{33,44}};```
 - 获取元素：
数组名[i][j]
 - 遍历：先获取一维数组，再获取一维数组中的元素
```java
int[][] arr = {
        {1,2,3},
        {4,5,6}
        };
        //遍历
        //外围循环：遍历二维数组，得到里面每一个一维数组
for(int i = 0; i < arr.length -1 ; i++){
    //内循环：遍历一维数组，得到里面每一个元素
    for(int j = 0; j< arr[i].length -1,i++){
        system.out.print(arr[i][j] + " ")
    }
    //不同维度换行展示
    system.out.println()
}
```

- 动态初始化
> 格式：
> 
> 数据类型[][] 数组名 = new 数据类型[m][n]
> 
> m:可以存放多少个一维数组
> 
> n:每一个一维数组可以存放多少个元素
>

> 练习：【[CODE](G-Method/src/Demo/Exercise7.java)】
> 
> 某商场每季度营业额如下：
> 
> 第一季度：22，66，44
> 
> 第二季度：77，33，88
> 
> 第三季度：25，45，65
> 
> 第四季度：11，66，99
> 
> 计算每季度的总营业额和全年总营业额。

### 1.8 面向对象
通俗解释面向对象编程：拿东西来做对应的事情。
1. 设计对象并使用

类和对象：

- 1. 类（设计图）：对象共同特征的描述。
- 2. 对象：真实存在的具体东西

因此要先设计类，再获取对象。

** 开发中类的设计 ：**
- 属性： 提取名词
- 行为： 提取动词

> 如何定义类：
> 
> 补充说明：
> - 用来描述一类事物的类，专业叫：Javabean类，在此类中不写main方法
> - 编写main方法的类，叫测试类。可以在测试类中创建javabean类的对象并进行赋值调用。
> - 类名首字母建议大写，需要见名知意，驼峰模式
> - 一个java文件中可以定义多个class类，且只能一个类是public修饰，且public修饰的类名必须成为代码文件名。但是建议一个文件定义一个class类
> - 成员变量的完整定义格式是：```修饰符 数据类型 变量名称 = 初始化值； ``` 一般无需指定初始化值，存在默认值
> > public class 类名 {
> >
> > 1. 成员变量（代表属性，一般是名词）
> > 2. 成员方法（代表行为，一般是动词）
> > 3. 构造器
> > 4. 代码块
> > 5. 内部类
> > 
> > }
> > 
> > ```java
> > public class Phone{
> > //属性
> > String brand;
> > double price;
> > 
> > //行为
> > public void call(){
> > }
> > 
> > public void playGame(){
> > }
> > }
> > ```
>  如何获取类的对象
> > 类名 对象名 = new 类名();
> > ```java
> > Phone p = new Phone();
> >```
>  如何使用对象
> - 访问属性： 对象名.成员变量
> - 访问行为：对象名.方法名(...)
>

练习：医生类 

编写医生类【[CODE](H-Objection/src/Demo/Doctor.java)】，创建医生类的对象 【[CODE](H-Objection/src/Demo/Doctor_test.java)】

给医生的属性赋值并调用医生类中的方法。

2. 封装
- 面向对象的三大特征：
1） 封装：如何正确设计对象的属性和方法
2） 继承
3） 多态

封装：对象代表什么，就封装对应的数据，并提供数据对应的行为。

例如：

人关门：关门行为封装在门中

- private 关键字：被private修饰的成员只能在本类中才能访问, 保证数据安全性。修饰成员变量和成员方法
```java
public class Doctor{
    private int age;
    
    //set(赋值)
    public void setAge(int a){
        if(a>= 18 && a <=50){
            age = a;
        }else{
          System.out.println("非法数据");
        }
    }
    
    //get(获取)
    public int getAge(){
        return age;
    }
}

public class DoctorTest{
  public static void main(String[] args) {
    //创建对象
    Doctor d = new Doctor();
    //赋值
    d.setAge(30);
    System.out.println(d.getAge());
  }
}

```
3. this关键字
- 成员变量和局部变量区别：
  1）局部变量：方法内的变量
  2）成员变量：方法外部，类内部的变量是成员变量
** 注意： 当成员变量和局部变量重名时，若调用成员变量，则加this， 查看以下例子
```java
public class Doctor{
    //成员变量
    private int age;
    
    public void method(){
        //局部变量
      int age = 10;
      //System.out.println(age);//根据就近原则，打印的是method中的age
      System.out.println(this.age);//则返回成员变量age
    }
}

```
```java
public class Doctor{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName{
        return name;
  }
}
```
4. 构造方法
- 构造方法：构造器，构造函数。 作用：在创建对象的时候给成员变量进行初始化（赋值）
- 格式：
- > ```java
  > public class Student{
  >   修饰符 类名（参数）{
  >          方法体；
  >    }
  > }
  
特点及注意点：

1）. 方法名与类名相同，大小写也要一致

2）. 没有返回值类型，连void都没有

3）. 没有具体的返回值（不能由return带回结果数据）

4）. 如果没有定义构造方法，系统将给一个默认的无参数构造方法

5）. 如果定义来构造方法，系统将不再提供默认的构造方法

6）. 带参构造方法和无参构造方法，两者方法名相同，但参数不同，叫做构造方法但重载

7）. 无论是否使用，都手动书写无参数构造方法和带全部参数都构造方法。（重要）

例子：
```java
public class Student{
    private String name;
    private int age;
    
    //空参构造
    public Student(){
      ....
    }
   //带参构造
  public Student(String name, int age){
      this.name = name;
      this.age = age;
  }
    
}
```
执行时机：
- 1. 创建对象的时候由虚拟机调用，不能手动调用构造方法
- 2. 每创建一次对象，就会调用一次构造方法
```java
public class StudentTest{
  public static void main(String[] args) {
    //创建对象
    //调用空参构造,如果没有写任何构造方法，则虚拟机自动加一个空参构造方法,
    //Student s = new Student();
    Student s = new Student("张三",18);
    System.out.println(s.getName());//张三
    System.out.println(s.getAge());//18
  }
}
```
5. 标准的JavaBean类

结构：

1). 类名需要见名知意

2). 成员变量使用private修饰

3). 提供至少两个构造方法：
- 无参构造方法
- 带全部参数的构造方法

4). 成员方法
- 提供每一个成员变量对应的setXxx()/getXxx()
- 如果还有其他行为，也需要写上


> 练习：【[CODE](H-Objection/src/Demo/Setup.java)】
> 
> 写一个网站的注册界面：
> 
> 用户名：
> 
> 密码：
> 
> 确认密码：
> 
> 邮箱：
> 
> 性别： 男  女
> 
> 年龄：
> 
> "注册"按钮
> 
快捷键说明：
- alt+insert/alt+Fn+insert: 生成构造方法，getter and setter
- 使用插件PTG 1秒生成标准Javabean:file-settings- plugins-marketplace - 搜索'PTG'-install-ptg to javabean

6. 对象内存图（视频P87-P92)
7. 综合练习
* 文字版格斗游戏：
 * 初级【[CODE](H-Objection/src/Practical1)】
   - 需求：
     1. 游戏中每个角色的姓名，血量都不同。选定人物时，信息就被确定下来。
     2. 模拟回合版游戏：例如："乔峰举起拳头打了鸠摩智以下，造成XX点伤害，鸠摩智还剩下xxx点血"，最后判断谁的血量先为0
 
 * 进阶【[CODE](H-Objection/src/Practical2)】
   * 关于System.out.printf():
     - 有两部分参数，第一部分参数，要输出的内容%s(占位)，第二部分参数为填充的数据。```System.out.printf("你好呀%s","张三")``` 输出结果为"你好呀张三" 
     - 不可换行
   - 需求：增加两个属性 gender 和 face(长相随机)
     - boyfaces={"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"}
     - girlfaces={"美轮美奂","成鱼落雁"，"亭亭玉立"，"身材姣好"，"相貌平平"，"相貌简陋"，"惨不忍睹"}
     - 对攻击增加描述
       - ```
         attcks_desc = {
          "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去",
          "%s使出一招【游空探爪】，飞起身形自半空中变掌为爪锁向%s",
          "%s大喝一声，身形下伏，一招【霹雷坠地】，锤向%s双腿",
          "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s",
          "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实锤向%s",
          "%s上步抢身，招中套招，一招【劈挂连环】，连环功向%s"}
        
         对受伤增加描述
         injureds_desc = {
         "结果%s退了半步，毫发无伤"，//血量>90
         "结果给%s造成一处瘀伤"，//血量80～90
         "结果一击命中，%s得弯下腰"，//血量70~80
         "结果%s痛苦地闷哼了一声，显然受了一点内伤"，//60-70
         "结果%s摇摇晃晃，一跤摔倒在地"，//40-60
         "结果%s脸色一下变得惨白，连退了好几步"，//20-40
         "结果【轰】的一声，%s口中献血狂喷而出"，/10-20
         "结果%s一声惨叫，像滩烂泥般塌了下去"//小于10
         }
         ```
* 对象数组练习 
* 练习1【[CODE](H-Objection/src/Practical3)】
  - 需求：
    1. 定义数组存储3个商品对象
    2. 商品的属性：商品的ID,名字，价格，库存
    3. 创建三个商品对象，并把商品对象存入到数组当中

* 练习2【[CODE](H-Objection/src/Practical4)】
  - 需求：
    1. 定义数组存储3部汽车对象
    2. 汽车的属性：品牌，价格，颜色
    3. 创建三个汽车对象，数据通过键盘录入而来，并把数据存入数组当中
  - 键盘录入：
    * nextInt():接收整数
    * nextDouble():接收小数
    * next():接收字符串
      //上述符号为第一套体系，遇到空格，制表符，回车则停止接受，后面的数据由第二次录入的变量接收(可能什么也没有输入)
    * nextLine():键盘接收字符串
      //上述符号是第二套体系，可以接收空格，制表符，遇到回车才停止接收数据。
    * 两套体系不可以混用

* 练习3【[CODE](H-Objection/src/Practical5)】
  - 需求：
    1. 定义数组存储3部手机对象
    2. 手机的属性：品牌，价格，颜色
    3. 计算出3部手机的平均价格
          
* 练习4【[CODE](H-Objection/src/Practical6)】
  - 需求：
    1. 定义数组存储4位好友信息
    2. 好友的属性：姓名，年龄，性别，爱好
    3. 计算出四位好友的平均年龄
    4. 统计年龄比平均值低的好友个数，并把他们的信息打印出来
* 练习5【[CODE](H-Objection/src/Practical7)】
  - 需求：
    1. 定义一个长度为3的数组，存储1-3名学生对象作为初始数据，学生的学号和姓名各不相同
    2. 学生的属性：学号，姓名，年龄
    3. 要求：再次添加一个学生对象，并在添加时进行学号的唯一性判断。 添加完毕后，遍历所有学生信息
    4. 要求：通过id删除学生信息，如存在，则删除，如不存在，则提示删除失败。删除完毕后，遍历所有学生信息。
    5. 查询数组id为"3"的学生，如存在，则将其年龄+1岁
### 1.9 API
API(Application Programming Interface):应用程序编程接口。例如Scanner,Random
API帮助文档
### 1.10 字符串
应用场景：用户登陆，字符串比较，字符串转换
1. String:java.lang.String类代表字符串
* 注意点：
   - 字符串的内容是不会发生改变的，它的对象在创建后不能被更改
* 创建String对象的两种方式：
   - 直接赋值： String name = "张三"
   - new: 用空参构造创造字符串对象
```java
//直接赋值
String s1 = "abc";
//使用new的方法获取一个字符串对象
//空参构造
String s2 = new String()
//传递一个字符数组，根据字符数组的内容再创建一个字符串对象
char[] ch={'a','b','c',d}
String s3= new String(ch);

//根据一个字节数组，根据字节数组的内容创建一个新的字符串对象
// 应用场景：网络中传播的数据是字节信息，需对字节信息进行转换，转换成字符串
byte[] bytes = {97,98,99,100};//
String s4 = new String(bytes);//输出结果是abcd

```
* Java常用方法(比较)
   1. 关于"=="：
      - 基本数据类型：比较的是数据值
      - 引用数据类型：比较的是地址值
   2. 字符串比较：
      - boolean equals方法(要比较的字符串)：完全一样才为true
      - ```String s1 = new String("abc"); String s2 = "abc"; boolean result = s1.euqal(s2)```
      - boolean equalsIgoreCase(要比较的字符串)：忽略大小写的比较
   
* 练习：用户登陆 【[CODE](H-Objection/src/Practical8/SignIn.java)】
   - 已知正确的用户名和密码，请用程序实现模拟用户登陆，总共三次机会，登陆后，给出相应的提示


* 练习：遍历字符串 【[CODE](H-Objection/src/Practical8/Exercise2.java)】
   - 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    * 相关知识点：
      - public  char charAt(int index):根据索引返回字符
      - public int length():返回此字符串的长度
      - 数组的长度：数组名.length
      - 字符串的长度：字符串对象.length()

* 练习：统计字符次数 【[CODE](H-Objection/src/Practical8/Exercise3.java)】
- 键盘录入一个字符串，统计该字符串中大写字母，小写字母，数字出现的次数

* 练习：拼接字符串 【[CODE](H-Objection/src/Practical8/Exercise4.java)】
- 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
- 调用该方法，并在控制台输出结果

* 练习：字符串反转 【[CODE](H-Objection/src/Practical8/Exercise5.java)】
- 定义一个方法，实现字符串反转
- 键盘录入一个字符串，调用该方法后，在控制台输出结果

* 练习：金额转换 【[CODE](H-Objection/src/Practical8/Exercise6.java)】
- 输入一个整数，转换成中文大写，例如：12345 转换成 壹万贰千叁佰肆拾伍元

* 练习：手机号屏蔽 【[CODE](H-Objection/src/Practical8/Exercise7.java)】
- 131****9876
- 知识点：
  - String substring(int beginIndex, int endIndex)截取，包头不包尾，只有返回值才是截取的小串
  - String substring(int begionIndex)截取到末尾

* 练习：身份证信息查看 【[CODE](H-Objection/src/Practical8/Exercise8.java)】
  - 1-2位省份
  - 3-4位城市
  - 5-6位区县
  - 7-14位：出生年月日
  - 15-16：所在地派出所
  - 17：性别（奇数是男性，偶数是女性）
  - 18：个人信息码（随机产生）
  - 要求取出7-14位，17位，生成人物信息：
    - 出生年月日： XXXX年x月X日
    - 性别：男/女

* 练习： 敏感词替换 
  - 知识点：
    - String replace(旧值,新值)：字符串本身不发生变化，只有返回值才是替换结果 
  
  
2. StringBuilder
* 作用：是一个容器，创建后内容可变，提高字符串的操作效率
* 构造方法
  - 空参构造： public StringBuilder()
  - 含参构造：public StringBuilder(String str)
* 常用方法
  - public StringBuilder append(任意类型)：添加数据，并返回对象本身
  - public StringBuilder reverse()：反转容器内的内容
  - public int length(): 返回长度（字符出现的个数）
  - public String toString(): 通过toString()实现把StringBuilder转换为String
* 使用场景
  - 字符串的拼接
  - 字符串的反转
* 练习： 对称字符串 【[CODE](H-Objection/src/Practical8/Exercise9.java)】
  - 键盘接收一个字符串，程序判断该字符串是否是对称字符串，并在控制台打印出是与否。
* 练习： 拼接字符串【[CODE](H-Objection/src/Practical8/Exercise10.java)】
  - 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
  - 调用该方法，在控制台输出结果
3. StringJonier
* 作用：提高字符串的操作效率，代码编写简洁
* 构造方法：
  - public StringJoiner(间隔符号)：创建一个StringJoiner对象，指定拼接时的间隔符号
  - public StringJoiner(间隔符号，开始符号，结束符号)
* 成员方法：
  - public StringJoiner add(添加的内容)：添加数据，并返回对象本身
  - public int length():返回对象(字符出现的个数)
  - public String toString():返回一个字符串
4. 综合练习
* 练习：转换罗马数字 【[Method1](H-Objection/src/Practical8/Exercise11.java)】 【[Method2](H-Objection/src/Practical8/Exercise12.java)】
  - 键盘录入一个字符串，
  - 要求1：长度为小于等于9
  - 要求2：只能是数字
  - 将内容变成罗马数字
  - 以下是阿拉伯数字与罗马数字的对应：I-1 II-2 III-3,IV-4 V-5 VI-6 VII-7 VIII-8 IX - 9
  - 罗马数字中没有0
  - 如果键盘录入的数字包含0，可以变成" "(长度为0的字符串)

* 练习：调整字符串 【[Method1](H-Objection/src/Practical8/Exercise13.java)】【[Method2](H-Objection/src/Practical8/Exercise14.java)】
  - 给定两个字符串，A 和 B。
  - A的旋转操作就是将A最左边的字符移动到最右边。例如：A='abcde'在移动一次之后结果就是'bcdea'
  - 如果在若干次调整操作之后A能变成B，返回True,否则false
    - 知识点：
      * 有两个方法修改字符串的内容：
         1. 用subString进行截取，把左边的字符截取出来拼接到右侧去
         2. 把字符串变成一个字符数组，调整字符数组内数据，最后把字符数组变成字符串
### 1.11 集合
1. 集合与数组对比：
- 集合可以自动扩容，长度可变；数组长度固定
- 集合可以存储引用数据类型，基本数据类型的存储需要包装类；数组可以存储基本数据类型，也可存储引用数据类型。
2. ArrayList
- 格式：```ArrayList<数据类型> list = new ArrayList<>();```
- 成员方法：
  - 增加：boolean add(E e),添加元素，返回值表示是否添加成功 ```boolean result = list.add("aaa")``` result = true
  - 删除:
    - boolean remove(E e) ```boolean result = list.remove("aaa")```
    - E remove(int index):根据索引进行删除。```String str = list.remove(0)```
  - 修改: E set(int index,E e) ```String result = list.set(1,"ddd")``` ddd替代原1索引上的数据
  - 查询：E get(index) 
  - 获取长度：int size()
  - 遍历集合
   ```python
  for(int i = 0;i< list.size();i++){
      //i 表示索引
      // list.get(i): 表示元素
      String str = list.get(i);
      System.out.println(str);
  }
   ```
* 练习：集合的遍历 【[CODE](I-Set/src/Demo/Exercise1.java)】
  - 定义一个集合，添加字符串，

* 练习：添加数字并遍历 【[CODE](I-Set/src/Demo/Exercise2.java)】
  - 定义一个集合，添加数字，并进行遍历

* 练习：添加学生对象并遍历 【[CODE](I-Set/src/Demo/Exercise3.java)】
  - 定义一个集合，添加一些学生对象，并进行遍历。 学生类的属性为：姓名，年龄
  - 改进：要求数据来自键盘录入【[CODE](I-Set/src/Demo/Exercise4.java)】
* 练习：添加用户对象并判断是否存在 【[CODE](I-Set/src/Demo/Exercise5.java)】
  - main 方法中定义一个集合，存入三个用户对象，用户属性为：id,username,password
  - 定义一个方法，根据id查找对应的用户信息，如存在，返回true，如不存在，返回false
  - 改进：定义一个方法，根据id查找对应的用户信息，如存在返回索引，如不存在，返回-1 【[CODE](I-Set/src/Demo/Exercise6.java)】
* 练习： 添加手机对象并返回要求的数据 【[CODE](I-Set/src/Demo/Exercise7.java)】
  - 定义javabean类:phone; phone属性：品牌，价格
  - main方法中定义一个集合，存入三个手机对象
  - 定义一个方法，将价格低于3000的手机信息返回


### 1.12 综合应用
* 学生管理系统【[CODE](J-projects/StudentsSystem)】
  - 需求文档：- 采取控制台的方式书写学生管理系统 (详细要求见代码注释)
  - 升级：在原来的基础上写一个登陆，注册，忘记密码功能，登陆成功后才能进入系统中进行增删改查操作（详细要求见代码注释）【[CODE]()】补

### 1.13 面向对象进阶
1. static
* 定义：可修饰成员方法和成员变量
* 练习：【[CODE](K-Static/src/a01saticdemo1)】
  - 需求：写一个javaBean类来描述一个班级的学生
  - 1.属性：姓名，年龄，性别
  - 2.行为：学习
  - 升级：属性中新增教师姓名，属性为public static , 即表示Students类中所有对象共享同一个值
* 被static修饰的成员变量，叫做静态变量
  - 特点：
    - 被该类所有对象共享
    - 不属于对象，属于类
    - 随着类的加载而加载，优先于对象存在
  - 调用方式：--> 见上述练习中对teacherName的调用
    - 类名调用（推荐） 
    - 对象名调用
* 被static修饰的成员方法，叫做静态方法
  - 特点：
    - 多用在测试类和工具类中
    - javabean类中很少会用
  - 调用方式：
    - 类名调用（推荐）
    - 对象名调用
  - 什么是工具类？ 帮忙处理一些事情，但不描述任何事物的类
    - 类名见名知意
    - 私有化构造方法：则外界不能创造对象
    - 方法定义为静态
    - 练习：定义数组工具类 【[CODE](K-Static/src/a02staticdemo2)】
      - 请按照如下要求编写一个数组的工具类：ArrayUtil
      - 提供一个工具类方法printArr，用于返回整数数组的内容，返回的字符串格式如：[10,20,50,34,100] (只考虑整数数组，且只考虑一维数组)
      - 提供这样一个工具方法getAvrage,用于返回平均分（只考虑浮点型数组，且只考虑一维数组）
      - 定义一个测试类TestDemo,调用该工具类的工具方法，并返回结果。
    - 练习：定义学生工具类 【[CODE](K-Static/src/a03staticdemo3)】
      - 定义一个集合，用于存储3个学生对象，学生类的属性为：name,age,gender
      - 定义一个工具类，用于获取集合中最大学生的年龄
    - 注意事项：
      - 静态方法只能访问静态变量和静态方法
      - 非静态方法可以访问静态变量或静态方法，也可以访问非静态的成员变量和非静态的成员方法
      - 静态方法中没有this关键字
  - javabean类，测试类，工具类的区别
    - javabean类：用来描述一类事物的类，比如student
    - 测试类：用来检查其他类是否书写正确，带有main方法的类，是程序的入口
    - 工具类：帮忙处理一些事情，但不描述任何事物的类
* 重新认识main方法
  - public:访问权限足够大
  - static：不用创建对象，直接类名访问，因为main方法是静态的，所以测试类中其他方法也需要是静态的
  - void: 不需要返回值
  - main: 一个通用的名称，虽不是关键字，但被JVM识别
  - String[] args: 无用
2. 继承
* 作用：
  - 减少重复性，提高代码复用性
  - 子类可以在父类的基础上，增加其他的功能，使子类更强大
* 方法：使用extend关键字
```java
//Student是子类，Person是父类
public class Student extends Person{}
```
* 什么时候用继承？
  - 当类与类之间存在相同的内容，并满足子类是父类中的一种，就可以考虑用继承来优化代码
* 特点：
  - 只支持单继承（一个子类只能继承一个父类），不支持多继承（子类不能同时继承多个父类），但支持多层继承（子类A继承父类B，父类B可以继承父类C）
  - 每个类都直接或间接继承于Object
* 练习 【[CODE](L-Extends/src/a01extenddemo1)】
  - 有四种动物：布偶猫，狸花猫，哈士奇，泰迪，暂不考虑属性，只考虑行为，按照继承的思想特点进行继承体系的设计
  - 四种动物分别有以下行为：
    - 布偶猫：吃饭，喝水，抓老鼠
    - 狸花猫：吃饭，喝水，抓老鼠
    - 哈士奇：吃饭，喝水，看家，拆家
    - 泰迪：吃饭，喝水，看家，跳舞
 
* 子类能够继承父类中哪些内容？P126 补
  - 
* 继承中成员变量的访问特点:就近原则 (P127) 补
* 继承中成员方法的访问特点(P127) 补
* 继承中构造方法的特点
  - 父类中的构造方法不会被子类继承
  - 子类中所有的构造方法默认先访问父类中的无参构造，再执行自己（子类构造方法的第一行语句默认是：super(),不写也存在，且必须在第一行 ）
  - 如果要调用父类有参构造，必须手写super进行调用【[例子](L-Extends/src/a02extenddemo2)】
* this，super使用总结
  - this：理解为一个变量，表示当前方法调用者的地址值；
  - super:代表父类存储空间
  - 
| 关键字   | 访问成员变量             | 访问成员方法               | 访问构造方法             |
|-------|--------------------|----------------------|--------------------|
| this  | this.成员变量访问本类成员变量  | this.成员方法（）访问本类成员方法  | this（...）访问本类构造方法  |
| super | super.成员变量访问父类成员变量 | super.成员方法（）访问父类成员方法 | super（...）访问父类构造方法 |

* 练习：带有继承结构的javabean类 【[CCODE](L-Extends/src/a03extenddemo3)】
  - 经理：
    - 成员变量：工号，姓名，工资，管理奖金
    - 成员方法：工作（管理其他人） 吃饭（吃米饭）
  - 厨师：
    - 成员变量：工号，姓名，工资
    - 成员方法：工作（炒菜） 吃饭（吃米饭）
* 练习：带有继承结构的javabean类【[CODE]()】补
  - 学校有很多员工（Employee）
  - 按工作内容不同分为教师（Teacher）和 行政管理员（Admin）
  - 教师根据教学方式分为讲师（Lecturer）和助教（Tutor）
  - 行政员工分为维护专员（maintainer）和采购专员（buyer）
  - 每个员工都有编号，姓名和其负责的工作，每个员工工作内容不一样
3. 多态: 同类型对象表现出的的不同形态 
* 表现形式：
  - 父类类型 对象名称 = 子类对象；
* 使用前提：【[例子](M-Polymorphism/src/a01polymorphism1)】
  - 有继承/实现关系；
  - 有父类引用指向子类对象 ```Fu f = new Zi();```
  - 有方法重写
* 多态调用成员的特点
  - 变量调用：编译看左边，运行也看左边
  - 方法调用：编译看左边，运行看右边
* 多态的优势和弊端
  - 优势：
    - 在多态形式下，右边对象可以实现解耦合，便于扩展和维护。
    - 定义方式的时候，使用父类型作为参数，可以接收所有子类对象，体现多态的扩展性和便利。
  - 弊端：
    - 不能调用子类的特有功能（解决方法：变回子类类型 ```Animal a = new Dog()  不能调用Dog的特有功能，解决方法 Dog b = (Dog) a```）
    - 判断
    - ```java
      //先判断a是否为Dog类型，如果是，则强制转换为Dog类型，转换后变量为d, 如果不是，则不强转，结果直接是false
      if(a instanceof Dog d){
          d.lookHome();
      }else if (a instanceof Cat c){
          c.catchMouse();
      }else{
          system.out.println("没有这个类型")
      }
    ```
* 练习 【[CODE](M-Polymorphism/src/a02polymorphism2)】
  - 需求：
  - 定义狗类：
    - 属性：年龄，颜色
    - 行为： eat(String something)方法   看家lookHome方法（无参数）
  - 定义猫类：
    - 属性：年龄，颜色
    - 行为：eat(String something)方法  逮老鼠catchMouse方法(无参数)
  - 定义Person类//饲养员：
    - 属性：姓名，年龄
    - 行为：keepPet(Dog dog,String something)方法 功能：喂养宠物狗
    - 行为：keepPet(Cat cat,String something)方法 功能：喂养宠物猫
    - 生成空参有参构造，set和get方法
  - 定义测试类（完成以下打印效果）：
    - keepPet(Dog dog,String something)方法打印内容如下：年龄为30岁的老王养了一只黑色的2岁的狗//2岁的黑色的狗两只前腿死死抱住骨头猛吃
    - keepPet(Cat cat,String something)方法打印内容如下：年龄为25岁的老李养了一只灰色的3岁的猫//3岁的灰色的猫眯着眼睛侧着头吃鱼
  - 思考：
    - 1. Dog和Cat都是Animal的子类，以上案例中针对不同的动物，定义了不同的keepPet方法，过于繁琐，能否简化，并体会简化后的好处？
    - 2. Dog和Cat虽都是Animal的子类，但都有其特有方法，能否想办法在KeepPet中调用特有方法
4. 包、final、权限修饰符、代码块
* 包（package）：文件夹，用来管理不同功能的java类，方便后期代码维护
  - 命名规则：公司域名反写+包的作用，全部英文小写，见名知意；
  - 导包：
    - 使用同一个包中的类时，不需要导包
    - 使用Java.lang包中的类时，不需要导包
    - 其他情况都需要导包
    - 如果同时使用两个包中的同类名，需要用全类名
* final:用来修饰方法，类，变量，表示不可被改变的
  - 方法：表明该方法是最终方法，不能被重写（应用场景：方法是规则，不希望被改变）
  - 类：表明该类是最终类，不能被继承
  - 变量：叫做常量，只能被赋值一次，且必须赋值（Math中会用）
* 常量：一般作为系统的配置信息，方便维护，提高可读性
  - 命名规范：
    1. 单个单词：全部大写
    2. 多个单词：全部大写，单词之间用下划线隔开
    3. 用final修饰的变量是基本类型，那么变量存储的数据值不能发生改变 ```final doubel PI =3.14```
    4. final修饰的变量是引用类型，那么变量存储的地址值不能发生改变，对象内部的可以改变
  - 练习：【[CODE](J-projects/StudentsSystem/src/StudentSystem.java)】
    - 将学生管理系统中用户的操作改写为常量的形式
* 权限修饰符：用来控制一个成员能够被访问的范围的，可以修饰成员变量，方法，构造方法，内部类

| 修饰符       | 同一个类中 | 同一个包中其他类 | 不同包下的子类 | 不同包下的无关类 |
|-----------|-------|----------|---------|----------|
| private   | *     |          |         |          |
| 空着不写      | *     | *        |         |          |
| protected | *     | *        | *       |          |
| public    | *     | *        | *       | *        |
* 代码块：
  - 局部代码块：在方法内的{}内的内容
  - 构造代码块：写在成员位置的代码块，作用是把多个构造方法中重复的代码抽取出来。在创建本类对象的时候会先执行构造代码块再执行构造方法
  - 静态代码块（重点）：static{} 需要通过static关键字修饰，随着类的加载而加载，并且自动触发，只执行一次。应用场景：数据初始化【[CODE](J-projects/StudentsSystem/src/StudentSystem.java)】
4. 抽象类:
* 作用：父类中相同方法体内的内容可能不同，比如Person类中都有work的行为，但work的内容可能不同 如果不确定，可用abstract去修饰'''public abstract void work();'''
* 抽象类的定义格式
  - 抽象类：如果一个类中存在抽象方法，那么该类必须声明为抽象类
  - 定义格式：public abstract class 类名{}
* 抽象方法的定义格式
  - 抽象方法：将共性的行为（方法）抽取导父类之后，由于每一个子类执行的内容是不一样的，所以在父类中不能确定具体的方法体，该方法则可定义为抽象方法。
  - 定义格式： public abstract 返回值类型 方法名（参数列表）；
* 抽象类和抽象方法的注意事项
  - 抽象类不能实例化
  - 抽象类中不一定有抽象方法，有抽象方法的类不一定是抽象类
  - 可以有构造方法
  - 抽象类的子类
    - 要么重写抽象类中的所有抽象方法
    - 要么是抽象类
* 练习：编写带有抽象类的标准Javabean类 【[CODE](L-Extends/src/a04extenddemo4)】
  - 青蛙frog   属性：名字 年龄 行为：吃虫子， 喝水
  - 狗Dog    属性：名字 年龄 行为：吃骨头 喝水
  - 山羊sheep 属性：名字 年龄 行为：吃草 喝水

5. 接口：一种规则
* 接口与抽象类的区别：抽象类主要作用于父类；接口主要是一种行为的抽象
* 接口的定义和使用：
  - 用关键字interface来定义```public interface 接口名{}```
  - 接口不能实例化
  - 接口和类之间是实现关系，通过implements关键字表示 ```public class 类名implements 接口名{}```
  - 接口的子类（实现类）：要么重写接口内的所有抽象方法 要么本身是抽象类
  - 注意：
    - 接口和类的实现关系，可以单实现，也可以多实现 ```public class 类名 implements 接口名1，接口名2{}```
    - 实现类可以在继承一个类的同时实现多个接口```public class 类名 extends 父类 implements 接口名1，接口名2{}```
* 练习： 编写带有接口和抽象类的标准Javabean类 【[CODE](L-Extends/src/a05extenddemo5)】
    - 青蛙frog   属性：名字 年龄 行为：吃虫子， 蛙泳
    - 狗Dog    属性：名字 年龄 行为：吃骨头 狗刨
    - 兔子Rabit 属性：名字 年龄 行为：吃胡萝卜

* 接口内成员的特点
  - 成员变量：只能是常量，默认修饰符：public static final
  - 构造方法:没有
  - 成员方法：只能是抽象方法，默认修饰符：public abstract 
* 接口与类之间的关系
  - 类和类的关系：继承关系，只能单继承，不能多继承，但是可以多层继承
  - 类和接口的关系：实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
  - 接口和接口的关系：继承关系，可以单继承，可以多继承
* 练习： 编写带有接口和抽象类的标准Javabean类 【[CODE](L-Extends/src/a06extenddemo6)】
  - 乒乓球运动员：姓名，年龄，学打乒乓球，说英语
  - 蓝球运动员：姓名，年龄，学打蓝球
  - 乒乓球教练：姓名，年龄，教打乒乓球，说英语
  - 蓝球运动员：姓名，年龄，教打蓝球
* 接口拓展知识
  - JDK8开始接口中新增的方法：
    - JDK7以前接口中只能定义抽象方法； JDK8接口中可以定义有方法体的方法（默认``` public default 返回值类型 方法名（参数列表）{} public default void show(){}```,用于解决接口升级问题，静态```public static 返回值类型 方法名(参数列表){} public static void show(){}``` 静态方法只能通过接口名调用，不能通过实现类名或对象名调用）；JDK9接口可以定义私有方法
  - 接口的应用：行为的功能。当一个方法的参数是接口时，可以传递接口所有实现类的对象，这种方法称之为接口多态
  - 适配器设计模式：
    - 设计模式：一套被反复使用，多数人知晓的，经过分类编目的，代码设计经验的总结
    - 适配器设计模式：解决接口与接口实现类之间的矛盾问题，比如一个接口内有多个实现方法，但只想用其中一个，那种建立一个适配器，里面为接口的空方法，类从适配器中继承方法。
    - 步骤：
      - 1. 编写中间类XXXAdapter,实现对应的接口，对接口内的抽象方法进行空实现
      - 2. 让真正的实现类继承中间类，并重写需要用的方法
      - 3. 中间的适配器类用abstract进行修饰
7. 内部类：在一个类的内部再定义一个类，
   - 类的五大成员：属性，方法，构造方法，代码块，内部类
   - 内部类的特点：
     - 1. 内部类表示的事物是外部类的一部分
     - 2. 内部类单独出现没有任何意义
     - 3. 内部类可以直接访问外部类的成员，包括私有
     - 4. 外部类要访问内部类的成员，必须创建对象
   - 练习：写一个javabean类描述汽车
     - 汽车的品牌，车龄，颜色，发动机的品牌，使用年限
     ```java
     //Car是外部类
     public class Car{
          String carName;
          int carAge;
          int carColor;
          //Engine是内部类
           class Engine{
               String engineName;
               int engineAge;
      }
     }
     ```
* 成员内部类：
  - 写在成员位置的，属于外部类的成员
  - 可以被一些修饰符所修饰，比如：privat，default,protected,public,static等
  - 在成员内部类中可以定义静态变量
  - 获取成员内部类对象的两种方法：
    - 在外部类中编写方法，对外提供内部类的对象
    - 直接创建格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象 ```Outer.Inner oi = new Outer().new Inner();```
  - 成员内部类如何获取外部类对象
  - ```java
    public class Outer{
       private int a = 10;
       
       class Inner{
            private int a = 20;
            public void show(){
                int a = 30;
                system.out.pintln(a);//30
                system.out.pintln(this.a);//20
                system.out.pintln(Outer.this.s);//10
            }
       }
    }
          
    }
  ```
* 静态内部类
  - 只能访问外部类中的静态变量和静态方法，如想要访问非静态的需要创建外部类的对象
  - 创建静态内部类对象的格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
* 局部内部类：
  - 将内部类定义在方法里面，类似于方法中的局部变量
  - 外界无法直接使用，需要在方法内部创建对象并使用
  - 该类可以直接访问外部类的成员，也可以访问方法内的局部变量
* 匿名内部类（重点）
  - 匿名内部类本质上就是隐藏了名字的内部类
  - 可以写在成员位置，也可以写在局部位置
  - 格式：【[例子](L-Extends/src/a07extenddemo7)】
    - 细节：包含类继承或实现，方法重写，创建对象。整体就是一个类的子类对象或者接口的实现类对象
    - 
  - ```java
    new 类名或者接口名（）{
        重写方法；
    }
    
    new Inter（）{
        public void show(){
    }
    }
   ```
  - 应用场景：【[例子](L-Extends/src/a08extenddemo8)】 
    - 当方式的参数是接口或者类时，以接口为例，可以传递这个接口的实现类对象，如果实现类只要使用一次，就可以用匿名内部类简化代码
  
8. 拼图小游戏 【[CODE]()】补
## 2. JAVA 进阶知识
