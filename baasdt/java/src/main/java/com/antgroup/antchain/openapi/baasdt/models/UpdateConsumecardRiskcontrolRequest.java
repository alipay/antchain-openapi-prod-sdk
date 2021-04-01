// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateConsumecardRiskcontrolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否加值(false为减)
    @NameInMap("add")
    @Validation(required = true)
    public Boolean add;

    // 调整金额(元)
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    public static UpdateConsumecardRiskcontrolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumecardRiskcontrolRequest self = new UpdateConsumecardRiskcontrolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumecardRiskcontrolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateConsumecardRiskcontrolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateConsumecardRiskcontrolRequest setAdd(Boolean add) {
        this.add = add;
        return this;
    }
    public Boolean getAdd() {
        return this.add;
    }

    public UpdateConsumecardRiskcontrolRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public UpdateConsumecardRiskcontrolRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

}
