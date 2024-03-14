package uk.hilsamlabs;

import org.springframework.http.*;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
