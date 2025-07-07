// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TaskListInfoDTO extends TeaModel {
    // 任务名称
    /**
     * <strong>example:</strong>
     * <p>普通任务</p>
     */
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>qdQxqU5gz</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // appId
    /**
     * <strong>example:</strong>
     * <p>2021004121633301</p>
     */
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 自有ID
    /**
     * <strong>example:</strong>
     * <p>ybl1112</p>
     */
    @NameInMap("survey_id")
    @Validation(required = true)
    public String surveyId;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>RIVUFSJG</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户名称
    /**
     * <strong>example:</strong>
     * <p>李强</p>
     */
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 操作员
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:eipzps@alitest.comtest">eipzps@alitest.comtest</a></p>
     */
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 样本数量
    @NameInMap("sample_num")
    @Validation(required = true)
    public Long sampleNum;

    // 完成数量
    @NameInMap("completed_num")
    @Validation(required = true)
    public Long completedNum;

    // 甄别数量
    @NameInMap("screen_num")
    @Validation(required = true)
    public Long screenNum;

    // 样本总金额
    /**
     * <strong>example:</strong>
     * <p>10.00</p>
     */
    @NameInMap("sample_total_amount")
    @Validation(required = true)
    public String sampleTotalAmount;

    // 全额红包总金额
    /**
     * <strong>example:</strong>
     * <p>20.00</p>
     */
    @NameInMap("red_packet_total_amount")
    @Validation(required = true)
    public String redPacketTotalAmount;

    // 该任务总金额
    /**
     * <strong>example:</strong>
     * <p>30.00</p>
     */
    @NameInMap("task_total_amount")
    @Validation(required = true)
    public String taskTotalAmount;

    // 全额红包金额
    /**
     * <strong>example:</strong>
     * <p>1.00</p>
     */
    @NameInMap("full_red_packet_amount")
    @Validation(required = true)
    public String fullRedPacketAmount;

    // 甄别红包金额
    /**
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("examine_red_packet_amount")
    @Validation(required = true)
    public String examineRedPacketAmount;

    // 发证量
    @NameInMap("issued_num")
    public Long issuedNum;

    // 产品下单code类型（1-资源包 2-后付费）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("product_code_type")
    @Validation(required = true)
    public String productCodeType;

    // 审核理由
    /**
     * <strong>example:</strong>
     * <p>拒绝,图片不合适</p>
     */
    @NameInMap("review_content")
    public String reviewContent;

    // 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // ap状态，1:启用，0：审批中
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ap_status")
    @Validation(required = true)
    public String apStatus;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("prize_channel")
    @Validation(required = true)
    public Long prizeChannel;

    // 奖励渠道为问卷自带时，全额红包信息
    /**
     * <strong>example:</strong>
     * <p>1-5元红包</p>
     */
    @NameInMap("full_red_packet_text_info")
    public String fullRedPacketTextInfo;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2023-12-22 10:34:11</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2023-12-22 10:11:33</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 投放时间
    /**
     * <strong>example:</strong>
     * <p>2023-12-23 10:11:22</p>
     */
    @NameInMap("gmt_online")
    public String gmtOnline;

    // 最近暂停/完成时间
    /**
     * <strong>example:</strong>
     * <p>2022-12-22 09:11:11</p>
     */
    @NameInMap("gmt_pause_or_complete")
    public String gmtPauseOrComplete;

    // 最近一轮用时（h）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("last_round_time")
    public Long lastRoundTime;

    public static TaskListInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        TaskListInfoDTO self = new TaskListInfoDTO();
        return TeaModel.build(map, self);
    }

    public TaskListInfoDTO setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public TaskListInfoDTO setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskListInfoDTO setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public TaskListInfoDTO setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

    public TaskListInfoDTO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TaskListInfoDTO setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TaskListInfoDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TaskListInfoDTO setSampleNum(Long sampleNum) {
        this.sampleNum = sampleNum;
        return this;
    }
    public Long getSampleNum() {
        return this.sampleNum;
    }

    public TaskListInfoDTO setCompletedNum(Long completedNum) {
        this.completedNum = completedNum;
        return this;
    }
    public Long getCompletedNum() {
        return this.completedNum;
    }

    public TaskListInfoDTO setScreenNum(Long screenNum) {
        this.screenNum = screenNum;
        return this;
    }
    public Long getScreenNum() {
        return this.screenNum;
    }

    public TaskListInfoDTO setSampleTotalAmount(String sampleTotalAmount) {
        this.sampleTotalAmount = sampleTotalAmount;
        return this;
    }
    public String getSampleTotalAmount() {
        return this.sampleTotalAmount;
    }

    public TaskListInfoDTO setRedPacketTotalAmount(String redPacketTotalAmount) {
        this.redPacketTotalAmount = redPacketTotalAmount;
        return this;
    }
    public String getRedPacketTotalAmount() {
        return this.redPacketTotalAmount;
    }

    public TaskListInfoDTO setTaskTotalAmount(String taskTotalAmount) {
        this.taskTotalAmount = taskTotalAmount;
        return this;
    }
    public String getTaskTotalAmount() {
        return this.taskTotalAmount;
    }

    public TaskListInfoDTO setFullRedPacketAmount(String fullRedPacketAmount) {
        this.fullRedPacketAmount = fullRedPacketAmount;
        return this;
    }
    public String getFullRedPacketAmount() {
        return this.fullRedPacketAmount;
    }

    public TaskListInfoDTO setExamineRedPacketAmount(String examineRedPacketAmount) {
        this.examineRedPacketAmount = examineRedPacketAmount;
        return this;
    }
    public String getExamineRedPacketAmount() {
        return this.examineRedPacketAmount;
    }

    public TaskListInfoDTO setIssuedNum(Long issuedNum) {
        this.issuedNum = issuedNum;
        return this;
    }
    public Long getIssuedNum() {
        return this.issuedNum;
    }

    public TaskListInfoDTO setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
        return this;
    }
    public String getProductCodeType() {
        return this.productCodeType;
    }

    public TaskListInfoDTO setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
        return this;
    }
    public String getReviewContent() {
        return this.reviewContent;
    }

    public TaskListInfoDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskListInfoDTO setApStatus(String apStatus) {
        this.apStatus = apStatus;
        return this;
    }
    public String getApStatus() {
        return this.apStatus;
    }

    public TaskListInfoDTO setPrizeChannel(Long prizeChannel) {
        this.prizeChannel = prizeChannel;
        return this;
    }
    public Long getPrizeChannel() {
        return this.prizeChannel;
    }

    public TaskListInfoDTO setFullRedPacketTextInfo(String fullRedPacketTextInfo) {
        this.fullRedPacketTextInfo = fullRedPacketTextInfo;
        return this;
    }
    public String getFullRedPacketTextInfo() {
        return this.fullRedPacketTextInfo;
    }

    public TaskListInfoDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TaskListInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TaskListInfoDTO setGmtOnline(String gmtOnline) {
        this.gmtOnline = gmtOnline;
        return this;
    }
    public String getGmtOnline() {
        return this.gmtOnline;
    }

    public TaskListInfoDTO setGmtPauseOrComplete(String gmtPauseOrComplete) {
        this.gmtPauseOrComplete = gmtPauseOrComplete;
        return this;
    }
    public String getGmtPauseOrComplete() {
        return this.gmtPauseOrComplete;
    }

    public TaskListInfoDTO setLastRoundTime(Long lastRoundTime) {
        this.lastRoundTime = lastRoundTime;
        return this;
    }
    public Long getLastRoundTime() {
        return this.lastRoundTime;
    }

}
