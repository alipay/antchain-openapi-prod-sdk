// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuthFundFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署最后落签的签署区域id列表
    @NameInMap("sign_field_ids")
    public String signFieldIds;

    public static AuthFundFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthFundFlowResponse self = new AuthFundFlowResponse();
        return TeaModel.build(map, self);
    }

    public AuthFundFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthFundFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthFundFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthFundFlowResponse setSignFieldIds(String signFieldIds) {
        this.signFieldIds = signFieldIds;
        return this;
    }
    public String getSignFieldIds() {
        return this.signFieldIds;
    }

}
