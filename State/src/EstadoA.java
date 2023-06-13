class EstadoA implements Estado {
    @Override
    public void executarAcao(Contexto contexto) {
        System.out.println("Executando ação do Estado A.");
        contexto.definirEstado(new EstadoB()); // Transição para o próximo estado
    }
}