// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class QueryAntsecuritytechGatewayEkytDriverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接口请求head
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 请求业务参数，加密之后的密文信息
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // 请求数据签名值
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static QueryAntsecuritytechGatewayEkytDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsecuritytechGatewayEkytDriverRequest self = new QueryAntsecuritytechGatewayEkytDriverRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsecuritytechGatewayEkytDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsecuritytechGatewayEkytDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsecuritytechGatewayEkytDriverRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public QueryAntsecuritytechGatewayEkytDriverRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public QueryAntsecuritytechGatewayEkytDriverRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
