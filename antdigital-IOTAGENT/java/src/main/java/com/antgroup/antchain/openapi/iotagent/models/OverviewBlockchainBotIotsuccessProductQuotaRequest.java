// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OverviewBlockchainBotIotsuccessProductQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    public static OverviewBlockchainBotIotsuccessProductQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        OverviewBlockchainBotIotsuccessProductQuotaRequest self = new OverviewBlockchainBotIotsuccessProductQuotaRequest();
        return TeaModel.build(map, self);
    }

    public OverviewBlockchainBotIotsuccessProductQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
