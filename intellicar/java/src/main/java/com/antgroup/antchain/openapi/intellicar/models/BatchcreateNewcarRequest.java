// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BatchcreateNewcarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // testchannleCode
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 新车线索集合
    @NameInMap("new_car_info")
    @Validation(required = true)
    public java.util.List<NewCarInfo> newCarInfo;

    public static BatchcreateNewcarRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateNewcarRequest self = new BatchcreateNewcarRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateNewcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateNewcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateNewcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public BatchcreateNewcarRequest setNewCarInfo(java.util.List<NewCarInfo> newCarInfo) {
        this.newCarInfo = newCarInfo;
        return this;
    }
    public java.util.List<NewCarInfo> getNewCarInfo() {
        return this.newCarInfo;
    }

}
