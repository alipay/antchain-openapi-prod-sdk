// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadUmktOfflinedecisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 离线圈客计划id
    @NameInMap("offline_decision_plan_id")
    @Validation(required = true)
    public Long offlineDecisionPlanId;

    // 文件模版信息
    @NameInMap("file_template")
    @Validation(required = true)
    public String fileTemplate;

    // 文件id，网关文件上传自动装填
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
    public String fileId;

    // 非必填, 默认OFFLINE_DECISION
    @NameInMap("relation_type")
    public String relationType;

    public static UploadUmktOfflinedecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadUmktOfflinedecisionRequest self = new UploadUmktOfflinedecisionRequest();
        return TeaModel.build(map, self);
    }

    public UploadUmktOfflinedecisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadUmktOfflinedecisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadUmktOfflinedecisionRequest setOfflineDecisionPlanId(Long offlineDecisionPlanId) {
        this.offlineDecisionPlanId = offlineDecisionPlanId;
        return this;
    }
    public Long getOfflineDecisionPlanId() {
        return this.offlineDecisionPlanId;
    }

    public UploadUmktOfflinedecisionRequest setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
        return this;
    }
    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public UploadUmktOfflinedecisionRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadUmktOfflinedecisionRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadUmktOfflinedecisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadUmktOfflinedecisionRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

}
