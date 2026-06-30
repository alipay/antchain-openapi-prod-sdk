// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dci.models;

import com.aliyun.tea.*;

public class QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    public static QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest self = new QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest();
        return TeaModel.build(map, self);
    }

    public QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryautosealauthBlockchainBccrCopyrightregistrationDigitalregistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

}
