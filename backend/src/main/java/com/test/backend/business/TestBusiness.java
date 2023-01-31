package com.test.backend.business;

import com.test.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
public class TestBusiness {

    public String register(MRegisterRequest request) throws Exception{
        if(request == null){
            throw new IOException("null request");
        }
        if (Objects.isNull(request.getEmail())){
            throw new IOException("null email");
        }

        //validate...

        return "";
    }

}
