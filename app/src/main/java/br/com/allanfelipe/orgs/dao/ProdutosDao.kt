package br.com.allanfelipe.orgs.dao

import br.com.allanfelipe.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Salada De Fruta",
                descricao = "Laranja, maça e uva",
                valor = BigDecimal("19.99")
            )

        )
    }

}