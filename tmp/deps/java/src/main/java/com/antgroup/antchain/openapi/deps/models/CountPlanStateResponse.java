// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountPlanStateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // state_counts
    @NameInMap("state_counts")
    public java.util.List<String> stateCounts;

    public static CountPlanStateResponse build(java.util.Map<String, ?> map) throws Exception {
        CountPlanStateResponse self = new CountPlanStateResponse();
        return TeaModel.build(map, self);
    }

    public CountPlanStateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountPlanStateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountPlanStateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountPlanStateResponse setStateCounts(java.util.List<String> stateCounts) {
        this.stateCounts = stateCounts;
        return this;
    }
    public java.util.List<String> getStateCounts() {
        return this.stateCounts;
    }

}
