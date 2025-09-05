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
    protected $_name = [
        'productionTime' => 'production_time',
        'brandName'      => 'brand_name',
        'seriesName'     => 'series_name',
        'fuelType'       => 'fuel_type',
        'axesNumber'     => 'axes_number',
        'wheelBase'      => 'wheel_base',
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

        return $model;
    }
}
