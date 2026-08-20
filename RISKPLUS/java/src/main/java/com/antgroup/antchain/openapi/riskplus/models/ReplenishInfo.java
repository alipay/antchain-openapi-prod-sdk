// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ReplenishInfo extends TeaModel {
    // 客户姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("custom_name")
    public String customName;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13800000000</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 省份
    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("province")
    public String province;

    // 城市
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("city")
    public String city;

    // 地区名称
    /**
     * <strong>example:</strong>
     * <p>滨江区</p>
     */
    @NameInMap("area")
    public String area;

    public static ReplenishInfo build(java.util.Map<String, ?> map) throws Exception {
        ReplenishInfo self = new ReplenishInfo();
        return TeaModel.build(map, self);
    }

    public ReplenishInfo setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public ReplenishInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ReplenishInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ReplenishInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ReplenishInfo setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

}
