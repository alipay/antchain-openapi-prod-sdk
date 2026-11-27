// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.idproofing.models;

import com.aliyun.tea.*;

public class CallbackZolozidRaasIdproofingWebhookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static CallbackZolozidRaasIdproofingWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackZolozidRaasIdproofingWebhookRequest self = new CallbackZolozidRaasIdproofingWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CallbackZolozidRaasIdproofingWebhookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackZolozidRaasIdproofingWebhookRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
