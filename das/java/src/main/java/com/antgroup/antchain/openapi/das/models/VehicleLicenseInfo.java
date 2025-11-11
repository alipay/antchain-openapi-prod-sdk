// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VehicleLicenseInfo extends TeaModel {
    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>品牌</p>
     */
    @NameInMap("brand_name")
    public String brandName;

    // 车身颜色
    /**
     * <strong>example:</strong>
     * <p>红</p>
     */
    @NameInMap("body_color")
    public String bodyColor;

    // 使用性质
    /**
     * <strong>example:</strong>
     * <p>运营车辆</p>
     */
    @NameInMap("properties")
    public String properties;

    // 车型
    /**
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("type")
    public String type;

    // 车辆类型
    /**
     * <strong>example:</strong>
     * <p>车辆类型</p>
     */
    @NameInMap("vehicle_type")
    public String vehicleType;

    // 发动机号
    /**
     * <strong>example:</strong>
     * <p>R20859</p>
     */
    @NameInMap("engine_number")
    public String engineNumber;

    // 发动机型号
    /**
     * <strong>example:</strong>
     * <p>CSR</p>
     */
    @NameInMap("engine_model")
    public String engineModel;

    // 初次登记日期
    /**
     * <strong>example:</strong>
     * <p>2016-10-10 00:00:00</p>
     */
    @NameInMap("first_registry_date")
    public String firstRegistryDate;

    // 检验失效日期
    /**
     * <strong>example:</strong>
     * <p>2099-12-31 00:00:00</p>
     */
    @NameInMap("inspection_expire_date")
    public String inspectionExpireDate;

    // 车辆状态
    /**
     * <strong>example:</strong>
     * <p>有效</p>
     */
    @NameInMap("vehicle_status")
    public String vehicleStatus;

    // 核定载客数
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("passengers")
    public String passengers;

    // 强制报废期止
    /**
     * <strong>example:</strong>
     * <p>2099-12-31 00:00:00</p>
     */
    @NameInMap("retirement_date")
    public String retirementDate;

    // 燃料种类
    /**
     * <strong>example:</strong>
     * <p>汽油</p>
     */
    @NameInMap("fuel_type")
    public String fuelType;

    // 排量
    /**
     * <strong>example:</strong>
     * <p>1600</p>
     */
    @NameInMap("displacement")
    public String displacement;

    // 出厂日期
    /**
     * <strong>example:</strong>
     * <p>2016-01-01 00:00:00</p>
     */
    @NameInMap("pps_date")
    public String ppsDate;

    // 最大功率
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maximum_power")
    public String maximumPower;

    // 轴数
    /**
     * <strong>example:</strong>
     * <p>轴数</p>
     */
    @NameInMap("shaft")
    public String shaft;

    // 轴距
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("wheel_base")
    public String wheelBase;

    // 前轮距
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("front_tread")
    public String frontTread;

    // 后轮距
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("rear_tread")
    public String rearTread;

    // 总重量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("cross_weight")
    public String crossWeight;

    // 整备质量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("curb_weight")
    public String curbWeight;

    // 核定载质量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("load_weight")
    public String loadWeight;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("vin")
    public String vin;

    // 车牌号
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("plate_number")
    public String plateNumber;

    // 车牌种类
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("plate_type")
    public String plateType;

    // 检车日期
    /**
     * <strong>example:</strong>
     * <p>2099-12-31 00:00:00</p>
     */
    @NameInMap("inspection_date")
    public String inspectionDate;

    public static VehicleLicenseInfo build(java.util.Map<String, ?> map) throws Exception {
        VehicleLicenseInfo self = new VehicleLicenseInfo();
        return TeaModel.build(map, self);
    }

    public VehicleLicenseInfo setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public VehicleLicenseInfo setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
        return this;
    }
    public String getBodyColor() {
        return this.bodyColor;
    }

    public VehicleLicenseInfo setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public VehicleLicenseInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public VehicleLicenseInfo setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleLicenseInfo setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }
    public String getEngineNumber() {
        return this.engineNumber;
    }

    public VehicleLicenseInfo setEngineModel(String engineModel) {
        this.engineModel = engineModel;
        return this;
    }
    public String getEngineModel() {
        return this.engineModel;
    }

    public VehicleLicenseInfo setFirstRegistryDate(String firstRegistryDate) {
        this.firstRegistryDate = firstRegistryDate;
        return this;
    }
    public String getFirstRegistryDate() {
        return this.firstRegistryDate;
    }

    public VehicleLicenseInfo setInspectionExpireDate(String inspectionExpireDate) {
        this.inspectionExpireDate = inspectionExpireDate;
        return this;
    }
    public String getInspectionExpireDate() {
        return this.inspectionExpireDate;
    }

    public VehicleLicenseInfo setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
        return this;
    }
    public String getVehicleStatus() {
        return this.vehicleStatus;
    }

    public VehicleLicenseInfo setPassengers(String passengers) {
        this.passengers = passengers;
        return this;
    }
    public String getPassengers() {
        return this.passengers;
    }

    public VehicleLicenseInfo setRetirementDate(String retirementDate) {
        this.retirementDate = retirementDate;
        return this;
    }
    public String getRetirementDate() {
        return this.retirementDate;
    }

    public VehicleLicenseInfo setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }
    public String getFuelType() {
        return this.fuelType;
    }

    public VehicleLicenseInfo setDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }
    public String getDisplacement() {
        return this.displacement;
    }

    public VehicleLicenseInfo setPpsDate(String ppsDate) {
        this.ppsDate = ppsDate;
        return this;
    }
    public String getPpsDate() {
        return this.ppsDate;
    }

    public VehicleLicenseInfo setMaximumPower(String maximumPower) {
        this.maximumPower = maximumPower;
        return this;
    }
    public String getMaximumPower() {
        return this.maximumPower;
    }

    public VehicleLicenseInfo setShaft(String shaft) {
        this.shaft = shaft;
        return this;
    }
    public String getShaft() {
        return this.shaft;
    }

    public VehicleLicenseInfo setWheelBase(String wheelBase) {
        this.wheelBase = wheelBase;
        return this;
    }
    public String getWheelBase() {
        return this.wheelBase;
    }

    public VehicleLicenseInfo setFrontTread(String frontTread) {
        this.frontTread = frontTread;
        return this;
    }
    public String getFrontTread() {
        return this.frontTread;
    }

    public VehicleLicenseInfo setRearTread(String rearTread) {
        this.rearTread = rearTread;
        return this;
    }
    public String getRearTread() {
        return this.rearTread;
    }

    public VehicleLicenseInfo setCrossWeight(String crossWeight) {
        this.crossWeight = crossWeight;
        return this;
    }
    public String getCrossWeight() {
        return this.crossWeight;
    }

    public VehicleLicenseInfo setCurbWeight(String curbWeight) {
        this.curbWeight = curbWeight;
        return this;
    }
    public String getCurbWeight() {
        return this.curbWeight;
    }

    public VehicleLicenseInfo setLoadWeight(String loadWeight) {
        this.loadWeight = loadWeight;
        return this;
    }
    public String getLoadWeight() {
        return this.loadWeight;
    }

    public VehicleLicenseInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public VehicleLicenseInfo setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }
    public String getPlateNumber() {
        return this.plateNumber;
    }

    public VehicleLicenseInfo setPlateType(String plateType) {
        this.plateType = plateType;
        return this;
    }
    public String getPlateType() {
        return this.plateType;
    }

    public VehicleLicenseInfo setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
        return this;
    }
    public String getInspectionDate() {
        return this.inspectionDate;
    }

}
