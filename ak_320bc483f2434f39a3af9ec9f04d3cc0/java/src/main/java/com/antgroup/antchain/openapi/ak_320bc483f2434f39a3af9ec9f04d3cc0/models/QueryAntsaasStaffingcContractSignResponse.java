// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcContractSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流程id
    @NameInMap("flow_id")
    public String flowId;

    // 文件有效截止日期
    @NameInMap("contract_validity")
    public Long contractValidity;

    // 流程描述
    @NameInMap("flow_desc")
    public String flowDesc;

    // 流程开始时间
    @NameInMap("flow_start_time")
    public String flowStartTime;

    // 流程结束时间
    @NameInMap("flow_end_time")
    public String flowEndTime;

    // 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
    @NameInMap("flow_status")
    public Long flowStatus;

    // 合同文件id
    @NameInMap("file_id")
    public String fileId;

    // 合同文件名称
    @NameInMap("file_name")
    public String fileName;

    // 合同文件下载地址（1小时内有效）
    @NameInMap("file_url")
    public String fileUrl;

    public static QueryAntsaasStaffingcContractSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcContractSignResponse self = new QueryAntsaasStaffingcContractSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcContractSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsaasStaffingcContractSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsaasStaffingcContractSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsaasStaffingcContractSignResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryAntsaasStaffingcContractSignResponse setContractValidity(Long contractValidity) {
        this.contractValidity = contractValidity;
        return this;
    }
    public Long getContractValidity() {
        return this.contractValidity;
    }

    public QueryAntsaasStaffingcContractSignResponse setFlowDesc(String flowDesc) {
        this.flowDesc = flowDesc;
        return this;
    }
    public String getFlowDesc() {
        return this.flowDesc;
    }

    public QueryAntsaasStaffingcContractSignResponse setFlowStartTime(String flowStartTime) {
        this.flowStartTime = flowStartTime;
        return this;
    }
    public String getFlowStartTime() {
        return this.flowStartTime;
    }

    public QueryAntsaasStaffingcContractSignResponse setFlowEndTime(String flowEndTime) {
        this.flowEndTime = flowEndTime;
        return this;
    }
    public String getFlowEndTime() {
        return this.flowEndTime;
    }

    public QueryAntsaasStaffingcContractSignResponse setFlowStatus(Long flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public Long getFlowStatus() {
        return this.flowStatus;
    }

    public QueryAntsaasStaffingcContractSignResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public QueryAntsaasStaffingcContractSignResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryAntsaasStaffingcContractSignResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
