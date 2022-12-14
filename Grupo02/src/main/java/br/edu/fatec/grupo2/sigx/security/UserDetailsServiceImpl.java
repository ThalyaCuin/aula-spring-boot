package br.edu.fatec.grupo2.sigx.security;

import br.edu.fatec.grupo2.sigx.model.UserAppRepository;
import br.edu.fatec.grupo2.sigx.model.UsuarioApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    UserAppRepository repository;
    /*
     * recebe o username e consulta no banco de dados as credenciais de autenticacao
     */
    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioApp userApp = repository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado =>" + username));
        return userApp;
    }
}