// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudBillingRespackageBalanceRequest extends TeaModel {
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

    public static QueryAntcloudBillingRespackageBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudBillingRespackageBalanceRequest self = new QueryAntcloudBillingRespackageBalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudBillingRespackageBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudBillingRespackageBalanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudBillingRespackageBalanceRequest setDeductProductCode(String deductProductCode) {
        this.deductProductCode = deductProductCode;
        return this;
    }
    public String getDeductProductCode() {
        return this.deductProductCode;
    }

    public QueryAntcloudBillingRespackageBalanceRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

}
