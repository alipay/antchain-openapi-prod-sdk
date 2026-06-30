// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RechargePoiMallpointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 充值结果
    @NameInMap("recharge_result")
    public PoiMallPointRechargeResult rechargeResult;

    public static RechargePoiMallpointResponse build(java.util.Map<String, ?> map) throws Exception {
        RechargePoiMallpointResponse self = new RechargePoiMallpointResponse();
        return TeaModel.build(map, self);
    }

    public RechargePoiMallpointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RechargePoiMallpointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RechargePoiMallpointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RechargePoiMallpointResponse setRechargeResult(PoiMallPointRechargeResult rechargeResult) {
        this.rechargeResult = rechargeResult;
        return this;
    }
    public PoiMallPointRechargeResult getRechargeResult() {
        return this.rechargeResult;
    }

}
