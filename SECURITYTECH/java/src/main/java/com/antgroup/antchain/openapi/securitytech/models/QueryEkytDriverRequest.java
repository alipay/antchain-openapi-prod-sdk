// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEkytDriverRequest extends TeaModel {
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

    public static QueryEkytDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEkytDriverRequest self = new QueryEkytDriverRequest();
        return TeaModel.build(map, self);
    }

    public QueryEkytDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEkytDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEkytDriverRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public QueryEkytDriverRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public QueryEkytDriverRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
