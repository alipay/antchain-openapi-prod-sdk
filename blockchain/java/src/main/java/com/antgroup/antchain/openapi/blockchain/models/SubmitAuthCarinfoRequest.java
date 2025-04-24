// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SubmitAuthCarinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarUserInfo userInfo;

    // 车辆信息
    @NameInMap("car_info")
    @Validation(required = true)
    public BasicCarInfo carInfo;

    public static SubmitAuthCarinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuthCarinfoRequest self = new SubmitAuthCarinfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuthCarinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuthCarinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuthCarinfoRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitAuthCarinfoRequest setUserInfo(CarUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarUserInfo getUserInfo() {
        return this.userInfo;
    }

    public SubmitAuthCarinfoRequest setCarInfo(BasicCarInfo carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public BasicCarInfo getCarInfo() {
        return this.carInfo;
    }

}
