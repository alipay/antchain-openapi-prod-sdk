<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionCounteractionStatistics extends Model
{
    // 碳抵消类别
    /**
     * @example Quota
     *
     * @var string
     */
    public $assertType;

    // 碳抵消类别名称
    /**
     * @example 配额
     *
     * @var string
     */
    public $assertTypeName;

    // 抵消量
    /**
     * @example 22.22
     *
     * @var string
     */
    public $counteractionAmount;

    // 排放量单位，默认为：tCO2e
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $dataUnit;
    protected $_name = [
        'assertType'          => 'assert_type',
        'assertTypeName'      => 'assert_type_name',
        'counteractionAmount' => 'counteraction_amount',
        'dataUnit'            => 'data_unit',
    ];

    public function validate()
    {
        Model::validateRequired('assertType', $this->assertType, true);
        Model::validateRequired('assertTypeName', $this->assertTypeName, true);
        Model::validateRequired('counteractionAmount', $this->counteractionAmount, true);
        Model::validateRequired('dataUnit', $this->dataUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assertType) {
            $res['assert_type'] = $this->assertType;
        }
        if (null !== $this->assertTypeName) {
            $res['assert_type_name'] = $this->assertTypeName;
        }
        if (null !== $this->counteractionAmount) {
            $res['counteraction_amount'] = $this->counteractionAmount;
        }
        if (null !== $this->dataUnit) {
            $res['data_unit'] = $this->dataUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionCounteractionStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['assert_type'])) {
            $model->assertType = $map['assert_type'];
        }
        if (isset($map['assert_type_name'])) {
            $model->assertTypeName = $map['assert_type_name'];
        }
        if (isset($map['counteraction_amount'])) {
            $model->counteractionAmount = $map['counteraction_amount'];
        }
        if (isset($map['data_unit'])) {
            $model->dataUnit = $map['data_unit'];
        }

        return $model;
    }
}
