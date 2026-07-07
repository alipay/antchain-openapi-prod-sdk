// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class CreateAntdigitalCorlabFeatureminingPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据来源
    @NameInMap("data_source")
    @Validation(required = true)
    public String dataSource;

    // 业务领域
    @NameInMap("risk_domain")
    @Validation(required = true)
    public String riskDomain;

    // 业务版块
    @NameInMap("risk_category")
    @Validation(required = true)
    public String riskCategory;

    // 业务场景
    @NameInMap("risk_scene")
    @Validation(required = true)
    public String riskScene;

    // agent目标导向
    @NameInMap("demand_detail")
    public String demandDetail;

    // 交易表/浏览表
    @NameInMap("depend_tables")
    @Validation(required = true)
    public String dependTables;

    // 运行小时数
    @NameInMap("run_hours")
    @Validation(required = true)
    public Long runHours;

    // 15
    @NameInMap("run_minutes")
    public Long runMinutes;

    // 100
    @NameInMap("feature_num")
    @Validation(required = true)
    public Long featureNum;

    // iv要求
    @NameInMap("iv")
    public Long iv;

    // 1702
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public Long fileId;

    // 客群
    @NameInMap("customer_group")
    public String customerGroup;

    // 是否进行模型评估
    @NameInMap("model_evaluate")
    @Validation(required = true)
    public Boolean modelEvaluate;

    // 基模选择
    @NameInMap("basic_model")
    @Validation(required = true)
    public String basicModel;

    public static CreateAntdigitalCorlabFeatureminingPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalCorlabFeatureminingPlanRequest self = new CreateAntdigitalCorlabFeatureminingPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setRiskDomain(String riskDomain) {
        this.riskDomain = riskDomain;
        return this;
    }
    public String getRiskDomain() {
        return this.riskDomain;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }
    public String getRiskCategory() {
        return this.riskCategory;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setRiskScene(String riskScene) {
        this.riskScene = riskScene;
        return this;
    }
    public String getRiskScene() {
        return this.riskScene;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setDemandDetail(String demandDetail) {
        this.demandDetail = demandDetail;
        return this;
    }
    public String getDemandDetail() {
        return this.demandDetail;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setDependTables(String dependTables) {
        this.dependTables = dependTables;
        return this;
    }
    public String getDependTables() {
        return this.dependTables;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setRunHours(Long runHours) {
        this.runHours = runHours;
        return this;
    }
    public Long getRunHours() {
        return this.runHours;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setRunMinutes(Long runMinutes) {
        this.runMinutes = runMinutes;
        return this;
    }
    public Long getRunMinutes() {
        return this.runMinutes;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setFeatureNum(Long featureNum) {
        this.featureNum = featureNum;
        return this;
    }
    public Long getFeatureNum() {
        return this.featureNum;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setIv(Long iv) {
        this.iv = iv;
        return this;
    }
    public Long getIv() {
        return this.iv;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }
    public String getCustomerGroup() {
        return this.customerGroup;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setModelEvaluate(Boolean modelEvaluate) {
        this.modelEvaluate = modelEvaluate;
        return this;
    }
    public Boolean getModelEvaluate() {
        return this.modelEvaluate;
    }

    public CreateAntdigitalCorlabFeatureminingPlanRequest setBasicModel(String basicModel) {
        this.basicModel = basicModel;
        return this;
    }
    public String getBasicModel() {
        return this.basicModel;
    }

}
