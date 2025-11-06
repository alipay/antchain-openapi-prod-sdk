// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushAuthCarloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车信息
    @NameInMap("basic_car_info")
    @Validation(required = true)
    public BasicCarInfo basicCarInfo;

    // 用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarUserInfo userInfo;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static PushAuthCarloanRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAuthCarloanRequest self = new PushAuthCarloanRequest();
        return TeaModel.build(map, self);
    }

    public PushAuthCarloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAuthCarloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAuthCarloanRequest setBasicCarInfo(BasicCarInfo basicCarInfo) {
        this.basicCarInfo = basicCarInfo;
        return this;
    }
    public BasicCarInfo getBasicCarInfo() {
        return this.basicCarInfo;
    }

    public PushAuthCarloanRequest setUserInfo(CarUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarUserInfo getUserInfo() {
        return this.userInfo;
    }

    public PushAuthCarloanRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
