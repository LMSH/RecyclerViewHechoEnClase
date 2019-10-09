package com.example.mercadoabierto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter {

    private List<Producto> productosList;

    public ProductoAdapter(List<Producto> productosList) {
        this.productosList = productosList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //1.Traer inflador.
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());

        //2.Inflar la vista.
        View view = inflador.inflate(R.layout.celda_producto, parent,false);

        //3.Instanciar la clase ProductoViewHolder (inner class).
        ProductoViewHolder productoViewHolder = new ProductoViewHolder(view);

        return productoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductoViewHolder productoViewHolder = (ProductoViewHolder) holder;
        Producto producto = productosList.get(position);
        productoViewHolder.bind(producto);
    }

    @Override
    public int getItemCount() {
        return productosList.size();
    }


    private class ProductoViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView descripcion;
       // private ImageView imagen;

        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombredelproducto);
            descripcion = itemView.findViewById(R.id.descripciondelproducto);
            //imagen = itemView.findViewById(R.id.imagendelproducto);

        }

        public void bind (Producto unProducto){
            nombre.setText(unProducto.getNombre());
            descripcion.setText(unProducto.getDescripción());
           // imagen.setImageResource(unProducto.getImagen());

        }
    }

}
