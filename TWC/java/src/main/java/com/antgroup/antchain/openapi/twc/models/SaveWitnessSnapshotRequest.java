// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SaveWitnessSnapshotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 快照数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 快照步骤，最大20长度，START-开始，UPDATE-更新，FINISH-结束，允许自定义
    @NameInMap("step")
    @Validation(required = true)
    public String step;

    // 快照步骤描述，最大40长度
    @NameInMap("step_description")
    @Validation(required = true)
    public String stepDescription;

    // 见证流程id
    @NameInMap("witness_flow_id")
    @Validation(required = true)
    public String witnessFlowId;

    // 发起请求的实例应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发起请求的鉴权token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static SaveWitnessSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWitnessSnapshotRequest self = new SaveWitnessSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public SaveWitnessSnapshotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveWitnessSnapshotRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveWitnessSnapshotRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveWitnessSnapshotRequest setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public SaveWitnessSnapshotRequest setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
        return this;
    }
    public String getStepDescription() {
        return this.stepDescription;
    }

    public SaveWitnessSnapshotRequest setWitnessFlowId(String witnessFlowId) {
        this.witnessFlowId = witnessFlowId;
        return this;
    }
    public String getWitnessFlowId() {
        return this.witnessFlowId;
    }

    public SaveWitnessSnapshotRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveWitnessSnapshotRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
