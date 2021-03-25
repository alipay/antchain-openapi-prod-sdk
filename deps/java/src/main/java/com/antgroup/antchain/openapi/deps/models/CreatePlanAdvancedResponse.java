// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreatePlanAdvancedResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ops_plan
    @NameInMap("ops_plan")
    public String opsPlan;

    public static CreatePlanAdvancedResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanAdvancedResponse self = new CreatePlanAdvancedResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlanAdvancedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePlanAdvancedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePlanAdvancedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePlanAdvancedResponse setOpsPlan(String opsPlan) {
        this.opsPlan = opsPlan;
        return this;
    }
    public String getOpsPlan() {
        return this.opsPlan;
    }

}
