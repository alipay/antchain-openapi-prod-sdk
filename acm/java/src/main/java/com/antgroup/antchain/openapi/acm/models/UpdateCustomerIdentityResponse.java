// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class UpdateCustomerIdentityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回客户id
    @NameInMap("customer_id")
    public String customerId;

    public static UpdateCustomerIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerIdentityResponse self = new UpdateCustomerIdentityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerIdentityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateCustomerIdentityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateCustomerIdentityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateCustomerIdentityResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
