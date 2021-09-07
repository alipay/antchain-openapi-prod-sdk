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
     * @var int
     */
    public $emissions;
    protected $_name = [
        'emissionDategoryNo'   => 'emission_dategory_no',
        'emissionCategoryName' => 'emission_category_name',
        'emissions'            => 'emissions',
    ];

    public function validate()
    {
        Model::validateRequired('emissionDategoryNo', $this->emissionDategoryNo, true);
        Model::validateRequired('emissionCategoryName', $this->emissionCategoryName, true);
        Model::validateRequired('emissions', $this->emissions, true);
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
        if (null !== $this->emissions) {
            $res['emissions'] = $this->emissions;
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
        if (isset($map['emissions'])) {
            $model->emissions = $map['emissions'];
        }

        return $model;
    }
}
