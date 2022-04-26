// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateStubResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回流程ID，全局唯一
    @NameInMap("flow_id")
    public String flowId;

    // 阶段存证结果列表
    @NameInMap("phase_create_result_list")
    public java.util.List<PhaseCreateResult> phaseCreateResultList;

    public static CreateStubResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStubResponse self = new CreateStubResponse();
        return TeaModel.build(map, self);
    }

    public CreateStubResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateStubResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateStubResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateStubResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateStubResponse setPhaseCreateResultList(java.util.List<PhaseCreateResult> phaseCreateResultList) {
        this.phaseCreateResultList = phaseCreateResultList;
        return this;
    }
    public java.util.List<PhaseCreateResult> getPhaseCreateResultList() {
        return this.phaseCreateResultList;
    }

}
