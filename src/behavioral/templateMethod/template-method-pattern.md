<h2> Template Method Pattern </h2>

<blockquote>
    <b>
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without
changing the algorithm's structure.
    </b>The  GOF-301
</blockquote>

  <p>
     Bir abstract sınıfta algoritma için gerekli işlemler tanımlanır. Child classlar için override stratejisi belirlenir.
  </p>


![](/image/templateMethodDiagram.png)

Yukardaki class diagramı baz alırsak, concrete A ve B classları, abstract class extend etmişlerdir.
Abstract classta bulunan template method , override edilememesi için ayarlanmıştır ve istenilen algoritmayı bulunmaktadır.
Step 1,2 ve 3 methodları ise override edilebilecek bir şekilde ayarlanmıştır.Concrete classların bu methodlarının içeriklerini birbirlerinden bağımsız bir şekilde implemente edebilirler.


<h2> Uygulanabilirlik  </h2>
<p>Template method şu durumlarda kullanılabilir; </p>
<ul>
<li> Algoritmanın değişmez parçaları abstract class içinde ele alınır.Davranışsal (behavioral kategorisinde değerlendirilmesinin sebebi budur) farklılıklar child class içinde yönetilmesinin gerektiği durumlarda.</li>
<li> Code duplicationdan koruynmak için.</li>
<li> Subclass extension kontrol amaçlı kullanılabilir.Template method(tüm classlarda değişmemesi istenen davranış) hook operationlar tanımlanabilir.</li>
</ul>

<h2>Sonuc </h2>
Template method en önemli artıları;
<ul>
<li> Reusability</li>
<li> Decoupling</li>
</ul>

Eksileri ;
<ul>
<li> Inheritance</li>
<li> Liskov Substition principle ihlal eder</li>
<li> Template methoddaki stepler artıkça maintaini zorlaşacaktır.</li>
</ul>


Template method bir çok yapıda kullanılmaktadır.Java Java core libraries, for example by java.util.AbstractList, or java.util.AbstractSet. 
For instance, Abstract List provides a skeletal implementation of the List interface.
(bknz: https://www.baeldung.com/java-template-method-pattern)

<ul>
All non-abstract methods of 
<li> java.io.InputStream  </li> 
<li> java.io.OutputStream </li>
<li> java.io.Reader </li>
<li> java.io.Writer </li>
<li> java.util.AbstractList </li> 
<li> java.util.AbstractSet </li>
<li> java.util.AbstractMap </li>
<li> javax.servlet.http.HttpServlet all the doXXX() methods by default send a HTTP 405 “Method Not Allowed” error as a response. You’re free to override any of them. </li>
</ul>
(bknz: https://refactoring.guru/design-patterns/template-method/java/example)

Ayrıca template method ile inverted control stucture geliştirilebilir.

 
![](/image/Hollywood.jpg)


<h2>Diğer Pattern ile ilişkisi</h2>
Factory method , template method için kullanılabilir.





<h3>linkler </h3>
https://refactoring.guru/design-patterns/template-method



<h2> Örnek Senaryo Açıklaması </h2>
Senaryo:  online hediye tasarlama

![](/image/templateMethod.png)

