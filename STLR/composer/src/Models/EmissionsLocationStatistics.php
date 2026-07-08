<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsLocationStatistics extends Model
{
    // 盘查单元编码
    /**
     * @example L0100000008902
     *
     * @var string
     */
    public $locationNo;

    // 盘查单元名称
    /**
     * @example 2022亚运会游泳馆
     *
     * @var string
     */
    public $locationName;

    // 盘查单元排放量
    /**
     * @example 2223.22
     *
     * @var string
     */
    public $emissionAmount;

    // 排放量单位，默认为：tCO2e
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $dataUnit;
    protected $_name = [
        'locationNo'     => 'location_no',
        'locationName'   => 'location_name',
        'emissionAmount' => 'emission_amount',
        'dataUnit'       => 'data_unit',
    ];

    public function validate()
    {
        Model::validateRequired('locationNo', $this->locationNo, true);
        Model::validateRequired('locationName', $this->locationName, true);
        Model::validateRequired('emissionAmount', $this->emissionAmount, true);
        Model::validateRequired('dataUnit', $this->dataUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->locationNo) {
            $res['location_no'] = $this->locationNo;
        }
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->emissionAmount) {
            $res['emission_amount'] = $this->emissionAmount;
        }
        if (null !== $this->dataUnit) {
            $res['data_unit'] = $this->dataUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionsLocationStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location_no'])) {
            $model->locationNo = $map['location_no'];
        }
        if (isset($map['location_name'])) {
            $model->locationName = $map['location_name'];
        }
        if (isset($map['emission_amount'])) {
            $model->emissionAmount = $map['emission_amount'];
        }
        if (isset($map['data_unit'])) {
            $model->dataUnit = $map['data_unit'];
        }

        return $model;
    }
}
