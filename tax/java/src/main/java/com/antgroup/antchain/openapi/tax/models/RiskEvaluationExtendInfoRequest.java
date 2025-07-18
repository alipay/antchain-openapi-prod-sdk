// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class RiskEvaluationExtendInfoRequest extends TeaModel {
    // 协议集合
    @NameInMap("agreement_list")
    @Validation(required = true)
    public java.util.List<RiskEvaluationAgreementExtRequest> agreementList;

    // 地区请求
    /**
     * <strong>example:</strong>
     * <p>地区请求</p>
     */
    @NameInMap("district_ext")
    @Validation(required = true)
    public RiskEvaluationDistrictExtRequest districtExt;

    public static RiskEvaluationExtendInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RiskEvaluationExtendInfoRequest self = new RiskEvaluationExtendInfoRequest();
        return TeaModel.build(map, self);
    }

    public RiskEvaluationExtendInfoRequest setAgreementList(java.util.List<RiskEvaluationAgreementExtRequest> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<RiskEvaluationAgreementExtRequest> getAgreementList() {
        return this.agreementList;
    }

    public RiskEvaluationExtendInfoRequest setDistrictExt(RiskEvaluationDistrictExtRequest districtExt) {
        this.districtExt = districtExt;
        return this;
    }
    public RiskEvaluationDistrictExtRequest getDistrictExt() {
        return this.districtExt;
    }

}
