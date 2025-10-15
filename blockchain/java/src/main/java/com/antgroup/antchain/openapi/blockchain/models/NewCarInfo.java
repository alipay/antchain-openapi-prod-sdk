// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NewCarInfo extends TeaModel {
    // 车系
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("car_series")
    @Validation(required = true)
    public String carSeries;

    // 金融方案
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("finaical_plan")
    public String finaicalPlan;

    // 车系id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_series_id")
    public String carSeriesId;

    // 请求提交唯一id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("submit_id")
    public String submitId;

    // 预计购买时间
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("purcharse_time")
    public String purcharseTime;

    // 用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public CarUserInfo userInfo;

    public static NewCarInfo build(java.util.Map<String, ?> map) throws Exception {
        NewCarInfo self = new NewCarInfo();
        return TeaModel.build(map, self);
    }

    public NewCarInfo setCarSeries(String carSeries) {
        this.carSeries = carSeries;
        return this;
    }
    public String getCarSeries() {
        return this.carSeries;
    }

    public NewCarInfo setFinaicalPlan(String finaicalPlan) {
        this.finaicalPlan = finaicalPlan;
        return this;
    }
    public String getFinaicalPlan() {
        return this.finaicalPlan;
    }

    public NewCarInfo setCarSeriesId(String carSeriesId) {
        this.carSeriesId = carSeriesId;
        return this;
    }
    public String getCarSeriesId() {
        return this.carSeriesId;
    }

    public NewCarInfo setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public NewCarInfo setPurcharseTime(String purcharseTime) {
        this.purcharseTime = purcharseTime;
        return this;
    }
    public String getPurcharseTime() {
        return this.purcharseTime;
    }

    public NewCarInfo setUserInfo(CarUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CarUserInfo getUserInfo() {
        return this.userInfo;
    }

}
