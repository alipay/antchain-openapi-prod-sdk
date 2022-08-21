// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetDciRegistrationcertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci内容id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 幂等字段
    @NameInMap("client_token")
    public String clientToken;

    public static GetDciRegistrationcertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDciRegistrationcertRequest self = new GetDciRegistrationcertRequest();
        return TeaModel.build(map, self);
    }

    public GetDciRegistrationcertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDciRegistrationcertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDciRegistrationcertRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public GetDciRegistrationcertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
