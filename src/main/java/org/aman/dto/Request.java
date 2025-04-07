package org.aman.dto;

import java.util.Objects;
import java.util.Optional;

public class Request {
    private String requestType;
    private String route;
    private Optional<Objects>body;
}
