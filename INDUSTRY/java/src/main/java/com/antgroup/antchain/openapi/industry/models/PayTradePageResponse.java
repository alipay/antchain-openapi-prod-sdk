// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class PayTradePageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 收银台页面String
    @NameInMap("form")
    public String form;

    public static PayTradePageResponse build(java.util.Map<String, ?> map) throws Exception {
        PayTradePageResponse self = new PayTradePageResponse();
        return TeaModel.build(map, self);
    }

    public PayTradePageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PayTradePageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PayTradePageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PayTradePageResponse setForm(String form) {
        this.form = form;
        return this;
    }
    public String getForm() {
        return this.form;
    }

}
