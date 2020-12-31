package com.free.project1.main.services.usuario;

import java.util.ArrayList;
import java.util.List;

import com.free.project1.main.interfaces.usuario.IUsuario;
import com.free.project1.main.model.usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuarios // implements UserDetailsServ 
{

    // @Autowired
    // private IUser repo;

    // @Override
    // public UserDetails loadUserByUsername(String username) throws
    // UsernameNotFoundException {

    // User user = repo.findByUsername(username);
    // List<GrantedAuthority> roles = new ArrayList<>();

    // // roles.add(new SimpleGrantedAuthority("ADMIN"));

    // UserDetails details = new
    // org.springframework.security.core.userdetails.User(user.getUsername(),
    // user.getPassword(), roles);
    // return details;
    // }

}
