package com.example.apssdc.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class SampleWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        for(int appWidget:appWidgetIds){

            Intent i=new Intent(context,MainActivity.class);
            PendingIntent pi=PendingIntent.getActivity(context,1,i,0);
            RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.widget_design);
            views.setOnClickPendingIntent(R.id.widgets,pi);
            appWidgetManager.updateAppWidget(appWidget,views);
        }

    }
}
