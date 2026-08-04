// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataAssetProviderInfo extends TeaModel {
    // 数据提供商唯一标识码
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 数据提供商名称
    /**
     * <strong>example:</strong>
     * <p>浙江省xx医院</p>
     */
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 提供商类型
    // NATURAL_PERSON
    // LEGAL_PERSON
    // NON_LEGAL_ORGANIZATION
    // 
    /**
     * <strong>example:</strong>
     * <p>自然人</p>
     */
    @NameInMap("provider_type")
    @Validation(required = true)
    public String providerType;

    // 数据提供商主体信息
    /**
     * <strong>example:</strong>
     * <p>数据提供商主体信息</p>
     */
    @NameInMap("entity_information")
    @Validation(required = true)
    public String entityInformation;

    // 数据提供商身份标识
    /**
     * <strong>example:</strong>
     * <p>数据提供商身份标识</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    // 数据提供商简介
    /**
     * <strong>example:</strong>
     * <p>数据提供商简介</p>
     */
    @NameInMap("provider_desc")
    public String providerDesc;

    // 提供方信息--法人经办人姓名
    /**
     * <strong>example:</strong>
     * <p>提供方信息--法人经办人姓名</p>
     */
    @NameInMap("operator_name")
    public String operatorName;

    // 提供方信息--法人经办人电话
    /**
     * <strong>example:</strong>
     * <p>提供方信息--法人经办人电话</p>
     */
    @NameInMap("operator_telephone")
    public String operatorTelephone;

    // 提供方信息--法人经办人身份证
    /**
     * <strong>example:</strong>
     * <p>提供方信息--法人经办人身份证</p>
     */
    @NameInMap("operator_id_card")
    public String operatorIdCard;

    // 声明信息--授权委托书
    /**
     * <strong>example:</strong>
     * <p>声明信息--授权委托书</p>
     */
    @NameInMap("commissions")
    public java.util.List<DataAssetDocumentInfo> commissions;

    // 声明信息--数据样例
    /**
     * <strong>example:</strong>
     * <p>声明信息--数据样例</p>
     */
    @NameInMap("data_samples")
    public java.util.List<DataAssetDocumentInfo> dataSamples;

    // 声明信息--合法合规声明
    /**
     * <strong>example:</strong>
     * <p>声明信息--合法合规声明</p>
     */
    @NameInMap("compliance_and_legal_statements")
    public java.util.List<DataAssetDocumentInfo> complianceAndLegalStatements;

    // 声明信息--数据来源声明
    /**
     * <strong>example:</strong>
     * <p>声明信息--数据来源声明</p>
     */
    @NameInMap("data_source_statements")
    public java.util.List<DataAssetDocumentInfo> dataSourceStatements;

    // 声明信息--安全分级分类
    /**
     * <strong>example:</strong>
     * <p>声明信息--安全分级分类</p>
     */
    @NameInMap("safe_level_statements")
    public java.util.List<DataAssetDocumentInfo> safeLevelStatements;

    // 数据质量、产品价值评估报告
    /**
     * <strong>example:</strong>
     * <p>数据质量、产品价值评估报告</p>
     */
    @NameInMap("evaluation_reprots")
    public java.util.List<DataAssetDocumentInfo> evaluationReprots;

    // 其他额外信息
    /**
     * <strong>example:</strong>
     * <p>其他额外信息</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    public static DataAssetProviderInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetProviderInfo self = new DataAssetProviderInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetProviderInfo setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public DataAssetProviderInfo setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public DataAssetProviderInfo setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public DataAssetProviderInfo setEntityInformation(String entityInformation) {
        this.entityInformation = entityInformation;
        return this;
    }
    public String getEntityInformation() {
        return this.entityInformation;
    }

    public DataAssetProviderInfo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public DataAssetProviderInfo setProviderDesc(String providerDesc) {
        this.providerDesc = providerDesc;
        return this;
    }
    public String getProviderDesc() {
        return this.providerDesc;
    }

    public DataAssetProviderInfo setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public DataAssetProviderInfo setOperatorTelephone(String operatorTelephone) {
        this.operatorTelephone = operatorTelephone;
        return this;
    }
    public String getOperatorTelephone() {
        return this.operatorTelephone;
    }

    public DataAssetProviderInfo setOperatorIdCard(String operatorIdCard) {
        this.operatorIdCard = operatorIdCard;
        return this;
    }
    public String getOperatorIdCard() {
        return this.operatorIdCard;
    }

    public DataAssetProviderInfo setCommissions(java.util.List<DataAssetDocumentInfo> commissions) {
        this.commissions = commissions;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getCommissions() {
        return this.commissions;
    }

    public DataAssetProviderInfo setDataSamples(java.util.List<DataAssetDocumentInfo> dataSamples) {
        this.dataSamples = dataSamples;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getDataSamples() {
        return this.dataSamples;
    }

    public DataAssetProviderInfo setComplianceAndLegalStatements(java.util.List<DataAssetDocumentInfo> complianceAndLegalStatements) {
        this.complianceAndLegalStatements = complianceAndLegalStatements;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getComplianceAndLegalStatements() {
        return this.complianceAndLegalStatements;
    }

    public DataAssetProviderInfo setDataSourceStatements(java.util.List<DataAssetDocumentInfo> dataSourceStatements) {
        this.dataSourceStatements = dataSourceStatements;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getDataSourceStatements() {
        return this.dataSourceStatements;
    }

    public DataAssetProviderInfo setSafeLevelStatements(java.util.List<DataAssetDocumentInfo> safeLevelStatements) {
        this.safeLevelStatements = safeLevelStatements;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getSafeLevelStatements() {
        return this.safeLevelStatements;
    }

    public DataAssetProviderInfo setEvaluationReprots(java.util.List<DataAssetDocumentInfo> evaluationReprots) {
        this.evaluationReprots = evaluationReprots;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getEvaluationReprots() {
        return this.evaluationReprots;
    }

    public DataAssetProviderInfo setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
