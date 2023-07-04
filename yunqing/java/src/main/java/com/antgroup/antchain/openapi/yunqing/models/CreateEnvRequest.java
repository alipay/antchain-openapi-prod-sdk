// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateEnvRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境初始化参数配置
    @NameInMap("env_config_info")
    @Validation(required = true)
    public String envConfigInfo;

    public static CreateEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvRequest self = new CreateEnvRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEnvRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEnvRequest setEnvConfigInfo(String envConfigInfo) {
        this.envConfigInfo = envConfigInfo;
        return this;
    }
    public String getEnvConfigInfo() {
        return this.envConfigInfo;
    }

}
