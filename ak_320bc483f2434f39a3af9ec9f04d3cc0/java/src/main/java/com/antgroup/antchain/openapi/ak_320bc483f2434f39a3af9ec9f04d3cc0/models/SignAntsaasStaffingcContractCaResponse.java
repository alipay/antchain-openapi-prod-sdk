// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignAntsaasStaffingcContractCaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约流程id
    @NameInMap("sign_flow_id")
    public String signFlowId;

    // 业务流水号
    @NameInMap("biz_no")
    public String bizNo;

    // 用印子任务受理流水
    @NameInMap("sub_ant_sign_result_list")
    public java.util.List<CaSubSignResult> subAntSignResultList;

    public static SignAntsaasStaffingcContractCaResponse build(java.util.Map<String, ?> map) throws Exception {
        SignAntsaasStaffingcContractCaResponse self = new SignAntsaasStaffingcContractCaResponse();
        return TeaModel.build(map, self);
    }

    public SignAntsaasStaffingcContractCaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SignAntsaasStaffingcContractCaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SignAntsaasStaffingcContractCaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SignAntsaasStaffingcContractCaResponse setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public SignAntsaasStaffingcContractCaResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SignAntsaasStaffingcContractCaResponse setSubAntSignResultList(java.util.List<CaSubSignResult> subAntSignResultList) {
        this.subAntSignResultList = subAntSignResultList;
        return this;
    }
    public java.util.List<CaSubSignResult> getSubAntSignResultList() {
        return this.subAntSignResultList;
    }

}
