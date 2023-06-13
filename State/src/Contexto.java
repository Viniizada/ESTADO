class Contexto {
    private Estado estadoAtual;

    public Contexto() {
        estadoAtual = new EstadoA(); // Estado inicial
    }

    public void definirEstado(Estado estado) {
        estadoAtual = estado;
    }

    public void executarAcao() {
        estadoAtual.executarAcao(this);
    }
}