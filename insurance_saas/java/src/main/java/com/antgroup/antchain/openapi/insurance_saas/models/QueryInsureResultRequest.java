// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryInsureResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 保险产品编码
    @NameInMap("trustworthy_value_insurance_type_code")
    @Validation(required = true)
    public String trustworthyValueInsuranceTypeCode;

    // 保司编码
    @NameInMap("insurance_company_no")
    @Validation(required = true)
    public String insuranceCompanyNo;

    // 通知单号,投保申请时会返回
    @NameInMap("notice_no")
    @Validation(required = true)
    public String noticeNo;

    public static QueryInsureResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsureResultRequest self = new QueryInsureResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsureResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsureResultRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public QueryInsureResultRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public QueryInsureResultRequest setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
        return this;
    }
    public String getNoticeNo() {
        return this.noticeNo;
    }

}
