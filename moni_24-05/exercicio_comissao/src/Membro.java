public class Membro {
    private String nome;
    // Ex: BP111111-2
    private String campus;
    private int prontuario;

    //** Construtor */
    public Membro(String nome, String campus, int prontuario) {
        this.nome = nome;
        this.campus = campus;
        this.prontuario = prontuario;
    }

    //** Getters e Setters */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCampus() {
        return campus;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }
    public int getProntuario() {
        return prontuario;
    }
    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        // Ex: Servidor Nome do Servidor - BP12345-1
        return "Servidor" + this.nome + "-" + formatarProntuario();
        
    }

    private String formatarProntuario() {
        // --- Formatar o prontuário ---
        // 1. Converter o prontuário de int para String
        String prontuarioStr = String.valueOf(this.prontuario); 

        // 2. Extrair o último digito do protunário
        char ultimoNum = prontuarioStr.charAt(
             prontuarioStr.length() - 1
        );

        // 3. Adicionar um traço para formar o digito
        String digito = "-" + ultimoNum;

        // 4. Remover o último digito do prontuário que é String
        prontuarioStr = prontuarioStr.substring(0, prontuarioStr.length() - 1);

        // 5. Concatenar campus 
        // + prontuario sem o último número
        // + digito
        // Ex: BP2145-4
        return this.campus + prontuarioStr + digito;
    }
    
}
