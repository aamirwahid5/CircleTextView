# CircleTextView
This is an Android library that will help users to have a circular TextView with an intial inside just like Gmail app with random colors that are genrated automatically. Please refer to included sample app for demo. 

![screenshot_2017-02-01-21-44-23-597_project aamir sheikh circletextviewexample](https://cloud.githubusercontent.com/assets/24679732/22515968/5658025e-e8ca-11e6-8b32-78078411a643.png)
![screenshot_2017-02-01-21-44-33-657_project aamir sheikh circletextviewexample](https://cloud.githubusercontent.com/assets/24679732/22515969/56637440-e8ca-11e6-9287-3c834cda3044.png)


Download
--------  
1) First Add this to your root build.gradle file:  
```gradle
repositories {
  maven { url 'https://jitpack.io' } //TODO
}
```
2) Then to your project's build.gradle file:
```gradle
dependencies {  
    .......  
    
    compile 'com.github.aamirwahid5:CircleTextView:1.0' //TODO  
       
}  
```
Or Maven:
First this in your root build.gradle:
```xml
repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  then add the dependency in your project's build.gradle:
```xml
<dependency>
	    <groupId>com.github.aamirwahid5</groupId>
	    <artifactId>CircleTextView</artifactId>
	    <version>1.0</version>
	</dependency>
```
HOW TO USE
-------- 
This goes in your layout xml file with width and height as u want:
```xml

<project.aamir.sheikh.circletextview.CircleTextView
        android:id="@+id/ctv"
        android:layout_width="50dp"   
        android:layout_height="50dp"
        android:gravity="center" />
```
and then in your java file:
```java
        CircleTextView  mCircleTextView = (CircleTextView) findViewById(R.id.ctv); //change with your id
        mCircleTextView.setCustomText(mArrayList.get(position)); //Supply your whole text here it will automatically generate the initial
        mCircleTextView.setSolidColor(position); //pass position if used inside RecyclerView otherwise you can keep blank this is used to save background color state
        mCircleTextView.setTextColor(Color.WHITE);
        mCircleTextView.setCustomTextSize(18); //change with your text size or if kept blank will take size automatically
 ```
 
