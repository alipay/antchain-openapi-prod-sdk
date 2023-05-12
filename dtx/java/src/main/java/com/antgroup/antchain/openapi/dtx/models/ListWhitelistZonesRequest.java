// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListWhitelistZonesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aaaaa
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // app
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // ds
    @NameInMap("ds_name")
    @Validation(required = true)
    public String dsName;

    public static ListWhitelistZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistZonesRequest self = new ListWhitelistZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListWhitelistZonesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListWhitelistZonesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListWhitelistZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWhitelistZonesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListWhitelistZonesRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

}
