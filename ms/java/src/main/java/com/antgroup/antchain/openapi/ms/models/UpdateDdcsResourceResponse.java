// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdcsResourceResponse extends TeaModel {
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

    public static UpdateDdcsResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdcsResourceResponse self = new UpdateDdcsResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDdcsResourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDdcsResourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDdcsResourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDdcsResourceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
