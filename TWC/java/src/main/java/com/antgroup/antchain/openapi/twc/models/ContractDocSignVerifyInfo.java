// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractDocSignVerifyInfo extends TeaModel {
    // 证书信息
    @NameInMap("cert")
    public ContractDocSignVerifyCertInfo cert;

    // 签名信息
    @NameInMap("signature")
    public ContractDocSignVerifySignatureInfo signature;

    // 印章数据
    /**
     * <strong>example:</strong>
     * <p>35058319XXxxxxxx33</p>
     */
    @NameInMap("seal_data")
    public String sealData;

    public static ContractDocSignVerifyInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractDocSignVerifyInfo self = new ContractDocSignVerifyInfo();
        return TeaModel.build(map, self);
    }

    public ContractDocSignVerifyInfo setCert(ContractDocSignVerifyCertInfo cert) {
        this.cert = cert;
        return this;
    }
    public ContractDocSignVerifyCertInfo getCert() {
        return this.cert;
    }

    public ContractDocSignVerifyInfo setSignature(ContractDocSignVerifySignatureInfo signature) {
        this.signature = signature;
        return this;
    }
    public ContractDocSignVerifySignatureInfo getSignature() {
        return this.signature;
    }

    public ContractDocSignVerifyInfo setSealData(String sealData) {
        this.sealData = sealData;
        return this;
    }
    public String getSealData() {
        return this.sealData;
    }

}
