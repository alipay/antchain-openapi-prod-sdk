// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateAuthTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true, maxLength = 20)
    public String taskId;

    // 任务标题(同一个租户不能重复)
    @NameInMap("task_name")
    @Validation(required = true, maxLength = 20)
    public String taskName;

    // appId
    @NameInMap("app_id")
    @Validation(required = true, maxLength = 32)
    public String appId;

    // 问卷id(同一个租户不能重复，只能包含字母、数组或者下划线)
    @NameInMap("survey_id")
    @Validation(required = true, maxLength = 32)
    public String surveyId;

    // notes
    @NameInMap("notes")
    @Validation(maxLength = 32)
    public String notes;

    // 任务调整操作者
    @NameInMap("operator")
    @Validation(required = true, maxLength = 100)
    public String operator;

    // banner标题
    @NameInMap("banner_title")
    @Validation(required = true, maxLength = 30)
    public String bannerTitle;

    // banner图片地址（最多支持3张）
    @NameInMap("banner_image_urls")
    public java.util.List<String> bannerImageUrls;

    // 题量
    @NameInMap("question_num")
    @Validation(required = true)
    public Long questionNum;

    // 任务连接地址
    @NameInMap("task_link_url")
    @Validation(required = true, maxLength = 1000)
    public String taskLinkUrl;

    // 人群划分描述
    @NameInMap("person_divide_content")
    @Validation(maxLength = 1000)
    public String personDivideContent;

    // 城市列表
    @NameInMap("city_divide_urls")
    public java.util.List<String> cityDivideUrls;

    // 样本数量
    @NameInMap("sample_num")
    @Validation(required = true)
    public Long sampleNum;

    // 产品下单code类型（1-资源包 2-后付费）
    @NameInMap("product_code_type")
    @Validation(required = true, maxLength = 4)
    public String productCodeType;

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

    // 全额红包金额（价格在0.01~100），奖励渠道为0和1时
    @NameInMap("full_red_packet_amount")
    @Validation(required = true)
    public String fullRedPacketAmount;

    // 甄别红包金额
    @NameInMap("examine_red_packet_amount")
    @Validation(required = true)
    public String examineRedPacketAmount;

    // 全额红包描述，奖励渠道为2时，此处必填
    @NameInMap("full_red_packet_text_info")
    public String fullRedPacketTextInfo;

    // 证书内容
    @NameInMap("cert_content")
    @Validation(required = true)
    public String certContent;

    // 人群配置
    @NameInMap("crowd_config")
    @Validation(required = true)
    public String crowdConfig;

    // 是否草稿，1表示草稿
    @NameInMap("draft")
    @Validation(required = true)
    public String draft;

    public static UpdateAuthTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthTaskRequest self = new UpdateAuthTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAuthTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAuthTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateAuthTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdateAuthTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAuthTaskRequest setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

    public UpdateAuthTaskRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public UpdateAuthTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateAuthTaskRequest setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
        return this;
    }
    public String getBannerTitle() {
        return this.bannerTitle;
    }

    public UpdateAuthTaskRequest setBannerImageUrls(java.util.List<String> bannerImageUrls) {
        this.bannerImageUrls = bannerImageUrls;
        return this;
    }
    public java.util.List<String> getBannerImageUrls() {
        return this.bannerImageUrls;
    }

    public UpdateAuthTaskRequest setQuestionNum(Long questionNum) {
        this.questionNum = questionNum;
        return this;
    }
    public Long getQuestionNum() {
        return this.questionNum;
    }

    public UpdateAuthTaskRequest setTaskLinkUrl(String taskLinkUrl) {
        this.taskLinkUrl = taskLinkUrl;
        return this;
    }
    public String getTaskLinkUrl() {
        return this.taskLinkUrl;
    }

    public UpdateAuthTaskRequest setPersonDivideContent(String personDivideContent) {
        this.personDivideContent = personDivideContent;
        return this;
    }
    public String getPersonDivideContent() {
        return this.personDivideContent;
    }

    public UpdateAuthTaskRequest setCityDivideUrls(java.util.List<String> cityDivideUrls) {
        this.cityDivideUrls = cityDivideUrls;
        return this;
    }
    public java.util.List<String> getCityDivideUrls() {
        return this.cityDivideUrls;
    }

    public UpdateAuthTaskRequest setSampleNum(Long sampleNum) {
        this.sampleNum = sampleNum;
        return this;
    }
    public Long getSampleNum() {
        return this.sampleNum;
    }

    public UpdateAuthTaskRequest setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
        return this;
    }
    public String getProductCodeType() {
        return this.productCodeType;
    }

    public UpdateAuthTaskRequest setPrizeChannel(Long prizeChannel) {
        this.prizeChannel = prizeChannel;
        return this;
    }
    public Long getPrizeChannel() {
        return this.prizeChannel;
    }

    public UpdateAuthTaskRequest setAlipayAccountId(String alipayAccountId) {
        this.alipayAccountId = alipayAccountId;
        return this;
    }
    public String getAlipayAccountId() {
        return this.alipayAccountId;
    }

    public UpdateAuthTaskRequest setPrizeType(Long prizeType) {
        this.prizeType = prizeType;
        return this;
    }
    public Long getPrizeType() {
        return this.prizeType;
    }

    public UpdateAuthTaskRequest setFullRedPacketAmount(String fullRedPacketAmount) {
        this.fullRedPacketAmount = fullRedPacketAmount;
        return this;
    }
    public String getFullRedPacketAmount() {
        return this.fullRedPacketAmount;
    }

    public UpdateAuthTaskRequest setExamineRedPacketAmount(String examineRedPacketAmount) {
        this.examineRedPacketAmount = examineRedPacketAmount;
        return this;
    }
    public String getExamineRedPacketAmount() {
        return this.examineRedPacketAmount;
    }

    public UpdateAuthTaskRequest setFullRedPacketTextInfo(String fullRedPacketTextInfo) {
        this.fullRedPacketTextInfo = fullRedPacketTextInfo;
        return this;
    }
    public String getFullRedPacketTextInfo() {
        return this.fullRedPacketTextInfo;
    }

    public UpdateAuthTaskRequest setCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }
    public String getCertContent() {
        return this.certContent;
    }

    public UpdateAuthTaskRequest setCrowdConfig(String crowdConfig) {
        this.crowdConfig = crowdConfig;
        return this;
    }
    public String getCrowdConfig() {
        return this.crowdConfig;
    }

    public UpdateAuthTaskRequest setDraft(String draft) {
        this.draft = draft;
        return this;
    }
    public String getDraft() {
        return this.draft;
    }

}
