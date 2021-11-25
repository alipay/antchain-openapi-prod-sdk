// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDataauthorizationProcessWithsignatureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流程处理结果
    @NameInMap("process_result")
    public ProcessResult processResult;

    // 权限凭证
    @NameInMap("authority_cert")
    public String authorityCert;

    public static ExecDataauthorizationProcessWithsignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataauthorizationProcessWithsignatureResponse self = new ExecDataauthorizationProcessWithsignatureResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataauthorizationProcessWithsignatureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecDataauthorizationProcessWithsignatureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecDataauthorizationProcessWithsignatureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecDataauthorizationProcessWithsignatureResponse setProcessResult(ProcessResult processResult) {
        this.processResult = processResult;
        return this;
    }
    public ProcessResult getProcessResult() {
        return this.processResult;
    }

    public ExecDataauthorizationProcessWithsignatureResponse setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

}
