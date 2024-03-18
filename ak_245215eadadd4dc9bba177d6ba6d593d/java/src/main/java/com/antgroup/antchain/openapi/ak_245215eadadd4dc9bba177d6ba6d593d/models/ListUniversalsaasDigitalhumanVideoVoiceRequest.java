// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanVideoVoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static ListUniversalsaasDigitalhumanVideoVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanVideoVoiceRequest self = new ListUniversalsaasDigitalhumanVideoVoiceRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanVideoVoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanVideoVoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
