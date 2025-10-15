// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateAuthNewcarRequest extends TeaModel {
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
    public NewCarInfo newCarInfo;

    public static BatchcreateAuthNewcarRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAuthNewcarRequest self = new BatchcreateAuthNewcarRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAuthNewcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAuthNewcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAuthNewcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public BatchcreateAuthNewcarRequest setNewCarInfo(NewCarInfo newCarInfo) {
        this.newCarInfo = newCarInfo;
        return this;
    }
    public NewCarInfo getNewCarInfo() {
        return this.newCarInfo;
    }

}
