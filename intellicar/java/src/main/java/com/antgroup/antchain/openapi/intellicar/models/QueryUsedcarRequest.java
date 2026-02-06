// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 二手车信息
    @NameInMap("used_car_info")
    @Validation(required = true)
    public UsedCarInfo usedCarInfo;

    // 用户基本信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarOwnerUserInfo userInfo;

    public static QueryUsedcarRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarRequest self = new QueryUsedcarRequest();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUsedcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUsedcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryUsedcarRequest setUsedCarInfo(UsedCarInfo usedCarInfo) {
        this.usedCarInfo = usedCarInfo;
        return this;
    }
    public UsedCarInfo getUsedCarInfo() {
        return this.usedCarInfo;
    }

    public QueryUsedcarRequest setUserInfo(CarOwnerUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarOwnerUserInfo getUserInfo() {
        return this.userInfo;
    }

}
