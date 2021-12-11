# Zero to Hero With Kotlin


## Content:

- [What's/Why Kotlin?](#1)
- [Kotlin Syntax Basic](#2)
  - [Hello World](#2.1)
  - [Difference of Print & Println](#2.2)
  - [Comment Lines](#2.3)




## <a name="1"></a>What's/Why Kotlin?

## <a name="2"></a>Kotlin Syntax Basic

### <a name="2.1"></a>Hello World!
 
Gelin çoğu kodlama dilinde olduğu gibi "Hello World" ile başlayalım

![image](https://user-images.githubusercontent.com/70329389/145671536-9b15c586-6b67-4d91-99ff-09c60075f167.png) 

Satır satır incelemeye ne dersiniz? 

- Öncelikle `fun` kelimesiyle başlıyoruz. `fun` function(foksiyon) kelimesinin kısaltmasıdır, fonksiyonlar programların yapı taşlarıdır. belirli bir işlevi yerine getirmek için kullanılır.

- Fonksiyonları ayırt edebilmemiz için adları vardır.`main`ile devam ediyoruz. `main`bu fonksiyonun ismidir ama main foksiyonları biraz daha özeldir. Main fonksiyonları bu programın ana veya birincil fonksiyonudur. Her Kotlin kodu bir main fonksiyona ihtiyaç duyar.

- Fonksiyonlar çalışmak için belirli bilgilere ihtiyaç duyabilir. Sonrasında kullandığımız `()` içine, fonksiyonun kullanması için bilgi girebilirsiniz. Fonksiyona yapılan bu girdiye *"arguments"* veya kısaca *args* denir . Argümanlar hakkında daha sonra daha fazlasını öğreneceksiniz.
- Fonksiyonlarımız çalışmak için belli sınırlara(başlama ve bitiş noktası) ihtiyaç duyar. `{}`sembolleri bu sınırları belirler. Bu sınırların içinde bir işlevi yerine getiren kodlar bulunur.
- Fonksiyon küme parantezlerinin içindeki `print()`sisteme bir metin satırı yazdırır. Dikkatinizi çektiyse `print()` kod içerisinde kullandığımız hazır fonksiyonlardan biridir
- Pazantezlerin içine yazdırmak istediği metni `""`işaretleri arasına yazmanız gerekmektedir. Bu semboller içlerine yazılan her şeyi birebir ekrana bastırmasını söyler 

dikkat etmeniz gereken son şey, print gibi yaptırmak istediğimiz işlevlerin hepsinin fun main()'in içinde olduğuna emin olmaktır.

### <a name="2.2"></a>Difference of Print & Println

Daha önce basic bir kotlin kodu gördüyseniz mutlaka gözünüze `println()`de takılmıştır. Peki nedir bu print ve println in farkı?

println deki `ln`kısaltması *line*'dan gelmektedir ve birsonraki ekrana bastırılacak değeri bir alt satırdan başlatır. Kısaca anlatmak gerekirse kodlarken print fonksiyonunun içine yazdığınız cümleler karakter karakter basılır yani siz nasılki kağıda Hello World yazarken harf harf kodda bunu bu şekilde ekrana aktarır. ancak println cümlenin bittiği anda bir kere enter tuşuna basılmış gibi devam ederek birsonraki işlev çıktısını bir alt satırda başlatır.

![image](https://user-images.githubusercontent.com/70329389/145672222-8030af63-9c10-46e6-80ab-7fe304b0554a.png)

Bu kodda göreceğiniz çıktı aşağıdaki gibidir:

```
Hello World Whats's my purpose
Ohh my God :|
```

### <a name="2.3"></a>Comment Lines

Yorum satırları bilgisayarın okumadığı veya ilgilenmediği satırlar diyebiliriz. Peki buna neden ihtiyacımız olsun?
Genelde yazdığımız kodlardaki bazı detayları neden yazdığımızı unutabiliriz veya bu kodları sadece siz değil başka yazılımcılarda kullanmak durumunda kalabilir bu nedenle yazdığımız kodları olabildiğince açık ve belirli yazmalıyız. Bu nedenle yorum satırları kullanarak daha açıklayıcı notlar bırakabiliriz sonrası için

Kotlinde birden fazla yorum satırı bırakma şekli vardır:

1. `//`ifadesini kullanarak bu ifadenin sağında kalan 


![image](https://user-images.githubusercontent.com/70329389/145679445-fb55c3ad-cba1-497b-a578-13e80845bde3.png)





