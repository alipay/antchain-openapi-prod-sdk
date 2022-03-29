// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class IdBindingQueryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // binding
    @NameInMap("binding")
    @Validation(required = true)
    public Binding binding;

    public static IdBindingQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IdBindingQueryResponse self = new IdBindingQueryResponse();
        return TeaModel.build(map, self);
    }

    public IdBindingQueryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public IdBindingQueryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IdBindingQueryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public IdBindingQueryResponse setBinding(Binding binding) {
        this.binding = binding;
        return this;
    }
    public Binding getBinding() {
        return this.binding;
    }

}
