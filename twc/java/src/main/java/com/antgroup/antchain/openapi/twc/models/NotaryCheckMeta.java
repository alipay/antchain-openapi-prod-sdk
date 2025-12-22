// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotaryCheckMeta extends TeaModel {
    // 对应的法院编号
    /**
     * <strong>example:</strong>
     * <p>hzfy</p>
     */
    @NameInMap("agency_code")
    public String agencyCode;

    // 哈希算法, notary_type 为 HASH 时此参数必填
    /**
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 存证内容
    /**
     * <strong>example:</strong>
     * <p>5p2t5bee5LuK5aSp5aSp5rCU6Zi0</p>
     */
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 交易哈希
    /**
     * <strong>example:</strong>
     * <p>aac0cf38b6072352f6b3be4cc0a3cf3950058472eacdda91e6723d75e2994567</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 应用ID
    /**
     * <strong>example:</strong>
     * <p>dstj</p>
     */
    @NameInMap("application_code")
    public String applicationCode;

    public static NotaryCheckMeta build(java.util.Map<String, ?> map) throws Exception {
        NotaryCheckMeta self = new NotaryCheckMeta();
        return TeaModel.build(map, self);
    }

    public NotaryCheckMeta setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
        return this;
    }
    public String getAgencyCode() {
        return this.agencyCode;
    }

    public NotaryCheckMeta setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public NotaryCheckMeta setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public NotaryCheckMeta setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public NotaryCheckMeta setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

}
