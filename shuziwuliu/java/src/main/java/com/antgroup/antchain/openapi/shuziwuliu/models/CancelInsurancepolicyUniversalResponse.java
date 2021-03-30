// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CancelInsurancepolicyUniversalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投保订单号
    @NameInMap("apply_trade_no")
    public String applyTradeNo;

    // 保单号
    @NameInMap("pol_no")
    public String polNo;

    // 退还保费
    @NameInMap("send_back_premium")
    public String sendBackPremium;

    // 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    @NameInMap("success_surrender_time")
    public String successSurrenderTime;

    // 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    @NameInMap("surrender_effective_time")
    public String surrenderEffectiveTime;

    public static CancelInsurancepolicyUniversalResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelInsurancepolicyUniversalResponse self = new CancelInsurancepolicyUniversalResponse();
        return TeaModel.build(map, self);
    }

    public CancelInsurancepolicyUniversalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelInsurancepolicyUniversalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelInsurancepolicyUniversalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelInsurancepolicyUniversalResponse setApplyTradeNo(String applyTradeNo) {
        this.applyTradeNo = applyTradeNo;
        return this;
    }
    public String getApplyTradeNo() {
        return this.applyTradeNo;
    }

    public CancelInsurancepolicyUniversalResponse setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public CancelInsurancepolicyUniversalResponse setSendBackPremium(String sendBackPremium) {
        this.sendBackPremium = sendBackPremium;
        return this;
    }
    public String getSendBackPremium() {
        return this.sendBackPremium;
    }

    public CancelInsurancepolicyUniversalResponse setSuccessSurrenderTime(String successSurrenderTime) {
        this.successSurrenderTime = successSurrenderTime;
        return this;
    }
    public String getSuccessSurrenderTime() {
        return this.successSurrenderTime;
    }

    public CancelInsurancepolicyUniversalResponse setSurrenderEffectiveTime(String surrenderEffectiveTime) {
        this.surrenderEffectiveTime = surrenderEffectiveTime;
        return this;
    }
    public String getSurrenderEffectiveTime() {
        return this.surrenderEffectiveTime;
    }

}
