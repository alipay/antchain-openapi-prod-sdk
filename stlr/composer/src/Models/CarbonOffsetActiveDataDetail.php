<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CarbonOffsetActiveDataDetail extends Model
{
    // 活动数据编号
    /**
     * @example AD1
     *
     * @var string
     */
    public $activeDataNo;

    // 活动数据名称
    /**
     * @example 行走里程数
     *
     * @var string
     */
    public $activeDataName;

    // 活动数据单位
    /**
     * @example km
     *
     * @var string
     */
    public $activeDataUnit;

    // 活动数据描述文案
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 活动数据值
    /**
     * @example 22.22
     *
     * @var string
     */
    public $activeDataValue;
    protected $_name = [
        'activeDataNo'    => 'active_data_no',
        'activeDataName'  => 'active_data_name',
        'activeDataUnit'  => 'active_data_unit',
        'description'     => 'description',
        'activeDataValue' => 'active_data_value',
    ];

    public function validate()
    {
        Model::validateRequired('activeDataNo', $this->activeDataNo, true);
        Model::validateRequired('activeDataValue', $this->activeDataValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activeDataNo) {
            $res['active_data_no'] = $this->activeDataNo;
        }
        if (null !== $this->activeDataName) {
            $res['active_data_name'] = $this->activeDataName;
        }
        if (null !== $this->activeDataUnit) {
            $res['active_data_unit'] = $this->activeDataUnit;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->activeDataValue) {
            $res['active_data_value'] = $this->activeDataValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarbonOffsetActiveDataDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['active_data_no'])) {
            $model->activeDataNo = $map['active_data_no'];
        }
        if (isset($map['active_data_name'])) {
            $model->activeDataName = $map['active_data_name'];
        }
        if (isset($map['active_data_unit'])) {
            $model->activeDataUnit = $map['active_data_unit'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['active_data_value'])) {
            $model->activeDataValue = $map['active_data_value'];
        }

        return $model;
    }
}
