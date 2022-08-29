// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowEvidenceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上证据包对应的链上交易Hash，只有resultMsg为success时才返回
    @NameInMap("chain_pack_tx_hash")
    public String chainPackTxHash;

    // 暂不支持，预留字段，链下证据包对应的可下载链接，有效期3小时，只有申请时选择了链下证据包、查询入参evidencePackType选择LocalEvidencePack及resultMsg为success时才返回
    @NameInMap("local_pack_url")
    public String localPackUrl;

    public static QueryFlowEvidenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowEvidenceResponse self = new QueryFlowEvidenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowEvidenceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowEvidenceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowEvidenceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowEvidenceResponse setChainPackTxHash(String chainPackTxHash) {
        this.chainPackTxHash = chainPackTxHash;
        return this;
    }
    public String getChainPackTxHash() {
        return this.chainPackTxHash;
    }

    public QueryFlowEvidenceResponse setLocalPackUrl(String localPackUrl) {
        this.localPackUrl = localPackUrl;
        return this;
    }
    public String getLocalPackUrl() {
        return this.localPackUrl;
    }

}
