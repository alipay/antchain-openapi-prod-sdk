// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyTechintegrationSkushipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品型号
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // 出货数量，上限8
    @NameInMap("quota")
    @Validation(required = true, maximum = 8, minimum = 1)
    public Long quota;

    // 产品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 安全方案
    @NameInMap("security_mechanism")
    @Validation(required = true)
    public String securityMechanism;

    // 证书类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 凭证种类
    @NameInMap("features")
    @Validation(required = true)
    public java.util.List<String> features;

    // 证书拉取任务ID
    @NameInMap("task_id")
    public String taskId;

    // 证书拉取任务批次
    @NameInMap("task_batch_num")
    public String taskBatchNum;

    // 重试标志
    @NameInMap("retry_flag")
    public Boolean retryFlag;

    public static ApplyTechintegrationSkushipRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTechintegrationSkushipRequest self = new ApplyTechintegrationSkushipRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTechintegrationSkushipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTechintegrationSkushipRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyTechintegrationSkushipRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public ApplyTechintegrationSkushipRequest setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public ApplyTechintegrationSkushipRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ApplyTechintegrationSkushipRequest setSecurityMechanism(String securityMechanism) {
        this.securityMechanism = securityMechanism;
        return this;
    }
    public String getSecurityMechanism() {
        return this.securityMechanism;
    }

    public ApplyTechintegrationSkushipRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ApplyTechintegrationSkushipRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public ApplyTechintegrationSkushipRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ApplyTechintegrationSkushipRequest setTaskBatchNum(String taskBatchNum) {
        this.taskBatchNum = taskBatchNum;
        return this;
    }
    public String getTaskBatchNum() {
        return this.taskBatchNum;
    }

    public ApplyTechintegrationSkushipRequest setRetryFlag(Boolean retryFlag) {
        this.retryFlag = retryFlag;
        return this;
    }
    public Boolean getRetryFlag() {
        return this.retryFlag;
    }

}
