<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CarBusinessPrice extends Model
{
    // 品牌id
    /**
     * @example xxx
     *
     * @var string
     */
    public $brandId;

    // 品牌名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $brandName;

    // 车系ID
    //
    /**
     * @example xxx
     *
     * @var string
     */
    public $carSeriesId;

    // 车系名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $carSeries;

    // 车型ID
    /**
     * @example xxx
     *
     * @var string
     */
    public $carId;

    // 车型名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $carName;

    // 年款
    /**
     * @example xxx
     *
     * @var string
     */
    public $carYear;

    // 城市code
    /**
     * @example xxx
     *
     * @var string
     */
    public $cityCode;

    // 城市名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $cityName;

    // 车系指导价（范围值） 单位到分
    /**
     * @example {"min":1234,"max":5678}
     *
     * @var string
     */
    public $seriesGuidePrice;

    // 车型指导价（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $officialPrice;

    // 车主成交价（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $fullPrice;

    // 车主裸车价（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $nakedPrice;

    // 购置税（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $purchaseTax;

    // 车船税（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $vehicleVesselTax;

    // 商业险（具体值）单位到分
    /**
     * @example
     *
     * @var int
     */
    public $businessInsurance;

    // json 扩展字段
    /**
     * @example xxx
     *
     * @var string
     */
    public $extraContent;
    protected $_name = [
        'brandId'           => 'brand_id',
        'brandName'         => 'brand_name',
        'carSeriesId'       => 'car_series_id',
        'carSeries'         => 'car_series',
        'carId'             => 'car_id',
        'carName'           => 'car_name',
        'carYear'           => 'car_year',
        'cityCode'          => 'city_code',
        'cityName'          => 'city_name',
        'seriesGuidePrice'  => 'series_guide_price',
        'officialPrice'     => 'official_price',
        'fullPrice'         => 'full_price',
        'nakedPrice'        => 'naked_price',
        'purchaseTax'       => 'purchase_tax',
        'vehicleVesselTax'  => 'vehicle_vessel_tax',
        'businessInsurance' => 'business_insurance',
        'extraContent'      => 'extra_content',
    ];

    public function validate()
    {
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('brandName', $this->brandName, true);
        Model::validateRequired('carSeriesId', $this->carSeriesId, true);
        Model::validateRequired('carSeries', $this->carSeries, true);
        Model::validateRequired('carId', $this->carId, true);
        Model::validateRequired('carName', $this->carName, true);
        Model::validateRequired('carYear', $this->carYear, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('cityName', $this->cityName, true);
        Model::validateRequired('seriesGuidePrice', $this->seriesGuidePrice, true);
        Model::validateRequired('officialPrice', $this->officialPrice, true);
        Model::validateRequired('fullPrice', $this->fullPrice, true);
        Model::validateRequired('nakedPrice', $this->nakedPrice, true);
        Model::validateRequired('purchaseTax', $this->purchaseTax, true);
        Model::validateRequired('vehicleVesselTax', $this->vehicleVesselTax, true);
        Model::validateRequired('businessInsurance', $this->businessInsurance, true);
        Model::validateRequired('extraContent', $this->extraContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->carSeriesId) {
            $res['car_series_id'] = $this->carSeriesId;
        }
        if (null !== $this->carSeries) {
            $res['car_series'] = $this->carSeries;
        }
        if (null !== $this->carId) {
            $res['car_id'] = $this->carId;
        }
        if (null !== $this->carName) {
            $res['car_name'] = $this->carName;
        }
        if (null !== $this->carYear) {
            $res['car_year'] = $this->carYear;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }
        if (null !== $this->seriesGuidePrice) {
            $res['series_guide_price'] = $this->seriesGuidePrice;
        }
        if (null !== $this->officialPrice) {
            $res['official_price'] = $this->officialPrice;
        }
        if (null !== $this->fullPrice) {
            $res['full_price'] = $this->fullPrice;
        }
        if (null !== $this->nakedPrice) {
            $res['naked_price'] = $this->nakedPrice;
        }
        if (null !== $this->purchaseTax) {
            $res['purchase_tax'] = $this->purchaseTax;
        }
        if (null !== $this->vehicleVesselTax) {
            $res['vehicle_vessel_tax'] = $this->vehicleVesselTax;
        }
        if (null !== $this->businessInsurance) {
            $res['business_insurance'] = $this->businessInsurance;
        }
        if (null !== $this->extraContent) {
            $res['extra_content'] = $this->extraContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarBusinessPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['car_series_id'])) {
            $model->carSeriesId = $map['car_series_id'];
        }
        if (isset($map['car_series'])) {
            $model->carSeries = $map['car_series'];
        }
        if (isset($map['car_id'])) {
            $model->carId = $map['car_id'];
        }
        if (isset($map['car_name'])) {
            $model->carName = $map['car_name'];
        }
        if (isset($map['car_year'])) {
            $model->carYear = $map['car_year'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }
        if (isset($map['series_guide_price'])) {
            $model->seriesGuidePrice = $map['series_guide_price'];
        }
        if (isset($map['official_price'])) {
            $model->officialPrice = $map['official_price'];
        }
        if (isset($map['full_price'])) {
            $model->fullPrice = $map['full_price'];
        }
        if (isset($map['naked_price'])) {
            $model->nakedPrice = $map['naked_price'];
        }
        if (isset($map['purchase_tax'])) {
            $model->purchaseTax = $map['purchase_tax'];
        }
        if (isset($map['vehicle_vessel_tax'])) {
            $model->vehicleVesselTax = $map['vehicle_vessel_tax'];
        }
        if (isset($map['business_insurance'])) {
            $model->businessInsurance = $map['business_insurance'];
        }
        if (isset($map['extra_content'])) {
            $model->extraContent = $map['extra_content'];
        }

        return $model;
    }
}
