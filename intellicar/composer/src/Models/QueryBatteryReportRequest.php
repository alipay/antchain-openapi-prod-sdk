<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryBatteryReportRequest extends Model
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

    // 充电报告
    /**
     * @var BatteryReport
     */
    public $batteryReport;

    // 桩所属运营平台
    /**
     * @var string
     */
    public $operatorPlatform;

    // 场站名称
    /**
     * @var string
     */
    public $stationName;

    // 场站ID
    /**
     * @var string
     */
    public $stationId;

    // 桩ID
    /**
     * @var string
     */
    public $pileId;

    // 枪序号（充电端口号）
    /**
     * @var int
     */
    public $gunNo;

    // 充电订单号
    /**
     * @var string
     */
    public $chargeOrderNo;

    // 充电量，单位kWh
    /**
     * @var string
     */
    public $chargePower;

    // 服务费，单位元
    /**
     * @var string
     */
    public $serviceFee;

    // 电费，单位元
    /**
     * @var string
     */
    public $electricityFee;

    // 充电开始时间
    /**
     * @var string
     */
    public $chargeStartTime;

    // 充电结束时间
    /**
     * @var string
     */
    public $chargeEndTime;

    // 租户场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batteryReport'     => 'battery_report',
        'operatorPlatform'  => 'operator_platform',
        'stationName'       => 'station_name',
        'stationId'         => 'station_id',
        'pileId'            => 'pile_id',
        'gunNo'             => 'gun_no',
        'chargeOrderNo'     => 'charge_order_no',
        'chargePower'       => 'charge_power',
        'serviceFee'        => 'service_fee',
        'electricityFee'    => 'electricity_fee',
        'chargeStartTime'   => 'charge_start_time',
        'chargeEndTime'     => 'charge_end_time',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('batteryReport', $this->batteryReport, true);
        Model::validateRequired('operatorPlatform', $this->operatorPlatform, true);
        Model::validateRequired('stationName', $this->stationName, true);
        Model::validateRequired('stationId', $this->stationId, true);
        Model::validateRequired('pileId', $this->pileId, true);
        Model::validateRequired('gunNo', $this->gunNo, true);
        Model::validateRequired('chargeOrderNo', $this->chargeOrderNo, true);
        Model::validateRequired('chargePower', $this->chargePower, true);
        Model::validateRequired('serviceFee', $this->serviceFee, true);
        Model::validateRequired('electricityFee', $this->electricityFee, true);
        Model::validateRequired('chargeStartTime', $this->chargeStartTime, true);
        Model::validateRequired('chargeEndTime', $this->chargeEndTime, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->batteryReport) {
            $res['battery_report'] = null !== $this->batteryReport ? $this->batteryReport->toMap() : null;
        }
        if (null !== $this->operatorPlatform) {
            $res['operator_platform'] = $this->operatorPlatform;
        }
        if (null !== $this->stationName) {
            $res['station_name'] = $this->stationName;
        }
        if (null !== $this->stationId) {
            $res['station_id'] = $this->stationId;
        }
        if (null !== $this->pileId) {
            $res['pile_id'] = $this->pileId;
        }
        if (null !== $this->gunNo) {
            $res['gun_no'] = $this->gunNo;
        }
        if (null !== $this->chargeOrderNo) {
            $res['charge_order_no'] = $this->chargeOrderNo;
        }
        if (null !== $this->chargePower) {
            $res['charge_power'] = $this->chargePower;
        }
        if (null !== $this->serviceFee) {
            $res['service_fee'] = $this->serviceFee;
        }
        if (null !== $this->electricityFee) {
            $res['electricity_fee'] = $this->electricityFee;
        }
        if (null !== $this->chargeStartTime) {
            $res['charge_start_time'] = $this->chargeStartTime;
        }
        if (null !== $this->chargeEndTime) {
            $res['charge_end_time'] = $this->chargeEndTime;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBatteryReportRequest
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
        if (isset($map['battery_report'])) {
            $model->batteryReport = BatteryReport::fromMap($map['battery_report']);
        }
        if (isset($map['operator_platform'])) {
            $model->operatorPlatform = $map['operator_platform'];
        }
        if (isset($map['station_name'])) {
            $model->stationName = $map['station_name'];
        }
        if (isset($map['station_id'])) {
            $model->stationId = $map['station_id'];
        }
        if (isset($map['pile_id'])) {
            $model->pileId = $map['pile_id'];
        }
        if (isset($map['gun_no'])) {
            $model->gunNo = $map['gun_no'];
        }
        if (isset($map['charge_order_no'])) {
            $model->chargeOrderNo = $map['charge_order_no'];
        }
        if (isset($map['charge_power'])) {
            $model->chargePower = $map['charge_power'];
        }
        if (isset($map['service_fee'])) {
            $model->serviceFee = $map['service_fee'];
        }
        if (isset($map['electricity_fee'])) {
            $model->electricityFee = $map['electricity_fee'];
        }
        if (isset($map['charge_start_time'])) {
            $model->chargeStartTime = $map['charge_start_time'];
        }
        if (isset($map['charge_end_time'])) {
            $model->chargeEndTime = $map['charge_end_time'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
