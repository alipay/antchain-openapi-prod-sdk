// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VCEvent extends TeaModel {
    // 事件对应的合约方法
    /**
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 本次事件的触发者
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 事件在区块的高度
    /**
     * <strong>example:</strong>
     * <p>6300</p>
     */
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // 该VC的颁发者
    /**
     * <strong>example:</strong>
     * <p>did:mychian:xxxxx</p>
     */
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 有效，或者无效
    /**
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 该vc的接受者
    /**
     * <strong>example:</strong>
     * <p>hash256(did:mychain:xxxxx)</p>
     */
    @NameInMap("subjec")
    @Validation(required = true)
    public String subjec;

    // 交易hash
    // 
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易在区块中的index
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("tx_index")
    @Validation(required = true)
    public Long txIndex;

    // 可验证声明Hash值
    /**
     * <strong>example:</strong>
     * <p>hash256(可验证声明)</p>
     */
    @NameInMap("vc_hash")
    @Validation(required = true)
    public String vcHash;

    // vcid
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:XXXX</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static VCEvent build(java.util.Map<String, ?> map) throws Exception {
        VCEvent self = new VCEvent();
        return TeaModel.build(map, self);
    }

    public VCEvent setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public VCEvent setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public VCEvent setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public VCEvent setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public VCEvent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VCEvent setSubjec(String subjec) {
        this.subjec = subjec;
        return this;
    }
    public String getSubjec() {
        return this.subjec;
    }

    public VCEvent setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VCEvent setTxIndex(Long txIndex) {
        this.txIndex = txIndex;
        return this;
    }
    public Long getTxIndex() {
        return this.txIndex;
    }

    public VCEvent setVcHash(String vcHash) {
        this.vcHash = vcHash;
        return this;
    }
    public String getVcHash() {
        return this.vcHash;
    }

    public VCEvent setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
