## equals 与 hashCode
+ equals和hashCode都是Object对象中的非final方法，它们设计的目的就是被用来override的。
+ 覆写equals的准则
    + 自反性：对于任何非空引用值x，x.equals(x)都应返回true
    + 对称性：对于任何非空引用值x和y，当且仅当y.equals(X)返回true时，x.equals(y)才应返回true。
    + 传递性：对于任何非空引用值X、y和z，如果y.equals(x)返回true，并且y.equals(z)返回true，那么x.equals(z)应返回true。
    + 一致性：在对象没有被修改的情况下，多次调用返回结果一致
    + 非空性：对于任何非空引用值x，x.equals(null)都应返回false
    
+ 违反对称性？所以一般在覆写equals只兼容同类型的变量
+ 违反传递性？

+ 
     


