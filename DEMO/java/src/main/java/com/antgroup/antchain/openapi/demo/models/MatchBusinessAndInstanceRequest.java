// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class MatchBusinessAndInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // L5
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 实例
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    public static MatchBusinessAndInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchBusinessAndInstanceRequest self = new MatchBusinessAndInstanceRequest();
        return TeaModel.build(map, self);
    }

    public MatchBusinessAndInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchBusinessAndInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchBusinessAndInstanceRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public MatchBusinessAndInstanceRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

}
