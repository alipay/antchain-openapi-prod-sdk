// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SubmitNewcarRequest extends TeaModel {
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

    // 	
    // 预计购买时间
    @NameInMap("purcharse_time")
    public String purcharseTime;

    // xxxx
    @NameInMap("car_series_id")
    public String carSeriesId;

    // 提交线索的唯一id
    @NameInMap("submit_id")
    public String submitId;

    // 汽车之家车系id
    @NameInMap("qc_car_series_id")
    public String qcCarSeriesId;

    // 匹配源
    @NameInMap("match_source")
    public String matchSource;

    public static SubmitNewcarRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitNewcarRequest self = new SubmitNewcarRequest();
        return TeaModel.build(map, self);
    }

    public SubmitNewcarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitNewcarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitNewcarRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitNewcarRequest setUserInfo(CarUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarUserInfo getUserInfo() {
        return this.userInfo;
    }

    public SubmitNewcarRequest setCarSeries(String carSeries) {
        this.carSeries = carSeries;
        return this;
    }
    public String getCarSeries() {
        return this.carSeries;
    }

    public SubmitNewcarRequest setFinaicalPlan(String finaicalPlan) {
        this.finaicalPlan = finaicalPlan;
        return this;
    }
    public String getFinaicalPlan() {
        return this.finaicalPlan;
    }

    public SubmitNewcarRequest setPurcharseTime(String purcharseTime) {
        this.purcharseTime = purcharseTime;
        return this;
    }
    public String getPurcharseTime() {
        return this.purcharseTime;
    }

    public SubmitNewcarRequest setCarSeriesId(String carSeriesId) {
        this.carSeriesId = carSeriesId;
        return this;
    }
    public String getCarSeriesId() {
        return this.carSeriesId;
    }

    public SubmitNewcarRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public SubmitNewcarRequest setQcCarSeriesId(String qcCarSeriesId) {
        this.qcCarSeriesId = qcCarSeriesId;
        return this;
    }
    public String getQcCarSeriesId() {
        return this.qcCarSeriesId;
    }

    public SubmitNewcarRequest setMatchSource(String matchSource) {
        this.matchSource = matchSource;
        return this;
    }
    public String getMatchSource() {
        return this.matchSource;
    }

}
