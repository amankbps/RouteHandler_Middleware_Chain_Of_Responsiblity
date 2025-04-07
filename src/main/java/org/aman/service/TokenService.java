package org.aman.service;

import org.aman.dto.Request;

public interface TokenService {
    boolean validateToken(Request request);
}
