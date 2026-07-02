// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 更新的实体DID，等于输入
    @NameInMap("thing_did")
    public String thingDid;

    // 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
    @NameInMap("executed")
    public Boolean executed;

    // 交易唯一ID
    @NameInMap("nonce")
    public String nonce;

    public static UpdateThingsdidDidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidDidResponse self = new UpdateThingsdidDidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateThingsdidDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateThingsdidDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateThingsdidDidResponse setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

    public UpdateThingsdidDidResponse setExecuted(Boolean executed) {
        this.executed = executed;
        return this;
    }
    public Boolean getExecuted() {
        return this.executed;
    }

    public UpdateThingsdidDidResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
