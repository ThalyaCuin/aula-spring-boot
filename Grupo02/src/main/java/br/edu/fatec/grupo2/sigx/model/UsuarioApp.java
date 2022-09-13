package br.edu.fatec.grupo2.sigx.model;

import java.util.Collection; import java.util.UUID; import javax.persistence.Column; import javax.persistence.Entity; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id; import org.springframework.security.core.GrantedAuthority; import org.springframework.security.core.userdetails.UserDetails;
@Entity
public class UsuarioApp implements UserDetails{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;
    @Column(nullable=false, unique = true)
    private String userName;
    @Column (nullable=false)
    private String password;

    @Override public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    @Override public String getPassword() {
        return this.password;
    }
    @Override public String getUsername() {
        return this.userName;
    } @Override public boolean isAccountNonExpired() {
        return true;
    } @Override public boolean isAccountNonLocked() {
        return true;
    }
    @Override public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override public boolean isEnabled() {
        return true;
    }
}