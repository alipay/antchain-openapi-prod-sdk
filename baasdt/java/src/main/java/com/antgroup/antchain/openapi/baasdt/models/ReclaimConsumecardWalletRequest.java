// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReclaimConsumecardWalletRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回退金额(元)
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 角色(1 机构, 2 个人)
    @NameInMap("role_type")
    @Validation(required = true)
    public Long roleType;

    public static ReclaimConsumecardWalletRequest build(java.util.Map<String, ?> map) throws Exception {
        ReclaimConsumecardWalletRequest self = new ReclaimConsumecardWalletRequest();
        return TeaModel.build(map, self);
    }

    public ReclaimConsumecardWalletRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReclaimConsumecardWalletRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReclaimConsumecardWalletRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public ReclaimConsumecardWalletRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public ReclaimConsumecardWalletRequest setRoleType(Long roleType) {
        this.roleType = roleType;
        return this;
    }
    public Long getRoleType() {
        return this.roleType;
    }

}
