package com.ps.grupo2.comunio;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Josué on 08/11/2015.
 */

public class Social {

    public static void share(Context ctx, String subject,String text) {
        final Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);

        ctx.startActivity(Intent.createChooser(intent, ctx.getString(R.string.tit_share)));
    }
}