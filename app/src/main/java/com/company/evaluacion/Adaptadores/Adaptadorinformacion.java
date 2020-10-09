package com.company.evaluacion.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.evaluacion.R;

import java.util.List;

public class Adaptadorinformacion extends RecyclerView.Adapter<ViewHolderInformacion>{
    private List<Estudiante> listInfotmation;

    public Adaptadorinformacion(List<Estudiante> lst){
        this.listInfotmation = lst;
    }

    @NonNull
    @Override
    public ViewHolderInformacion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_student,parent,false);
        ViewHolderInformacion vhinfo = new ViewHolderInformacion(vista);
        return vhinfo;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderInformacion holder, int position) {
        holder.getLblIndex().setText(String.valueOf(position + 1));
        holder.getLblName().setText(this.listInfotmation.get(position).getNombre());
        holder.getLblCode().setText(this.listInfotmation.get(position).getCodigo());
        holder.getLblSubject().setText(this.listInfotmation.get(position).getMateria());
        holder.getLblPromedio().setText(this.listInfotmation.get(position).CalcPromedio());

    }

    @Override
    public int getItemCount() {
        return this.listInfotmation.size();
    }
}
