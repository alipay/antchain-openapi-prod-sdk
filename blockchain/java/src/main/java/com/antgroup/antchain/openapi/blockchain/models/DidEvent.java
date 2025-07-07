// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidEvent extends TeaModel {
    // 事件对应的合约方法
    /**
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 对应did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:XXXX</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // did对应doc
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("did_doc")
    @Validation(required = true)
    public String didDoc;

    // 本次事件的触发者
    /**
     * <strong>example:</strong>
     * <p>XXXXXXXXX</p>
     */
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 6500
    /**
     * <strong>example:</strong>
     * <p>事件在区块的高度</p>
     */
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
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

    public static DidEvent build(java.util.Map<String, ?> map) throws Exception {
        DidEvent self = new DidEvent();
        return TeaModel.build(map, self);
    }

    public DidEvent setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DidEvent setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DidEvent setDidDoc(String didDoc) {
        this.didDoc = didDoc;
        return this;
    }
    public String getDidDoc() {
        return this.didDoc;
    }

    public DidEvent setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DidEvent setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public DidEvent setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DidEvent setTxIndex(Long txIndex) {
        this.txIndex = txIndex;
        return this;
    }
    public Long getTxIndex() {
        return this.txIndex;
    }

}
