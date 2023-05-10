// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class UpdateGatewayRoadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 更新后返回info
    @NameInMap("upd_info")
    public String updInfo;

    // 组合返回请求结果
    @NameInMap("upd_pack")
    public InitPack updPack;

    public static UpdateGatewayRoadResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRoadResponse self = new UpdateGatewayRoadResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRoadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateGatewayRoadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateGatewayRoadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateGatewayRoadResponse setUpdInfo(String updInfo) {
        this.updInfo = updInfo;
        return this;
    }
    public String getUpdInfo() {
        return this.updInfo;
    }

    public UpdateGatewayRoadResponse setUpdPack(InitPack updPack) {
        this.updPack = updPack;
        return this;
    }
    public InitPack getUpdPack() {
        return this.updPack;
    }

}
