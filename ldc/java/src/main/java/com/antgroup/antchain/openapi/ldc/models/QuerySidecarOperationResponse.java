// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecarOperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 是否结束
    @NameInMap("finished")
    public Boolean finished;

    // 执行状态
    @NameInMap("operation_status")
    public String operationStatus;

    // 执行详情
    @NameInMap("target_processes")
    public java.util.List<String> targetProcesses;

    // 发布分组执行详情
    @NameInMap("process_detail_list")
    public java.util.List<SidecarOpsMachineGroup> processDetailList;

    // 扩展信息
    @NameInMap("properties")
    public String properties;

    public static QuerySidecarOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecarOperationResponse self = new QuerySidecarOperationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySidecarOperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySidecarOperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySidecarOperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySidecarOperationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySidecarOperationResponse setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public QuerySidecarOperationResponse setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public QuerySidecarOperationResponse setTargetProcesses(java.util.List<String> targetProcesses) {
        this.targetProcesses = targetProcesses;
        return this;
    }
    public java.util.List<String> getTargetProcesses() {
        return this.targetProcesses;
    }

    public QuerySidecarOperationResponse setProcessDetailList(java.util.List<SidecarOpsMachineGroup> processDetailList) {
        this.processDetailList = processDetailList;
        return this;
    }
    public java.util.List<SidecarOpsMachineGroup> getProcessDetailList() {
        return this.processDetailList;
    }

    public QuerySidecarOperationResponse setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
