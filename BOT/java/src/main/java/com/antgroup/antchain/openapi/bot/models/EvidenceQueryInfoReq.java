// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EvidenceQueryInfoReq extends TeaModel {
    // 暂时保留
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("device_signature")
    public String deviceSignature;

    // 暂时保留
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("device_uid")
    public String deviceUid;

    // 不同上链方式
    // "CZ": 普通存证
    // "IOTPAY": 支付存证
    // "RAW": 文本上链
    // "TTTS": 溯源存证
    /**
     * <strong>example:</strong>
     * <p>&quot;CZ&quot;</p>
     */
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 查询的链上交易txHash
    /**
     * <strong>example:</strong>
     * <p>&quot;516e981c8b62c6ef08dc99b5f5165ab2a8592b5a116298788f95bbd45d0cc499&quot;</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static EvidenceQueryInfoReq build(java.util.Map<String, ?> map) throws Exception {
        EvidenceQueryInfoReq self = new EvidenceQueryInfoReq();
        return TeaModel.build(map, self);
    }

    public EvidenceQueryInfoReq setDeviceSignature(String deviceSignature) {
        this.deviceSignature = deviceSignature;
        return this;
    }
    public String getDeviceSignature() {
        return this.deviceSignature;
    }

    public EvidenceQueryInfoReq setDeviceUid(String deviceUid) {
        this.deviceUid = deviceUid;
        return this;
    }
    public String getDeviceUid() {
        return this.deviceUid;
    }

    public EvidenceQueryInfoReq setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public EvidenceQueryInfoReq setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
