// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class PublishAntchainAtoInnerSppdemandplanResponse extends TeaModel {
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

    public static PublishAntchainAtoInnerSppdemandplanResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAntchainAtoInnerSppdemandplanResponse self = new PublishAntchainAtoInnerSppdemandplanResponse();
        return TeaModel.build(map, self);
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public PublishAntchainAtoInnerSppdemandplanResponse setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

}
