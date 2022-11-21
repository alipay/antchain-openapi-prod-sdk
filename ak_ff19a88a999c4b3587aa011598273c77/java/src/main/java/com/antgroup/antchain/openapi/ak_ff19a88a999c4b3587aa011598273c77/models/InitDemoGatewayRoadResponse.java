// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class InitDemoGatewayRoadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回desc
    @NameInMap("init_desc")
    public String initDesc;

    // 组合返回请求结果
    @NameInMap("init_pack")
    public InitPack initPack;

    public static InitDemoGatewayRoadResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDemoGatewayRoadResponse self = new InitDemoGatewayRoadResponse();
        return TeaModel.build(map, self);
    }

    public InitDemoGatewayRoadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitDemoGatewayRoadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitDemoGatewayRoadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitDemoGatewayRoadResponse setInitDesc(String initDesc) {
        this.initDesc = initDesc;
        return this;
    }
    public String getInitDesc() {
        return this.initDesc;
    }

    public InitDemoGatewayRoadResponse setInitPack(InitPack initPack) {
        this.initPack = initPack;
        return this;
    }
    public InitPack getInitPack() {
        return this.initPack;
    }

}
