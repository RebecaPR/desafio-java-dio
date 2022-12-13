package OrientacaoObjetos.Desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.print("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Set<Conteudo> return the conteudosInscritos
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * @param conteudosInscritos the conteudosInscritos to set
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * @return Set<Conteudo> return the conteudosConcluidos
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * @param conteudosConcluidos the conteudosConcluidos to set
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev =(Dev) o;
        return Objects.equals(nome, dev.nome)&& Objects.equals(conteudosInscritos, dev.conteudosInscritos)&& Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);

    @Override
    public final int hashCode(){
        return Objects.hash(nome,conteudosInscritos,conteudosConcluidos);
    }

    }

}
