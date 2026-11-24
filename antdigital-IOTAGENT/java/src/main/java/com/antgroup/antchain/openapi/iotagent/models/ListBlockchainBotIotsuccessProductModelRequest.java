// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static ListBlockchainBotIotsuccessProductModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductModelRequest self = new ListBlockchainBotIotsuccessProductModelRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListBlockchainBotIotsuccessProductModelRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
