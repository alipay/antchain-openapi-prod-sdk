// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateMeiyouAuditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口响应
    @NameInMap("result")
    public String result;

    public static UpdateMeiyouAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeiyouAuditResponse self = new UpdateMeiyouAuditResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeiyouAuditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateMeiyouAuditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMeiyouAuditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateMeiyouAuditResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
