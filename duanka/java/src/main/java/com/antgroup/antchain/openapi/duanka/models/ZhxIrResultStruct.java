// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ZhxIrResultStruct extends TeaModel {
    // 日合计交易金额指数
    /**
     * <strong>example:</strong>
     * <p>13.34374889</p>
     */
    @NameInMap("amt_index_v")
    public String amtIndexV;

    // 日合计交易笔数指标
    /**
     * <strong>example:</strong>
     * <p>17.09792805</p>
     */
    @NameInMap("trans_num_index_v")
    public String transNumIndexV;

    // 日合计交易人数指数
    /**
     * <strong>example:</strong>
     * <p>user_num_index</p>
     */
    @NameInMap("user_num_index_v")
    public String userNumIndexV;

    // 时间
    /**
     * <strong>example:</strong>
     * <p>20240321</p>
     */
    @NameInMap("dt")
    public String dt;

    // 城市等级
    /**
     * <strong>example:</strong>
     * <p>4线</p>
     */
    @NameInMap("city_level")
    public String cityLevel;

    public static ZhxIrResultStruct build(java.util.Map<String, ?> map) throws Exception {
        ZhxIrResultStruct self = new ZhxIrResultStruct();
        return TeaModel.build(map, self);
    }

    public ZhxIrResultStruct setAmtIndexV(String amtIndexV) {
        this.amtIndexV = amtIndexV;
        return this;
    }
    public String getAmtIndexV() {
        return this.amtIndexV;
    }

    public ZhxIrResultStruct setTransNumIndexV(String transNumIndexV) {
        this.transNumIndexV = transNumIndexV;
        return this;
    }
    public String getTransNumIndexV() {
        return this.transNumIndexV;
    }

    public ZhxIrResultStruct setUserNumIndexV(String userNumIndexV) {
        this.userNumIndexV = userNumIndexV;
        return this;
    }
    public String getUserNumIndexV() {
        return this.userNumIndexV;
    }

    public ZhxIrResultStruct setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

    public ZhxIrResultStruct setCityLevel(String cityLevel) {
        this.cityLevel = cityLevel;
        return this;
    }
    public String getCityLevel() {
        return this.cityLevel;
    }

}
