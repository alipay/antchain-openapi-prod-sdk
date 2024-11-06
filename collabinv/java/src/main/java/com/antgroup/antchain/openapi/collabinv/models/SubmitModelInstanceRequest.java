// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class SubmitModelInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 模型文件路径
    @NameInMap("model_file_path")
    @Validation(required = true)
    public String modelFilePath;

    // 特征集路径
    @NameInMap("features_file_path")
    @Validation(required = true)
    public String featuresFilePath;

    // 示例文件路径
    @NameInMap("demo_file_path")
    public String demoFilePath;

    // 模型编码，同一租户下唯一，后续回溯生产调用标记
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    public static SubmitModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitModelInstanceRequest self = new SubmitModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitModelInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitModelInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitModelInstanceRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public SubmitModelInstanceRequest setModelFilePath(String modelFilePath) {
        this.modelFilePath = modelFilePath;
        return this;
    }
    public String getModelFilePath() {
        return this.modelFilePath;
    }

    public SubmitModelInstanceRequest setFeaturesFilePath(String featuresFilePath) {
        this.featuresFilePath = featuresFilePath;
        return this;
    }
    public String getFeaturesFilePath() {
        return this.featuresFilePath;
    }

    public SubmitModelInstanceRequest setDemoFilePath(String demoFilePath) {
        this.demoFilePath = demoFilePath;
        return this;
    }
    public String getDemoFilePath() {
        return this.demoFilePath;
    }

    public SubmitModelInstanceRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
