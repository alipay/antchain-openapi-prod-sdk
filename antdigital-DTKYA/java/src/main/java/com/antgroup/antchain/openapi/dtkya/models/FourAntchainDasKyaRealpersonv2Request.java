// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FourAntchainDasKyaRealpersonv2Request extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人身份证件姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 个人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 待核验的手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 待核验的银行卡号
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    public static FourAntchainDasKyaRealpersonv2Request build(java.util.Map<String, ?> map) throws Exception {
        FourAntchainDasKyaRealpersonv2Request self = new FourAntchainDasKyaRealpersonv2Request();
        return TeaModel.build(map, self);
    }

    public FourAntchainDasKyaRealpersonv2Request setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FourAntchainDasKyaRealpersonv2Request setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FourAntchainDasKyaRealpersonv2Request setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public FourAntchainDasKyaRealpersonv2Request setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public FourAntchainDasKyaRealpersonv2Request setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public FourAntchainDasKyaRealpersonv2Request setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

}
