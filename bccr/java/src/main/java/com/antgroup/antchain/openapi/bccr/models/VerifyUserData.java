// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyUserData extends TeaModel {
    // 证件名称
    @NameInMap("cert_name")
    public String certName;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 登记人信息存证交易HASH
    @NameInMap("register_person_tx_hash")
    public String registerPersonTxHash;

    public static VerifyUserData build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserData self = new VerifyUserData();
        return TeaModel.build(map, self);
    }

    public VerifyUserData setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public VerifyUserData setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public VerifyUserData setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public VerifyUserData setRegisterPersonTxHash(String registerPersonTxHash) {
        this.registerPersonTxHash = registerPersonTxHash;
        return this;
    }
    public String getRegisterPersonTxHash() {
        return this.registerPersonTxHash;
    }

}
