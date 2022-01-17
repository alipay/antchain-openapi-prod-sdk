// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiTestRspVO extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // cost
    @NameInMap("cost")
    public Long cost;

    // size
    @NameInMap("size")
    public Long size;

    // payload
    @NameInMap("payload")
    public String payload;

    // headers
    @NameInMap("headers")
    public java.util.List<ApiTestParamVO> headers;

    public static ApiTestRspVO build(java.util.Map<String, ?> map) throws Exception {
        ApiTestRspVO self = new ApiTestRspVO();
        return TeaModel.build(map, self);
    }

    public ApiTestRspVO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApiTestRspVO setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public ApiTestRspVO setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ApiTestRspVO setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public ApiTestRspVO setHeaders(java.util.List<ApiTestParamVO> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<ApiTestParamVO> getHeaders() {
        return this.headers;
    }

}
