// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessConfirmData extends TeaModel {
    // 文档fileKey
    @NameInMap("doc_file_key")
    public String docFileKey;

    // 文档摘要算法，SHA256
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 签署后文档摘要值
    @NameInMap("signed_hash")
    @Validation(required = true)
    public String signedHash;

    // 第三方文档id
    @NameInMap("third_doc_id")
    @Validation(required = true)
    public String thirdDocId;

    public static WitnessConfirmData build(java.util.Map<String, ?> map) throws Exception {
        WitnessConfirmData self = new WitnessConfirmData();
        return TeaModel.build(map, self);
    }

    public WitnessConfirmData setDocFileKey(String docFileKey) {
        this.docFileKey = docFileKey;
        return this;
    }
    public String getDocFileKey() {
        return this.docFileKey;
    }

    public WitnessConfirmData setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public WitnessConfirmData setSignedHash(String signedHash) {
        this.signedHash = signedHash;
        return this;
    }
    public String getSignedHash() {
        return this.signedHash;
    }

    public WitnessConfirmData setThirdDocId(String thirdDocId) {
        this.thirdDocId = thirdDocId;
        return this;
    }
    public String getThirdDocId() {
        return this.thirdDocId;
    }

}
