package Spring.Boot.desafio.CadProdutos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.Boot.desafio.CadProdutos.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    

}
