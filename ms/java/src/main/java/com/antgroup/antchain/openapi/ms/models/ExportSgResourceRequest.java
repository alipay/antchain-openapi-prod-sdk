// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ExportSgResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // guardian 导出使用
    @NameInMap("app_name")
    public String appName;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // drm还是guardian资源
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ExportSgResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSgResourceRequest self = new ExportSgResourceRequest();
        return TeaModel.build(map, self);
    }

    public ExportSgResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportSgResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportSgResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportSgResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportSgResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
