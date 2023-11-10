// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktActionplanDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 触达策略详细信息
    @NameInMap("action_plan_detail_info")
    public java.util.List<ActionPlanDetailInfo> actionPlanDetailInfo;

    public static BatchqueryUmktActionplanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktActionplanDetailResponse self = new BatchqueryUmktActionplanDetailResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktActionplanDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktActionplanDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktActionplanDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktActionplanDetailResponse setActionPlanDetailInfo(java.util.List<ActionPlanDetailInfo> actionPlanDetailInfo) {
        this.actionPlanDetailInfo = actionPlanDetailInfo;
        return this;
    }
    public java.util.List<ActionPlanDetailInfo> getActionPlanDetailInfo() {
        return this.actionPlanDetailInfo;
    }

}
