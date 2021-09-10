// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveInsuranceWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。 
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
    // 
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 运单号，客户侧系统的运单唯一识别号
    @NameInMap("waybill_no")
    @Validation(required = true, maxLength = 200)
    public String waybillNo;

    // 发货单位，客户唯一识别码或脱敏标识
    @NameInMap("delivery_company")
    @Validation(maxLength = 200)
    public String deliveryCompany;

    // 发货人，客户唯一识别码或脱敏标识
    @NameInMap("consignor")
    @Validation(required = true, maxLength = 200)
    public String consignor;

    // 发货地址，地址可脱敏，不需要精确到门牌号
    @NameInMap("delivery_address")
    @Validation(maxLength = 500)
    public String deliveryAddress;

    // 货物名称
    @NameInMap("cargo_name")
    @Validation(required = true, maxLength = 500)
    public String cargoName;

    // 货物数量，单位（件）
    @NameInMap("cargo_quantity")
    @Validation(required = true, maxLength = 20)
    public String cargoQuantity;

    // 货物重量，单位（kg）
    @NameInMap("cargo_weight")
    @Validation(maxLength = 20)
    public String cargoWeight;

    // 货物体积，单位（方）
    @NameInMap("cargo_dimensions")
    @Validation(maxLength = 20)
    public String cargoDimensions;

    // 揽件网点，货物出发地的揽件网点
    @NameInMap("pickup_outlets")
    @Validation(maxLength = 200)
    public String pickupOutlets;

    // 出发站，专线出发站点
    @NameInMap("departure_station")
    @Validation(required = true, maxLength = 200)
    public String departureStation;

    // 到达站，专线到达站点
    @NameInMap("destination_station")
    @Validation(required = true, maxLength = 200)
    public String destinationStation;

    // 派件网点，货物目的地的派件网点
    @NameInMap("dispatch_outlets")
    @Validation(maxLength = 200)
    public String dispatchOutlets;

    // 收货人，客户唯一识别码或脱敏标识
    @NameInMap("consignee")
    @Validation(maxLength = 200)
    public String consignee;

    // 收货地址，地址可脱敏，不需要精确到门牌号
    @NameInMap("receiving_address")
    @Validation(maxLength = 500)
    public String receivingAddress;

    // 干线承运商
    @NameInMap("trunk_line_carrier")
    @Validation(maxLength = 200)
    public String trunkLineCarrier;

    // 干线车牌号
    @NameInMap("trunk_line_car_number")
    @Validation(maxLength = 20)
    public String trunkLineCarNumber;

    // 司机姓名
    @NameInMap("driver_name")
    @Validation(maxLength = 200)
    public String driverName;

    // 司机联系方式
    @NameInMap("driver_contact")
    @Validation(maxLength = 20)
    public String driverContact;

    // 运单创建时间，格式：yyyy-mm-dd hh:mm:ss
    @NameInMap("waybill_create_time")
    @Validation(required = true)
    public String waybillCreateTime;

    // 干线运输发车时间，格式要求：yyyy-mm-dd hh:mm:ss
    @NameInMap("trunk_line_departure_time")
    public String trunkLineDepartureTime;

    // 干线运输到达时间，格式要求：yyyy-mm-dd hh:mm:ss
    @NameInMap("trunk_line_arrival_time")
    public String trunkLineArrivalTime;

    // 运费总金额，单位（元），最多2位小数
    @NameInMap("freight")
    @Validation(required = true)
    public String freight;

    // 运单状态，客户系统中实际的当前运单状态
    @NameInMap("waybill_status")
    @Validation(required = true, maxLength = 200)
    public String waybillStatus;

    // 提货车牌号
    @NameInMap("take_cargo_car_number")
    @Validation(maxLength = 20)
    public String takeCargoCarNumber;

    // 短驳车牌号
    @NameInMap("short_barge_car_number")
    @Validation(maxLength = 20)
    public String shortBargeCarNumber;

    // 送货车牌号
    @NameInMap("delivery_car_number")
    @Validation(maxLength = 20)
    public String deliveryCarNumber;

    // 运单操作类型，CREATE -创建，UPDATE-更新
    @NameInMap("waybill_action_type")
    @Validation(required = true, maxLength = 20)
    public String waybillActionType;

    public static SaveInsuranceWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveInsuranceWaybillRequest self = new SaveInsuranceWaybillRequest();
        return TeaModel.build(map, self);
    }

    public SaveInsuranceWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveInsuranceWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveInsuranceWaybillRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public SaveInsuranceWaybillRequest setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
        return this;
    }
    public String getWaybillNo() {
        return this.waybillNo;
    }

    public SaveInsuranceWaybillRequest setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
        return this;
    }
    public String getDeliveryCompany() {
        return this.deliveryCompany;
    }

    public SaveInsuranceWaybillRequest setConsignor(String consignor) {
        this.consignor = consignor;
        return this;
    }
    public String getConsignor() {
        return this.consignor;
    }

    public SaveInsuranceWaybillRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public SaveInsuranceWaybillRequest setCargoName(String cargoName) {
        this.cargoName = cargoName;
        return this;
    }
    public String getCargoName() {
        return this.cargoName;
    }

    public SaveInsuranceWaybillRequest setCargoQuantity(String cargoQuantity) {
        this.cargoQuantity = cargoQuantity;
        return this;
    }
    public String getCargoQuantity() {
        return this.cargoQuantity;
    }

    public SaveInsuranceWaybillRequest setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }
    public String getCargoWeight() {
        return this.cargoWeight;
    }

    public SaveInsuranceWaybillRequest setCargoDimensions(String cargoDimensions) {
        this.cargoDimensions = cargoDimensions;
        return this;
    }
    public String getCargoDimensions() {
        return this.cargoDimensions;
    }

    public SaveInsuranceWaybillRequest setPickupOutlets(String pickupOutlets) {
        this.pickupOutlets = pickupOutlets;
        return this;
    }
    public String getPickupOutlets() {
        return this.pickupOutlets;
    }

    public SaveInsuranceWaybillRequest setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
        return this;
    }
    public String getDepartureStation() {
        return this.departureStation;
    }

    public SaveInsuranceWaybillRequest setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }
    public String getDestinationStation() {
        return this.destinationStation;
    }

    public SaveInsuranceWaybillRequest setDispatchOutlets(String dispatchOutlets) {
        this.dispatchOutlets = dispatchOutlets;
        return this;
    }
    public String getDispatchOutlets() {
        return this.dispatchOutlets;
    }

    public SaveInsuranceWaybillRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveInsuranceWaybillRequest setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
        return this;
    }
    public String getReceivingAddress() {
        return this.receivingAddress;
    }

    public SaveInsuranceWaybillRequest setTrunkLineCarrier(String trunkLineCarrier) {
        this.trunkLineCarrier = trunkLineCarrier;
        return this;
    }
    public String getTrunkLineCarrier() {
        return this.trunkLineCarrier;
    }

    public SaveInsuranceWaybillRequest setTrunkLineCarNumber(String trunkLineCarNumber) {
        this.trunkLineCarNumber = trunkLineCarNumber;
        return this;
    }
    public String getTrunkLineCarNumber() {
        return this.trunkLineCarNumber;
    }

    public SaveInsuranceWaybillRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public SaveInsuranceWaybillRequest setDriverContact(String driverContact) {
        this.driverContact = driverContact;
        return this;
    }
    public String getDriverContact() {
        return this.driverContact;
    }

    public SaveInsuranceWaybillRequest setWaybillCreateTime(String waybillCreateTime) {
        this.waybillCreateTime = waybillCreateTime;
        return this;
    }
    public String getWaybillCreateTime() {
        return this.waybillCreateTime;
    }

    public SaveInsuranceWaybillRequest setTrunkLineDepartureTime(String trunkLineDepartureTime) {
        this.trunkLineDepartureTime = trunkLineDepartureTime;
        return this;
    }
    public String getTrunkLineDepartureTime() {
        return this.trunkLineDepartureTime;
    }

    public SaveInsuranceWaybillRequest setTrunkLineArrivalTime(String trunkLineArrivalTime) {
        this.trunkLineArrivalTime = trunkLineArrivalTime;
        return this;
    }
    public String getTrunkLineArrivalTime() {
        return this.trunkLineArrivalTime;
    }

    public SaveInsuranceWaybillRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public SaveInsuranceWaybillRequest setWaybillStatus(String waybillStatus) {
        this.waybillStatus = waybillStatus;
        return this;
    }
    public String getWaybillStatus() {
        return this.waybillStatus;
    }

    public SaveInsuranceWaybillRequest setTakeCargoCarNumber(String takeCargoCarNumber) {
        this.takeCargoCarNumber = takeCargoCarNumber;
        return this;
    }
    public String getTakeCargoCarNumber() {
        return this.takeCargoCarNumber;
    }

    public SaveInsuranceWaybillRequest setShortBargeCarNumber(String shortBargeCarNumber) {
        this.shortBargeCarNumber = shortBargeCarNumber;
        return this;
    }
    public String getShortBargeCarNumber() {
        return this.shortBargeCarNumber;
    }

    public SaveInsuranceWaybillRequest setDeliveryCarNumber(String deliveryCarNumber) {
        this.deliveryCarNumber = deliveryCarNumber;
        return this;
    }
    public String getDeliveryCarNumber() {
        return this.deliveryCarNumber;
    }

    public SaveInsuranceWaybillRequest setWaybillActionType(String waybillActionType) {
        this.waybillActionType = waybillActionType;
        return this;
    }
    public String getWaybillActionType() {
        return this.waybillActionType;
    }

}
