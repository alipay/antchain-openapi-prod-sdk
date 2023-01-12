// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateComputeropsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建完成的运维单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    public static CreateComputeropsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeropsResponse self = new CreateComputeropsResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeropsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateComputeropsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateComputeropsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateComputeropsResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
