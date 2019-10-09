package com.example.mercadoabierto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.contendedordeproducto);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ProveedorDeProductos proveedorDeProductos = new ProveedorDeProductos();

        List<Producto> productoslist = proveedorDeProductos.getProducto();

        ProductoAdapter productoAdapter = new  ProductoAdapter(productoslist);

        recyclerView.setAdapter(productoAdapter);
    }

}

