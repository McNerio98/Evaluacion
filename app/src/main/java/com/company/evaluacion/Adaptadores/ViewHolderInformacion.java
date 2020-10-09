package com.company.evaluacion.Adaptadores;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.evaluacion.R;

public class ViewHolderInformacion extends RecyclerView.ViewHolder{
    private TextView lblIndex;
    private TextView lblName;
    private TextView lblCode;
    private  TextView lblSubject;
    private TextView lblPromedio;

    public ViewHolderInformacion(@NonNull View itemView) {
        super(itemView);
        this.lblIndex = itemView.findViewById(R.id.lblIndex);
        this.lblName = itemView.findViewById(R.id.lblName);
        this.lblCode = itemView.findViewById(R.id.lblCode);
        this.lblSubject = itemView.findViewById(R.id.lblSubject);
        this.lblPromedio = itemView.findViewById(R.id.lblPromedio);
    }

    public TextView getLblIndex() {
        return lblIndex;
    }

    public void setLblIndex(TextView lblIndex) {
        this.lblIndex = lblIndex;
    }

    public TextView getLblName() {
        return lblName;
    }

    public void setLblName(TextView lblName) {
        this.lblName = lblName;
    }

    public TextView getLblCode() {
        return lblCode;
    }

    public void setLblCode(TextView lblCode) {
        this.lblCode = lblCode;
    }

    public TextView getLblSubject() {
        return lblSubject;
    }

    public void setLblSubject(TextView lblSubject) {
        this.lblSubject = lblSubject;
    }

    public TextView getLblPromedio() {
        return lblPromedio;
    }

    public void setLblPromedio(TextView lblPromedio) {
        this.lblPromedio = lblPromedio;
    }
}
