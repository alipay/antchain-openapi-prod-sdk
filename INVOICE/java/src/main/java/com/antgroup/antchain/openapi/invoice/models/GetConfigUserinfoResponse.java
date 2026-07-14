// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class GetConfigUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户开票配置信息
    @NameInMap("user_invoice_config")
    public UserInvoiceConfigVO userInvoiceConfig;

    public static GetConfigUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigUserinfoResponse self = new GetConfigUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigUserinfoResponse setUserInvoiceConfig(UserInvoiceConfigVO userInvoiceConfig) {
        this.userInvoiceConfig = userInvoiceConfig;
        return this;
    }
    public UserInvoiceConfigVO getUserInvoiceConfig() {
        return this.userInvoiceConfig;
    }

}
