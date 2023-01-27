# JAVA
一个计算机小白学习JAVA的过程
## 1. JAVA 基础学习
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
常见问题：
> - 标点符号：必须是英文
> - 单词拼写错误：注意大小写

Java版本：
- Java SE: 标准版，用于桌面应用的开发
- Java ME: 小型版，用于嵌入式电子设备或小型移动设备
- Java EE: 企业版， web方向的开发

Java主要特征：
- 面向对象
- 多线程
- 开源
- 跨平台（操作系统）：通过虚拟机实现，不同的平台安装不同的虚拟机

JVM, JDK,JRE之间的关系：
- JVM:Java 虚拟机
- JDK = JVM + 核心类库 + 开发工具
- JRE = JVM + 核心类库 + 运行工具

#### 1.2.2 小概念
> 注释：解释说明代码
> - 单行注释： // 注释信息
> - 多行注释： /* 注释信息 */
> - 文档注释： /** 注释信息 */

> 关键字：被Java赋予了特定涵义的英文单词
> - 关键字的字母全部小写
> - 代码编辑器中，对关键字有特殊颜色标记
> - class:用于创建/定义 一个类，类是Java最基本的组成单元

> 字面量（常量）：
> 
| 字面量类型 |          说明           |                 举例                  |
|:-----:|:---------------------:|:-----------------------------------:|
| 整数类型  |       不带小数点的数字        |               666，-88               |
| 小数类型  |        带小数点的数字        |                13.14                |
| 字符串类型 |    用 *双引号* 括起来的内容     |            "hello world"            |
| 字符类型  | 用 *单引号* 括起来的，*内容只有一个* |                 'A'                 |
| 布尔类型  |         表示真假          |             true false              |
|  空类型  |       一个特殊的值，空值       | 值为：null *不可单独打印，用字符串格式进行打印，即"null"* |

> 特殊字符类型字面：
> - \t 制表符： 在打印的时候，把前面字符串的长度补齐到8，或8的倍数。打印时用于对齐
 
> 变量：在程序执行过程中，值可能变化的量
> 
> 定义格式： 数据类型 变量名 = 数据值 ; 例如 ``` int a = 18;```
> 
> 变量的使用方式 ： 
> - 1） 输出打印 
> ``` Java
> int a = 1;
> System.out.println(a);

> - 2）参与计算
> ```Java
> int a = 1;
> int b = 2;
> System.out.println(a+b);

> - 3） 修改记录的值
> ```Java
> int a = 1;
> System.out.println(a);
> a = 2;
> System.out.println(a);

> 变量的注意事项：
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
| 数据类型 | 关键字         | 取值范围                                                                 |
|------|-------------|----------------------------------------------------------------------|
| 整数   | byte        | -128 ～ 127                                                           |
|      | short       | -32768 ～ 32767                                                       |
|      | int (默认)    | -2147483648 ～ 2147483647（10位数）                                       |
|      | long        | 19位数 （如果定义long类型的变量，在数据值的后面需要加***L*** 作为后缀）                          |
| 浮点型  | float       | -3.401298e-38 ~ 3.401298e-38 （如果定义float类型的变量，在数据值的后面需要加***F*** 作为后缀） |
|      | double （默认） | -4.9000000e-324 ~ 1.797693e+308                                      |
| 字符型  | char        | 0-65535                                                              |
| 布尔   | boolean     | true, false                                                          |
> 整数和小数取值范围大小关系：
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

#### 1.2.3 Idea和运算符

##### 1.2.3.1 IDEA
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
##### 1.2.3.2 运算符
- 运算符和表达式

   1）运算符：对字面量或变量进行操作的符号 ``` + , - ```
   2）表达式：用运算符把字面量或变量连接起来，符合Java语法的式子 ``int c = a + b``
> - 算术运算符
> 
| 符号  | 作用    | 说明     |
|-----|-------|--------|
| +   | 加     | 3+2 =5 |
| -   | 减     | 5-2=3  |
| *   | 乘     | 3*2=6  |
| /   | 除     | 5/2=2  |
| %   | 取模，取余 | 5%2=1  |
> 整数参与计算，结果只能是整数
> 
> 如果有小数参与计算，结果可能不精确。 例如： ``` 1.1+ 1.1 =2.110000003```
> 
> 除：如果要完整显示结果，需有小数参与计算。例如 ```10/3=3; 10.0/3=3.3333333333  ```
> 
> 取模的应用：
> - 1. 用于判断A是否可以被B整除；``` 10 % 3 = 1```
> - 2. 用于判断一个是是否是偶数, A % 2 =0,A 是偶数，如果是1，则为奇数；
> > [练习1](A-Operator/src/Demo1/Exercise1.java)：数值拆分 
> >
> > 键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台。
> > ```java
> > import java.util.Scanner;
> > public class Exercise1 {
> >     public static void main(String[] args) {
> >     //创建键盘录入对象
> >         Scanner sc = new Scanner(System.in);
> >      //提示输入数据
> >         System.out.println("请输入一个三位整数：");
> >     // 定义一个变量接收输入值
> >         int i = sc.nextInt();
> >     //拆分出个位：取模10，例如 5 % 10 = 5 121 % 10 = 1
> >         int j = i % 10;
> >     // 拆分出十位：除10后， 取模10， 例如 (121 / 10) % 10 = 2
> >         int k = (i / 10) % 10;
> >     //拆出百位：除100后，取模10，例如（121/100）% 10 =1
> >         int l = (i / 100) % 10;
> >     //输出结果
> >         System.out.println(j);
> >         System.out.println(k);
> >         System.out.println(l);
> >     }
> > }

>> ```
> 

> - 自增自减运算符
> 

> - 赋值运算符
> 


> - 关系运算符
> 

> - 逻辑运算符
> 
> 

> - 三元运算符
> 
> 

> 运算符优先级



#### 1.2.4 判断和循环

#### 1.2.5 方法

#### 1.2.6 数组

#### 1.2.7 练习题

### 1.3 面向对象

### 1.4 API

### 1.5 字符串

### 1.6 集合

### 1.7 拼图游戏（综合应用）


## 2. JAVA 进阶知识
