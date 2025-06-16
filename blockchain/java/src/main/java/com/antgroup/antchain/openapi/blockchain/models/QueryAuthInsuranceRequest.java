// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 手机号
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    // 车辆信息
    @NameInMap("car_info")
    @Validation(required = true)
    public BasicCarInfo carInfo;

    public static QueryAuthInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthInsuranceRequest self = new QueryAuthInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthInsuranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAuthInsuranceRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public QueryAuthInsuranceRequest setCarInfo(BasicCarInfo carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public BasicCarInfo getCarInfo() {
        return this.carInfo;
    }

}
