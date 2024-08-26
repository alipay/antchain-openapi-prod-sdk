// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerWithholdsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代扣签约串
    @NameInMap("sign_str")
    public String signStr;

    public static CreateInnerWithholdsignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerWithholdsignResponse self = new CreateInnerWithholdsignResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerWithholdsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerWithholdsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerWithholdsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerWithholdsignResponse setSignStr(String signStr) {
        this.signStr = signStr;
        return this;
    }
    public String getSignStr() {
        return this.signStr;
    }

}
