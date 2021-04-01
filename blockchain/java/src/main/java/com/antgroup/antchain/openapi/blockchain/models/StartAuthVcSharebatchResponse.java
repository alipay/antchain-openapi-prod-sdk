// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcSharebatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // VC分享的结果列表，分别带有结果tx_hash
    @NameInMap("vc_share_results")
    public java.util.List<VcShareResult> vcShareResults;

    public static StartAuthVcSharebatchResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcSharebatchResponse self = new StartAuthVcSharebatchResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVcSharebatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVcSharebatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVcSharebatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVcSharebatchResponse setVcShareResults(java.util.List<VcShareResult> vcShareResults) {
        this.vcShareResults = vcShareResults;
        return this;
    }
    public java.util.List<VcShareResult> getVcShareResults() {
        return this.vcShareResults;
    }

}
