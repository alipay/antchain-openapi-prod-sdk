// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ThreeAntchainDasKyaRealenterpriseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业登记名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 企业登记证件号
    @NameInMap("enterprise_cert_no")
    @Validation(required = true)
    public String enterpriseCertNo;

    // 法定代表人姓名
    @NameInMap("legal_person_name")
    @Validation(required = true)
    public String legalPersonName;

    public static ThreeAntchainDasKyaRealenterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        ThreeAntchainDasKyaRealenterpriseRequest self = new ThreeAntchainDasKyaRealenterpriseRequest();
        return TeaModel.build(map, self);
    }

    public ThreeAntchainDasKyaRealenterpriseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ThreeAntchainDasKyaRealenterpriseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ThreeAntchainDasKyaRealenterpriseRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ThreeAntchainDasKyaRealenterpriseRequest setEnterpriseCertNo(String enterpriseCertNo) {
        this.enterpriseCertNo = enterpriseCertNo;
        return this;
    }
    public String getEnterpriseCertNo() {
        return this.enterpriseCertNo;
    }

    public ThreeAntchainDasKyaRealenterpriseRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

}
