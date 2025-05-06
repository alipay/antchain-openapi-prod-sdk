// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryReverseCommissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 案件号-外部唯一
    @NameInMap("out_case_no")
    @Validation(required = true)
    public String outCaseNo;

    // 委托的保司ID
    @NameInMap("entrust_insurance_company_id")
    @Validation(required = true)
    public String entrustInsuranceCompanyId;

    public static QueryReverseCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReverseCommissionRequest self = new QueryReverseCommissionRequest();
        return TeaModel.build(map, self);
    }

    public QueryReverseCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryReverseCommissionRequest setOutCaseNo(String outCaseNo) {
        this.outCaseNo = outCaseNo;
        return this;
    }
    public String getOutCaseNo() {
        return this.outCaseNo;
    }

    public QueryReverseCommissionRequest setEntrustInsuranceCompanyId(String entrustInsuranceCompanyId) {
        this.entrustInsuranceCompanyId = entrustInsuranceCompanyId;
        return this;
    }
    public String getEntrustInsuranceCompanyId() {
        return this.entrustInsuranceCompanyId;
    }

}
