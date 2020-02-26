//: generics/UseList.java
// {CompileTimeError} (Won't compile)
package generics;
import java.util.*;

public class UseList<W,T> {
//  void f(List<T> v) {}
  void f(List<W> v) {}
} ///:~
