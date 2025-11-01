package POLYGLOT.MS.TEST.Security.service;

import java.util.List;
import java.util.Optional;

import POLYGLOT.MS.TEST.Security.model.AccessModel;

public interface AuthService {

    List<AccessModel> findAll();

    Optional<AccessModel> findById(int id);

    Boolean validatedCredentials (String UserName, String Password);

    List<AccessModel> getAcces();
}