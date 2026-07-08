<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsCategoryStatistics extends Model
{
    // 排放类型编码
    /**
     * @example 000001
     *
     * @var string
     */
    public $emissionDategoryNo;

    // 排放类型名称
    /**
     * @example 间接排放
     *
     * @var string
     */
    public $emissionCategoryName;

    // 排放量
    /**
     * @example 11.22
     *
     * @var string
     */
    public $emission;

    // 排放占比，可直接换算成百分数即为百分占比
    /**
     * @example 0.56
     *
     * @var string
     */
    public $rate;

    // 排放量单位
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $unit;
    protected $_name = [
        'emissionDategoryNo'   => 'emission_dategory_no',
        'emissionCategoryName' => 'emission_category_name',
        'emission'             => 'emission',
        'rate'                 => 'rate',
        'unit'                 => 'unit',
    ];

    public function validate()
    {
        Model::validateRequired('emissionDategoryNo', $this->emissionDategoryNo, true);
        Model::validateRequired('emissionCategoryName', $this->emissionCategoryName, true);
        Model::validateRequired('emission', $this->emission, true);
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->emissionDategoryNo) {
            $res['emission_dategory_no'] = $this->emissionDategoryNo;
        }
        if (null !== $this->emissionCategoryName) {
            $res['emission_category_name'] = $this->emissionCategoryName;
        }
        if (null !== $this->emission) {
            $res['emission'] = $this->emission;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionsCategoryStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['emission_dategory_no'])) {
            $model->emissionDategoryNo = $map['emission_dategory_no'];
        }
        if (isset($map['emission_category_name'])) {
            $model->emissionCategoryName = $map['emission_category_name'];
        }
        if (isset($map['emission'])) {
            $model->emission = $map['emission'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }

        return $model;
    }
}
