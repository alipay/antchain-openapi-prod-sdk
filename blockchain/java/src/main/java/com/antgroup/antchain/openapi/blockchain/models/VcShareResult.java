// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcShareResult extends TeaModel {
    // 目标分享的VC的id
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:dec9725c55bc7ad28b97340230f211b2ad96a35f5131ce9f77c1bd7b67f919451572244785477124</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 分享给目标接受者的did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214 </p>
     */
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
    /**
     * <strong>example:</strong>
     * <p>388d0822df016aa66c954344e22c36ec89e4a4573ef0491220bd80c1fe3469cb</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 分享是否成功，true：成功，false：失败
    /**
     * <strong>example:</strong>
     * <p>true，false</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    // 失败的对应原因信息
    /**
     * <strong>example:</strong>
     * <p>“失败原因”</p>
     */
    @NameInMap("msg")
    public String msg;

    public static VcShareResult build(java.util.Map<String, ?> map) throws Exception {
        VcShareResult self = new VcShareResult();
        return TeaModel.build(map, self);
    }

    public VcShareResult setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcShareResult setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public VcShareResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VcShareResult setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public VcShareResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
