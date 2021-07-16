<h2>Chain of Responsibility Pattern </h2>
<blockquote>
    <b>
Avoid coupling the sender of a request to its receiver by giving more than one object a
chance to handle the request. Chain the receiving objects and pass the request along the
chain until an object handles it. 
    </b>The  GOF-209
</blockquote>

Bir isteği karşılayabilmek için hangi nesnenin kullanacağı bilinmediği zamanlarda kullanilabilir.Loosely couple yapılar tasarlamamızı sağlar.
Chain of responsibility patternda isteği karşılamak için yaratılan nesneler birbirleri ile ilişkili hale gelirler.Her bir zincir kendisinden sonraki zinciri bilir.
Gelen istek kendisi ile alakalı değil ise bir sonraki zincire iletilir.

![](/image/chain-responsability-sequence.png)

<h2> Uygulanabilirlik  </h2>
<p>Chain of responsibility şu durumlarda kullanılabilir; </p>

![](/image/cor.jpg)
<ul>
<li> Sıralı ve birbirleri ile bağlantılı  bir çözüm sunabilir.</li>
<li> Loose coupling</li>
</ul>

<h2>Sonuc </h2>
Artıları;
<ul>
<li> Coupling düşürür.</li>
<li> Esnekliği artırır</li>
<li> Single of Responsibility, classlar decouple edilebilir.</li>
<li> Open/Closed ,yeni bir zincir kolaylıkla eklenebilir tüm kodu değiştirmedin.</li>
</ul>

Eksileri ;
<ul>
<li> Gelen requestler ve yapmak istedikleri iş başlangıçta bilinmelidir.Herhangi bir noktada işlemin sonlanması, requestin kaybolması yol açabilir.</li>
<li> Code duplicationlarına yol açabilir. </li>
</ul>


<h2>Diğer Pattern ile ilişkisi</h2>
<ul>
<li>Command pattern ile unidirectional bir yapı sender ve reciever arasında kurulabilir.</li>
<li>Mediator pattern sender ve reciever arasında direk bağlantı kurma zorunluluğunu kaldırır.Indirect bir şekilde iletişimde olabilirler bir mediator objesi ile.</li>
<li>Observer pattern, gelen isteklere dinamilk bir şekilde subscribe be unscribe olmayı mümkün kılar.</li>
<li>CoR ve Decorator birbirlerine benzer bir yapıları vardır.İkiside recursive bir şekilde, çalışma adımlarını zincir üzerinde ilerletirler.Fakat önemli farklar bulunmaktadır.
CoR'da birbirinden bağımsız işlem yapan  zincirler vardır.İsterse bir alt zincire işlemin geçmesini durdurablir veya işlemi sonlandırabilir.Decorator patternda ise, obje davranışı extend edilir base interface ile tutarlı olunur ve decorator patternda akış durdurulmaz.</li>
</ul>

<h2> Örnek Senaryo Açıklaması </h2>
Login kontrol.

![](/image/templateMethod.png)
