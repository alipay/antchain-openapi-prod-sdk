// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcApplicantPersonInfo extends TeaModel {
    // 如果合作方传输，会在我行H5进件页面反显展示
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

    public static EcApplicantPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        EcApplicantPersonInfo self = new EcApplicantPersonInfo();
        return TeaModel.build(map, self);
    }

    public EcApplicantPersonInfo setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public EcApplicantPersonInfo setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

}
