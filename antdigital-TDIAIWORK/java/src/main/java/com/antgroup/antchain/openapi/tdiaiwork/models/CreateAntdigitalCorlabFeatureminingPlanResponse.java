// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class CreateAntdigitalCorlabFeatureminingPlanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 计划ID
    @NameInMap("plan_no")
    public String planNo;

    // RUNNING/SUCCESS/FAILED
    @NameInMap("status")
    public String status;

    public static CreateAntdigitalCorlabFeatureminingPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalCorlabFeatureminingPlanResponse self = new CreateAntdigitalCorlabFeatureminingPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalCorlabFeatureminingPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntdigitalCorlabFeatureminingPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntdigitalCorlabFeatureminingPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntdigitalCorlabFeatureminingPlanResponse setPlanNo(String planNo) {
        this.planNo = planNo;
        return this;
    }
    public String getPlanNo() {
        return this.planNo;
    }

    public CreateAntdigitalCorlabFeatureminingPlanResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
