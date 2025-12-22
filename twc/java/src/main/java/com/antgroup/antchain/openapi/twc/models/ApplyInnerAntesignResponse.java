// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyInnerAntesignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用印流程受理流水号
    @NameInMap("sign_flow_id")
    public String signFlowId;

    // 业务流水号
    @NameInMap("biz_no")
    public String bizNo;

    // 子任务信息
    @NameInMap("sub_ant_sign_result_list")
    public java.util.List<SubAntSignResult> subAntSignResultList;

    public static ApplyInnerAntesignResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInnerAntesignResponse self = new ApplyInnerAntesignResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInnerAntesignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInnerAntesignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInnerAntesignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInnerAntesignResponse setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public ApplyInnerAntesignResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ApplyInnerAntesignResponse setSubAntSignResultList(java.util.List<SubAntSignResult> subAntSignResultList) {
        this.subAntSignResultList = subAntSignResultList;
        return this;
    }
    public java.util.List<SubAntSignResult> getSubAntSignResultList() {
        return this.subAntSignResultList;
    }

}
