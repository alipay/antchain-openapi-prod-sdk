// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcShareResult extends TeaModel {
    // 目标分享的VC的id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 分享给目标接受者的did
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
    @NameInMap("tx_hash")
    public String txHash;

    // 分享是否成功，true：成功，false：失败
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    // 失败的对应原因信息
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
