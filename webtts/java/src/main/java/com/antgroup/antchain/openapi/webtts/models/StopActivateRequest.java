// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class StopActivateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部客户id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    // 备注
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static StopActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        StopActivateRequest self = new StopActivateRequest();
        return TeaModel.build(map, self);
    }

    public StopActivateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopActivateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopActivateRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public StopActivateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
