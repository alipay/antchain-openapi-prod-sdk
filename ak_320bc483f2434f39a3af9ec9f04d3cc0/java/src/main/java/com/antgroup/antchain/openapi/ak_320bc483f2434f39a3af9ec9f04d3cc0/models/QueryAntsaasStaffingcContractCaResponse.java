// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcContractCaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署流程ID
    @NameInMap("sign_flow_id")
    public String signFlowId;

    // 签署流程状态
    @NameInMap("status")
    public String status;

    // 业务流水号
    @NameInMap("biz_no")
    public String bizNo;

    // 签署任务结果列表
    @NameInMap("ant_sign_task_result_list")
    public java.util.List<CaSignTaskResult> antSignTaskResultList;

    public static QueryAntsaasStaffingcContractCaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcContractCaResponse self = new QueryAntsaasStaffingcContractCaResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcContractCaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsaasStaffingcContractCaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsaasStaffingcContractCaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsaasStaffingcContractCaResponse setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public QueryAntsaasStaffingcContractCaResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntsaasStaffingcContractCaResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryAntsaasStaffingcContractCaResponse setAntSignTaskResultList(java.util.List<CaSignTaskResult> antSignTaskResultList) {
        this.antSignTaskResultList = antSignTaskResultList;
        return this;
    }
    public java.util.List<CaSignTaskResult> getAntSignTaskResultList() {
        return this.antSignTaskResultList;
    }

}
