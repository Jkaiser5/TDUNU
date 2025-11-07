package POLYGLOT.MS.TEST.Security.service.Impl;

import java.util.List;
import java.util.stream.Collectors;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import POLYGLOT.MS.TEST.Security.model.AccessModel;
import POLYGLOT.MS.TEST.Security.repository.IAuthRepository;
import POLYGLOT.MS.TEST.Security.service.AuthService;
import jakarta.security.auth.message.AuthException;


@Service
public class AuthServiceImpl implements AuthService{
    
    @Autowired
    IAuthRepository authRepository;
   
    public List<AccessModel>  getAcces() {       
        return (List<AccessModel>) authRepository.findAll();
    }
        
    public Boolean validatedCredentials(String UserName, String Password) throws AuthException {        
        List<AccessModel> result = (List<AccessModel>) authRepository.findAll();
        List<AccessModel> resultFilter = result.stream()
                .filter(t -> t.getUsername().equals(UserName) && t.getPassword().equals(Password))
                .collect(Collectors.toList());

        if (resultFilter == null || resultFilter.isEmpty()) {
            throw new AuthException ("Credenciales invalidas; Usuario co ontraseña incorrectos");
        }
        return true;
    }  


}
