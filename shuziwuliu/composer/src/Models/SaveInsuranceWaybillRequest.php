<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveInsuranceWaybillRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    //
    /**
     * @var string
     */
    public $tradeNo;

    // 运单号，客户侧系统的运单唯一识别号
    /**
     * @var string
     */
    public $waybillNo;

    // 发货单位，客户唯一识别码或脱敏标识
    /**
     * @var string
     */
    public $deliveryCompany;

    // 发货人，客户唯一识别码或脱敏标识
    /**
     * @var string
     */
    public $consignor;

    // 发货地址，地址可脱敏，不需要精确到门牌号
    /**
     * @var string
     */
    public $deliveryAddress;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货物数量，单位（件）
    /**
     * @var string
     */
    public $cargoQuantity;

    // 货物重量，单位（kg）
    /**
     * @var string
     */
    public $cargoWeight;

    // 货物体积，单位（方）
    /**
     * @var string
     */
    public $cargoDimensions;

    // 揽件网点，货物出发地的揽件网点
    /**
     * @var string
     */
    public $pickupOutlets;

    // 出发站，专线出发站点
    /**
     * @var string
     */
    public $departureStation;

    // 到达站，专线到达站点
    /**
     * @var string
     */
    public $destinationStation;

    // 派件网点，货物目的地的派件网点
    /**
     * @var string
     */
    public $dispatchOutlets;

    // 收货人，客户唯一识别码或脱敏标识
    /**
     * @var string
     */
    public $consignee;

    // 收货地址，地址可脱敏，不需要精确到门牌号
    /**
     * @var string
     */
    public $receivingAddress;

    // 干线承运商
    /**
     * @var string
     */
    public $trunkLineCarrier;

    // 干线车牌号
    /**
     * @var string
     */
    public $trunkLineCarNumber;

    // 司机姓名
    /**
     * @var string
     */
    public $driverName;

    // 司机联系方式
    /**
     * @var string
     */
    public $driverContact;

    // 运单创建时间，格式：yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $waybillCreateTime;

    // 干线运输发车时间，格式要求：yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $trunkLineDepartureTime;

    // 干线运输到达时间，格式要求：yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $trunkLineArrivalTime;

    // 运费总金额，单位（元），最多2位小数
    /**
     * @var string
     */
    public $freight;

    // 运单状态，客户系统中实际的当前运单状态
    /**
     * @var string
     */
    public $waybillStatus;

    // 提货车牌号
    /**
     * @var string
     */
    public $takeCargoCarNumber;

    // 短驳车牌号
    /**
     * @var string
     */
    public $shortBargeCarNumber;

    // 送货车牌号
    /**
     * @var string
     */
    public $deliveryCarNumber;

    // 运单操作类型，CREATE -创建，UPDATE-更新
    /**
     * @var string
     */
    public $waybillActionType;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'tradeNo'                => 'trade_no',
        'waybillNo'              => 'waybill_no',
        'deliveryCompany'        => 'delivery_company',
        'consignor'              => 'consignor',
        'deliveryAddress'        => 'delivery_address',
        'cargoName'              => 'cargo_name',
        'cargoQuantity'          => 'cargo_quantity',
        'cargoWeight'            => 'cargo_weight',
        'cargoDimensions'        => 'cargo_dimensions',
        'pickupOutlets'          => 'pickup_outlets',
        'departureStation'       => 'departure_station',
        'destinationStation'     => 'destination_station',
        'dispatchOutlets'        => 'dispatch_outlets',
        'consignee'              => 'consignee',
        'receivingAddress'       => 'receiving_address',
        'trunkLineCarrier'       => 'trunk_line_carrier',
        'trunkLineCarNumber'     => 'trunk_line_car_number',
        'driverName'             => 'driver_name',
        'driverContact'          => 'driver_contact',
        'waybillCreateTime'      => 'waybill_create_time',
        'trunkLineDepartureTime' => 'trunk_line_departure_time',
        'trunkLineArrivalTime'   => 'trunk_line_arrival_time',
        'freight'                => 'freight',
        'waybillStatus'          => 'waybill_status',
        'takeCargoCarNumber'     => 'take_cargo_car_number',
        'shortBargeCarNumber'    => 'short_barge_car_number',
        'deliveryCarNumber'      => 'delivery_car_number',
        'waybillActionType'      => 'waybill_action_type',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('waybillNo', $this->waybillNo, true);
        Model::validateRequired('consignor', $this->consignor, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoQuantity', $this->cargoQuantity, true);
        Model::validateRequired('departureStation', $this->departureStation, true);
        Model::validateRequired('destinationStation', $this->destinationStation, true);
        Model::validateRequired('waybillCreateTime', $this->waybillCreateTime, true);
        Model::validateRequired('freight', $this->freight, true);
        Model::validateRequired('waybillStatus', $this->waybillStatus, true);
        Model::validateRequired('waybillActionType', $this->waybillActionType, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('waybillNo', $this->waybillNo, 200);
        Model::validateMaxLength('deliveryCompany', $this->deliveryCompany, 200);
        Model::validateMaxLength('consignor', $this->consignor, 200);
        Model::validateMaxLength('deliveryAddress', $this->deliveryAddress, 500);
        Model::validateMaxLength('cargoName', $this->cargoName, 500);
        Model::validateMaxLength('cargoQuantity', $this->cargoQuantity, 20);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 20);
        Model::validateMaxLength('cargoDimensions', $this->cargoDimensions, 20);
        Model::validateMaxLength('pickupOutlets', $this->pickupOutlets, 200);
        Model::validateMaxLength('departureStation', $this->departureStation, 200);
        Model::validateMaxLength('destinationStation', $this->destinationStation, 200);
        Model::validateMaxLength('dispatchOutlets', $this->dispatchOutlets, 200);
        Model::validateMaxLength('consignee', $this->consignee, 200);
        Model::validateMaxLength('receivingAddress', $this->receivingAddress, 500);
        Model::validateMaxLength('trunkLineCarrier', $this->trunkLineCarrier, 200);
        Model::validateMaxLength('trunkLineCarNumber', $this->trunkLineCarNumber, 20);
        Model::validateMaxLength('driverName', $this->driverName, 200);
        Model::validateMaxLength('driverContact', $this->driverContact, 20);
        Model::validateMaxLength('waybillStatus', $this->waybillStatus, 200);
        Model::validateMaxLength('takeCargoCarNumber', $this->takeCargoCarNumber, 20);
        Model::validateMaxLength('shortBargeCarNumber', $this->shortBargeCarNumber, 20);
        Model::validateMaxLength('deliveryCarNumber', $this->deliveryCarNumber, 20);
        Model::validateMaxLength('waybillActionType', $this->waybillActionType, 20);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->waybillNo) {
            $res['waybill_no'] = $this->waybillNo;
        }
        if (null !== $this->deliveryCompany) {
            $res['delivery_company'] = $this->deliveryCompany;
        }
        if (null !== $this->consignor) {
            $res['consignor'] = $this->consignor;
        }
        if (null !== $this->deliveryAddress) {
            $res['delivery_address'] = $this->deliveryAddress;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->cargoDimensions) {
            $res['cargo_dimensions'] = $this->cargoDimensions;
        }
        if (null !== $this->pickupOutlets) {
            $res['pickup_outlets'] = $this->pickupOutlets;
        }
        if (null !== $this->departureStation) {
            $res['departure_station'] = $this->departureStation;
        }
        if (null !== $this->destinationStation) {
            $res['destination_station'] = $this->destinationStation;
        }
        if (null !== $this->dispatchOutlets) {
            $res['dispatch_outlets'] = $this->dispatchOutlets;
        }
        if (null !== $this->consignee) {
            $res['consignee'] = $this->consignee;
        }
        if (null !== $this->receivingAddress) {
            $res['receiving_address'] = $this->receivingAddress;
        }
        if (null !== $this->trunkLineCarrier) {
            $res['trunk_line_carrier'] = $this->trunkLineCarrier;
        }
        if (null !== $this->trunkLineCarNumber) {
            $res['trunk_line_car_number'] = $this->trunkLineCarNumber;
        }
        if (null !== $this->driverName) {
            $res['driver_name'] = $this->driverName;
        }
        if (null !== $this->driverContact) {
            $res['driver_contact'] = $this->driverContact;
        }
        if (null !== $this->waybillCreateTime) {
            $res['waybill_create_time'] = $this->waybillCreateTime;
        }
        if (null !== $this->trunkLineDepartureTime) {
            $res['trunk_line_departure_time'] = $this->trunkLineDepartureTime;
        }
        if (null !== $this->trunkLineArrivalTime) {
            $res['trunk_line_arrival_time'] = $this->trunkLineArrivalTime;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
        }
        if (null !== $this->waybillStatus) {
            $res['waybill_status'] = $this->waybillStatus;
        }
        if (null !== $this->takeCargoCarNumber) {
            $res['take_cargo_car_number'] = $this->takeCargoCarNumber;
        }
        if (null !== $this->shortBargeCarNumber) {
            $res['short_barge_car_number'] = $this->shortBargeCarNumber;
        }
        if (null !== $this->deliveryCarNumber) {
            $res['delivery_car_number'] = $this->deliveryCarNumber;
        }
        if (null !== $this->waybillActionType) {
            $res['waybill_action_type'] = $this->waybillActionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveInsuranceWaybillRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['waybill_no'])) {
            $model->waybillNo = $map['waybill_no'];
        }
        if (isset($map['delivery_company'])) {
            $model->deliveryCompany = $map['delivery_company'];
        }
        if (isset($map['consignor'])) {
            $model->consignor = $map['consignor'];
        }
        if (isset($map['delivery_address'])) {
            $model->deliveryAddress = $map['delivery_address'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_quantity'])) {
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['cargo_dimensions'])) {
            $model->cargoDimensions = $map['cargo_dimensions'];
        }
        if (isset($map['pickup_outlets'])) {
            $model->pickupOutlets = $map['pickup_outlets'];
        }
        if (isset($map['departure_station'])) {
            $model->departureStation = $map['departure_station'];
        }
        if (isset($map['destination_station'])) {
            $model->destinationStation = $map['destination_station'];
        }
        if (isset($map['dispatch_outlets'])) {
            $model->dispatchOutlets = $map['dispatch_outlets'];
        }
        if (isset($map['consignee'])) {
            $model->consignee = $map['consignee'];
        }
        if (isset($map['receiving_address'])) {
            $model->receivingAddress = $map['receiving_address'];
        }
        if (isset($map['trunk_line_carrier'])) {
            $model->trunkLineCarrier = $map['trunk_line_carrier'];
        }
        if (isset($map['trunk_line_car_number'])) {
            $model->trunkLineCarNumber = $map['trunk_line_car_number'];
        }
        if (isset($map['driver_name'])) {
            $model->driverName = $map['driver_name'];
        }
        if (isset($map['driver_contact'])) {
            $model->driverContact = $map['driver_contact'];
        }
        if (isset($map['waybill_create_time'])) {
            $model->waybillCreateTime = $map['waybill_create_time'];
        }
        if (isset($map['trunk_line_departure_time'])) {
            $model->trunkLineDepartureTime = $map['trunk_line_departure_time'];
        }
        if (isset($map['trunk_line_arrival_time'])) {
            $model->trunkLineArrivalTime = $map['trunk_line_arrival_time'];
        }
        if (isset($map['freight'])) {
            $model->freight = $map['freight'];
        }
        if (isset($map['waybill_status'])) {
            $model->waybillStatus = $map['waybill_status'];
        }
        if (isset($map['take_cargo_car_number'])) {
            $model->takeCargoCarNumber = $map['take_cargo_car_number'];
        }
        if (isset($map['short_barge_car_number'])) {
            $model->shortBargeCarNumber = $map['short_barge_car_number'];
        }
        if (isset($map['delivery_car_number'])) {
            $model->deliveryCarNumber = $map['delivery_car_number'];
        }
        if (isset($map['waybill_action_type'])) {
            $model->waybillActionType = $map['waybill_action_type'];
        }

        return $model;
    }
}
