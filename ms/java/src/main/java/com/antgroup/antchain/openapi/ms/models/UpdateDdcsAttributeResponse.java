// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdcsAttributeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求执行是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static UpdateDdcsAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdcsAttributeResponse self = new UpdateDdcsAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDdcsAttributeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDdcsAttributeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDdcsAttributeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDdcsAttributeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
