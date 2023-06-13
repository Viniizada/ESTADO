class EstadoC implements Estado {
    @Override
    public void executarAcao(Contexto contexto) {
        System.out.println("Executando ação do Estado C.");
        contexto.definirEstado(new EstadoA()); // Transição para o próximo estado (volta ao EstadoA)
    }
}