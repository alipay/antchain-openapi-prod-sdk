// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCarownerCyRequest extends TeaModel {
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
    public CyUserInfo userInfo;

    // 车辆信息
    @NameInMap("car_info")
    @Validation(required = true)
    public CarInfo carInfo;

    public static RegisterCarownerCyRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCarownerCyRequest self = new RegisterCarownerCyRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCarownerCyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterCarownerCyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterCarownerCyRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public RegisterCarownerCyRequest setUserInfo(CyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public RegisterCarownerCyRequest setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public CarInfo getCarInfo() {
        return this.carInfo;
    }

}
