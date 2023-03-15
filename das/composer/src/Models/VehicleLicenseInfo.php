<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class VehicleLicenseInfo extends Model
{
    // 品牌名称
    /**
     * @example 品牌
     *
     * @var string
     */
    public $brandName;

    // 车身颜色
    /**
     * @example 红
     *
     * @var string
     */
    public $bodyColor;

    // 使用性质
    /**
     * @example 运营车辆
     *
     * @var string
     */
    public $properties;

    // 车型
    /**
     * @example A1
     *
     * @var string
     */
    public $type;

    // 车辆类型
    /**
     * @example 车辆类型
     *
     * @var string
     */
    public $vehicleType;

    // 发动机号
    /**
     * @example R20859
     *
     * @var string
     */
    public $engineNumber;

    // 发动机型号
    /**
     * @example CSR
     *
     * @var string
     */
    public $engineModel;

    // 初次登记日期
    /**
     * @example 2016-10-10 00:00:00
     *
     * @var string
     */
    public $firstRegistryDate;

    // 检验失效日期
    /**
     * @example 2099-12-31 00:00:00
     *
     * @var string
     */
    public $inspectionExpireDate;

    // 车辆状态
    /**
     * @example 有效
     *
     * @var string
     */
    public $vehicleStatus;

    // 核定载客数
    /**
     * @example 5
     *
     * @var string
     */
    public $passengers;

    // 强制报废期止
    /**
     * @example 2099-12-31 00:00:00
     *
     * @var string
     */
    public $retirementDate;

    // 燃料种类
    /**
     * @example 汽油
     *
     * @var string
     */
    public $fuelType;

    // 排量
    /**
     * @example 1600
     *
     * @var string
     */
    public $displacement;

    // 出厂日期
    /**
     * @example 2016-01-01 00:00:00
     *
     * @var string
     */
    public $ppsDate;

    // 最大功率
    /**
     * @example 100
     *
     * @var string
     */
    public $maximumPower;

    // 轴数
    /**
     * @example 轴数
     *
     * @var string
     */
    public $shaft;

    // 轴距
    /**
     * @example 1000
     *
     * @var string
     */
    public $wheelBase;

    // 前轮距
    /**
     * @example 1000
     *
     * @var string
     */
    public $frontTread;

    // 后轮距
    /**
     * @example 1000
     *
     * @var string
     */
    public $rearTread;

    // 总重量
    /**
     * @example 1000
     *
     * @var string
     */
    public $crossWeight;

    // 整备质量
    /**
     * @example 1000
     *
     * @var string
     */
    public $curbWeight;

    // 核定载质量
    /**
     * @example 1000
     *
     * @var string
     */
    public $loadWeight;

    // 车架号
    /**
     * @example 12345
     *
     * @var string
     */
    public $vin;

    // 车牌号
    /**
     * @example 12345
     *
     * @var string
     */
    public $plateNumber;

    // 车牌种类
    /**
     * @example 01
     *
     * @var string
     */
    public $plateType;

    // 检车日期
    /**
     * @example 2099-12-31 00:00:00
     *
     * @var string
     */
    public $inspectionDate;
    protected $_name = [
        'brandName'            => 'brand_name',
        'bodyColor'            => 'body_color',
        'properties'           => 'properties',
        'type'                 => 'type',
        'vehicleType'          => 'vehicle_type',
        'engineNumber'         => 'engine_number',
        'engineModel'          => 'engine_model',
        'firstRegistryDate'    => 'first_registry_date',
        'inspectionExpireDate' => 'inspection_expire_date',
        'vehicleStatus'        => 'vehicle_status',
        'passengers'           => 'passengers',
        'retirementDate'       => 'retirement_date',
        'fuelType'             => 'fuel_type',
        'displacement'         => 'displacement',
        'ppsDate'              => 'pps_date',
        'maximumPower'         => 'maximum_power',
        'shaft'                => 'shaft',
        'wheelBase'            => 'wheel_base',
        'frontTread'           => 'front_tread',
        'rearTread'            => 'rear_tread',
        'crossWeight'          => 'cross_weight',
        'curbWeight'           => 'curb_weight',
        'loadWeight'           => 'load_weight',
        'vin'                  => 'vin',
        'plateNumber'          => 'plate_number',
        'plateType'            => 'plate_type',
        'inspectionDate'       => 'inspection_date',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->bodyColor) {
            $res['body_color'] = $this->bodyColor;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vehicleType) {
            $res['vehicle_type'] = $this->vehicleType;
        }
        if (null !== $this->engineNumber) {
            $res['engine_number'] = $this->engineNumber;
        }
        if (null !== $this->engineModel) {
            $res['engine_model'] = $this->engineModel;
        }
        if (null !== $this->firstRegistryDate) {
            $res['first_registry_date'] = $this->firstRegistryDate;
        }
        if (null !== $this->inspectionExpireDate) {
            $res['inspection_expire_date'] = $this->inspectionExpireDate;
        }
        if (null !== $this->vehicleStatus) {
            $res['vehicle_status'] = $this->vehicleStatus;
        }
        if (null !== $this->passengers) {
            $res['passengers'] = $this->passengers;
        }
        if (null !== $this->retirementDate) {
            $res['retirement_date'] = $this->retirementDate;
        }
        if (null !== $this->fuelType) {
            $res['fuel_type'] = $this->fuelType;
        }
        if (null !== $this->displacement) {
            $res['displacement'] = $this->displacement;
        }
        if (null !== $this->ppsDate) {
            $res['pps_date'] = $this->ppsDate;
        }
        if (null !== $this->maximumPower) {
            $res['maximum_power'] = $this->maximumPower;
        }
        if (null !== $this->shaft) {
            $res['shaft'] = $this->shaft;
        }
        if (null !== $this->wheelBase) {
            $res['wheel_base'] = $this->wheelBase;
        }
        if (null !== $this->frontTread) {
            $res['front_tread'] = $this->frontTread;
        }
        if (null !== $this->rearTread) {
            $res['rear_tread'] = $this->rearTread;
        }
        if (null !== $this->crossWeight) {
            $res['cross_weight'] = $this->crossWeight;
        }
        if (null !== $this->curbWeight) {
            $res['curb_weight'] = $this->curbWeight;
        }
        if (null !== $this->loadWeight) {
            $res['load_weight'] = $this->loadWeight;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->plateNumber) {
            $res['plate_number'] = $this->plateNumber;
        }
        if (null !== $this->plateType) {
            $res['plate_type'] = $this->plateType;
        }
        if (null !== $this->inspectionDate) {
            $res['inspection_date'] = $this->inspectionDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VehicleLicenseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['body_color'])) {
            $model->bodyColor = $map['body_color'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['vehicle_type'])) {
            $model->vehicleType = $map['vehicle_type'];
        }
        if (isset($map['engine_number'])) {
            $model->engineNumber = $map['engine_number'];
        }
        if (isset($map['engine_model'])) {
            $model->engineModel = $map['engine_model'];
        }
        if (isset($map['first_registry_date'])) {
            $model->firstRegistryDate = $map['first_registry_date'];
        }
        if (isset($map['inspection_expire_date'])) {
            $model->inspectionExpireDate = $map['inspection_expire_date'];
        }
        if (isset($map['vehicle_status'])) {
            $model->vehicleStatus = $map['vehicle_status'];
        }
        if (isset($map['passengers'])) {
            $model->passengers = $map['passengers'];
        }
        if (isset($map['retirement_date'])) {
            $model->retirementDate = $map['retirement_date'];
        }
        if (isset($map['fuel_type'])) {
            $model->fuelType = $map['fuel_type'];
        }
        if (isset($map['displacement'])) {
            $model->displacement = $map['displacement'];
        }
        if (isset($map['pps_date'])) {
            $model->ppsDate = $map['pps_date'];
        }
        if (isset($map['maximum_power'])) {
            $model->maximumPower = $map['maximum_power'];
        }
        if (isset($map['shaft'])) {
            $model->shaft = $map['shaft'];
        }
        if (isset($map['wheel_base'])) {
            $model->wheelBase = $map['wheel_base'];
        }
        if (isset($map['front_tread'])) {
            $model->frontTread = $map['front_tread'];
        }
        if (isset($map['rear_tread'])) {
            $model->rearTread = $map['rear_tread'];
        }
        if (isset($map['cross_weight'])) {
            $model->crossWeight = $map['cross_weight'];
        }
        if (isset($map['curb_weight'])) {
            $model->curbWeight = $map['curb_weight'];
        }
        if (isset($map['load_weight'])) {
            $model->loadWeight = $map['load_weight'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['plate_number'])) {
            $model->plateNumber = $map['plate_number'];
        }
        if (isset($map['plate_type'])) {
            $model->plateType = $map['plate_type'];
        }
        if (isset($map['inspection_date'])) {
            $model->inspectionDate = $map['inspection_date'];
        }

        return $model;
    }
}
