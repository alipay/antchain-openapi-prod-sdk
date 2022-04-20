// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ScaleinProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用服务实例唯一标识。
    @NameInMap("app_service_id")
    @Validation(required = true)
    public String appServiceId;

    // 执行运维操作的目标容器列表。
    @NameInMap("container_ids")
    @Validation(required = true)
    public java.util.List<String> containerIds;

    // 操作人id
    @NameInMap("submitter_id")
    public String submitterId;

    public static ScaleinProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleinProdinstanceAppserviceRequest self = new ScaleinProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public ScaleinProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleinProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleinProdinstanceAppserviceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public ScaleinProdinstanceAppserviceRequest setContainerIds(java.util.List<String> containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public java.util.List<String> getContainerIds() {
        return this.containerIds;
    }

    public ScaleinProdinstanceAppserviceRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

}
