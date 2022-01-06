// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class EnableTransparentproxyNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 租户实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 节点 ID 数组
    @NameInMap("node_ids")
    @Validation(required = true)
    public String nodeIds;

    public static EnableTransparentproxyNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableTransparentproxyNodeRequest self = new EnableTransparentproxyNodeRequest();
        return TeaModel.build(map, self);
    }

    public EnableTransparentproxyNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableTransparentproxyNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableTransparentproxyNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnableTransparentproxyNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableTransparentproxyNodeRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

}
