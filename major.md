
[Basics](index.md)

[Main standard libraries](mainlib.md)

[Major third-party libraries](major.md)

[Development tools](development.md)

[learning resources](resource.md)

# Major third-party libraries

## A number of Kotlin third-party libraries


### Glide
  - one of the most popular image loading libraries from Bump Technologies. Glide Library can upload and display images from many sources and manage cache, while also consuming small amount of internal memory for image processing.
  
  Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs. Glide includes a flexible API that allows developers to plug in to almost any network stack. By default Glide uses a custom HttpUrlConnection based stack, but also includes utility libraries plug in to Google's Volley project or Square's OkHttp library instead.

Glide's primary focus is on making scrolling any kind of a list of images as smooth and fast as possible, but Glide is also effective for almost any case where you need to fetch, resize, and display a remote image.

For detailed instructions and requirements, see Glide's [download and setup docs page](http://bumptech.github.io/glide/doc/download-setup.html)


### Dagger 2
- the library developed by Google Inc. as a fast dependency injector for Android. It helps developers implement a Dependency Injection pattern which is “Inversion of control specific form”. Check out Kotlin + Dagger2 example below.


Dagger 2 is a compile-time evolution approach to dependency injection. Taking the approach started in Dagger 1.x to its ultimate conclusion, Dagger 2.x eliminates all reflection, and improves code clarity by removing the traditional ObjectGraph/Injector in favor of user-specified @Component interfaces.

This github project represents the Dagger 2 development stream. The earlier project page (Square, Inc's repository) represents the earlier 1.0 development stream. Both versions have benefited from strong involvement from Square, Google, and other contributors.

Dagger is currently in active development, primarily internally at Google, with regular pushes to the open-source community. Snapshot releases are auto-deployed to sonatype's central maven repository on every clean build with the version HEAD-SNAPSHOT.

[Dagger 2's main documentation website can be found here.](https://google.github.io/dagger/)

### Retrofit 2 
- a type-safe and the most popular HTTP client for Android Development. Kotlin and Retrofit libraries can be used in Android development without any drawbacks. Later we will show you a Kotlin Retrofit example.

[A type-safe HTTP client for Android and Java](https://square.github.io/retrofit/)


### Realm database 
  - a Mobile Database, which is an excellent substitute for SQLite and ORMs, as it operates faster, simpler and safer. The major part of Realm Kotlin library is written in Java. Our examples are below and you can check Realm Kotlin examples in the official Realm-java repository on GitHub.
  
  [Realm database](https://realm.io)
  
### RxJava + RxAndroid
  - Reactive programming has been deeply rooted in Mobile Development. Rx is a powerful tool that allows to solve issues in a neat declarative way of functional programming.There are thousands of articles telling about the benefits of RxJava, RxKotlin, RxAndroid and RxBinding for Android development. We won’t step aside and will use these libraries to work with asynchronous operations in a more convenient way. We will demonstrate you a small example of using Realm with RxJava in Kotlin.
  
#### Android specific bindings for RxJava 2.

This module adds the minimum classes to RxJava that make writing reactive components in Android applications easy and hassle-free. More specifically, it provides a Scheduler that schedules on the main thread or any given Looper

[RxJava + RxAndroid](https://github.com/ReactiveX/RxAndroid)

### How to convert Android java 3rd party library to kotlin?

You can import 3rd party java library as module then modify it as per your requirements. You can convert one file to Kotlin or whole library it up to you.

#### 3rd party library import as module steps for android studio:

```markdown
1.Open your project in Android Studio
2.Download the library (using Git, or a zip archive to unzip)
3.Go to File > Import Module and import the library as a module
4.Right-click your app in project view and select "Open Module Settings"
5.Click the "Dependencies" tab and then the '+' button
6.Select "Module Dependency"
7.Select "3rd Party Library"
8.Modify the library if you want to convert it to Kotlin etc
```
  
### GSON
GSON is an open-source Java library to serialize and deserialize Java objects to (and from) JSON.
GSON can use the Object definition to directly create an object of the desired type.
The advantage of Json is lightweight and much simpler than XML.
For example:
```markdown
// Serialize 
String userName = new Gson().toJson(user);

// Deserialize
User user = new Gson().fromJson(userName, User.class);
```


Klaxon is a library to parse JSON in Kotlin.[For more information](https://github.com/cbeust/klaxon)  
