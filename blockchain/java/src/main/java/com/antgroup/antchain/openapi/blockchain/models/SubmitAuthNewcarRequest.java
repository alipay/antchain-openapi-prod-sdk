// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SubmitAuthNewcarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarUserInfo userInfo;

    // 车系
    @NameInMap("car_series")
    @Validation(required = true)
    public String carSeries;

    // 金融方案
    @NameInMap("finaical_plan")
    public String finaicalPlan;

    // 预计购买时间
    @NameInMap("purcharse_time")
    public String purcharseTime;

    public static SubmitAuthNewcarRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuthNewcarRequest self = new SubmitAuthNewcarRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuthNewcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuthNewcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuthNewcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitAuthNewcarRequest setUserInfo(CarUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarUserInfo getUserInfo() {
        return this.userInfo;
    }

    public SubmitAuthNewcarRequest setCarSeries(String carSeries) {
        this.carSeries = carSeries;
        return this;
    }
    public String getCarSeries() {
        return this.carSeries;
    }

    public SubmitAuthNewcarRequest setFinaicalPlan(String finaicalPlan) {
        this.finaicalPlan = finaicalPlan;
        return this;
    }
    public String getFinaicalPlan() {
        return this.finaicalPlan;
    }

    public SubmitAuthNewcarRequest setPurcharseTime(String purcharseTime) {
        this.purcharseTime = purcharseTime;
        return this;
    }
    public String getPurcharseTime() {
        return this.purcharseTime;
    }

}
