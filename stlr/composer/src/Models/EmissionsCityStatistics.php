<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsCityStatistics extends Model
{
    // 城市编码
    /**
     * @example 637401
     *
     * @var string
     */
    public $cityNo;

    // 城市名称
    /**
     * @example 南充市
     *
     * @var string
     */
    public $cityName;

    // 累计排放量
    /**
     * @example 222.22
     *
     * @var int
     */
    public $emissionAmount;

    // 今日新增碳排放量
    /**
     * @example 22.22
     *
     * @var int
     */
    public $emissionAmountToday;

    // 总减碳量
    /**
     * @example 21.11
     *
     * @var int
     */
    public $reductionAmount;

    // 今日减碳量
    /**
     * @example 9.11
     *
     * @var int
     */
    public $reductionAmountToday;

    // 总抵消量
    /**
     * @example 9.11
     *
     * @var int
     */
    public $counteractionAmount;

    // 今日抵消量
    /**
     * @example 2.11
     *
     * @var int
     */
    public $counteractionAmountToday;

    // 排放量单位，默认为：
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $dataUnit;
    protected $_name = [
        'cityNo'                   => 'city_no',
        'cityName'                 => 'city_name',
        'emissionAmount'           => 'emission_amount',
        'emissionAmountToday'      => 'emission_amount_today',
        'reductionAmount'          => 'reduction_amount',
        'reductionAmountToday'     => 'reduction_amount_today',
        'counteractionAmount'      => 'counteraction_amount',
        'counteractionAmountToday' => 'counteraction_amount_today',
        'dataUnit'                 => 'data_unit',
    ];

    public function validate()
    {
        Model::validateRequired('cityNo', $this->cityNo, true);
        Model::validateRequired('cityName', $this->cityName, true);
        Model::validateRequired('emissionAmount', $this->emissionAmount, true);
        Model::validateRequired('emissionAmountToday', $this->emissionAmountToday, true);
        Model::validateRequired('reductionAmount', $this->reductionAmount, true);
        Model::validateRequired('reductionAmountToday', $this->reductionAmountToday, true);
        Model::validateRequired('counteractionAmount', $this->counteractionAmount, true);
        Model::validateRequired('counteractionAmountToday', $this->counteractionAmountToday, true);
        Model::validateRequired('dataUnit', $this->dataUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityNo) {
            $res['city_no'] = $this->cityNo;
        }
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }
        if (null !== $this->emissionAmount) {
            $res['emission_amount'] = $this->emissionAmount;
        }
        if (null !== $this->emissionAmountToday) {
            $res['emission_amount_today'] = $this->emissionAmountToday;
        }
        if (null !== $this->reductionAmount) {
            $res['reduction_amount'] = $this->reductionAmount;
        }
        if (null !== $this->reductionAmountToday) {
            $res['reduction_amount_today'] = $this->reductionAmountToday;
        }
        if (null !== $this->counteractionAmount) {
            $res['counteraction_amount'] = $this->counteractionAmount;
        }
        if (null !== $this->counteractionAmountToday) {
            $res['counteraction_amount_today'] = $this->counteractionAmountToday;
        }
        if (null !== $this->dataUnit) {
            $res['data_unit'] = $this->dataUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionsCityStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_no'])) {
            $model->cityNo = $map['city_no'];
        }
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }
        if (isset($map['emission_amount'])) {
            $model->emissionAmount = $map['emission_amount'];
        }
        if (isset($map['emission_amount_today'])) {
            $model->emissionAmountToday = $map['emission_amount_today'];
        }
        if (isset($map['reduction_amount'])) {
            $model->reductionAmount = $map['reduction_amount'];
        }
        if (isset($map['reduction_amount_today'])) {
            $model->reductionAmountToday = $map['reduction_amount_today'];
        }
        if (isset($map['counteraction_amount'])) {
            $model->counteractionAmount = $map['counteraction_amount'];
        }
        if (isset($map['counteraction_amount_today'])) {
            $model->counteractionAmountToday = $map['counteraction_amount_today'];
        }
        if (isset($map['data_unit'])) {
            $model->dataUnit = $map['data_unit'];
        }

        return $model;
    }
}
