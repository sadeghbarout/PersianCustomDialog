<div lang="fa" dir="rtl">
<h2>دیالوگ شخصی فارسی</h2>
<strong>
این دیالوگ به شما کمک میکند که بدون نیاز به کد نویسی اضافه و ساخت لیوت به راحتی و ب سرعت بالا دیالوگ شخصی خود را بسازید.

همچنین می توانید زنگ divider و عنوان دیالوگ را شخصی کنید.
</strong><br><br>
<img src="http://axgig.com/images/83080665343500149643.gif" border="0" alt="persian custom dialog" />

<h2>
نحوه استفاده
</h2>
</div>
```java
PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(context).
		setTitle("تیتر").
		setTitleColor("#FF00FF").
		setDividerColor("#FF00FF").
		setMessage("محل قرارگیری توضیحات برنامه").

persianDialogBuilder.show();
```

<div lang="fa" dir="rtl"><strong>
دیالوگ فارسی چیزی نیست به جز یه کلاس ساده(<code>PersianDialogBuilder.java</code>)  همراه با یک فایل لیوت (<code>persian_dialog_layout.xml</code>)<br>
شما میتوانید این دوفایل را درون پروژه خود وارد کنید و از آنها همانند کد بالا به سادگی استفاده کنید.
اگر نیاز به اضافه کردن جزئیات بیشتری دارید میتوانید xml شخصی خود را بسازید (<code>example_layout.xml</code>) و آن را همانند کد زیر در کلاس فراخوانی کنید
</strong></div>
```java
PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(context).
		setTitle("تیتر").
		setTitleColor("#FF00FF").
		setDividerColor("#FF00FF").
		setMessage("محل قرارگیری توضیحات برنامه").
		setIcon(getResources().getDrawable(R.drawable.ic_launcher)).
		setCustomView(R.layout.example_layout, v.getContext());

persianDialogBuilder.show();
```

<div lang="fa" dir="rtl"><strong>
همچنین میتوانید باتن های خود را در دیالوگ اضافه نمایید
</strong></div>
```java
PersianDialogBuilder persianDialogBuilder = new PersianDialogBuilder(context).
		setTitle("تیتر").
		setTitleColor("#FF00FF").
		setDividerColor("#FF00FF").
		setMessage("محل قرارگیری توضیحات برنامه").
		setIcon(getResources().getDrawable(R.drawable.ic_launcher)).
		setCustomView(R.layout.example_layout, v.getContext());

    persianDialogBuilder.setPositiveButton("خب", null);
    persianDialogBuilder.setNegativeButton("بیخیال", null);
persianDialogBuilder.show();
```

</head></html>
