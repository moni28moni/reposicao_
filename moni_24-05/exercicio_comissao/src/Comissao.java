import java.util.ArrayList;
import java.util.Iterator;

public class Comissao {
    private ArrayList<Membro> membros;
    private String portaria;

    //** Construtor */
    public Comissao(String portaria) {
        this.membros = new ArrayList<>();
        this.portaria = portaria;
    }

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }
    
    // pesquisar se a pessoa faz parte dela peloseu nome;
    public Membro pesquisarMembroPorNome(String nomeBusca){
        Iterator<Membro> it = this.membros.iterator();
        while(it.hasNext()){
            Membro membro = it.next();
            if(membro.getNome().contains(nomeBusca)){
                return membro;
            }
        }
        return null;
    }

    // Imprimir a lista de todos os membros da comissão;
    public void listaTodosOsMembros(){
        Iterator<Membro> it = this.membros.iterator();
        System.out.println("--- Lista de todos os membros ---");
        while(it.hasNext()){
            Membro membro = it.next();
            System.out.println(membro);
        }
    }

    // Adicionar novas pessoas na comissão;
    public void adicionaMembro(Membro novoMembro){
        membros.add(novoMembro);
    }
    
}
