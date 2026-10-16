// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class PushCustomerLogininfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("cust_no")
    @Validation(required = true)
    public String custNo;

    // 客户行为
    @NameInMap("action_info")
    @Validation(required = true)
    public String actionInfo;

    public static PushCustomerLogininfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCustomerLogininfoRequest self = new PushCustomerLogininfoRequest();
        return TeaModel.build(map, self);
    }

    public PushCustomerLogininfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushCustomerLogininfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushCustomerLogininfoRequest setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public PushCustomerLogininfoRequest setActionInfo(String actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }
    public String getActionInfo() {
        return this.actionInfo;
    }

}
