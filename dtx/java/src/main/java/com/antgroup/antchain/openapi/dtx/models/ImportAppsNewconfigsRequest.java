// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ImportAppsNewconfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 导入的内容，严格的json
    @NameInMap("context")
    public String context;

    public static ImportAppsNewconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppsNewconfigsRequest self = new ImportAppsNewconfigsRequest();
        return TeaModel.build(map, self);
    }

    public ImportAppsNewconfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAppsNewconfigsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAppsNewconfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportAppsNewconfigsRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
