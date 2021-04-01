// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveMydidIdaasDidserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static SaveMydidIdaasDidserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMydidIdaasDidserviceRequest self = new SaveMydidIdaasDidserviceRequest();
        return TeaModel.build(map, self);
    }

    public SaveMydidIdaasDidserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveMydidIdaasDidserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveMydidIdaasDidserviceRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
