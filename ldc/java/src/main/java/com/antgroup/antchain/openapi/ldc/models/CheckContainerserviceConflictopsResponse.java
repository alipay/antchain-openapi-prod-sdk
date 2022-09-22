// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CheckContainerserviceConflictopsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("result")
    public Boolean result;

    // 冲突的发布单id
    @NameInMap("operation_id")
    public String operationId;

    // sidercar工单id
    @NameInMap("sidercar_plan_id")
    public String sidercarPlanId;

    public static CheckContainerserviceConflictopsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckContainerserviceConflictopsResponse self = new CheckContainerserviceConflictopsResponse();
        return TeaModel.build(map, self);
    }

    public CheckContainerserviceConflictopsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckContainerserviceConflictopsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckContainerserviceConflictopsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckContainerserviceConflictopsResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CheckContainerserviceConflictopsResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CheckContainerserviceConflictopsResponse setSidercarPlanId(String sidercarPlanId) {
        this.sidercarPlanId = sidercarPlanId;
        return this;
    }
    public String getSidercarPlanId() {
        return this.sidercarPlanId;
    }

}
