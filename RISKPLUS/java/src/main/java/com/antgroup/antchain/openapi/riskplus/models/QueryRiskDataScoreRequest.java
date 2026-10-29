// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRiskDataScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 产品码
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    // 必要入参
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 二级租户
    @NameInMap("sub_tenant")
    @Validation(required = true)
    public String subTenant;

    // 业务唯一标准
    @NameInMap("biz_unique_id")
    public String bizUniqueId;

    // 加密方式
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // 测试标识
    @NameInMap("event_data_type")
    @Validation(required = true)
    public String eventDataType;

    public static QueryRiskDataScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskDataScoreRequest self = new QueryRiskDataScoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskDataScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskDataScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskDataScoreRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryRiskDataScoreRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public QueryRiskDataScoreRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryRiskDataScoreRequest setSubTenant(String subTenant) {
        this.subTenant = subTenant;
        return this;
    }
    public String getSubTenant() {
        return this.subTenant;
    }

    public QueryRiskDataScoreRequest setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public QueryRiskDataScoreRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public QueryRiskDataScoreRequest setEventDataType(String eventDataType) {
        this.eventDataType = eventDataType;
        return this;
    }
    public String getEventDataType() {
        return this.eventDataType;
    }

}
