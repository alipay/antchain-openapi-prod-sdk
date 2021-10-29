// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class CreateTlsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 非对称加密算法
    @NameInMap("tls_algo")
    public String tlsAlgo;

    // 密码
    @NameInMap("password")
    public String password;

    // 封装格式
    @NameInMap("key_format")
    public String keyFormat;

    public static CreateTlsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTlsRequest self = new CreateTlsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTlsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTlsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTlsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateTlsRequest setTlsAlgo(String tlsAlgo) {
        this.tlsAlgo = tlsAlgo;
        return this;
    }
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

    public CreateTlsRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTlsRequest setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
        return this;
    }
    public String getKeyFormat() {
        return this.keyFormat;
    }

}
