// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class QueryRespackageBalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 抵扣资源包的量价商品码
    @NameInMap("deduct_product_code")
    @Validation(required = true)
    public String deductProductCode;

    // 业务时间(不同时间余量不一样)
    @NameInMap("gmt_service")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtService;

    public static QueryRespackageBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRespackageBalanceRequest self = new QueryRespackageBalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRespackageBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRespackageBalanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryRespackageBalanceRequest setDeductProductCode(String deductProductCode) {
        this.deductProductCode = deductProductCode;
        return this;
    }
    public String getDeductProductCode() {
        return this.deductProductCode;
    }

    public QueryRespackageBalanceRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

}
