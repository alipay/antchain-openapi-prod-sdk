// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class CreateRiskplusDubbridgePetmallorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商城业务订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 积分订单创建结果，Y-成功；N-失败
    @NameInMap("create_result")
    public String createResult;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 商城订单的交易单号
    @NameInMap("own_trade_no")
    public String ownTradeNo;

    public static CreateRiskplusDubbridgePetmallorderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskplusDubbridgePetmallorderResponse self = new CreateRiskplusDubbridgePetmallorderResponse();
        return TeaModel.build(map, self);
    }

    public CreateRiskplusDubbridgePetmallorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setCreateResult(String createResult) {
        this.createResult = createResult;
        return this;
    }
    public String getCreateResult() {
        return this.createResult;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public CreateRiskplusDubbridgePetmallorderResponse setOwnTradeNo(String ownTradeNo) {
        this.ownTradeNo = ownTradeNo;
        return this;
    }
    public String getOwnTradeNo() {
        return this.ownTradeNo;
    }

}
