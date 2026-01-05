// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class StopActivateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 表单id
    @NameInMap("apply_form_id")
    public String applyFormId;

    public static StopActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        StopActivateResponse self = new StopActivateResponse();
        return TeaModel.build(map, self);
    }

    public StopActivateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StopActivateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StopActivateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StopActivateResponse setApplyFormId(String applyFormId) {
        this.applyFormId = applyFormId;
        return this;
    }
    public String getApplyFormId() {
        return this.applyFormId;
    }

}
