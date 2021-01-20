// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExecPlanResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ops_plan
    @NameInMap("ops_plan")
    public String opsPlan;

    public static ExecPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecPlanResponse self = new ExecPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecPlanResponse setOpsPlan(String opsPlan) {
        this.opsPlan = opsPlan;
        return this;
    }
    public String getOpsPlan() {
        return this.opsPlan;
    }

}
