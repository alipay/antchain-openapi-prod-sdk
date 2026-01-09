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

    // 排量描述
    /**
     * <strong>example:</strong>
     * <p>1.3L</p>
     */
    @NameInMap("engine_describe")
    public String engineDescribe;

    // 车身颜色
    /**
     * <strong>example:</strong>
     * <p>黑</p>
     */
    @NameInMap("color")
    public String color;

    // 年款
    /**
     * <strong>example:</strong>
     * <p>2018</p>
     */
    @NameInMap("year_pattern")
    public String yearPattern;

    // 生产厂商
    /**
     * <strong>example:</strong>
     * <p>上海通用汽车有限公司</p>
     */
    @NameInMap("manufacturer_name")
    public String manufacturerName;

    // 发布年月
    /**
     * <strong>example:</strong>
     * <p>201711</p>
     */
    @NameInMap("publish_date")
    public String publishDate;

    // 款型
    /**
     * <strong>example:</strong>
     * <p>赛欧3 1.3L 手动挡 舒适天窗版 18款</p>
     */
    @NameInMap("sale_code")
    public String saleCode;

    // 驱动形式
    /**
     * <strong>example:</strong>
     * <p>驱动形式</p>
     */
    @NameInMap("drive_form")
    public String driveForm;

    // 国产/进口/合资
    /**
     * <strong>example:</strong>
     * <p>合资</p>
     */
    @NameInMap("import_flag")
    public String importFlag;

    // 后轮距
    /**
     * <strong>example:</strong>
     * <p>1468</p>
     */
    @NameInMap("tire_distance_after")
    public String tireDistanceAfter;

    // 排量
    /**
     * <strong>example:</strong>
     * <p>1349</p>
     */
    @NameInMap("displacement")
    public String displacement;

    // 排放标准
    /**
     * <strong>example:</strong>
     * <p>国五</p>
     */
    @NameInMap("emission_standard")
    public String emissionStandard;

    // 功率
    /**
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("power")
    public String power;

    // 变速箱类型
    /**
     * <strong>example:</strong>
     * <p>手动档</p>
     */
    @NameInMap("gearbox")
    public String gearbox;

    // 车辆类型
    /**
     * <strong>example:</strong>
     * <p>轿车</p>
     */
    @NameInMap("vehicle_type")
    public String vehicleType;

    // 发动机型号
    /**
     * <strong>example:</strong>
     * <p>LEW</p>
     */
    @NameInMap("engine_model")
    public String engineModel;

    // 轮胎数
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("tire_count")
    public String tireCount;

    // 座位数
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("rated_passengers")
    public String ratedPassengers;

    // 指导价
    /**
     * <strong>example:</strong>
     * <p>5.69万</p>
     */
    @NameInMap("guided_price")
    public String guidedPrice;

    // 车长
    /**
     * <strong>example:</strong>
     * <p>4300</p>
     */
    @NameInMap("length")
    public String length;

    // 车宽
    /**
     * <strong>example:</strong>
     * <p>1735</p>
     */
    @NameInMap("width")
    public String width;

    // 车高
    /**
     * <strong>example:</strong>
     * <p>1504</p>
     */
    @NameInMap("height")
    public String height;

    // 整备质量
    /**
     * <strong>example:</strong>
     * <p>1045</p>
     */
    @NameInMap("curb_weight")
    public String curbWeight;

    // 总质量
    /**
     * <strong>example:</strong>
     * <p>1460</p>
     */
    @NameInMap("total_weight")
    public String totalWeight;

    // 前轮距
    /**
     * <strong>example:</strong>
     * <p>1477</p>
     */
    @NameInMap("tire_distance_before")
    public String tireDistanceBefore;

    // 额定载重量
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("rated_plyload")
    public String ratedPlyload;

    // 牵引总质量
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("trailer_weight")
    public String trailerWeight;

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

    public CarInfoBrief setEngineDescribe(String engineDescribe) {
        this.engineDescribe = engineDescribe;
        return this;
    }
    public String getEngineDescribe() {
        return this.engineDescribe;
    }

    public CarInfoBrief setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CarInfoBrief setYearPattern(String yearPattern) {
        this.yearPattern = yearPattern;
        return this;
    }
    public String getYearPattern() {
        return this.yearPattern;
    }

    public CarInfoBrief setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }
    public String getManufacturerName() {
        return this.manufacturerName;
    }

    public CarInfoBrief setPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }
    public String getPublishDate() {
        return this.publishDate;
    }

    public CarInfoBrief setSaleCode(String saleCode) {
        this.saleCode = saleCode;
        return this;
    }
    public String getSaleCode() {
        return this.saleCode;
    }

    public CarInfoBrief setDriveForm(String driveForm) {
        this.driveForm = driveForm;
        return this;
    }
    public String getDriveForm() {
        return this.driveForm;
    }

    public CarInfoBrief setImportFlag(String importFlag) {
        this.importFlag = importFlag;
        return this;
    }
    public String getImportFlag() {
        return this.importFlag;
    }

    public CarInfoBrief setTireDistanceAfter(String tireDistanceAfter) {
        this.tireDistanceAfter = tireDistanceAfter;
        return this;
    }
    public String getTireDistanceAfter() {
        return this.tireDistanceAfter;
    }

    public CarInfoBrief setDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }
    public String getDisplacement() {
        return this.displacement;
    }

    public CarInfoBrief setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
        return this;
    }
    public String getEmissionStandard() {
        return this.emissionStandard;
    }

    public CarInfoBrief setPower(String power) {
        this.power = power;
        return this;
    }
    public String getPower() {
        return this.power;
    }

    public CarInfoBrief setGearbox(String gearbox) {
        this.gearbox = gearbox;
        return this;
    }
    public String getGearbox() {
        return this.gearbox;
    }

    public CarInfoBrief setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public CarInfoBrief setEngineModel(String engineModel) {
        this.engineModel = engineModel;
        return this;
    }
    public String getEngineModel() {
        return this.engineModel;
    }

    public CarInfoBrief setTireCount(String tireCount) {
        this.tireCount = tireCount;
        return this;
    }
    public String getTireCount() {
        return this.tireCount;
    }

    public CarInfoBrief setRatedPassengers(String ratedPassengers) {
        this.ratedPassengers = ratedPassengers;
        return this;
    }
    public String getRatedPassengers() {
        return this.ratedPassengers;
    }

    public CarInfoBrief setGuidedPrice(String guidedPrice) {
        this.guidedPrice = guidedPrice;
        return this;
    }
    public String getGuidedPrice() {
        return this.guidedPrice;
    }

    public CarInfoBrief setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public CarInfoBrief setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public CarInfoBrief setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public CarInfoBrief setCurbWeight(String curbWeight) {
        this.curbWeight = curbWeight;
        return this;
    }
    public String getCurbWeight() {
        return this.curbWeight;
    }

    public CarInfoBrief setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }
    public String getTotalWeight() {
        return this.totalWeight;
    }

    public CarInfoBrief setTireDistanceBefore(String tireDistanceBefore) {
        this.tireDistanceBefore = tireDistanceBefore;
        return this;
    }
    public String getTireDistanceBefore() {
        return this.tireDistanceBefore;
    }

    public CarInfoBrief setRatedPlyload(String ratedPlyload) {
        this.ratedPlyload = ratedPlyload;
        return this;
    }
    public String getRatedPlyload() {
        return this.ratedPlyload;
    }

    public CarInfoBrief setTrailerWeight(String trailerWeight) {
        this.trailerWeight = trailerWeight;
        return this;
    }
    public String getTrailerWeight() {
        return this.trailerWeight;
    }

}
