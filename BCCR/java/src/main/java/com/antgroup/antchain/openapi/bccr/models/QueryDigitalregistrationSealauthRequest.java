// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDigitalregistrationSealauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    public static QueryDigitalregistrationSealauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalregistrationSealauthRequest self = new QueryDigitalregistrationSealauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalregistrationSealauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalregistrationSealauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalregistrationSealauthRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

}
