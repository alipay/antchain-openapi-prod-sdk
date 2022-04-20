// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ScaleoutProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用服务实例唯一标识。
    @NameInMap("app_service_id")
    @Validation(required = true)
    public String appServiceId;

    // 集群容器目标数量。target_num需要大于当前集群容器数量，扩容（target_num-当前集群容器数量）个容器。
    @NameInMap("target_num")
    @Validation(required = true)
    public Long targetNum;

    // 操作人
    @NameInMap("submitter_id")
    public String submitterId;

    // 容器分组策略，默认SYSTEM_RECOMMENDATION
    @NameInMap("group_strategy")
    public String groupStrategy;

    public static ScaleoutProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleoutProdinstanceAppserviceRequest self = new ScaleoutProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public ScaleoutProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleoutProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleoutProdinstanceAppserviceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public ScaleoutProdinstanceAppserviceRequest setTargetNum(Long targetNum) {
        this.targetNum = targetNum;
        return this;
    }
    public Long getTargetNum() {
        return this.targetNum;
    }

    public ScaleoutProdinstanceAppserviceRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public ScaleoutProdinstanceAppserviceRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

}
