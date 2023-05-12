// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AllInitiatorsTablesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 数据源名
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static AllInitiatorsTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        AllInitiatorsTablesRequest self = new AllInitiatorsTablesRequest();
        return TeaModel.build(map, self);
    }

    public AllInitiatorsTablesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllInitiatorsTablesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllInitiatorsTablesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AllInitiatorsTablesRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public AllInitiatorsTablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
