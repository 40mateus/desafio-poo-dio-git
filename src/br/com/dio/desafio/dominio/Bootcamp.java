import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Conteudo> getConteudos() { return conteudos; }
    public void setConteudos(Set<Conteudo> conteudos) { this.conteudos = conteudos; }

    public Set<Dev> getDevsInscritos() { return devsInscritos; }
    public void setDevsInscritos(Set<Dev> devsInscritos) { this.devsInscritos = devsInscritos; }
}
