// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请ID
    @NameInMap("digital_register_id")
    public String digitalRegisterId;

    // 客户端幂等号
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest self = new CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public CreateapplyformsealflowCopyrightregistrationDigitalregistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
