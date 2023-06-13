class EstadoB implements Estado {
    @Override
    public void executarAcao(Contexto contexto) {
        System.out.println("Executando ação do Estado B.");
        contexto.definirEstado(new EstadoC()); // Transição para o próximo estado
    }
}