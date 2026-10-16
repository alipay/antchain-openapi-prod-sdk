// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCarownerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户基本信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarOwnerUserInfo userInfo;

    // 车辆信息
    @NameInMap("car_info")
    @Validation(required = true)
    public CarInfo carInfo;

    public static RegisterCarownerRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCarownerRequest self = new RegisterCarownerRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCarownerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterCarownerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterCarownerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public RegisterCarownerRequest setUserInfo(CarOwnerUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarOwnerUserInfo getUserInfo() {
        return this.userInfo;
    }

    public RegisterCarownerRequest setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public CarInfo getCarInfo() {
        return this.carInfo;
    }

}
