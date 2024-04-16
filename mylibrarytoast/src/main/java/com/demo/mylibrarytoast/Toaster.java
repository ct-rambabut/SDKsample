package com.demo.mylibrarytoast;

import android.content.Context;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class Toaster {
    public static void simpleToast(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

}
