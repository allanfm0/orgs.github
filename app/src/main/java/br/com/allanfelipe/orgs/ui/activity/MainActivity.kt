package br.com.allanfelipe.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.allanfelipe.orgs.R
import br.com.allanfelipe.orgs.model.Produto
import br.com.allanfelipe.orgs.ui.recyclerview.adapter.ListaDeProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaDeProdutosAdapter(
            context = this, produto = listOf(
                Produto(
                    nome = "Teste = 0",
                    descricao = "teste desc",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste = 1 ",
                    descricao = "teste desc 1 ",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste = 2 ",
                    descricao = "teste desc 2 ",
                    valor = BigDecimal("39.99")
                )
            )
        )
    }
}