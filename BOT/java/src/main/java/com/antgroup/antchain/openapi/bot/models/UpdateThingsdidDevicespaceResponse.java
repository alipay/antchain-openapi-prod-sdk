// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateThingsdidDevicespaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代表本操作是否是异步调用 true: 执行完全，非异步操作
    @NameInMap("executed")
    public Boolean executed;

    // 代表唯一交易ID，等于输入参数同名字段
    @NameInMap("nonce")
    public String nonce;

    // 注册成功返回的实体身份DID
    @NameInMap("thing_did")
    public String thingDid;

    public static UpdateThingsdidDevicespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingsdidDevicespaceResponse self = new UpdateThingsdidDevicespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingsdidDevicespaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateThingsdidDevicespaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateThingsdidDevicespaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateThingsdidDevicespaceResponse setExecuted(Boolean executed) {
        this.executed = executed;
        return this;
    }
    public Boolean getExecuted() {
        return this.executed;
    }

    public UpdateThingsdidDevicespaceResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UpdateThingsdidDevicespaceResponse setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

}
