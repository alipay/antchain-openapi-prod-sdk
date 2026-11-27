// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ThreeAntchainDasKyaRealenterprisev2Request extends TeaModel {
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

    public static ThreeAntchainDasKyaRealenterprisev2Request build(java.util.Map<String, ?> map) throws Exception {
        ThreeAntchainDasKyaRealenterprisev2Request self = new ThreeAntchainDasKyaRealenterprisev2Request();
        return TeaModel.build(map, self);
    }

    public ThreeAntchainDasKyaRealenterprisev2Request setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ThreeAntchainDasKyaRealenterprisev2Request setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ThreeAntchainDasKyaRealenterprisev2Request setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ThreeAntchainDasKyaRealenterprisev2Request setEnterpriseCertNo(String enterpriseCertNo) {
        this.enterpriseCertNo = enterpriseCertNo;
        return this;
    }
    public String getEnterpriseCertNo() {
        return this.enterpriseCertNo;
    }

    public ThreeAntchainDasKyaRealenterprisev2Request setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

}
