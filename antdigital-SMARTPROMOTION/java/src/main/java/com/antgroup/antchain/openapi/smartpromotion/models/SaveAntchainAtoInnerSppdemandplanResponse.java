// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class SaveAntchainAtoInnerSppdemandplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 新增或编辑的计划编号
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // DRAFT 或 PENDING
    @NameInMap("audit_status")
    @Validation(required = true)
    public String auditStatus;

    // PENDING
    @NameInMap("run_status")
    @Validation(required = true)
    public String runStatus;

    public static SaveAntchainAtoInnerSppdemandplanResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAntchainAtoInnerSppdemandplanResponse self = new SaveAntchainAtoInnerSppdemandplanResponse();
        return TeaModel.build(map, self);
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public SaveAntchainAtoInnerSppdemandplanResponse setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

}
