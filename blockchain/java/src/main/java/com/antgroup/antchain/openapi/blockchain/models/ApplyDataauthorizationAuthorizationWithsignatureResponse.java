// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyDataauthorizationAuthorizationWithsignatureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果
    @NameInMap("process_result")
    public ProcessResult processResult;

    // 权限凭证
    @NameInMap("authority_cert")
    public String authorityCert;

    public static ApplyDataauthorizationAuthorizationWithsignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataauthorizationAuthorizationWithsignatureResponse self = new ApplyDataauthorizationAuthorizationWithsignatureResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDataauthorizationAuthorizationWithsignatureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureResponse setProcessResult(ProcessResult processResult) {
        this.processResult = processResult;
        return this;
    }
    public ProcessResult getProcessResult() {
        return this.processResult;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureResponse setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

}
