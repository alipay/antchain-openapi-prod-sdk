// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcInsurePriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 统一社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 产品ID
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 职业编码: 
    // default-1-一类职业;
    // default-2-二类职业;
    // default-3-三类职业;
    // default-4-四类职业;
    @NameInMap("job_code")
    @Validation(required = true)
    public String jobCode;

    // 周期：
    // 1D、
    // 30D、
    // 360D
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    public static QueryAntsaasStaffingcInsurePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcInsurePriceRequest self = new QueryAntsaasStaffingcInsurePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcInsurePriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public QueryAntsaasStaffingcInsurePriceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}
