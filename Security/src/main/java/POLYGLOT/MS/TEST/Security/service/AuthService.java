package POLYGLOT.MS.TEST.Security.service;

import java.util.List;

import POLYGLOT.MS.TEST.Security.model.AccessModel;
import jakarta.security.auth.message.AuthException;

public interface AuthService {

    Boolean validatedCredentials (String UserName, String Password) throws AuthException;

    List<AccessModel> getAcces();


}