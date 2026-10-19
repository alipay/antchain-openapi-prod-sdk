// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PublishInnerSppdemandplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作的计划编号
    @NameInMap("plan_id")
    public String planId;

    // 实际完成的操作 DELETE / OFFLINE
    @NameInMap("operation_type")
    public String operationType;

    // OFFLINE 成功时为 PAUSED；DELETE 成功时不返回
    @NameInMap("run_status")
    public String runStatus;

    public static PublishInnerSppdemandplanResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishInnerSppdemandplanResponse self = new PublishInnerSppdemandplanResponse();
        return TeaModel.build(map, self);
    }

    public PublishInnerSppdemandplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PublishInnerSppdemandplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PublishInnerSppdemandplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PublishInnerSppdemandplanResponse setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public PublishInnerSppdemandplanResponse setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public PublishInnerSppdemandplanResponse setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

}
