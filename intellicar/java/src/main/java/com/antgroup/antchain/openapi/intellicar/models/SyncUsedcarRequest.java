// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SyncUsedcarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 线索状态列表
    @NameInMap("lead_id_list")
    @Validation(required = true)
    public java.util.List<String> leadIdList;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static SyncUsedcarRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncUsedcarRequest self = new SyncUsedcarRequest();
        return TeaModel.build(map, self);
    }

    public SyncUsedcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncUsedcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncUsedcarRequest setLeadIdList(java.util.List<String> leadIdList) {
        this.leadIdList = leadIdList;
        return this;
    }
    public java.util.List<String> getLeadIdList() {
        return this.leadIdList;
    }

    public SyncUsedcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
