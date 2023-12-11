package br.com.allanfelipe.orgs.ui.activity

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.allanfelipe.orgs.R
import br.com.allanfelipe.orgs.model.Produto
import br.com.allanfelipe.orgs.ui.recyclerview.adapter.ListaDeProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta De Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, Maça e manga"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
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
            ))
    }
}