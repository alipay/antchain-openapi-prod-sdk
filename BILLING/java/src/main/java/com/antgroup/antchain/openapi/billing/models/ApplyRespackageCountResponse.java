// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class ApplyRespackageCountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外部唯一单据号 不超过64位
    @NameInMap("out_biz_id")
    public String outBizId;

    // 本次抵扣总量
    @NameInMap("deduct_amount")
    public Long deductAmount;

    // 抵扣的oms component key 
    @NameInMap("oms_component_key")
    public String omsComponentKey;

    // 抵扣后剩余计量值
    @NameInMap("left_amount")
    public Long leftAmount;

    // 资源包抵扣详细信息
    @NameInMap("oms_data_component_deduct_detail_resultvos")
    public java.util.List<OmsDataComponentDeductDetailResultVO> omsDataComponentDeductDetailResultvos;

    // 高精度本次抵扣总量，支持小数
    @NameInMap("deduct_amount_str")
    public String deductAmountStr;

    // 高精度抵扣剩余量值，支持小数
    @NameInMap("left_amount_str")
    public String leftAmountStr;

    public static ApplyRespackageCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRespackageCountResponse self = new ApplyRespackageCountResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRespackageCountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyRespackageCountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyRespackageCountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyRespackageCountResponse setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public ApplyRespackageCountResponse setDeductAmount(Long deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public Long getDeductAmount() {
        return this.deductAmount;
    }

    public ApplyRespackageCountResponse setOmsComponentKey(String omsComponentKey) {
        this.omsComponentKey = omsComponentKey;
        return this;
    }
    public String getOmsComponentKey() {
        return this.omsComponentKey;
    }

    public ApplyRespackageCountResponse setLeftAmount(Long leftAmount) {
        this.leftAmount = leftAmount;
        return this;
    }
    public Long getLeftAmount() {
        return this.leftAmount;
    }

    public ApplyRespackageCountResponse setOmsDataComponentDeductDetailResultvos(java.util.List<OmsDataComponentDeductDetailResultVO> omsDataComponentDeductDetailResultvos) {
        this.omsDataComponentDeductDetailResultvos = omsDataComponentDeductDetailResultvos;
        return this;
    }
    public java.util.List<OmsDataComponentDeductDetailResultVO> getOmsDataComponentDeductDetailResultvos() {
        return this.omsDataComponentDeductDetailResultvos;
    }

    public ApplyRespackageCountResponse setDeductAmountStr(String deductAmountStr) {
        this.deductAmountStr = deductAmountStr;
        return this;
    }
    public String getDeductAmountStr() {
        return this.deductAmountStr;
    }

    public ApplyRespackageCountResponse setLeftAmountStr(String leftAmountStr) {
        this.leftAmountStr = leftAmountStr;
        return this;
    }
    public String getLeftAmountStr() {
        return this.leftAmountStr;
    }

}
