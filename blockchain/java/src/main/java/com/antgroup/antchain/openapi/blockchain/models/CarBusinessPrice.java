// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CarBusinessPrice extends TeaModel {
    // 品牌id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("brand_name")
    @Validation(required = true)
    public String brandName;

    // 车系ID
    // 
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_series_id")
    @Validation(required = true)
    public String carSeriesId;

    // 车系名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_series")
    @Validation(required = true)
    public String carSeries;

    // 车型ID
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_id")
    @Validation(required = true)
    public String carId;

    // 车型名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_name")
    @Validation(required = true)
    public String carName;

    // 年款
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("car_year")
    @Validation(required = true)
    public String carYear;

    // 城市code
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 城市名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    //   车系指导价（范围值） 单位到分
    /**
     * <strong>example:</strong>
     * <p>{&quot;min&quot;:1234,&quot;max&quot;:5678}</p>
     */
    @NameInMap("series_guide_price")
    @Validation(required = true)
    public String seriesGuidePrice;

    // 车型指导价（具体值）单位到分
    @NameInMap("official_price")
    @Validation(required = true)
    public Long officialPrice;

    // 车主成交价（具体值）单位到分
    @NameInMap("full_price")
    @Validation(required = true)
    public Long fullPrice;

    // 车主裸车价（具体值）单位到分
    @NameInMap("naked_price")
    @Validation(required = true)
    public Long nakedPrice;

    // 购置税（具体值）单位到分
    @NameInMap("purchase_tax")
    @Validation(required = true)
    public Long purchaseTax;

    // 车船税（具体值）单位到分
    @NameInMap("vehicle_vessel_tax")
    @Validation(required = true)
    public Long vehicleVesselTax;

    // 商业险（具体值）单位到分
    @NameInMap("business_insurance")
    @Validation(required = true)
    public Long businessInsurance;

    // json 扩展字段
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("extra_content")
    @Validation(required = true)
    public String extraContent;

    public static CarBusinessPrice build(java.util.Map<String, ?> map) throws Exception {
        CarBusinessPrice self = new CarBusinessPrice();
        return TeaModel.build(map, self);
    }

    public CarBusinessPrice setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public CarBusinessPrice setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public CarBusinessPrice setCarSeriesId(String carSeriesId) {
        this.carSeriesId = carSeriesId;
        return this;
    }
    public String getCarSeriesId() {
        return this.carSeriesId;
    }

    public CarBusinessPrice setCarSeries(String carSeries) {
        this.carSeries = carSeries;
        return this;
    }
    public String getCarSeries() {
        return this.carSeries;
    }

    public CarBusinessPrice setCarId(String carId) {
        this.carId = carId;
        return this;
    }
    public String getCarId() {
        return this.carId;
    }

    public CarBusinessPrice setCarName(String carName) {
        this.carName = carName;
        return this;
    }
    public String getCarName() {
        return this.carName;
    }

    public CarBusinessPrice setCarYear(String carYear) {
        this.carYear = carYear;
        return this;
    }
    public String getCarYear() {
        return this.carYear;
    }

    public CarBusinessPrice setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CarBusinessPrice setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public CarBusinessPrice setSeriesGuidePrice(String seriesGuidePrice) {
        this.seriesGuidePrice = seriesGuidePrice;
        return this;
    }
    public String getSeriesGuidePrice() {
        return this.seriesGuidePrice;
    }

    public CarBusinessPrice setOfficialPrice(Long officialPrice) {
        this.officialPrice = officialPrice;
        return this;
    }
    public Long getOfficialPrice() {
        return this.officialPrice;
    }

    public CarBusinessPrice setFullPrice(Long fullPrice) {
        this.fullPrice = fullPrice;
        return this;
    }
    public Long getFullPrice() {
        return this.fullPrice;
    }

    public CarBusinessPrice setNakedPrice(Long nakedPrice) {
        this.nakedPrice = nakedPrice;
        return this;
    }
    public Long getNakedPrice() {
        return this.nakedPrice;
    }

    public CarBusinessPrice setPurchaseTax(Long purchaseTax) {
        this.purchaseTax = purchaseTax;
        return this;
    }
    public Long getPurchaseTax() {
        return this.purchaseTax;
    }

    public CarBusinessPrice setVehicleVesselTax(Long vehicleVesselTax) {
        this.vehicleVesselTax = vehicleVesselTax;
        return this;
    }
    public Long getVehicleVesselTax() {
        return this.vehicleVesselTax;
    }

    public CarBusinessPrice setBusinessInsurance(Long businessInsurance) {
        this.businessInsurance = businessInsurance;
        return this;
    }
    public Long getBusinessInsurance() {
        return this.businessInsurance;
    }

    public CarBusinessPrice setExtraContent(String extraContent) {
        this.extraContent = extraContent;
        return this;
    }
    public String getExtraContent() {
        return this.extraContent;
    }

}
