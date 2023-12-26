// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdatedTaskInfo extends TeaModel {
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

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

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
    @Validation(required = true)
    public CertInstanceDetail certInstanceDetail;

    // 审核意见
    @NameInMap("verify_omment")
    public String verifyOmment;

    // 任务创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 任务修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 审核理由
    @NameInMap("review_content")
    public String reviewContent;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 人群配置
    @NameInMap("crowd_config")
    @Validation(required = true)
    public String crowdConfig;

    public static UpdatedTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        UpdatedTaskInfo self = new UpdatedTaskInfo();
        return TeaModel.build(map, self);
    }

    public UpdatedTaskInfo setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdatedTaskInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdatedTaskInfo setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

    public UpdatedTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdatedTaskInfo setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public UpdatedTaskInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdatedTaskInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdatedTaskInfo setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
        return this;
    }
    public String getBannerTitle() {
        return this.bannerTitle;
    }

    public UpdatedTaskInfo setBannerImageUrls(String bannerImageUrls) {
        this.bannerImageUrls = bannerImageUrls;
        return this;
    }
    public String getBannerImageUrls() {
        return this.bannerImageUrls;
    }

    public UpdatedTaskInfo setBannerImageFullUrls(java.util.List<String> bannerImageFullUrls) {
        this.bannerImageFullUrls = bannerImageFullUrls;
        return this;
    }
    public java.util.List<String> getBannerImageFullUrls() {
        return this.bannerImageFullUrls;
    }

    public UpdatedTaskInfo setQuestionNum(Long questionNum) {
        this.questionNum = questionNum;
        return this;
    }
    public Long getQuestionNum() {
        return this.questionNum;
    }

    public UpdatedTaskInfo setTaskLinkUrl(String taskLinkUrl) {
        this.taskLinkUrl = taskLinkUrl;
        return this;
    }
    public String getTaskLinkUrl() {
        return this.taskLinkUrl;
    }

    public UpdatedTaskInfo setPersonDivideContent(String personDivideContent) {
        this.personDivideContent = personDivideContent;
        return this;
    }
    public String getPersonDivideContent() {
        return this.personDivideContent;
    }

    public UpdatedTaskInfo setCityDivideUrls(String cityDivideUrls) {
        this.cityDivideUrls = cityDivideUrls;
        return this;
    }
    public String getCityDivideUrls() {
        return this.cityDivideUrls;
    }

    public UpdatedTaskInfo setCityDivideFullUrls(java.util.List<String> cityDivideFullUrls) {
        this.cityDivideFullUrls = cityDivideFullUrls;
        return this;
    }
    public java.util.List<String> getCityDivideFullUrls() {
        return this.cityDivideFullUrls;
    }

    public UpdatedTaskInfo setSampleNum(Long sampleNum) {
        this.sampleNum = sampleNum;
        return this;
    }
    public Long getSampleNum() {
        return this.sampleNum;
    }

    public UpdatedTaskInfo setCompletedNum(Long completedNum) {
        this.completedNum = completedNum;
        return this;
    }
    public Long getCompletedNum() {
        return this.completedNum;
    }

    public UpdatedTaskInfo setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
        return this;
    }
    public String getProductCodeType() {
        return this.productCodeType;
    }

    public UpdatedTaskInfo setProductCapacity(Long productCapacity) {
        this.productCapacity = productCapacity;
        return this;
    }
    public Long getProductCapacity() {
        return this.productCapacity;
    }

    public UpdatedTaskInfo setPrizeChannel(Long prizeChannel) {
        this.prizeChannel = prizeChannel;
        return this;
    }
    public Long getPrizeChannel() {
        return this.prizeChannel;
    }

    public UpdatedTaskInfo setAlipayAccountId(String alipayAccountId) {
        this.alipayAccountId = alipayAccountId;
        return this;
    }
    public String getAlipayAccountId() {
        return this.alipayAccountId;
    }

    public UpdatedTaskInfo setPrizeType(Long prizeType) {
        this.prizeType = prizeType;
        return this;
    }
    public Long getPrizeType() {
        return this.prizeType;
    }

    public UpdatedTaskInfo setFullRedPacketAmount(String fullRedPacketAmount) {
        this.fullRedPacketAmount = fullRedPacketAmount;
        return this;
    }
    public String getFullRedPacketAmount() {
        return this.fullRedPacketAmount;
    }

    public UpdatedTaskInfo setFullRedPacketTextInfo(String fullRedPacketTextInfo) {
        this.fullRedPacketTextInfo = fullRedPacketTextInfo;
        return this;
    }
    public String getFullRedPacketTextInfo() {
        return this.fullRedPacketTextInfo;
    }

    public UpdatedTaskInfo setExamineRedPacketAmount(String examineRedPacketAmount) {
        this.examineRedPacketAmount = examineRedPacketAmount;
        return this;
    }
    public String getExamineRedPacketAmount() {
        return this.examineRedPacketAmount;
    }

    public UpdatedTaskInfo setCertInstanceId(String certInstanceId) {
        this.certInstanceId = certInstanceId;
        return this;
    }
    public String getCertInstanceId() {
        return this.certInstanceId;
    }

    public UpdatedTaskInfo setCertInstanceDetail(CertInstanceDetail certInstanceDetail) {
        this.certInstanceDetail = certInstanceDetail;
        return this;
    }
    public CertInstanceDetail getCertInstanceDetail() {
        return this.certInstanceDetail;
    }

    public UpdatedTaskInfo setVerifyOmment(String verifyOmment) {
        this.verifyOmment = verifyOmment;
        return this;
    }
    public String getVerifyOmment() {
        return this.verifyOmment;
    }

    public UpdatedTaskInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdatedTaskInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UpdatedTaskInfo setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
        return this;
    }
    public String getReviewContent() {
        return this.reviewContent;
    }

    public UpdatedTaskInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdatedTaskInfo setCrowdConfig(String crowdConfig) {
        this.crowdConfig = crowdConfig;
        return this;
    }
    public String getCrowdConfig() {
        return this.crowdConfig;
    }

}
