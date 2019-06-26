package com.example.katsavvebanav;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class finishDialog extends DialogFragment {

    interface MyDialogListener{
        void onOkBtnClicked();
    }

    MyDialogListener callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            callback = (MyDialogListener) context;
        }catch (ClassCastException ex){
            throw new ClassCastException("");
        }
    }

    @Nullable
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        String finish = getString(R.string.finish);
        String okBtn = getString(R.string.okSalad);
        String bonapatite = getString(R.string.bonapatite);
        builder.setTitle(finish).setMessage(bonapatite).setPositiveButton(okBtn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                callback.onOkBtnClicked();
            }
        });
        return builder.create();
    }
}