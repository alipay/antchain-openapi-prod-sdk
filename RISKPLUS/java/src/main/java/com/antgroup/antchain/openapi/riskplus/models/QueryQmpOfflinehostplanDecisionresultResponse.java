// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpOfflinehostplanDecisionresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 安全托管计划编码
    @NameInMap("plan_code")
    public String planCode;

    // EXECUTING/DECISI ON_SUCCESS/DECISION_FAIL/CANCEL。执行中/成功/失败/取消。
    @NameInMap("status")
    public String status;

    // 总托管数量
    @NameInMap("total_num")
    public Long totalNum;

    // 分层结果数
    @NameInMap("decision_num")
    public Long decisionNum;

    // 分层结果的oss文件路径
    @NameInMap("file_url")
    public String fileUrl;

    // 触达确认状态.Y/N,已确认，未确认，当前计划无触达则为空
    @NameInMap("action_confirm_status")
    public String actionConfirmStatus;

    // 触达时间
    @NameInMap("action_time")
    public String actionTime;

    public static QueryQmpOfflinehostplanDecisionresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpOfflinehostplanDecisionresultResponse self = new QueryQmpOfflinehostplanDecisionresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setDecisionNum(Long decisionNum) {
        this.decisionNum = decisionNum;
        return this;
    }
    public Long getDecisionNum() {
        return this.decisionNum;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setActionConfirmStatus(String actionConfirmStatus) {
        this.actionConfirmStatus = actionConfirmStatus;
        return this;
    }
    public String getActionConfirmStatus() {
        return this.actionConfirmStatus;
    }

    public QueryQmpOfflinehostplanDecisionresultResponse setActionTime(String actionTime) {
        this.actionTime = actionTime;
        return this;
    }
    public String getActionTime() {
        return this.actionTime;
    }

}
