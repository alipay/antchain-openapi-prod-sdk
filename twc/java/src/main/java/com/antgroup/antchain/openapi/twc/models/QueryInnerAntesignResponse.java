// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryInnerAntesignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务流水号
    @NameInMap("biz_no")
    public String bizNo;

    // 签署流水id
    @NameInMap("sign_flow_id")
    public String signFlowId;

    // 签署子任务结果
    @NameInMap("ant_sign_task_result_list")
    public java.util.List<AntSignTaskResult> antSignTaskResultList;

    // 总状态INIT-初始化
    // SIGNING-签署中
    // FINISH-已完成
    @NameInMap("status")
    public String status;

    // 应用方来源信息
    @NameInMap("app_name")
    public String appName;

    // 租户信息
    @NameInMap("tenant_name")
    public String tenantName;

    // 签署中心流程id
    @NameInMap("sign_center_id")
    public String signCenterId;

    public static QueryInnerAntesignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAntesignResponse self = new QueryInnerAntesignResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerAntesignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerAntesignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerAntesignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerAntesignResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryInnerAntesignResponse setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public QueryInnerAntesignResponse setAntSignTaskResultList(java.util.List<AntSignTaskResult> antSignTaskResultList) {
        this.antSignTaskResultList = antSignTaskResultList;
        return this;
    }
    public java.util.List<AntSignTaskResult> getAntSignTaskResultList() {
        return this.antSignTaskResultList;
    }

    public QueryInnerAntesignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerAntesignResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInnerAntesignResponse setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryInnerAntesignResponse setSignCenterId(String signCenterId) {
        this.signCenterId = signCenterId;
        return this;
    }
    public String getSignCenterId() {
        return this.signCenterId;
    }

}
