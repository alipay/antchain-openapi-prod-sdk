// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackPlanServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单信息
    @NameInMap("plan")
    public String plan;

    public static RollbackPlanServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackPlanServiceResponse self = new RollbackPlanServiceResponse();
        return TeaModel.build(map, self);
    }

    public RollbackPlanServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RollbackPlanServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackPlanServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RollbackPlanServiceResponse setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

}
