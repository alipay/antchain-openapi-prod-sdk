// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CarInfoBrief extends TeaModel {
    // 生产时间
    /**
     * <strong>example:</strong>
     * <p>2015-11-16</p>
     */
    @NameInMap("production_time")
    public String productionTime;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>大众</p>
     */
    @NameInMap("brand_name")
    public String brandName;

    // 车系名称
    /**
     * <strong>example:</strong>
     * <p>高尔夫</p>
     */
    @NameInMap("series_name")
    public String seriesName;

    // 燃料种类
    /**
     * <strong>example:</strong>
     * <p>汽油</p>
     */
    @NameInMap("fuel_type")
    public String fuelType;

    // 轴数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("axes_number")
    public String axesNumber;

    // 轴距
    /**
     * <strong>example:</strong>
     * <p>2915</p>
     */
    @NameInMap("wheel_base")
    public String wheelBase;

    public static CarInfoBrief build(java.util.Map<String, ?> map) throws Exception {
        CarInfoBrief self = new CarInfoBrief();
        return TeaModel.build(map, self);
    }

    public CarInfoBrief setProductionTime(String productionTime) {
        this.productionTime = productionTime;
        return this;
    }
    public String getProductionTime() {
        return this.productionTime;
    }

    public CarInfoBrief setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public CarInfoBrief setSeriesName(String seriesName) {
        this.seriesName = seriesName;
        return this;
    }
    public String getSeriesName() {
        return this.seriesName;
    }

    public CarInfoBrief setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }
    public String getFuelType() {
        return this.fuelType;
    }

    public CarInfoBrief setAxesNumber(String axesNumber) {
        this.axesNumber = axesNumber;
        return this;
    }
    public String getAxesNumber() {
        return this.axesNumber;
    }

    public CarInfoBrief setWheelBase(String wheelBase) {
        this.wheelBase = wheelBase;
        return this;
    }
    public String getWheelBase() {
        return this.wheelBase;
    }

}
