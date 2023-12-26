// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OldTaskInfo extends TeaModel {
    // 任务标题(同一个租户不能重复)
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 问卷ID
    @NameInMap("survey_id")
    @Validation(required = true)
    public String surveyId;

    // 备注信息
    @NameInMap("notes")
    public String notes;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 操作者ID
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // banner标题
    @NameInMap("banner_title")
    @Validation(required = true)
    public String bannerTitle;

    // banner图片地址（最多支持3张）
    @NameInMap("banner_image_urls")
    public String bannerImageUrls;

    // banner 图片地址, 拼装后的url
    @NameInMap("banner_image_full_urls")
    public java.util.List<String> bannerImageFullUrls;

    // 题量
    @NameInMap("question_num")
    @Validation(required = true)
    public Long questionNum;

    // 任务连接地址
    @NameInMap("task_link_url")
    @Validation(required = true)
    public String taskLinkUrl;

    // 人群划分描述
    @NameInMap("person_divide_content")
    public String personDivideContent;

    // 城市列表
    @NameInMap("city_divide_urls")
    public String cityDivideUrls;

    // 城市列表, 拼装后的url
    @NameInMap("city_divide_full_urls")
    public java.util.List<String> cityDivideFullUrls;

    // 样本数量
    @NameInMap("sample_num")
    @Validation(required = true)
    public Long sampleNum;

    // 完成样本量
    @NameInMap("completed_num")
    @Validation(required = true)
    public Long completedNum;

    // 产品下单code类型（1-资源包 2-后付费）
    @NameInMap("product_code_type")
    @Validation(required = true)
    public String productCodeType;

    // 产品余量
    @NameInMap("product_capacity")
    @Validation(required = true)
    public Long productCapacity;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    @NameInMap("prize_channel")
    @Validation(required = true)
    public Long prizeChannel;

    // 支付宝账号
    @NameInMap("alipay_account_id")
    public String alipayAccountId;

    // 奖励类型（0-定额红包）
    @NameInMap("prize_type")
    @Validation(required = true)
    public Long prizeType;

    // 全额红包金额，奖励渠道为0和1时
    @NameInMap("full_red_packet_amount")
    @Validation(required = true)
    public String fullRedPacketAmount;

    // 全额红包描述，奖励渠道为2时，此处必填
    @NameInMap("full_red_packet_text_info")
    public String fullRedPacketTextInfo;

    // 甄别红包金额
    @NameInMap("examine_red_packet_amount")
    @Validation(required = true)
    public String examineRedPacketAmount;

    // 关联的证书instanceId
    @NameInMap("cert_instance_id")
    public String certInstanceId;

    // 证书实例详情
    @NameInMap("cert_instance_detail")
    public CertInstanceDetail certInstanceDetail;

    // 审核建议
    @NameInMap("verify_comment")
    public String verifyComment;

    // 任务创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 任务更新时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 审核理由
    @NameInMap("review_content")
    public String reviewContent;

    // 人群配置信息
    @NameInMap("crowd_config")
    public String crowdConfig;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static OldTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        OldTaskInfo self = new OldTaskInfo();
        return TeaModel.build(map, self);
    }

    public OldTaskInfo setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public OldTaskInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OldTaskInfo setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

    public OldTaskInfo setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public OldTaskInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OldTaskInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public OldTaskInfo setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
        return this;
    }
    public String getBannerTitle() {
        return this.bannerTitle;
    }

    public OldTaskInfo setBannerImageUrls(String bannerImageUrls) {
        this.bannerImageUrls = bannerImageUrls;
        return this;
    }
    public String getBannerImageUrls() {
        return this.bannerImageUrls;
    }

    public OldTaskInfo setBannerImageFullUrls(java.util.List<String> bannerImageFullUrls) {
        this.bannerImageFullUrls = bannerImageFullUrls;
        return this;
    }
    public java.util.List<String> getBannerImageFullUrls() {
        return this.bannerImageFullUrls;
    }

    public OldTaskInfo setQuestionNum(Long questionNum) {
        this.questionNum = questionNum;
        return this;
    }
    public Long getQuestionNum() {
        return this.questionNum;
    }

    public OldTaskInfo setTaskLinkUrl(String taskLinkUrl) {
        this.taskLinkUrl = taskLinkUrl;
        return this;
    }
    public String getTaskLinkUrl() {
        return this.taskLinkUrl;
    }

    public OldTaskInfo setPersonDivideContent(String personDivideContent) {
        this.personDivideContent = personDivideContent;
        return this;
    }
    public String getPersonDivideContent() {
        return this.personDivideContent;
    }

    public OldTaskInfo setCityDivideUrls(String cityDivideUrls) {
        this.cityDivideUrls = cityDivideUrls;
        return this;
    }
    public String getCityDivideUrls() {
        return this.cityDivideUrls;
    }

    public OldTaskInfo setCityDivideFullUrls(java.util.List<String> cityDivideFullUrls) {
        this.cityDivideFullUrls = cityDivideFullUrls;
        return this;
    }
    public java.util.List<String> getCityDivideFullUrls() {
        return this.cityDivideFullUrls;
    }

    public OldTaskInfo setSampleNum(Long sampleNum) {
        this.sampleNum = sampleNum;
        return this;
    }
    public Long getSampleNum() {
        return this.sampleNum;
    }

    public OldTaskInfo setCompletedNum(Long completedNum) {
        this.completedNum = completedNum;
        return this;
    }
    public Long getCompletedNum() {
        return this.completedNum;
    }

    public OldTaskInfo setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
        return this;
    }
    public String getProductCodeType() {
        return this.productCodeType;
    }

    public OldTaskInfo setProductCapacity(Long productCapacity) {
        this.productCapacity = productCapacity;
        return this;
    }
    public Long getProductCapacity() {
        return this.productCapacity;
    }

    public OldTaskInfo setPrizeChannel(Long prizeChannel) {
        this.prizeChannel = prizeChannel;
        return this;
    }
    public Long getPrizeChannel() {
        return this.prizeChannel;
    }

    public OldTaskInfo setAlipayAccountId(String alipayAccountId) {
        this.alipayAccountId = alipayAccountId;
        return this;
    }
    public String getAlipayAccountId() {
        return this.alipayAccountId;
    }

    public OldTaskInfo setPrizeType(Long prizeType) {
        this.prizeType = prizeType;
        return this;
    }
    public Long getPrizeType() {
        return this.prizeType;
    }

    public OldTaskInfo setFullRedPacketAmount(String fullRedPacketAmount) {
        this.fullRedPacketAmount = fullRedPacketAmount;
        return this;
    }
    public String getFullRedPacketAmount() {
        return this.fullRedPacketAmount;
    }

    public OldTaskInfo setFullRedPacketTextInfo(String fullRedPacketTextInfo) {
        this.fullRedPacketTextInfo = fullRedPacketTextInfo;
        return this;
    }
    public String getFullRedPacketTextInfo() {
        return this.fullRedPacketTextInfo;
    }

    public OldTaskInfo setExamineRedPacketAmount(String examineRedPacketAmount) {
        this.examineRedPacketAmount = examineRedPacketAmount;
        return this;
    }
    public String getExamineRedPacketAmount() {
        return this.examineRedPacketAmount;
    }

    public OldTaskInfo setCertInstanceId(String certInstanceId) {
        this.certInstanceId = certInstanceId;
        return this;
    }
    public String getCertInstanceId() {
        return this.certInstanceId;
    }

    public OldTaskInfo setCertInstanceDetail(CertInstanceDetail certInstanceDetail) {
        this.certInstanceDetail = certInstanceDetail;
        return this;
    }
    public CertInstanceDetail getCertInstanceDetail() {
        return this.certInstanceDetail;
    }

    public OldTaskInfo setVerifyComment(String verifyComment) {
        this.verifyComment = verifyComment;
        return this;
    }
    public String getVerifyComment() {
        return this.verifyComment;
    }

    public OldTaskInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OldTaskInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OldTaskInfo setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
        return this;
    }
    public String getReviewContent() {
        return this.reviewContent;
    }

    public OldTaskInfo setCrowdConfig(String crowdConfig) {
        this.crowdConfig = crowdConfig;
        return this;
    }
    public String getCrowdConfig() {
        return this.crowdConfig;
    }

    public OldTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OldTaskInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
