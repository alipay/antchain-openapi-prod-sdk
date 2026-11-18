// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ModifySignSchemeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 押金方案
    @NameInMap("deposit_type")
    public String depositType;

    // 经校验落库的信用减免金额（分）
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 动作集：是否需要预授权冻结
    @NameInMap("need_preauth")
    public Boolean needPreauth;

    // 动作集：是否需要代扣签约（含信用减免的方案为 true；组合方案的代扣与预授权一并发起）
    @NameInMap("need_withhold")
    public Boolean needWithhold;

    // 动作集：是否需要合同签署（由订单进件时的 contractEnabled 决定，不由本接口修改）
    @NameInMap("need_contract")
    public Boolean needContract;

    // 协议清单，随免押/预授权参与与否变化
    @NameInMap("agreement_list")
    public java.util.List<String> agreementList;

    public static ModifySignSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySignSchemeResponse self = new ModifySignSchemeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySignSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ModifySignSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ModifySignSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ModifySignSchemeResponse setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ModifySignSchemeResponse setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public ModifySignSchemeResponse setNeedPreauth(Boolean needPreauth) {
        this.needPreauth = needPreauth;
        return this;
    }
    public Boolean getNeedPreauth() {
        return this.needPreauth;
    }

    public ModifySignSchemeResponse setNeedWithhold(Boolean needWithhold) {
        this.needWithhold = needWithhold;
        return this;
    }
    public Boolean getNeedWithhold() {
        return this.needWithhold;
    }

    public ModifySignSchemeResponse setNeedContract(Boolean needContract) {
        this.needContract = needContract;
        return this;
    }
    public Boolean getNeedContract() {
        return this.needContract;
    }

    public ModifySignSchemeResponse setAgreementList(java.util.List<String> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<String> getAgreementList() {
        return this.agreementList;
    }

}
