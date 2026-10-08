// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class StopAntdigitalWebttsActivateRequest extends TeaModel {
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

    public static StopAntdigitalWebttsActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAntdigitalWebttsActivateRequest self = new StopAntdigitalWebttsActivateRequest();
        return TeaModel.build(map, self);
    }

    public StopAntdigitalWebttsActivateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopAntdigitalWebttsActivateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopAntdigitalWebttsActivateRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public StopAntdigitalWebttsActivateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
