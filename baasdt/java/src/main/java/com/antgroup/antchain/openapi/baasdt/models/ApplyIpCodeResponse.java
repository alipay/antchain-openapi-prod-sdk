// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ApplyIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 正版码的批次ID
    @NameInMap("code_batch_id")
    public String codeBatchId;

    public static ApplyIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyIpCodeResponse self = new ApplyIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public ApplyIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyIpCodeResponse setCodeBatchId(String codeBatchId) {
        this.codeBatchId = codeBatchId;
        return this;
    }
    public String getCodeBatchId() {
        return this.codeBatchId;
    }

}
