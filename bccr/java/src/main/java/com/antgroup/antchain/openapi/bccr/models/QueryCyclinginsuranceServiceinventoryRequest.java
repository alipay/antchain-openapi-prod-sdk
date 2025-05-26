// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryCyclinginsuranceServiceinventoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 请求id，用于链路追踪，如uuid
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 调用方
    @NameInMap("caller_app_name")
    @Validation(required = true)
    public String callerAppName;

    // 服务商账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 商品code
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 商品属性
    @NameInMap("item_attributes")
    @Validation(required = true)
    public String itemAttributes;

    public static QueryCyclinginsuranceServiceinventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCyclinginsuranceServiceinventoryRequest self = new QueryCyclinginsuranceServiceinventoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryCyclinginsuranceServiceinventoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setCallerAppName(String callerAppName) {
        this.callerAppName = callerAppName;
        return this;
    }
    public String getCallerAppName() {
        return this.callerAppName;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public QueryCyclinginsuranceServiceinventoryRequest setItemAttributes(String itemAttributes) {
        this.itemAttributes = itemAttributes;
        return this;
    }
    public String getItemAttributes() {
        return this.itemAttributes;
    }

}
