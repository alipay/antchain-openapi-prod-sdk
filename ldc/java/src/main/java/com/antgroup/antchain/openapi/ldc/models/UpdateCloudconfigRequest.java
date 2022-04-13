// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateCloudconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cloud_config json描述
    @NameInMap("cloud_config")
    @Validation(required = true)
    public String cloudConfig;

    // UPDATE或ROLLBACK
    @NameInMap("option")
    @Validation(required = true)
    public String option;

    public static UpdateCloudconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudconfigRequest self = new UpdateCloudconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCloudconfigRequest setCloudConfig(String cloudConfig) {
        this.cloudConfig = cloudConfig;
        return this;
    }
    public String getCloudConfig() {
        return this.cloudConfig;
    }

    public UpdateCloudconfigRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

}
