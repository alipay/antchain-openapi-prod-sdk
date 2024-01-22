// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceplusMpaasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // mpaas环境id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // mpaas应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 加密电话号码
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    public static QueryDeviceplusMpaasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceplusMpaasRequest self = new QueryDeviceplusMpaasRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceplusMpaasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceplusMpaasRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceplusMpaasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryDeviceplusMpaasRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryDeviceplusMpaasRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryDeviceplusMpaasRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
