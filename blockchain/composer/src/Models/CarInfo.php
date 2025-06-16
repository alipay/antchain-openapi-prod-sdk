<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CarInfo extends Model
{
    // 车辆信息
    /**
     * @example xxx
     *
     * @var string
     */
    public $licenseNo;

    // 车架号
    /**
     * @example xx
     *
     * @var string
     */
    public $vin;

    // 发动机号
    /**
     * @example xxx
     *
     * @var string
     */
    public $engineNo;

    //
    // 注册日期
    /**
     * @example xxxx
     *
     * @var string
     */
    public $registerDate;

    // 车型
    /**
     * @example xxx
     *
     * @var string
     */
    public $modelCode;
    protected $_name = [
        'licenseNo'    => 'license_no',
        'vin'          => 'vin',
        'engineNo'     => 'engine_no',
        'registerDate' => 'register_date',
        'modelCode'    => 'model_code',
    ];

    public function validate()
    {
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('engineNo', $this->engineNo, true);
        Model::validateRequired('registerDate', $this->registerDate, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->engineNo) {
            $res['engine_no'] = $this->engineNo;
        }
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['engine_no'])) {
            $model->engineNo = $map['engine_no'];
        }
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }

        return $model;
    }
}
