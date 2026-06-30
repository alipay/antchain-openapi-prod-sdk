// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dci.models;

import com.aliyun.tea.*;

public class QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    public static QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest self = new QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest();
        return TeaModel.build(map, self);
    }

    public QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryapplyformsealurlBlockchainBccrCopyrightregistrationDigitalregistrationRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

}
