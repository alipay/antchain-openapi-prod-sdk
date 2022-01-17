// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwAuthenticationVO extends TeaModel {
    // 		
    // access key
    // 
    // 
    @NameInMap("auth_access_key")
    public String authAccessKey;

    // secret key
    @NameInMap("auth_secret_key")
    public String authSecretKey;

    // id
    @NameInMap("id")
    public Long id;

    public static SofaGwAuthenticationVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwAuthenticationVO self = new SofaGwAuthenticationVO();
        return TeaModel.build(map, self);
    }

    public SofaGwAuthenticationVO setAuthAccessKey(String authAccessKey) {
        this.authAccessKey = authAccessKey;
        return this;
    }
    public String getAuthAccessKey() {
        return this.authAccessKey;
    }

    public SofaGwAuthenticationVO setAuthSecretKey(String authSecretKey) {
        this.authSecretKey = authSecretKey;
        return this;
    }
    public String getAuthSecretKey() {
        return this.authSecretKey;
    }

    public SofaGwAuthenticationVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
