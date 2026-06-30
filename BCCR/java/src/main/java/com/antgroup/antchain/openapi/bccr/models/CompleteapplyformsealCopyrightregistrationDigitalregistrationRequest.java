// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    public static CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest self = new CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest();
        return TeaModel.build(map, self);
    }

    public CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CompleteapplyformsealCopyrightregistrationDigitalregistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

}
