// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ReplaceInnerFundassetpackagefinanceplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资金方案版本
    @NameInMap("finance_plan_version")
    public Long financePlanVersion;

    public static ReplaceInnerFundassetpackagefinanceplanResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceInnerFundassetpackagefinanceplanResponse self = new ReplaceInnerFundassetpackagefinanceplanResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceInnerFundassetpackagefinanceplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReplaceInnerFundassetpackagefinanceplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReplaceInnerFundassetpackagefinanceplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReplaceInnerFundassetpackagefinanceplanResponse setFinancePlanVersion(Long financePlanVersion) {
        this.financePlanVersion = financePlanVersion;
        return this;
    }
    public Long getFinancePlanVersion() {
        return this.financePlanVersion;
    }

}
