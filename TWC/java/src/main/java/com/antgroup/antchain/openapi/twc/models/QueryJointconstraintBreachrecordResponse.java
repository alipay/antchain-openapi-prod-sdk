// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJointconstraintBreachrecordResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否存在履行记录
    // 
    // 
    @NameInMap("has_record")
    public Boolean hasRecord;

    // 违约次数
    // 
    // 
    @NameInMap("breach_count")
    public Long breachCount;

    public static QueryJointconstraintBreachrecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJointconstraintBreachrecordResponse self = new QueryJointconstraintBreachrecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryJointconstraintBreachrecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJointconstraintBreachrecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJointconstraintBreachrecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJointconstraintBreachrecordResponse setHasRecord(Boolean hasRecord) {
        this.hasRecord = hasRecord;
        return this;
    }
    public Boolean getHasRecord() {
        return this.hasRecord;
    }

    public QueryJointconstraintBreachrecordResponse setBreachCount(Long breachCount) {
        this.breachCount = breachCount;
        return this;
    }
    public Long getBreachCount() {
        return this.breachCount;
    }

}
