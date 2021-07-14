<h2> Software Design Pattern </h2>

<blockquote>
    <b>
“Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice” (Alexander et al. 1977, p x).
    </b>
</blockquote>

  <p >Said said:
    Patterns are general solutions to recurring problems. They also have the benefit of being well tested by lots of developers. So, when you see a need for one, you can sleep well knowing many developers have been there before and solved the problem using similar techniques.
    </p>

Doğada sıklıkla kullanılan patternlar(memeliler,kar tanesi, leopar desenli elbise, keçi yolu, hilal taktiği, ayasofya, trafikte seyir halindeyken sinyal vermeden aniden önünüze kıran araç için; düşünmeden frene basmanız ve sözel olarak iyi dileklerinizi sunmmanız ), yazılım olaylarında ise The GOF ile iyice popüleritesini artırmıştır.Kitap ismi:  Design Patterns: Elements of Reusable Object-Oriented Software.Referans kaynak olarak bunu kullandık

![](https://ichef.bbci.co.uk/news/800/cpsprodpb/A1E1/production/_104914414_fb6ec4da-cca2-4e16-8e9a-a561c099959a.jpg)

<h3>Neden Öğrenmeye Çalışıyoruz ?</h3>
<li>
    highly cohesive ve loosely couplinge sağladğığı fayda  için.Bu sayede kodlar daha okunaklı ve maintable oluyor.
    </li>
    <li>
    Ortak bir dil yaratır. Mülakatlarda merhaba yerine singleton diyebilirsiniz.Yazılım muhabbetlerinin tıkandığı zamanlarda ortaya çıkarabilirsiniz.
    </li>
    
<h3> Mevzu Bahis Patternlar için Patternlar </h3>
<ul>
<li>1.Karşılan Problem</li>
    <li>2.Çözüm</li>
    <li>3.Sonuç</li>
</ul>
<p>
    Patternlarda öncellikle problemin tanımı ve bu probleme getirilen çözüm anlatılır.Çözüm için örnekler verilsede concrete bir dizayn verilmez.Patternlar daha çok bir guide veya template olarak düşünebiliriz.Çözüm beraberinde bir takım trade-off lar ortaya çıkarır.Const and benefit göz önüne almak gerekir.
 </p>   
 
   ![](https://i.pinimg.com/originals/f3/d2/c2/f3d2c2af63693822a8cbdb745f54e4f2.jpg)
    <h3>Ne zaman uzak durmalıyız, Kimler uzak durmalı ? Pattern Depresyon</h3>  
   <ul>
    <li>Öğrenme aşamasında design patternları yazdığımız kodlardan uzak tutmalıyız.Getter setter varken lütfen kullanma</li>
    <li>Stickerli macbooklarını satan yazılımcılar kullanmalı</li>
    <li>Nasada çalışan arkadaşlar</li>
    <li>Over engineeringé uzak durmak için en önemli sebeplerden aman.</li>
    </ul>
    
 <div>
    <h3>Sınıflandırma</h3>
    Design patternlar 3 ana kategori altında konumlandırılmıştır.
    <ul>
        <li>Creational Patterns</li>
        <li>Structural Patterns</li>
        <li>Behavioral Patterns </li>
    </ul>
 </div>

![](https://image.slideserve.com/770720/design-pattern-space-l.jpg)
 
<div style="font-size: 18px;font-family: 'Lohit Devanagari'">
<ul>
<li>
            Creational Patterns
</li>
<ol>
<li>
Creational patterns provide the capability to create objects based on a required criterion and in a controlled way. They deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

</li>

</ol>

<hr/>
<li>
            Structural Patterns 
</li>
<ol>
<li>
Structural patterns are about organizing different classes and objects to form larger structures and provide new functionality. They ease the design by identifying a simple way to realize relationships among entities.
</li>

</ol>

<hr/>
<li>
            Behavioral Patterns
</li>
<ol>
<li>
Behavioral patterns are about identifying common communication patterns between objects and realize these patterns. They identify common communication patterns among objects and distribute responsibility. By doing so, these patterns increase flexibility in carrying out communication.</li>

</ol>



</ul>

<h4> SOLID PRINCIPLES </h4>
https://gokhana.medium.com/solid-nedir-solid-yaz%C4%B1l%C4%B1m-prensipleri-nelerdir-40fb9450408e


</div>
