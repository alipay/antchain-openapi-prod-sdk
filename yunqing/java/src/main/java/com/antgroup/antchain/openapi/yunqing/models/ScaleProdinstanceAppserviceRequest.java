// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ScaleProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用服务实例唯一标识。
    @NameInMap("app_service_id")
    @Validation(required = true)
    public String appServiceId;

    // 集群容器目标数量。如果target_num>当前集群num，则扩容target_num-num个容器；如果target_num<当前集群num，则随机缩容target_num-num个容器。
    @NameInMap("target_num")
    @Validation(required = true)
    public Long targetNum;

    public static ScaleProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleProdinstanceAppserviceRequest self = new ScaleProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public ScaleProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleProdinstanceAppserviceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public ScaleProdinstanceAppserviceRequest setTargetNum(Long targetNum) {
        this.targetNum = targetNum;
        return this;
    }
    public Long getTargetNum() {
        return this.targetNum;
    }

}
