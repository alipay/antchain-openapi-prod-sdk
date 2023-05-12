// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListAppsRecoverydsnameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static ListAppsRecoverydsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRecoverydsnameRequest self = new ListAppsRecoverydsnameRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRecoverydsnameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppsRecoverydsnameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAppsRecoverydsnameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppsRecoverydsnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
