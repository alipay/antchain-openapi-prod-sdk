// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dci.models;

import com.aliyun.tea.*;

public class QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public Long digitalRegisterId;

    public static QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest self = new QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest();
        return TeaModel.build(map, self);
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationRequest setDigitalRegisterId(Long digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public Long getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

}
