package br.com.allanfelipe.orgs.dao

import br.com.allanfelipe.orgs.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }
    fun buscaTodos() : List<Produto>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}