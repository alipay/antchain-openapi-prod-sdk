// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDciPreregistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 作品名称
    @NameInMap("work_name")
    @Validation(required = true)
    public String workName;

    // 作品类型
    @NameInMap("work_category")
    @Validation(required = true)
    public String workCategory;

    // 推荐作品分类
    @NameInMap("recommend_work_category")
    public String recommendWorkCategory;

    // 作品oss文件Id
    @NameInMap("work_file_id")
    @Validation(required = true)
    public String workFileId;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 创作信息
    @NameInMap("creation_info")
    @Validation(required = true)
    public DciCreationInfo creationInfo;

    // 发表信息
    @NameInMap("publication_info")
    @Validation(required = true)
    public DciPublicationInfo publicationInfo;

    // 作者姓名
    @NameInMap("author_name")
    @Validation(required = true)
    public String authorName;

    // 作者署名
    @NameInMap("author_signature")
    public String authorSignature;

    // 原创声明
    @NameInMap("original_statement")
    public String originalStatement;

    // 权利信息
    @NameInMap("right_info")
    @Validation(required = true)
    public DciRightInfo rightInfo;

    // 真实意愿表达信息
    @NameInMap("pre_registration_true_will")
    @Validation(required = true)
    public String preRegistrationTrueWill;

    // dci用户id
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // 代理信息
    @NameInMap("proxy_data")
    public ProxyData proxyData;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 作品类型相似度
    @NameInMap("category_similar_ratio")
    public String categorySimilarRatio;

    // 作品类型风险等级
    @NameInMap("category_risk_rank")
    public String categoryRiskRank;

    // 著作权人用户id List
    @NameInMap("copyright_owner_ids")
    @Validation(required = true)
    public java.util.List<String> copyrightOwnerIds;

    // DCI类型
    @NameInMap("apply_type")
    public String applyType;

    // 渠道标签
    @NameInMap("channel_terminal")
    public String channelTerminal;

    // 推荐分类明细信息
    @NameInMap("recommend_category_list")
    public java.util.List<RecommendCategoryDetail> recommendCategoryList;

    // 证书样式ID
    @NameInMap("customize_cert_id")
    public String customizeCertId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    public static CreateDciPreregistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDciPreregistrationRequest self = new CreateDciPreregistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDciPreregistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDciPreregistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDciPreregistrationRequest setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

    public CreateDciPreregistrationRequest setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
        return this;
    }
    public String getWorkCategory() {
        return this.workCategory;
    }

    public CreateDciPreregistrationRequest setRecommendWorkCategory(String recommendWorkCategory) {
        this.recommendWorkCategory = recommendWorkCategory;
        return this;
    }
    public String getRecommendWorkCategory() {
        return this.recommendWorkCategory;
    }

    public CreateDciPreregistrationRequest setWorkFileId(String workFileId) {
        this.workFileId = workFileId;
        return this;
    }
    public String getWorkFileId() {
        return this.workFileId;
    }

    public CreateDciPreregistrationRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateDciPreregistrationRequest setCreationInfo(DciCreationInfo creationInfo) {
        this.creationInfo = creationInfo;
        return this;
    }
    public DciCreationInfo getCreationInfo() {
        return this.creationInfo;
    }

    public CreateDciPreregistrationRequest setPublicationInfo(DciPublicationInfo publicationInfo) {
        this.publicationInfo = publicationInfo;
        return this;
    }
    public DciPublicationInfo getPublicationInfo() {
        return this.publicationInfo;
    }

    public CreateDciPreregistrationRequest setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public CreateDciPreregistrationRequest setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
        return this;
    }
    public String getAuthorSignature() {
        return this.authorSignature;
    }

    public CreateDciPreregistrationRequest setOriginalStatement(String originalStatement) {
        this.originalStatement = originalStatement;
        return this;
    }
    public String getOriginalStatement() {
        return this.originalStatement;
    }

    public CreateDciPreregistrationRequest setRightInfo(DciRightInfo rightInfo) {
        this.rightInfo = rightInfo;
        return this;
    }
    public DciRightInfo getRightInfo() {
        return this.rightInfo;
    }

    public CreateDciPreregistrationRequest setPreRegistrationTrueWill(String preRegistrationTrueWill) {
        this.preRegistrationTrueWill = preRegistrationTrueWill;
        return this;
    }
    public String getPreRegistrationTrueWill() {
        return this.preRegistrationTrueWill;
    }

    public CreateDciPreregistrationRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public CreateDciPreregistrationRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

    public CreateDciPreregistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDciPreregistrationRequest setCategorySimilarRatio(String categorySimilarRatio) {
        this.categorySimilarRatio = categorySimilarRatio;
        return this;
    }
    public String getCategorySimilarRatio() {
        return this.categorySimilarRatio;
    }

    public CreateDciPreregistrationRequest setCategoryRiskRank(String categoryRiskRank) {
        this.categoryRiskRank = categoryRiskRank;
        return this;
    }
    public String getCategoryRiskRank() {
        return this.categoryRiskRank;
    }

    public CreateDciPreregistrationRequest setCopyrightOwnerIds(java.util.List<String> copyrightOwnerIds) {
        this.copyrightOwnerIds = copyrightOwnerIds;
        return this;
    }
    public java.util.List<String> getCopyrightOwnerIds() {
        return this.copyrightOwnerIds;
    }

    public CreateDciPreregistrationRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public CreateDciPreregistrationRequest setChannelTerminal(String channelTerminal) {
        this.channelTerminal = channelTerminal;
        return this;
    }
    public String getChannelTerminal() {
        return this.channelTerminal;
    }

    public CreateDciPreregistrationRequest setRecommendCategoryList(java.util.List<RecommendCategoryDetail> recommendCategoryList) {
        this.recommendCategoryList = recommendCategoryList;
        return this;
    }
    public java.util.List<RecommendCategoryDetail> getRecommendCategoryList() {
        return this.recommendCategoryList;
    }

    public CreateDciPreregistrationRequest setCustomizeCertId(String customizeCertId) {
        this.customizeCertId = customizeCertId;
        return this;
    }
    public String getCustomizeCertId() {
        return this.customizeCertId;
    }

    public CreateDciPreregistrationRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
