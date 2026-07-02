// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundAssertorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权id
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户的租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商家统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 异步生成文件任务流水号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryFundAssertorderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFundAssertorderRequest self = new QueryFundAssertorderRequest();
        return TeaModel.build(map, self);
    }

    public QueryFundAssertorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFundAssertorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFundAssertorderRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryFundAssertorderRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryFundAssertorderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryFundAssertorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryFundAssertorderRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
