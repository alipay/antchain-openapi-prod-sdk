// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class SaveConfigUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("save_result")
    public Boolean saveResult;

    public static SaveConfigUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigUserinfoResponse self = new SaveConfigUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public SaveConfigUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveConfigUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveConfigUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveConfigUserinfoResponse setSaveResult(Boolean saveResult) {
        this.saveResult = saveResult;
        return this;
    }
    public Boolean getSaveResult() {
        return this.saveResult;
    }

}
