package br.com.noguez;

public class ListaEncadeada<T> {

    No<T> referenciEntrada;

    public ListaEncadeada() {
        this.referenciEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()) {
            referenciEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciEntrada;
        for(int i=0; i< this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validarIndice(index);
        No<T> noAuxiliar = referenciEntrada;
        No<T> noRetorno = null;

        for(int i=0; i<= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {
        No<T> no = this.getNo(index);
        if(index == 0) {
            referenciEntrada = no.getProximoNo();
            return no.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(no.getProximoNo());
        return no.getConteudo();
    }

    private void validarIndice(int index) {
        if(index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciEntrada;
        while (true) {
            if(referenciaAuxiliar != null) {
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = referenciEntrada;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno += "null";

        return stringRetorno;
    }
}
