// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessConfirmData extends TeaModel {
    // 文档fileKey
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("doc_file_key")
    public String docFileKey;

    // 文档摘要算法，SHA256
    /**
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 签署后文档摘要值
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("signed_hash")
    @Validation(required = true)
    public String signedHash;

    // 第三方文档id
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
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
