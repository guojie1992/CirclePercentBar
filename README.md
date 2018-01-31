# 效果图
![](https://github.com/guojie1992/CirclePercentBar/blob/master/demogif/%E7%99%BE%E5%88%86%E6%AF%94%E9%9A%8F%E6%9C%BA%E8%AE%A1%E7%AE%97.png)
![](https://github.com/guojie1992/CirclePercentBar/blob/master/demogif/%E7%99%BE%E5%88%86%E6%AF%94%E8%AE%A1%E7%AE%97.png)
# 使用方法
1、项目下的build.gradle添加

```
allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```
2、模块下的build.gradle添加依赖

```
dependencies {
	        compile 'com.github.gittjy:CirclePercentBar:1.0.1'
	}
```
3、代码中<br>
<br>
布局xml文件
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    tools:context="com.android.tu.circlepercentcontrol.MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_horizontal"
        android:layout_marginLeft="30dp"
        android:orientation="vertical">

    <include layout="@layout/online_stu_info"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginTop="5dp"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:background="@color/simple_white"
            >

            <include layout="@layout/include"></include>


            <com.android.tu.circlelibrary.CirclePercentBar
                android:id="@+id/circle_bar"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_margin="5dp"
                app:arcColor="@color/colorPrimary"
                app:arcStartColor="@android:color/holo_blue_light"
                app:arcWidth="3dp"
                app:centerTextColor="@color/char_blue"
                app:centerTextSize="10sp"
                app:circleRadius="25dp" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:background="@color/simple_white"
            android:layout_marginTop="5dp">

            <include layout="@layout/include_two"></include>


            <com.android.tu.circlelibrary.CirclePercentBar
                android:id="@+id/circle_bar_two"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_margin="5dp"
                app:arcColor="@color/colorPrimary"
                app:arcStartColor="@android:color/holo_blue_light"
                app:arcWidth="3dp"
                app:centerTextColor="@color/char_blue"
                app:centerTextSize="10sp"
                app:circleRadius="25dp" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:background="@color/simple_white"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:layout_marginTop="5dp">

            <include layout="@layout/include_three"></include>


            <com.android.tu.circlelibrary.CirclePercentBar
                android:id="@+id/circle_bar_three"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_margin="5dp"
                app:arcColor="@color/colorPrimary"
                app:arcStartColor="@android:color/holo_blue_light"
                app:arcWidth="3dp"
                app:centerTextColor="@color/char_blue"
                app:centerTextSize="10sp"
                app:circleRadius="25dp" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:background="@color/simple_white"
            android:layout_marginLeft="30dp"
            android:layout_marginRight="30dp"
            android:layout_marginTop="5dp">

            <include
                layout="@layout/include_four"></include>


            <com.android.tu.circlelibrary.CirclePercentBar
                android:id="@+id/circle_bar_four"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_margin="5dp"
                app:arcColor="@color/colorPrimary"
                app:arcStartColor="@android:color/holo_blue_light"
                app:arcWidth="3dp"
                app:centerTextColor="@color/char_blue"
                app:centerTextSize="10sp"
                app:circleRadius="25dp" />
        </LinearLayout>

    </LinearLayout>
</LinearLayout>

```
java文件中设置数值
```
circlePercentBar.setPercentData(data,new DecelerateInterpolator());
```
