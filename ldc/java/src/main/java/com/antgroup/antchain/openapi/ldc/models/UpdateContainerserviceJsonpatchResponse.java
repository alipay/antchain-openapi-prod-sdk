// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceJsonpatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 新的应用服务版本
    @NameInMap("revision")
    public String revision;

    // 部署单id
    @NameInMap("operation_id")
    public String operationId;

    public static UpdateContainerserviceJsonpatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceJsonpatchResponse self = new UpdateContainerserviceJsonpatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceJsonpatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateContainerserviceJsonpatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateContainerserviceJsonpatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateContainerserviceJsonpatchResponse setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceJsonpatchResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
