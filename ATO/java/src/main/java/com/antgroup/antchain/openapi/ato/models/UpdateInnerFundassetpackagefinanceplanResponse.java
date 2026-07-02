// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerFundassetpackagefinanceplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资金方案内容
    @NameInMap("finance_plan")
    public AssetPackageFinancePlan financePlan;

    // 类型
    @NameInMap("type")
    public String type;

    // 回答
    @NameInMap("answer")
    public String answer;

    public static UpdateInnerFundassetpackagefinanceplanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerFundassetpackagefinanceplanResponse self = new UpdateInnerFundassetpackagefinanceplanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setFinancePlan(AssetPackageFinancePlan financePlan) {
        this.financePlan = financePlan;
        return this;
    }
    public AssetPackageFinancePlan getFinancePlan() {
        return this.financePlan;
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateInnerFundassetpackagefinanceplanResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

}
