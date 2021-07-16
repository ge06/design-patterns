<h2>Command Pattern </h2>
<blockquote>
    <b>
Encapsulate a request as an object, thereby letting you parameterize clients with
different requests, queue or log requests, and support undoable operations.  

Also knowns as action, transaction
    </b>The  GOF-219
</blockquote>

Command pattern ile yapılmak istenen işlemler bir nesneye dönüştürülerek, receiverlar tarafından işlemin yapılması sağlanır.
Yapılacak işlemler için bir command interface oluşturulur ve işlemler burda deklare edilir.

Örnek olarak telefon ile fotograf cekmek veya telefon araması yapmak için, telefon içinde internal olarak nasıl bir işlem yapıldığını bilmemeize gerek yoktur.
Sadece fotograf ve arama isteklerini telefonun bilmesi yeterlidir.Client sadece telefon etmek için veya fotograf çekmek için hangi commanda  hangi tuşlarla ulaşmasını bilmesi yeterlidir.


![](/image/commandPattern.png)

<h2> Uygulanabilirlik  </h2>
<p>Command pattern şu durumlarda kullanılabilir; </p>

![](/image/commandPatternButton.png)
<ul>
<li> Command pattern ile queue, async, schedule, offline vb. yapıları kurulabilir ve her bir command bu yapılarda yönetilebilir.</li>
<li> Geriye dönebilen yapılar kurulabilir</li>
</ul>

<h2>Sonuc </h2>
The Command pattern is pretty common in Java code. 
Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions. 
It’s also used for queueing tasks, tracking operations history, etc.

Here are some examples of Commands in core Java libraries:

<ul>
<li>All implementations of java.lang.Runnable</li>
<li>All implementations of javax.swing.Action</li>
</ul>

Artıları;
<ul>
<li> Single of Responsibility.Cağırılan commandlar decouple bir şekilde elde edilebilir.</li>
<li> Open and Close.Yeni bir command eklenir tüm kodu değiştirmeden</li>
<li> Undo ve Redo işlevleri eklenebilir.</li>
<li> Karışık bir command parçalanabilir.</li>
</ul>

Eksileri ;
<ul>
<li> Gelen requestler ve yapmak istedikleri iş başlangıçta bilinmelidir.Herhangi bir noktada işlemin sonlanması, requestin kaybolması yol açabilir.</li>
<li> Sender ve reciever arasında yeni layerlar eklendiğinde karmaşıklığa yol açar. </li>
</ul>


<h2>Diğer Pattern ile ilişkisi</h2>
<ul>
<li>Chain of Responsibility bulunan handler yapıları command pattern kullanılarak oluşturulabilir.</li>
<li>Memento ile beraber kullanılarak undo, reversible yapılar kurulabilir.</li>
<li>Strategy pattern ile benzer görülebilir.Fakat strategy pattern genellikle bir işi değişik yollarla yapmak olarakta tanımlanır.</li>
<li>Prototype ile beraber kullanılarak, command history tutulabilir.</ul>
<li>Visitor ile beraber, command pattern farklı objeler farklı sınıflar için de kullanılabilir.</ul>

<h2> Örnek Senaryo Açıklaması </h2>

