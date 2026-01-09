<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CarInfoBrief extends Model
{
    // 生产时间
    /**
     * @example 2015-11-16
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

    // 车系名称
    /**
     * @example 高尔夫
     *
     * @var string
     */
    public $seriesName;

    // 燃料种类
    /**
     * @example 汽油
     *
     * @var string
     */
    public $fuelType;

    // 轴数
    /**
     * @example 2
     *
     * @var string
     */
    public $axesNumber;

    // 轴距
    /**
     * @example 2915
     *
     * @var string
     */
    public $wheelBase;

    // 排量描述
    /**
     * @example 1.3L
     *
     * @var string
     */
    public $engineDescribe;

    // 车身颜色
    /**
     * @example 黑
     *
     * @var string
     */
    public $color;

    // 年款
    /**
     * @example 2018
     *
     * @var string
     */
    public $yearPattern;

    // 生产厂商
    /**
     * @example 上海通用汽车有限公司
     *
     * @var string
     */
    public $manufacturerName;

    // 发布年月
    /**
     * @example 201711
     *
     * @var string
     */
    public $publishDate;

    // 款型
    /**
     * @example 赛欧3 1.3L 手动挡 舒适天窗版 18款
     *
     * @var string
     */
    public $saleCode;

    // 驱动形式
    /**
     * @example 驱动形式
     *
     * @var string
     */
    public $driveForm;

    // 国产/进口/合资
    /**
     * @example 合资
     *
     * @var string
     */
    public $importFlag;

    // 后轮距
    /**
     * @example 1468
     *
     * @var string
     */
    public $tireDistanceAfter;

    // 排量
    /**
     * @example 1349
     *
     * @var string
     */
    public $displacement;

    // 排放标准
    /**
     * @example 国五
     *
     * @var string
     */
    public $emissionStandard;

    // 功率
    /**
     * @example 73
     *
     * @var string
     */
    public $power;

    // 变速箱类型
    /**
     * @example 手动档
     *
     * @var string
     */
    public $gearbox;

    // 车辆类型
    /**
     * @example 轿车
     *
     * @var string
     */
    public $vehicleType;

    // 发动机型号
    /**
     * @example LEW
     *
     * @var string
     */
    public $engineModel;

    // 轮胎数
    /**
     * @example 4
     *
     * @var string
     */
    public $tireCount;

    // 座位数
    /**
     * @example 5
     *
     * @var string
     */
    public $ratedPassengers;

    // 指导价
    /**
     * @example 5.69万
     *
     * @var string
     */
    public $guidedPrice;

    // 车长
    /**
     * @example 4300
     *
     * @var string
     */
    public $length;

    // 车宽
    /**
     * @example 1735
     *
     * @var string
     */
    public $width;

    // 车高
    /**
     * @example 1504
     *
     * @var string
     */
    public $height;

    // 整备质量
    /**
     * @example 1045
     *
     * @var string
     */
    public $curbWeight;

    // 总质量
    /**
     * @example 1460
     *
     * @var string
     */
    public $totalWeight;

    // 前轮距
    /**
     * @example 1477
     *
     * @var string
     */
    public $tireDistanceBefore;

    // 额定载重量
    /**
     * @example 5
     *
     * @var string
     */
    public $ratedPlyload;

    // 牵引总质量
    /**
     * @example 3
     *
     * @var string
     */
    public $trailerWeight;
    protected $_name = [
        'productionTime'     => 'production_time',
        'brandName'          => 'brand_name',
        'seriesName'         => 'series_name',
        'fuelType'           => 'fuel_type',
        'axesNumber'         => 'axes_number',
        'wheelBase'          => 'wheel_base',
        'engineDescribe'     => 'engine_describe',
        'color'              => 'color',
        'yearPattern'        => 'year_pattern',
        'manufacturerName'   => 'manufacturer_name',
        'publishDate'        => 'publish_date',
        'saleCode'           => 'sale_code',
        'driveForm'          => 'drive_form',
        'importFlag'         => 'import_flag',
        'tireDistanceAfter'  => 'tire_distance_after',
        'displacement'       => 'displacement',
        'emissionStandard'   => 'emission_standard',
        'power'              => 'power',
        'gearbox'            => 'gearbox',
        'vehicleType'        => 'vehicle_type',
        'engineModel'        => 'engine_model',
        'tireCount'          => 'tire_count',
        'ratedPassengers'    => 'rated_passengers',
        'guidedPrice'        => 'guided_price',
        'length'             => 'length',
        'width'              => 'width',
        'height'             => 'height',
        'curbWeight'         => 'curb_weight',
        'totalWeight'        => 'total_weight',
        'tireDistanceBefore' => 'tire_distance_before',
        'ratedPlyload'       => 'rated_plyload',
        'trailerWeight'      => 'trailer_weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productionTime) {
            $res['production_time'] = $this->productionTime;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->seriesName) {
            $res['series_name'] = $this->seriesName;
        }
        if (null !== $this->fuelType) {
            $res['fuel_type'] = $this->fuelType;
        }
        if (null !== $this->axesNumber) {
            $res['axes_number'] = $this->axesNumber;
        }
        if (null !== $this->wheelBase) {
            $res['wheel_base'] = $this->wheelBase;
        }
        if (null !== $this->engineDescribe) {
            $res['engine_describe'] = $this->engineDescribe;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->yearPattern) {
            $res['year_pattern'] = $this->yearPattern;
        }
        if (null !== $this->manufacturerName) {
            $res['manufacturer_name'] = $this->manufacturerName;
        }
        if (null !== $this->publishDate) {
            $res['publish_date'] = $this->publishDate;
        }
        if (null !== $this->saleCode) {
            $res['sale_code'] = $this->saleCode;
        }
        if (null !== $this->driveForm) {
            $res['drive_form'] = $this->driveForm;
        }
        if (null !== $this->importFlag) {
            $res['import_flag'] = $this->importFlag;
        }
        if (null !== $this->tireDistanceAfter) {
            $res['tire_distance_after'] = $this->tireDistanceAfter;
        }
        if (null !== $this->displacement) {
            $res['displacement'] = $this->displacement;
        }
        if (null !== $this->emissionStandard) {
            $res['emission_standard'] = $this->emissionStandard;
        }
        if (null !== $this->power) {
            $res['power'] = $this->power;
        }
        if (null !== $this->gearbox) {
            $res['gearbox'] = $this->gearbox;
        }
        if (null !== $this->vehicleType) {
            $res['vehicle_type'] = $this->vehicleType;
        }
        if (null !== $this->engineModel) {
            $res['engine_model'] = $this->engineModel;
        }
        if (null !== $this->tireCount) {
            $res['tire_count'] = $this->tireCount;
        }
        if (null !== $this->ratedPassengers) {
            $res['rated_passengers'] = $this->ratedPassengers;
        }
        if (null !== $this->guidedPrice) {
            $res['guided_price'] = $this->guidedPrice;
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
        if (null !== $this->curbWeight) {
            $res['curb_weight'] = $this->curbWeight;
        }
        if (null !== $this->totalWeight) {
            $res['total_weight'] = $this->totalWeight;
        }
        if (null !== $this->tireDistanceBefore) {
            $res['tire_distance_before'] = $this->tireDistanceBefore;
        }
        if (null !== $this->ratedPlyload) {
            $res['rated_plyload'] = $this->ratedPlyload;
        }
        if (null !== $this->trailerWeight) {
            $res['trailer_weight'] = $this->trailerWeight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfoBrief
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['production_time'])) {
            $model->productionTime = $map['production_time'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['series_name'])) {
            $model->seriesName = $map['series_name'];
        }
        if (isset($map['fuel_type'])) {
            $model->fuelType = $map['fuel_type'];
        }
        if (isset($map['axes_number'])) {
            $model->axesNumber = $map['axes_number'];
        }
        if (isset($map['wheel_base'])) {
            $model->wheelBase = $map['wheel_base'];
        }
        if (isset($map['engine_describe'])) {
            $model->engineDescribe = $map['engine_describe'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['year_pattern'])) {
            $model->yearPattern = $map['year_pattern'];
        }
        if (isset($map['manufacturer_name'])) {
            $model->manufacturerName = $map['manufacturer_name'];
        }
        if (isset($map['publish_date'])) {
            $model->publishDate = $map['publish_date'];
        }
        if (isset($map['sale_code'])) {
            $model->saleCode = $map['sale_code'];
        }
        if (isset($map['drive_form'])) {
            $model->driveForm = $map['drive_form'];
        }
        if (isset($map['import_flag'])) {
            $model->importFlag = $map['import_flag'];
        }
        if (isset($map['tire_distance_after'])) {
            $model->tireDistanceAfter = $map['tire_distance_after'];
        }
        if (isset($map['displacement'])) {
            $model->displacement = $map['displacement'];
        }
        if (isset($map['emission_standard'])) {
            $model->emissionStandard = $map['emission_standard'];
        }
        if (isset($map['power'])) {
            $model->power = $map['power'];
        }
        if (isset($map['gearbox'])) {
            $model->gearbox = $map['gearbox'];
        }
        if (isset($map['vehicle_type'])) {
            $model->vehicleType = $map['vehicle_type'];
        }
        if (isset($map['engine_model'])) {
            $model->engineModel = $map['engine_model'];
        }
        if (isset($map['tire_count'])) {
            $model->tireCount = $map['tire_count'];
        }
        if (isset($map['rated_passengers'])) {
            $model->ratedPassengers = $map['rated_passengers'];
        }
        if (isset($map['guided_price'])) {
            $model->guidedPrice = $map['guided_price'];
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
        if (isset($map['curb_weight'])) {
            $model->curbWeight = $map['curb_weight'];
        }
        if (isset($map['total_weight'])) {
            $model->totalWeight = $map['total_weight'];
        }
        if (isset($map['tire_distance_before'])) {
            $model->tireDistanceBefore = $map['tire_distance_before'];
        }
        if (isset($map['rated_plyload'])) {
            $model->ratedPlyload = $map['rated_plyload'];
        }
        if (isset($map['trailer_weight'])) {
            $model->trailerWeight = $map['trailer_weight'];
        }

        return $model;
    }
}
