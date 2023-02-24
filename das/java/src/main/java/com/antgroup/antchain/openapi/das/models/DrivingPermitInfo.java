// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DrivingPermitInfo extends TeaModel {
    // 品牌名称
    @NameInMap("brandname")
    public String brandname;

    // 车身颜色
    @NameInMap("bodycolor")
    public String bodycolor;

    // 使用性质
    @NameInMap("properties")
    public String properties;

    // 车型
    @NameInMap("type")
    public String type;

    // 车辆类型
    @NameInMap("vehicletype")
    public String vehicletype;

    // 发动机号
    @NameInMap("enginenumber")
    public String enginenumber;

    // 发动机型号
    @NameInMap("enginemodel")
    public String enginemodel;

    // 初次登记日期
    @NameInMap("firsissuedate")
    public String firsissuedate;

    // 检验有效期止
    @NameInMap("validitydayend")
    public String validitydayend;

    // 车辆状态
    @NameInMap("vehiclestatus")
    public String vehiclestatus;

    // 核定载客数
    @NameInMap("passengers")
    public String passengers;

    // 强制报废期止
    @NameInMap("retirementdate")
    public String retirementdate;

    // 燃料种类
    @NameInMap("fueltype")
    public String fueltype;

    // 排量
    @NameInMap("cc")
    public String cc;

    // 出厂日期
    @NameInMap("ppsdate")
    public String ppsdate;

    // 最大功率
    @NameInMap("maxjourney")
    public String maxjourney;

    // 轴数
    @NameInMap("shaft")
    public String shaft;

    // 轴距
    @NameInMap("wheelbase")
    public String wheelbase;

    // 前轮距
    @NameInMap("fronttread")
    public String fronttread;

    // 后轮距
    @NameInMap("reartread")
    public String reartread;

    // 总重量
    @NameInMap("crossweight")
    public String crossweight;

    // 整备质量
    @NameInMap("curbweight")
    public String curbweight;

    // 核定载质量
    @NameInMap("loadweight")
    public String loadweight;

    // 车架号
    @NameInMap("vin")
    public String vin;

    // 车牌号
    @NameInMap("plate")
    public String plate;

    // 车牌种类
    @NameInMap("platetype")
    public String platetype;

    // 年检日期
    @NameInMap("jianchetime")
    public String jianchetime;

    public static DrivingPermitInfo build(java.util.Map<String, ?> map) throws Exception {
        DrivingPermitInfo self = new DrivingPermitInfo();
        return TeaModel.build(map, self);
    }

    public DrivingPermitInfo setBrandname(String brandname) {
        this.brandname = brandname;
        return this;
    }
    public String getBrandname() {
        return this.brandname;
    }

    public DrivingPermitInfo setBodycolor(String bodycolor) {
        this.bodycolor = bodycolor;
        return this;
    }
    public String getBodycolor() {
        return this.bodycolor;
    }

    public DrivingPermitInfo setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public DrivingPermitInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DrivingPermitInfo setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
        return this;
    }
    public String getVehicletype() {
        return this.vehicletype;
    }

    public DrivingPermitInfo setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber;
        return this;
    }
    public String getEnginenumber() {
        return this.enginenumber;
    }

    public DrivingPermitInfo setEnginemodel(String enginemodel) {
        this.enginemodel = enginemodel;
        return this;
    }
    public String getEnginemodel() {
        return this.enginemodel;
    }

    public DrivingPermitInfo setFirsissuedate(String firsissuedate) {
        this.firsissuedate = firsissuedate;
        return this;
    }
    public String getFirsissuedate() {
        return this.firsissuedate;
    }

    public DrivingPermitInfo setValiditydayend(String validitydayend) {
        this.validitydayend = validitydayend;
        return this;
    }
    public String getValiditydayend() {
        return this.validitydayend;
    }

    public DrivingPermitInfo setVehiclestatus(String vehiclestatus) {
        this.vehiclestatus = vehiclestatus;
        return this;
    }
    public String getVehiclestatus() {
        return this.vehiclestatus;
    }

    public DrivingPermitInfo setPassengers(String passengers) {
        this.passengers = passengers;
        return this;
    }
    public String getPassengers() {
        return this.passengers;
    }

    public DrivingPermitInfo setRetirementdate(String retirementdate) {
        this.retirementdate = retirementdate;
        return this;
    }
    public String getRetirementdate() {
        return this.retirementdate;
    }

    public DrivingPermitInfo setFueltype(String fueltype) {
        this.fueltype = fueltype;
        return this;
    }
    public String getFueltype() {
        return this.fueltype;
    }

    public DrivingPermitInfo setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public DrivingPermitInfo setPpsdate(String ppsdate) {
        this.ppsdate = ppsdate;
        return this;
    }
    public String getPpsdate() {
        return this.ppsdate;
    }

    public DrivingPermitInfo setMaxjourney(String maxjourney) {
        this.maxjourney = maxjourney;
        return this;
    }
    public String getMaxjourney() {
        return this.maxjourney;
    }

    public DrivingPermitInfo setShaft(String shaft) {
        this.shaft = shaft;
        return this;
    }
    public String getShaft() {
        return this.shaft;
    }

    public DrivingPermitInfo setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
        return this;
    }
    public String getWheelbase() {
        return this.wheelbase;
    }

    public DrivingPermitInfo setFronttread(String fronttread) {
        this.fronttread = fronttread;
        return this;
    }
    public String getFronttread() {
        return this.fronttread;
    }

    public DrivingPermitInfo setReartread(String reartread) {
        this.reartread = reartread;
        return this;
    }
    public String getReartread() {
        return this.reartread;
    }

    public DrivingPermitInfo setCrossweight(String crossweight) {
        this.crossweight = crossweight;
        return this;
    }
    public String getCrossweight() {
        return this.crossweight;
    }

    public DrivingPermitInfo setCurbweight(String curbweight) {
        this.curbweight = curbweight;
        return this;
    }
    public String getCurbweight() {
        return this.curbweight;
    }

    public DrivingPermitInfo setLoadweight(String loadweight) {
        this.loadweight = loadweight;
        return this;
    }
    public String getLoadweight() {
        return this.loadweight;
    }

    public DrivingPermitInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public DrivingPermitInfo setPlate(String plate) {
        this.plate = plate;
        return this;
    }
    public String getPlate() {
        return this.plate;
    }

    public DrivingPermitInfo setPlatetype(String platetype) {
        this.platetype = platetype;
        return this;
    }
    public String getPlatetype() {
        return this.platetype;
    }

    public DrivingPermitInfo setJianchetime(String jianchetime) {
        this.jianchetime = jianchetime;
        return this;
    }
    public String getJianchetime() {
        return this.jianchetime;
    }

}
