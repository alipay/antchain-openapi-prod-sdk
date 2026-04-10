// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryBatteryReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 充电报告
    @NameInMap("battery_report")
    @Validation(required = true)
    public BatteryReport batteryReport;

    // 桩所属运营平台
    @NameInMap("operator_platform")
    @Validation(required = true)
    public String operatorPlatform;

    // 场站名称
    @NameInMap("station_name")
    @Validation(required = true)
    public String stationName;

    // 场站ID
    @NameInMap("station_id")
    @Validation(required = true)
    public String stationId;

    // 桩ID
    @NameInMap("pile_id")
    @Validation(required = true)
    public String pileId;

    // 枪序号（充电端口号）
    @NameInMap("gun_no")
    @Validation(required = true)
    public Long gunNo;

    // 充电订单号
    @NameInMap("charge_order_no")
    @Validation(required = true)
    public String chargeOrderNo;

    // 充电量，单位kWh
    @NameInMap("charge_power")
    @Validation(required = true)
    public String chargePower;

    // 服务费，单位元
    @NameInMap("service_fee")
    @Validation(required = true)
    public String serviceFee;

    // 电费，单位元
    @NameInMap("electricity_fee")
    @Validation(required = true)
    public String electricityFee;

    // 充电开始时间
    @NameInMap("charge_start_time")
    @Validation(required = true)
    public String chargeStartTime;

    // 充电结束时间
    @NameInMap("charge_end_time")
    @Validation(required = true)
    public String chargeEndTime;

    // 租户场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static QueryBatteryReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatteryReportRequest self = new QueryBatteryReportRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatteryReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBatteryReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBatteryReportRequest setBatteryReport(BatteryReport batteryReport) {
        this.batteryReport = batteryReport;
        return this;
    }
    public BatteryReport getBatteryReport() {
        return this.batteryReport;
    }

    public QueryBatteryReportRequest setOperatorPlatform(String operatorPlatform) {
        this.operatorPlatform = operatorPlatform;
        return this;
    }
    public String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    public QueryBatteryReportRequest setStationName(String stationName) {
        this.stationName = stationName;
        return this;
    }
    public String getStationName() {
        return this.stationName;
    }

    public QueryBatteryReportRequest setStationId(String stationId) {
        this.stationId = stationId;
        return this;
    }
    public String getStationId() {
        return this.stationId;
    }

    public QueryBatteryReportRequest setPileId(String pileId) {
        this.pileId = pileId;
        return this;
    }
    public String getPileId() {
        return this.pileId;
    }

    public QueryBatteryReportRequest setGunNo(Long gunNo) {
        this.gunNo = gunNo;
        return this;
    }
    public Long getGunNo() {
        return this.gunNo;
    }

    public QueryBatteryReportRequest setChargeOrderNo(String chargeOrderNo) {
        this.chargeOrderNo = chargeOrderNo;
        return this;
    }
    public String getChargeOrderNo() {
        return this.chargeOrderNo;
    }

    public QueryBatteryReportRequest setChargePower(String chargePower) {
        this.chargePower = chargePower;
        return this;
    }
    public String getChargePower() {
        return this.chargePower;
    }

    public QueryBatteryReportRequest setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
        return this;
    }
    public String getServiceFee() {
        return this.serviceFee;
    }

    public QueryBatteryReportRequest setElectricityFee(String electricityFee) {
        this.electricityFee = electricityFee;
        return this;
    }
    public String getElectricityFee() {
        return this.electricityFee;
    }

    public QueryBatteryReportRequest setChargeStartTime(String chargeStartTime) {
        this.chargeStartTime = chargeStartTime;
        return this;
    }
    public String getChargeStartTime() {
        return this.chargeStartTime;
    }

    public QueryBatteryReportRequest setChargeEndTime(String chargeEndTime) {
        this.chargeEndTime = chargeEndTime;
        return this;
    }
    public String getChargeEndTime() {
        return this.chargeEndTime;
    }

    public QueryBatteryReportRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
