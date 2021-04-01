// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class RemoveConsumecardCommissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 手续费类型（0:全局，1:商户）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 分类id（ffaaaaabbbbbb）
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static RemoveConsumecardCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveConsumecardCommissionRequest self = new RemoveConsumecardCommissionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveConsumecardCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveConsumecardCommissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RemoveConsumecardCommissionRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public RemoveConsumecardCommissionRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public RemoveConsumecardCommissionRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public RemoveConsumecardCommissionRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
