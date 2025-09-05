<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CarInfoDetail extends Model
{
    // 车辆型号
    /**
     * @example FV7144LBDBG
     *
     * @var string
     */
    public $clxh;

    // 发动机号
    /**
     * @example N10514
     *
     * @var string
     */
    public $engineCode;

    // 发动机型号
    /**
     * @example CST
     *
     * @var string
     */
    public $engineModel;

    // 生产时间
    /**
     * @example 2022-08-17
     *
     * @var string
     */
    public $productionTime;

    // 品牌名称
    /**
     * @example 大众
     *
     * @var string
     */
    public $brandName;

    // 高尔夫(第七代,2014-)
    /**
     * @example series_name
     *
     * @var string
     */
    public $seriesName;

    // 年款
    /**
     * @example 2016
     *
     * @var string
     */
    public $modelYear;

    // 款型名称
    /**
     * @example 极狐αT 653S+ 160kW 22款;极狐αT 653S 160kW 22款
     *
     * @var string
     */
    public $vehicleName;

    // 指导价
    /**
     * @example 28.23万;26.23万
     *
     * @var string
     */
    public $guidePrice;

    // 车身颜色
    /**
     * @example 黑/白
     *
     * @var string
     */
    public $color;

    // 车型级别
    /**
     * @example vehicle_level
     *
     * @var string
     */
    public $vehicleLevel;

    // 车型种类
    /**
     * @example 多用途乘用车
     *
     * @var string
     */
    public $vehicleType;

    // 车身结构
    /**
     * @example 两厢车
     *
     * @var string
     */
    public $bodyStruct;

    // 燃料种类
    /**
     * @example 汽油
     *
     * @var string
     */
    public $fuelType;

    // 驱动方式
    /**
     * @example 前置前驱
     *
     * @var string
     */
    public $driveWay;

    // 底盘型号-商用车用
    /**
     * @example chassis_model
     *
     * @var string
     */
    public $chassisModel;

    // 排放标准
    /**
     * @example GB18352.5-2013
     *
     * @var string
     */
    public $emissionStandard;

    // 排量
    /**
     * @example 1.4T
     *
     * @var string
     */
    public $displacement;

    // 长
    /**
     * @example 4255
     *
     * @var string
     */
    public $length;

    // 宽
    /**
     * @example 1799
     *
     * @var string
     */
    public $width;

    // 高
    /**
     * @example 1452
     *
     * @var string
     */
    public $height;

    // 总质量
    /**
     * @example 1760
     *
     * @var string
     */
    public $totalMass;

    // 整备质量
    /**
     * @example 1280
     *
     * @var string
     */
    public $curbWeight;

    // 前轮距
    /**
     * @example 1549
     *
     * @var string
     */
    public $tireDistanceBefore;

    // 后轮距
    /**
     * @example 1640
     *
     * @var string
     */
    public $tireDistanceAfter;

    // 轴数
    /**
     * @example 2
     *
     * @var string
     */
    public $axesNumber;

    // 轴距
    /**
     * @example 2637
     *
     * @var string
     */
    public $wheelBase;

    // 座位数
    /**
     * @example 5
     *
     * @var string
     */
    public $seatingCapacity;

    // 核定载质量
    /**
     * @example approved_load
     *
     * @var string
     */
    public $approvedLoad;

    // 准牵引总质量
    /**
     * @example quasi_traction
     *
     * @var string
     */
    public $quasiTraction;

    // 轮胎规格
    /**
     * @example tire_size
     *
     * @var string
     */
    public $tireSize;

    // 轮胎数
    /**
     * @example 4
     *
     * @var string
     */
    public $tireNumber;

    // 变速箱
    /**
     * @example 7挡双离合
     *
     * @var string
     */
    public $transmission;

    // 功率
    /**
     * @example 额定功率:70/峰值功率:160
     *
     * @var string
     */
    public $power;

    // 油耗
    /**
     * @example 5.80
     *
     * @var string
     */
    public $fuelConsumption;

    // 环保标准
    /**
     * @example 国IV(国V)
     *
     * @var string
     */
    public $environmentalStandards;
    protected $_name = [
        'clxh'                   => 'clxh',
        'engineCode'             => 'engine_code',
        'engineModel'            => 'engine_model',
        'productionTime'         => 'production_time',
        'brandName'              => 'brand_name',
        'seriesName'             => 'series_name',
        'modelYear'              => 'model_year',
        'vehicleName'            => 'vehicle_name',
        'guidePrice'             => 'guide_price',
        'color'                  => 'color',
        'vehicleLevel'           => 'vehicle_level',
        'vehicleType'            => 'vehicle_type',
        'bodyStruct'             => 'body_struct',
        'fuelType'               => 'fuel_type',
        'driveWay'               => 'drive_way',
        'chassisModel'           => 'chassis_model',
        'emissionStandard'       => 'emission_standard',
        'displacement'           => 'displacement',
        'length'                 => 'length',
        'width'                  => 'width',
        'height'                 => 'height',
        'totalMass'              => 'total_mass',
        'curbWeight'             => 'curb_weight',
        'tireDistanceBefore'     => 'tire_distance_before',
        'tireDistanceAfter'      => 'tire_distance_after',
        'axesNumber'             => 'axes_number',
        'wheelBase'              => 'wheel_base',
        'seatingCapacity'        => 'seating_capacity',
        'approvedLoad'           => 'approved_load',
        'quasiTraction'          => 'quasi_traction',
        'tireSize'               => 'tire_size',
        'tireNumber'             => 'tire_number',
        'transmission'           => 'transmission',
        'power'                  => 'power',
        'fuelConsumption'        => 'fuel_consumption',
        'environmentalStandards' => 'environmental_standards',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clxh) {
            $res['clxh'] = $this->clxh;
        }
        if (null !== $this->engineCode) {
            $res['engine_code'] = $this->engineCode;
        }
        if (null !== $this->engineModel) {
            $res['engine_model'] = $this->engineModel;
        }
        if (null !== $this->productionTime) {
            $res['production_time'] = $this->productionTime;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->seriesName) {
            $res['series_name'] = $this->seriesName;
        }
        if (null !== $this->modelYear) {
            $res['model_year'] = $this->modelYear;
        }
        if (null !== $this->vehicleName) {
            $res['vehicle_name'] = $this->vehicleName;
        }
        if (null !== $this->guidePrice) {
            $res['guide_price'] = $this->guidePrice;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->vehicleLevel) {
            $res['vehicle_level'] = $this->vehicleLevel;
        }
        if (null !== $this->vehicleType) {
            $res['vehicle_type'] = $this->vehicleType;
        }
        if (null !== $this->bodyStruct) {
            $res['body_struct'] = $this->bodyStruct;
        }
        if (null !== $this->fuelType) {
            $res['fuel_type'] = $this->fuelType;
        }
        if (null !== $this->driveWay) {
            $res['drive_way'] = $this->driveWay;
        }
        if (null !== $this->chassisModel) {
            $res['chassis_model'] = $this->chassisModel;
        }
        if (null !== $this->emissionStandard) {
            $res['emission_standard'] = $this->emissionStandard;
        }
        if (null !== $this->displacement) {
            $res['displacement'] = $this->displacement;
        }
        if (null !== $this->length) {
            $res['length'] = $this->length;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->totalMass) {
            $res['total_mass'] = $this->totalMass;
        }
        if (null !== $this->curbWeight) {
            $res['curb_weight'] = $this->curbWeight;
        }
        if (null !== $this->tireDistanceBefore) {
            $res['tire_distance_before'] = $this->tireDistanceBefore;
        }
        if (null !== $this->tireDistanceAfter) {
            $res['tire_distance_after'] = $this->tireDistanceAfter;
        }
        if (null !== $this->axesNumber) {
            $res['axes_number'] = $this->axesNumber;
        }
        if (null !== $this->wheelBase) {
            $res['wheel_base'] = $this->wheelBase;
        }
        if (null !== $this->seatingCapacity) {
            $res['seating_capacity'] = $this->seatingCapacity;
        }
        if (null !== $this->approvedLoad) {
            $res['approved_load'] = $this->approvedLoad;
        }
        if (null !== $this->quasiTraction) {
            $res['quasi_traction'] = $this->quasiTraction;
        }
        if (null !== $this->tireSize) {
            $res['tire_size'] = $this->tireSize;
        }
        if (null !== $this->tireNumber) {
            $res['tire_number'] = $this->tireNumber;
        }
        if (null !== $this->transmission) {
            $res['transmission'] = $this->transmission;
        }
        if (null !== $this->power) {
            $res['power'] = $this->power;
        }
        if (null !== $this->fuelConsumption) {
            $res['fuel_consumption'] = $this->fuelConsumption;
        }
        if (null !== $this->environmentalStandards) {
            $res['environmental_standards'] = $this->environmentalStandards;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfoDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['clxh'])) {
            $model->clxh = $map['clxh'];
        }
        if (isset($map['engine_code'])) {
            $model->engineCode = $map['engine_code'];
        }
        if (isset($map['engine_model'])) {
            $model->engineModel = $map['engine_model'];
        }
        if (isset($map['production_time'])) {
            $model->productionTime = $map['production_time'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['series_name'])) {
            $model->seriesName = $map['series_name'];
        }
        if (isset($map['model_year'])) {
            $model->modelYear = $map['model_year'];
        }
        if (isset($map['vehicle_name'])) {
            $model->vehicleName = $map['vehicle_name'];
        }
        if (isset($map['guide_price'])) {
            $model->guidePrice = $map['guide_price'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['vehicle_level'])) {
            $model->vehicleLevel = $map['vehicle_level'];
        }
        if (isset($map['vehicle_type'])) {
            $model->vehicleType = $map['vehicle_type'];
        }
        if (isset($map['body_struct'])) {
            $model->bodyStruct = $map['body_struct'];
        }
        if (isset($map['fuel_type'])) {
            $model->fuelType = $map['fuel_type'];
        }
        if (isset($map['drive_way'])) {
            $model->driveWay = $map['drive_way'];
        }
        if (isset($map['chassis_model'])) {
            $model->chassisModel = $map['chassis_model'];
        }
        if (isset($map['emission_standard'])) {
            $model->emissionStandard = $map['emission_standard'];
        }
        if (isset($map['displacement'])) {
            $model->displacement = $map['displacement'];
        }
        if (isset($map['length'])) {
            $model->length = $map['length'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['total_mass'])) {
            $model->totalMass = $map['total_mass'];
        }
        if (isset($map['curb_weight'])) {
            $model->curbWeight = $map['curb_weight'];
        }
        if (isset($map['tire_distance_before'])) {
            $model->tireDistanceBefore = $map['tire_distance_before'];
        }
        if (isset($map['tire_distance_after'])) {
            $model->tireDistanceAfter = $map['tire_distance_after'];
        }
        if (isset($map['axes_number'])) {
            $model->axesNumber = $map['axes_number'];
        }
        if (isset($map['wheel_base'])) {
            $model->wheelBase = $map['wheel_base'];
        }
        if (isset($map['seating_capacity'])) {
            $model->seatingCapacity = $map['seating_capacity'];
        }
        if (isset($map['approved_load'])) {
            $model->approvedLoad = $map['approved_load'];
        }
        if (isset($map['quasi_traction'])) {
            $model->quasiTraction = $map['quasi_traction'];
        }
        if (isset($map['tire_size'])) {
            $model->tireSize = $map['tire_size'];
        }
        if (isset($map['tire_number'])) {
            $model->tireNumber = $map['tire_number'];
        }
        if (isset($map['transmission'])) {
            $model->transmission = $map['transmission'];
        }
        if (isset($map['power'])) {
            $model->power = $map['power'];
        }
        if (isset($map['fuel_consumption'])) {
            $model->fuelConsumption = $map['fuel_consumption'];
        }
        if (isset($map['environmental_standards'])) {
            $model->environmentalStandards = $map['environmental_standards'];
        }

        return $model;
    }
}
