// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractTextSignVerifySignInfo extends TeaModel {
    // 签名信息
    @NameInMap("signature")
    public ContractTextSignVerifySignatureInfo signature;

    // 证书信息
    @NameInMap("cert")
    public ContractTextSignVerifyCertInfo cert;

    public static ContractTextSignVerifySignInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractTextSignVerifySignInfo self = new ContractTextSignVerifySignInfo();
        return TeaModel.build(map, self);
    }

    public ContractTextSignVerifySignInfo setSignature(ContractTextSignVerifySignatureInfo signature) {
        this.signature = signature;
        return this;
    }
    public ContractTextSignVerifySignatureInfo getSignature() {
        return this.signature;
    }

    public ContractTextSignVerifySignInfo setCert(ContractTextSignVerifyCertInfo cert) {
        this.cert = cert;
        return this;
    }
    public ContractTextSignVerifyCertInfo getCert() {
        return this.cert;
    }

}
