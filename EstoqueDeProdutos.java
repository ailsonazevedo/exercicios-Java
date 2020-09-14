package com.company;

public class EstoqueDeProdutos {

    private String NomeDoProduto;
    private int NumeroDoLote;
    private int PrecoDeCompra;
    private int PrecoDeVenda;
    public String MarcaDoProduto;

    public String getNomeDoProduto() {
        return this.NomeDoProduto;
    }

    public void setNomeDoProduto(String nProduto) {
        NomeDoProduto = nProduto;
    }

    public int getNumeroDoLote() {
        return this.NumeroDoLote;
    }

    public void setNumeroDoLote(int numeroDoLote) {
        NumeroDoLote = numeroDoLote;
    }

    public int getPrecoDeCompra() {
        return this.PrecoDeCompra;
    }

    public void setPrecoDeCompra(int precoDeCompra) {
        PrecoDeCompra = precoDeCompra;
    }

    public int getPrecoDeVenda() {
        return this.PrecoDeVenda;
    }

    public void setPrecoDeVenda(int precoDeVenda) {
        PrecoDeVenda = precoDeVenda;
    }


    public String getMarcaDoProduto() {
        return this.MarcaDoProduto;
    }

    public void setMarcaDoProduto(String marcaDoProduto) {
        MarcaDoProduto = marcaDoProduto;
    }

    public void estoque(){
        System.out.println("Produto:" + this.getNomeDoProduto());
        System.out.println("Marca: " + this.getMarcaDoProduto());
        System.out.println("Lote: " + this.getNumeroDoLote());
        System.out.println("Preço de compra: " + this.getPrecoDeCompra());
        System.out.println("Preço de venda: " + this.getPrecoDeVenda());


    }


}
