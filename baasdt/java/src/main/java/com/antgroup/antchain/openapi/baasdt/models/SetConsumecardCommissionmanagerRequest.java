// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardCommissionmanagerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 手续费管理员账户
    @NameInMap("set_account_id")
    public String setAccountId;

    public static SetConsumecardCommissionmanagerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardCommissionmanagerRequest self = new SetConsumecardCommissionmanagerRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardCommissionmanagerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardCommissionmanagerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardCommissionmanagerRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SetConsumecardCommissionmanagerRequest setSetAccountId(String setAccountId) {
        this.setAccountId = setAccountId;
        return this;
    }
    public String getSetAccountId() {
        return this.setAccountId;
    }

}
