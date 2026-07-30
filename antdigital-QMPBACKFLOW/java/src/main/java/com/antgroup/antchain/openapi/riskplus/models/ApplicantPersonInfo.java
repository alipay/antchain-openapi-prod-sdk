// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplicantPersonInfo extends TeaModel {
    // 申请人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("applicant_name")
    public String applicantName;

    // 申请人身份证号码
    /**
     * <strong>example:</strong>
     * <p>6230582100000003260</p>
     */
    @NameInMap("id_no")
    public String idNo;

    public static ApplicantPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplicantPersonInfo self = new ApplicantPersonInfo();
        return TeaModel.build(map, self);
    }

    public ApplicantPersonInfo setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public ApplicantPersonInfo setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

}
