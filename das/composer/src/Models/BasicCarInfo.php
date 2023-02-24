<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class BasicCarInfo extends Model
{
    // 号牌号码
    /**
     * @example 京Axxxxx
     *
     * @var string
     */
    public $licenseNo;

    // 号牌种类，枚举值
    /**
     * @example 01
     *
     * @var string
     */
    public $licenseType;

    // 车架号
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $vin;

    // 发动机号
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $engineNo;
    protected $_name = [
        'licenseNo'   => 'license_no',
        'licenseType' => 'license_type',
        'vin'         => 'vin',
        'engineNo'    => 'engine_no',
    ];

    public function validate()
    {
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('licenseType', $this->licenseType, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('engineNo', $this->engineNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->licenseType) {
            $res['license_type'] = $this->licenseType;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->engineNo) {
            $res['engine_no'] = $this->engineNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BasicCarInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['license_type'])) {
            $model->licenseType = $map['license_type'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['engine_no'])) {
            $model->engineNo = $map['engine_no'];
        }

        return $model;
    }
}
