// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RetrySidecarOperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跳转链接
    @NameInMap("change_url")
    public String changeUrl;

    // sidecar运维请求ID
    @NameInMap("operation_id")
    public String operationId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static RetrySidecarOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrySidecarOperationResponse self = new RetrySidecarOperationResponse();
        return TeaModel.build(map, self);
    }

    public RetrySidecarOperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetrySidecarOperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetrySidecarOperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetrySidecarOperationResponse setChangeUrl(String changeUrl) {
        this.changeUrl = changeUrl;
        return this;
    }
    public String getChangeUrl() {
        return this.changeUrl;
    }

    public RetrySidecarOperationResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RetrySidecarOperationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
