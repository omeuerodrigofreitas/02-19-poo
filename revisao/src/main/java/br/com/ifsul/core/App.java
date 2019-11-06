package br.com.ifsul.core;

import br.com.ifsul.core.model.Bairro;
import br.com.ifsul.core.model.Endereco;
import br.com.ifsul.core.model.Grupo;
import br.com.ifsul.core.model.Pessoa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        
        Bairro meuBairro = new Bairro("Centro");
        Endereco meuEndereco = new Endereco("pretro caxias", meuBairro);
        
        Pessoa minhaPessoa = new Pessoa("XPTO", meuEndereco);
        Grupo meuGrupo = new Grupo("Grupo 2", minhaPessoa);
    



    System.out.println( "A pessoa " + 
        meuGrupo.getPessoa().getNome() + 
    " faz parte do grupo " + meuGrupo.getNome() + 
    " que eh do bairro " + meuGrupo.getPessoa()
        .getEndereco().getBairro().getNome());

    }
}
