# Zero to Hero With Kotlin


## Content:

- [What's/Why Kotlin?](#1)
- [Kotlin Basic Syntax](#2)
  - [Hello World](#2.1)
  - [Difference of Print & Println](#2.2)
  - [Comment Lines](#2.3)
  - [Escape Characters](#2.4)
  - [Data Types](#2.5)
  - [Variable Declaration](#2.6)
  - [Semicolon Usage](#2.7)
  - [Type Conversion](#2.8)
  - [User Input](#2.9)
  - [Conditions Expression](2.10)



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

1. `//`ifadesini kullanarak bu ifadenin sağında kalan bütün değerleri yorum satırı haline getirebilirsiniz
2. `/* */` ifadeleri aralarında bulunan bütün metni yorum satırları haline getirir. Çoklu satırlarda önerilir


![image](https://user-images.githubusercontent.com/70329389/145679445-fb55c3ad-cba1-497b-a578-13e80845bde3.png)

### <a name="2.4"></a> Escape Characters

Kaçış karakterleri, tab, enter, satır sonu gibi doğrudan klavyeden girilemeyen bazı tuşları oluşturmak içinde kullanılır. 

1. `$` veya `${}` sembolleri tırnak içerisinde bile tanımladığımız değişkenleri değerleriyle çağırabilmemizi sağlar

![image](https://user-images.githubusercontent.com/70329389/145680530-889281a7-c956-4edf-9785-c804e3b7fd0f.png)

2. `\n` kullanımı println mantığına benzerdir. Eğer `\n`'i tırnak içerisinde kullanırsanız sonrasında gelen değerleri enter tuşuna basılmış gibi bir alt satırdan başlatır. Kısaltılması **New Line**'dan gelmektedir
3. `\t`kullanımı kendinde sonra gelenleri bir kere tab tuşuna basılmış gibi ekrana gösterir. Kısaltılması **tab**'dan gelmektedir.


### <a name="2.5"></a> Data Types

Veri tipleri kodlamada sıklıkla kullanılan verinin türünü belirtme şeklimizdir. Okuduğunuz bir şeyin cümle olduğunu birden fazla kelimeden oluşuyor olmasından anladığınız gibi veya kelime olduğunu harflerden oluşmasından anladığınız gibi bilgisayarada belli verileri sınıflandırıp anlatmanız lazım. 

![image](https://user-images.githubusercontent.com/70329389/145681032-13ad482f-795b-4ee7-8472-616b253020bd.png)

### <a name="2.6"></a> Variable Declaration

Daha önce tanımlanmadıysa eğer bilgisayar için kelimeler bir şey ifade etmez. Bu nedenle daha sonrası için ihtiyaca göre belli kelimelere veya harflere bazı değerler atamamız gerekebilir. Bunu yapmanın iki yolu vardır:

### Var:

`var`, *variable*'ın yani değişkenin kısaltılmış halidir ve daha sonra içinde tuttuğu değişebilecek değerleri tanımlamak için kullanılır. İşte kullanım şekli :

![image](https://user-images.githubusercontent.com/70329389/145681321-fe231e92-915c-4210-9465-8df0d0ac3e57.png)

### Val : 

`val`, *value*'nun yani değer kelimesinin kısaltılmış halidir ve daha sonra içinde tuuttuğu değişkenin değerini değiştirilemez olarak tanımlar. Sonrasında herhangi bir işlem ile değiştirilmeye çalışıldığında hata verecektir. İşte kullanımı:

![image](https://user-images.githubusercontent.com/70329389/145681411-0e3c3d38-f870-448c-a1e5-393ec84084cd.png)

### Attantion:

`val` veya var `var` kullanırken aşağıda gördüğünüz gibi değişkenlerin veri türlerinide belirtebilirsiniz ama buna çoğunlukla gerek yoktur. Çünkü Kotlin bunu anlayacak ve ihtiyaç duymayacak kadar zeki bir dil

### <a name="2.7"></a> Semicolon Usage

Java kodlama diline aşina olanlar için şu ana kadar büyük bir eksiklik fark etmişlerdir. yazdığımız hiçbir kodda semicolons yani `;` kullanmadık, çünkü Kotlin satırın bittiğini anlamak için semicolons'a ihtiyaç duymaz. Ama çoğu java yazılımcısı kotline geçtiğinde alışkanlık olarak satır sonuna semicolons ekler, Kotlin bunada hata vermeyecektir.

1 İstisna dışında semicolonsları satır sonunda kullanmanıza gerek yoktur zaten bu istisna hariç eklediğinizdede giri gözükecektir. Peki bu istisna ne? 

Tek satırda birden fazla fonksiyon veya kod çalıştırmak istiyorsanız semicolonsları aşağıdaki gibi kullanmanız gerekmektedir.

![image](https://user-images.githubusercontent.com/70329389/145681708-9e2ee90d-ccb9-43d0-b164-768d068a1120.png)

### <a name="2.8"></a> Type Conversion

Daha önceki konu başlıklarından birinde [Data Type](#2.5)'ı işlemiştik. Bu bölümde ise bu türleri değiştirmemiz gerektiğinde nasıl bir yazım şeklini kullanabileceğimizi göreceğiz:

![image](https://user-images.githubusercontent.com/70329389/145681805-1165adf3-8ad1-49bc-b59b-931b9a21f708.png)

### <a name="2.9"></a> User Input

Yazdığınız kodun bazen kullanıcıdan değer alması gerekebilir. Bunun için 2 farklı kullanım vardır 

1. `readLine()`fonksiyonunu kullanarak tek satırda kullanıcıdan bir değer isteyebilirsiniz. kullanım şekli: 

<img width="1200" alt="1" src="https://user-images.githubusercontent.com/70329389/145682106-7e010055-5c3d-40cf-ba79-6d53eaf818fb.png">

2. `Scanner()`kullanarak aşağıdaki gibi kullanıcıdan bir değer alabilirsiniz

<img width="1200" alt="1" src="https://user-images.githubusercontent.com/70329389/145682297-28a80ebd-abf6-49b1-94c5-8aab5c8ebfcf.png">

### <a name="2.10"></a> Conditions Expression

### if/else Expression

Kodlarımızı yazarken çoğunluklara koşullara ihtiyaç duyarız , bu gibi durumlarda `if / else / else if` ifadelerini kullanabilirsiniz. İşte kullanım şekilleri:

![image](https://user-images.githubusercontent.com/70329389/145682509-f03fe5aa-bea9-4187-b901-7801e71cee25.png)

### When Expression

`When`içinde birçok koşul barındıran bir yapıdır. Daha okunaklı ve daha kısa yazımı yüzünden tercih edilmesi daha olasıdır. Diğer dillerdeki switch case mantığı gibi çalışır

![image](https://user-images.githubusercontent.com/70329389/145682593-5bcc9ef6-ab4c-4536-8daf-683c2b750bad.png)



























