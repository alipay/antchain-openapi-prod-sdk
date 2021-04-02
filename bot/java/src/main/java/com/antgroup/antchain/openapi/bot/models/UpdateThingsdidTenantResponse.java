// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易唯一ID，等于输入
    @NameInMap("nonce")
    public String nonce;

    // 代表本操作是否是异步调用 
    // true: 执行完全，非异步操作.
    @NameInMap("executed")
    public Boolean executed;

    public static UpdateThingsdidTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidTenantResponse self = new UpdateThingsdidTenantResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateThingsdidTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateThingsdidTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateThingsdidTenantResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateThingsdidTenantResponse setExecuted(Boolean executed) {
        this.executed = executed;
        return this;
    }
    public Boolean getExecuted() {
        return this.executed;
    }

}
