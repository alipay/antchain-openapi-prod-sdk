// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否自动归档
    @NameInMap("auto_archive")
    public Boolean autoArchive;

    // 文件主题
    @NameInMap("business_scene")
    public String businessScene;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 流程配置信息
    @NameInMap("config_info")
    public ContractSignFlowConfig configInfo;

    // 文件到期前，提前多少小时提醒续签
    @NameInMap("contract_remind")
    public Long contractRemind;

    // 文件有效截止日期
    @NameInMap("contract_validity")
    public Long contractValidity;

    // 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
    @NameInMap("flow_desc")
    public String flowDesc;

    // 流程结束时间
    @NameInMap("flow_end_time")
    public String flowEndTime;

    // 流程ID
    @NameInMap("flow_id")
    public String flowId;

    // 流程开始时间
    @NameInMap("flow_start_time")
    public String flowStartTime;

    // 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
    @NameInMap("flow_status")
    public Long flowStatus;

    // 发起人账户id
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起方主体id
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 签署有效截止日期
    @NameInMap("sign_validity")
    public String signValidity;

    public static QueryContractFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractFlowResponse self = new QueryContractFlowResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractFlowResponse setAutoArchive(Boolean autoArchive) {
        this.autoArchive = autoArchive;
        return this;
    }
    public Boolean getAutoArchive() {
        return this.autoArchive;
    }

    public QueryContractFlowResponse setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryContractFlowResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractFlowResponse setConfigInfo(ContractSignFlowConfig configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public ContractSignFlowConfig getConfigInfo() {
        return this.configInfo;
    }

    public QueryContractFlowResponse setContractRemind(Long contractRemind) {
        this.contractRemind = contractRemind;
        return this;
    }
    public Long getContractRemind() {
        return this.contractRemind;
    }

    public QueryContractFlowResponse setContractValidity(Long contractValidity) {
        this.contractValidity = contractValidity;
        return this;
    }
    public Long getContractValidity() {
        return this.contractValidity;
    }

    public QueryContractFlowResponse setFlowDesc(String flowDesc) {
        this.flowDesc = flowDesc;
        return this;
    }
    public String getFlowDesc() {
        return this.flowDesc;
    }

    public QueryContractFlowResponse setFlowEndTime(String flowEndTime) {
        this.flowEndTime = flowEndTime;
        return this;
    }
    public String getFlowEndTime() {
        return this.flowEndTime;
    }

    public QueryContractFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryContractFlowResponse setFlowStartTime(String flowStartTime) {
        this.flowStartTime = flowStartTime;
        return this;
    }
    public String getFlowStartTime() {
        return this.flowStartTime;
    }

    public QueryContractFlowResponse setFlowStatus(Long flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public Long getFlowStatus() {
        return this.flowStatus;
    }

    public QueryContractFlowResponse setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public QueryContractFlowResponse setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

    public QueryContractFlowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractFlowResponse setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

}
