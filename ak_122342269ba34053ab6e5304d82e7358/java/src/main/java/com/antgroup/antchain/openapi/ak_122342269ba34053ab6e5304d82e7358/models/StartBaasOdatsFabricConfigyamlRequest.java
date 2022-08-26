// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsFabricConfigyamlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // fabir yaml配置文件
    @NameInMap("config_yaml")
    @Validation(required = true)
    public String configYaml;

    public static StartBaasOdatsFabricConfigyamlRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsFabricConfigyamlRequest self = new StartBaasOdatsFabricConfigyamlRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsFabricConfigyamlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasOdatsFabricConfigyamlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasOdatsFabricConfigyamlRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

}
