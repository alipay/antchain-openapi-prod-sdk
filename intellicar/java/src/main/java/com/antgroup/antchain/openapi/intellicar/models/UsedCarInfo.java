// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class UsedCarInfo extends TeaModel {
    // 渠道方线索业务id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("lead_id")
    @Validation(required = true)
    public String leadId;

    // 城市名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    // 省份id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("pid")
    @Validation(required = true)
    public String pid;

    // 城市id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("cid")
    @Validation(required = true)
    public String cid;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("brand_name")
    public String brandName;

    // 车系名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("series_name")
    public String seriesName;

    // 汽车之家车型id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 车型名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("spec_name")
    public String specName;

    // 首次上牌时间格式 yyyy/MM/dd
    /**
     * <strong>example:</strong>
     * <p>2020/01/01</p>
     */
    @NameInMap("first_reg_time")
    @Validation(required = true)
    public String firstRegTime;

    // 行驶公里数(km)
    /**
     * <strong>example:</strong>
     * <p>12345.67</p>
     */
    @NameInMap("mileage")
    @Validation(required = true)
    public String mileage;

    public static UsedCarInfo build(java.util.Map<String, ?> map) throws Exception {
        UsedCarInfo self = new UsedCarInfo();
        return TeaModel.build(map, self);
    }

    public UsedCarInfo setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

    public UsedCarInfo setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public UsedCarInfo setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public UsedCarInfo setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public UsedCarInfo setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public UsedCarInfo setSeriesName(String seriesName) {
        this.seriesName = seriesName;
        return this;
    }
    public String getSeriesName() {
        return this.seriesName;
    }

    public UsedCarInfo setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public UsedCarInfo setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public UsedCarInfo setFirstRegTime(String firstRegTime) {
        this.firstRegTime = firstRegTime;
        return this;
    }
    public String getFirstRegTime() {
        return this.firstRegTime;
    }

    public UsedCarInfo setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }
    public String getMileage() {
        return this.mileage;
    }

}
