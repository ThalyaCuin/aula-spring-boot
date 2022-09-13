package br.edu.fatec.grupo2.sigx.model;

import java.util.Optional; import java.util.UUID; import org.springframework.data.jpa.repository.JpaRepository; import org.springframework.stereotype.Repository;
@Repository
public interface UserAppRepository extends JpaRepository<UsuarioApp, UUID>{
    Optional<UsuarioApp> findByUserName(String usarName);
}