// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryOpenchainUserDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户code
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户code
    @NameInMap("merchant_code")
    @Validation(required = true)
    public String merchantCode;

    // 网站sitid
    @NameInMap("websit_id")
    @Validation(required = true)
    public String websitId;

    // 查询的开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 查询的截止时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static QueryOpenchainUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenchainUserDataRequest self = new QueryOpenchainUserDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpenchainUserDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpenchainUserDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOpenchainUserDataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryOpenchainUserDataRequest setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
        return this;
    }
    public String getMerchantCode() {
        return this.merchantCode;
    }

    public QueryOpenchainUserDataRequest setWebsitId(String websitId) {
        this.websitId = websitId;
        return this;
    }
    public String getWebsitId() {
        return this.websitId;
    }

    public QueryOpenchainUserDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryOpenchainUserDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
