# UIBaznasTanggerang
this project is a replica ui of the application "Baznas Tanggerang City Government"

Indonesia : 
proyek ini adalah sebuah ui replika dari aplikasi "Baznas Pemerintah Kota Tanggerang"

you can see a the app in playstore (real not replica) || anda bisa melihat aplikasi di playstore (asli bukan replika)

App Baznas Tanggerang : https://play.google.com/store/apps/details?id=id.go.tangerangkota.baznastangerang

* the reason I made this is to test my UXD & Front-End skills: D || alasan saya membuat ini untuk menguji skill UXD & Front-End saya :D

# How to Build

1. Configure Gradl (Module: app) --> for using UI Login

```javascript

    compile 'com.android.support:design:26.1.0'
    
```

2. how to make option box on the menu app || cara buat menu kotak di menu aplikasi

```javascript

    <RelativeLayout
                android:id="@+id/menu1"
                android:layout_width="match_parent"
                android:layout_height="40dp"
                android:layout_marginRight="10dp"
                android:layout_marginLeft="10dp"
                android:paddingTop="10dp"
                android:background="@color/colorPrimaryDark">

                <TextView
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:background="@color/colorPrimaryDark"
                    android:singleLine="true"
                    android:layout_gravity="start"
                    android:textColor="@android:color/white"
                    android:text="Menu"
                    android:textAllCaps="true"
                    android:textSize="14dp"
                    android:layout_marginLeft="10dp"
                    android:enabled="false"/>
            </RelativeLayout>
    
```

# Screenshoot

![alt text](https://github.com/kataponcoe/UIBaznasTanggerang/blob/master/screenshoot/ss1.png?raw=true)
![alt text](https://github.com/kataponcoe/UIBaznasTanggerang/blob/master/screenshoot/ss2.png?raw=true)
