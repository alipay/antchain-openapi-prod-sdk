// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ModifySignSchemeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最新方案快照与动作集，RentalSignSchemeResp 对象的 JSON 字符串
    @NameInMap("response_data")
    public RentalSignSchemeResp responseData;

    public static ModifySignSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySignSchemeResponse self = new ModifySignSchemeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySignSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ModifySignSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ModifySignSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ModifySignSchemeResponse setResponseData(RentalSignSchemeResp responseData) {
        this.responseData = responseData;
        return this;
    }
    public RentalSignSchemeResp getResponseData() {
        return this.responseData;
    }

}
