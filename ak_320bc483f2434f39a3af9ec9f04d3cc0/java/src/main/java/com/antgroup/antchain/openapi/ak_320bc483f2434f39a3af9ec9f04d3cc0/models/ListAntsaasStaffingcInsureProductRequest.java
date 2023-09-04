// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class ListAntsaasStaffingcInsureProductRequest extends TeaModel {
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

    // 保险场景码: 
    // FLEXIBLE_EMPLOYMENT-日单（实时生效）
    // INITIATIVE_EMPLOYMENT-长期（次日0点生效）
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 险种编码:
    //  ACCIDENT: 意外险
    //  EMPLOYER_LIABILITY: 雇主险
    @NameInMap("insurance_type_code")
    @Validation(required = true)
    public String insuranceTypeCode;

    public static ListAntsaasStaffingcInsureProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntsaasStaffingcInsureProductRequest self = new ListAntsaasStaffingcInsureProductRequest();
        return TeaModel.build(map, self);
    }

    public ListAntsaasStaffingcInsureProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntsaasStaffingcInsureProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntsaasStaffingcInsureProductRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ListAntsaasStaffingcInsureProductRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public ListAntsaasStaffingcInsureProductRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ListAntsaasStaffingcInsureProductRequest setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

}
