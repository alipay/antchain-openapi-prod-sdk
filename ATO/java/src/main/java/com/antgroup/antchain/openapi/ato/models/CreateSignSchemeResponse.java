// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSignSchemeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约单号，供对账与排查；后续改方案、发起、查询均以 order_id 定位
    @NameInMap("sign_no")
    public String signNo;

    // 签约单状态；创建成功后为 INIT，重复建单回显当前实际状态
    @NameInMap("status")
    public String status;

    // 落库的押金方案,DEPOSIT_FREE（仅免押）/ PREAUTH_ONLY（仅预授权）/ FREE_WITH_PREAUTH（免押&预授权）
    @NameInMap("deposit_type")
    public String depositType;

    // 落库的信用减免金额（分），供确认页与合同展示
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 动作集：是否需要预授权冻结（INIT 阶段由改方案重算，发起后不可变）
    @NameInMap("need_preauth")
    public Boolean needPreauth;

    // 动作集：是否需要代扣签约（含信用减免的方案为 true）
    @NameInMap("need_withhold")
    public Boolean needWithhold;

    // 动作集：是否需要合同签署（由订单进件时的 contractEnabled 决定，不由本接口修改）
    @NameInMap("need_contract")
    public Boolean needContract;

    // 签约场景: RENTAL（短租）
    @NameInMap("scene")
    public String scene;

    public static CreateSignSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignSchemeResponse self = new CreateSignSchemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSignSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSignSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSignSchemeResponse setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public CreateSignSchemeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateSignSchemeResponse setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateSignSchemeResponse setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public CreateSignSchemeResponse setNeedPreauth(Boolean needPreauth) {
        this.needPreauth = needPreauth;
        return this;
    }
    public Boolean getNeedPreauth() {
        return this.needPreauth;
    }

    public CreateSignSchemeResponse setNeedWithhold(Boolean needWithhold) {
        this.needWithhold = needWithhold;
        return this;
    }
    public Boolean getNeedWithhold() {
        return this.needWithhold;
    }

    public CreateSignSchemeResponse setNeedContract(Boolean needContract) {
        this.needContract = needContract;
        return this;
    }
    public Boolean getNeedContract() {
        return this.needContract;
    }

    public CreateSignSchemeResponse setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
