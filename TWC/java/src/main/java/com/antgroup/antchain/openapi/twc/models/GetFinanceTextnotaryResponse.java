// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetFinanceTextnotaryResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 哈希算法
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 文本哈希
    @NameInMap("text_hash")
    public String textHash;

    // 可信时间戳
    @NameInMap("tsr")
    public TsrResponse tsr;

    // 存证阶段
    @NameInMap("phase")
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    public static GetFinanceTextnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFinanceTextnotaryResponse self = new GetFinanceTextnotaryResponse();
        return TeaModel.build(map, self);
    }

    public GetFinanceTextnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFinanceTextnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFinanceTextnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFinanceTextnotaryResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public GetFinanceTextnotaryResponse setTextHash(String textHash) {
        this.textHash = textHash;
        return this;
    }
    public String getTextHash() {
        return this.textHash;
    }

    public GetFinanceTextnotaryResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

    public GetFinanceTextnotaryResponse setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetFinanceTextnotaryResponse setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
