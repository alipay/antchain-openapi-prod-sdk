// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeleteIifaaDigitalkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 业务参数
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    public static DeleteIifaaDigitalkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIifaaDigitalkeyRequest self = new DeleteIifaaDigitalkeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIifaaDigitalkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIifaaDigitalkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIifaaDigitalkeyRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public DeleteIifaaDigitalkeyRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

}
