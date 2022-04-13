// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateSidecarOperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar运维ID
    @NameInMap("operation_id")
    public String operationId;

    // 跳转链接
    @NameInMap("change_url")
    public String changeUrl;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static CreateSidecarOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSidecarOperationResponse self = new CreateSidecarOperationResponse();
        return TeaModel.build(map, self);
    }

    public CreateSidecarOperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSidecarOperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSidecarOperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSidecarOperationResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CreateSidecarOperationResponse setChangeUrl(String changeUrl) {
        this.changeUrl = changeUrl;
        return this;
    }
    public String getChangeUrl() {
        return this.changeUrl;
    }

    public CreateSidecarOperationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
