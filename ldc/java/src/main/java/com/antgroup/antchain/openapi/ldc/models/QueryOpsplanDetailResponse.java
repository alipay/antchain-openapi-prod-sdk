// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单包含的应用数
    @NameInMap("app_count")
    public Long appCount;

    // 应用信息列表
    @NameInMap("app_infos")
    public java.util.List<AppSimpleInfo> appInfos;

    // 执行人
    @NameInMap("executor")
    public String executor;

    // 发布结束时间
    @NameInMap("finish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishTime;

    // 应用分组概要信息列表
    @NameInMap("group_collection_list")
    public java.util.List<AppGroupSimpleViewList> groupCollectionList;

    // 发布单id
    @NameInMap("id")
    public String id;

    // 错误信息
    @NameInMap("message_detail")
    public String messageDetail;

    // 运维单类型
    // 
    @NameInMap("mode")
    public String mode;

    // 发布单标题
    @NameInMap("name")
    public String name;

    // 备注信息
    @NameInMap("remark")
    public String remark;

    // 发布开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 发布单状态
    // 
    @NameInMap("state")
    public String state;

    // 发布单号
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // 发布单类型
    @NameInMap("type")
    public String type;

    // pod数量
    @NameInMap("pod_count")
    public Long podCount;

    // 审批状态：AGREE-同意，REJECTED-拒绝，CANCELED-取消
    @NameInMap("approval_status")
    public String approvalStatus;

    // 审批详情url
    @NameInMap("approval_url")
    public String approvalUrl;

    public static QueryOpsplanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanDetailResponse self = new QueryOpsplanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsplanDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsplanDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsplanDetailResponse setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

    public QueryOpsplanDetailResponse setAppInfos(java.util.List<AppSimpleInfo> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<AppSimpleInfo> getAppInfos() {
        return this.appInfos;
    }

    public QueryOpsplanDetailResponse setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public QueryOpsplanDetailResponse setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public QueryOpsplanDetailResponse setGroupCollectionList(java.util.List<AppGroupSimpleViewList> groupCollectionList) {
        this.groupCollectionList = groupCollectionList;
        return this;
    }
    public java.util.List<AppGroupSimpleViewList> getGroupCollectionList() {
        return this.groupCollectionList;
    }

    public QueryOpsplanDetailResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryOpsplanDetailResponse setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
        return this;
    }
    public String getMessageDetail() {
        return this.messageDetail;
    }

    public QueryOpsplanDetailResponse setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryOpsplanDetailResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryOpsplanDetailResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryOpsplanDetailResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryOpsplanDetailResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryOpsplanDetailResponse setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryOpsplanDetailResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryOpsplanDetailResponse setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
    }

    public QueryOpsplanDetailResponse setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public QueryOpsplanDetailResponse setApprovalUrl(String approvalUrl) {
        this.approvalUrl = approvalUrl;
        return this;
    }
    public String getApprovalUrl() {
        return this.approvalUrl;
    }

}
