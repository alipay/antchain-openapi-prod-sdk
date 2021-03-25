// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackPlanResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ops_plan
    @NameInMap("ops_plan")
    public String opsPlan;

    public static RollbackPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackPlanResponse self = new RollbackPlanResponse();
        return TeaModel.build(map, self);
    }

    public RollbackPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RollbackPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RollbackPlanResponse setOpsPlan(String opsPlan) {
        this.opsPlan = opsPlan;
        return this;
    }
    public String getOpsPlan() {
        return this.opsPlan;
    }

}
