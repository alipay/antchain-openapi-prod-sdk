// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class LoadSofamqConnectorsourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 来源的配置信息。source kv结构配置 数组 的 JSON String
    @NameInMap("source_configs")
    @Validation(required = true)
    public String sourceConfigs;

    // 数据源类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 任务名称，仅仅在任务修改时需要传递
    @NameInMap("name")
    public String name;

    public static LoadSofamqConnectorsourceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadSofamqConnectorsourceRequest self = new LoadSofamqConnectorsourceRequest();
        return TeaModel.build(map, self);
    }

    public LoadSofamqConnectorsourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadSofamqConnectorsourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadSofamqConnectorsourceRequest setSourceConfigs(String sourceConfigs) {
        this.sourceConfigs = sourceConfigs;
        return this;
    }
    public String getSourceConfigs() {
        return this.sourceConfigs;
    }

    public LoadSofamqConnectorsourceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public LoadSofamqConnectorsourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
