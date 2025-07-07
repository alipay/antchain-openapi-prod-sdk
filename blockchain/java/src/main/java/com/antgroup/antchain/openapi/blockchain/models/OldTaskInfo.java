// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OldTaskInfo extends TeaModel {
    // 任务标题(同一个租户不能重复)
    /**
     * <strong>example:</strong>
     * <p>普通任务</p>
     */
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // appId
    /**
     * <strong>example:</strong>
     * <p>2021004121633301</p>
     */
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 问卷ID
    /**
     * <strong>example:</strong>
     * <p>ybl1112</p>
     */
    @NameInMap("survey_id")
    @Validation(required = true)
    public String surveyId;

    // 备注信息
    /**
     * <strong>example:</strong>
     * <p>普通任务备注</p>
     */
    @NameInMap("notes")
    public String notes;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>RIVUFSJG</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 操作者
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:eipzps@alitest.comtest">eipzps@alitest.comtest</a></p>
     */
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // banner标题
    /**
     * <strong>example:</strong>
     * <p>普通任务banner</p>
     */
    @NameInMap("banner_title")
    @Validation(required = true)
    public String bannerTitle;

    // banner图片地址（最多支持3张）
    /**
     * <strong>example:</strong>
     * <p>testTenant_1.png,testTenant_1.png</p>
     */
    @NameInMap("banner_image_urls")
    public String bannerImageUrls;

    // banner 图片地址, 拼装后的url
    /**
     * <strong>example:</strong>
     * <p>[&quot;testTenant_1.png&quot;,&quot;testTenant_1.png&quot;]</p>
     */
    @NameInMap("banner_image_full_urls")
    public java.util.List<String> bannerImageFullUrls;

    // 题量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("question_num")
    @Validation(required = true)
    public Long questionNum;

    // 任务连接地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://pro.wenjuan.com/t/a2">https://pro.wenjuan.com/t/a2</a></p>
     */
    @NameInMap("task_link_url")
    @Validation(required = true)
    public String taskLinkUrl;

    // 人群划分描述
    /**
     * <strong>example:</strong>
     * <p>购买过健身服装的人群</p>
     */
    @NameInMap("person_divide_content")
    public String personDivideContent;

    // 城市列表
    /**
     * <strong>example:</strong>
     * <p>北京,上海,新加坡</p>
     */
    @NameInMap("city_divide_urls")
    public String cityDivideUrls;

    // 城市列表, 拼装后的url
    /**
     * <strong>example:</strong>
     * <p>[&quot;北京&quot;,&quot;上海&quot;,&quot;新加坡&quot;]</p>
     */
    @NameInMap("city_divide_full_urls")
    public java.util.List<String> cityDivideFullUrls;

    // 样本数量
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sample_num")
    @Validation(required = true)
    public Long sampleNum;

    // 完成样本量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("completed_num")
    @Validation(required = true)
    public Long completedNum;

    // 产品下单code类型（1-资源包 2-后付费）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("product_code_type")
    @Validation(required = true)
    public String productCodeType;

    // 产品余量
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("product_capacity")
    @Validation(required = true)
    public Long productCapacity;

    // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("prize_channel")
    @Validation(required = true)
    public Long prizeChannel;

    // 支付宝账号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:kefu@lingdangshuo.com">kefu@lingdangshuo.com</a></p>
     */
    @NameInMap("alipay_account_id")
    public String alipayAccountId;

    // 奖励类型（0-定额红包）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("prize_type")
    @Validation(required = true)
    public Long prizeType;

    // 全额红包金额，奖励渠道为0和1时
    /**
     * <strong>example:</strong>
     * <p>1.00</p>
     */
    @NameInMap("full_red_packet_amount")
    @Validation(required = true)
    public String fullRedPacketAmount;

    // 全额红包描述，奖励渠道为2时，此处必填
    /**
     * <strong>example:</strong>
     * <p>1-5元红包</p>
     */
    @NameInMap("full_red_packet_text_info")
    public String fullRedPacketTextInfo;

    // 甄别红包金额
    /**
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("examine_red_packet_amount")
    @Validation(required = true)
    public String examineRedPacketAmount;

    // 关联的证书instanceId
    /**
     * <strong>example:</strong>
     * <p>6511ce4b43414e9588114682bbf9a893</p>
     */
    @NameInMap("cert_instance_id")
    public String certInstanceId;

    // 证书实例详情
    @NameInMap("cert_instance_detail")
    public CertInstanceDetail certInstanceDetail;

    // 审核建议
    /**
     * <strong>example:</strong>
     * <p>拒绝</p>
     */
    @NameInMap("verify_comment")
    public String verifyComment;

    // 任务创建时间
    /**
     * <strong>example:</strong>
     * <p>2023-12-20 12:19:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 任务更新时间
    /**
     * <strong>example:</strong>
     * <p>2023-12-20 12:45:00</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 审核理由
    /**
     * <strong>example:</strong>
     * <p>不合适</p>
     */
    @NameInMap("review_content")
    public String reviewContent;

    // 人群配置信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;exclude&quot;: false,&quot;nodeConfig&quot;: {&quot;groupType&quot;: &quot;AND&quot;,&quot;children&quot;: [&quot;exclude&quot;: false,&quot;nodeType&quot;: &quot;GROUP&quot;,&quot;nodeId&quot;: &quot;1303661d-a7da-4d8a-b646-0819f2fc2855&quot;,&quot;nodeConfig&quot;: {&quot;groupType&quot;: &quot;AND&quot;,&quot;children&quot;: []}}]},&quot;nodeId&quot;: &quot;ROOT&quot;,&quot;nodeType&quot;: &quot;GROUP&quot;}</p>
     */
    @NameInMap("crowd_config")
    public String crowdConfig;

    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>qdQxqU5gz</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
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
