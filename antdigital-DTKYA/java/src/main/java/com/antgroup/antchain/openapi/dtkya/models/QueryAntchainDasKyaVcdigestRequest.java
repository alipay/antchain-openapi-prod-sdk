// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaVcdigestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vcId
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static QueryAntchainDasKyaVcdigestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaVcdigestRequest self = new QueryAntchainDasKyaVcdigestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaVcdigestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaVcdigestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaVcdigestRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
