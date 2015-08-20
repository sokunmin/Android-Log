 # Android-Log
L class is a wrapper of Log class to print log easier and show more details in Adb LogCat.
* Append text with String.format(). 
* Log shows line number, method name, custom tag and messages.
* Adjust the depth to get super method name.


<H1>How to</H1>
Use `L.d(), L.i(), L.w() and L.e()` instead of `Log.d(), Log.i(), Log.w() and Log.e()`.

<H2>Sample</H2>
```java
L.d();
L.i(this);
L.w("CustomTag");
L.e(this,  "[%d] L.e(%s)", 1, "DEBUG");
L.d("[%d] L.d(%s)", 2, "DEBUG");
L.i(1, "Text isNull? %s", L.isNull(mTest));
L.w(1, "Text2 isNull? %s", L.isNull(mTest2));
```

<H2>Result</H2>
<pre>
D/[(29)testLevel()] =>﹕ ----------
I/[(30)MainActivity / testLevel()] =>﹕ ----------
W/[(31)CustomTag / testLevel()] =>﹕ ----------
E/[(32)MainActivity / testLevel()] =>﹕ [1] L.e(DEBUG)
D/[(33)testLevel()] =>﹕ [2] L.d(DEBUG)
I/[(34)/(19)onCreate()] =>﹕ Text isNull? null
W/[(35)/(19)onCreate()] =>﹕ Text2 isNull? String not null
</pre>