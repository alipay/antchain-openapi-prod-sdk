<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DetailCarInfo extends Model
{
    // 号牌号码
    /**
     * @example 京Axxxxx
     *
     * @var string
     */
    public $licenseNo;

    // 号牌种类，枚举值
    //
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

    // 初登日期
    /**
     * @example 2021-12-13
     *
     * @var string
     */
    public $registerDate;

    // 车辆型号
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $modelCode;

    // 是否营运车辆，枚举值
    /**
     * @example 100
     *
     * @var string
     */
    public $useNatureCode;

    // 能源种类，枚举值
    /**
     * @example 10
     *
     * @var string
     */
    public $fuelType;

    // 排量，数字
    /**
     * @example 10
     *
     * @var string
     */
    public $displacement;
    protected $_name = [
        'licenseNo'     => 'license_no',
        'licenseType'   => 'license_type',
        'vin'           => 'vin',
        'engineNo'      => 'engine_no',
        'registerDate'  => 'register_date',
        'modelCode'     => 'model_code',
        'useNatureCode' => 'use_nature_code',
        'fuelType'      => 'fuel_type',
        'displacement'  => 'displacement',
    ];

    public function validate()
    {
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('licenseType', $this->licenseType, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('engineNo', $this->engineNo, true);
        Model::validateRequired('registerDate', $this->registerDate, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
        Model::validateRequired('useNatureCode', $this->useNatureCode, true);
        Model::validateRequired('fuelType', $this->fuelType, true);
        Model::validateRequired('displacement', $this->displacement, true);
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
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->useNatureCode) {
            $res['use_nature_code'] = $this->useNatureCode;
        }
        if (null !== $this->fuelType) {
            $res['fuel_type'] = $this->fuelType;
        }
        if (null !== $this->displacement) {
            $res['displacement'] = $this->displacement;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailCarInfo
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
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['use_nature_code'])) {
            $model->useNatureCode = $map['use_nature_code'];
        }
        if (isset($map['fuel_type'])) {
            $model->fuelType = $map['fuel_type'];
        }
        if (isset($map['displacement'])) {
            $model->displacement = $map['displacement'];
        }

        return $model;
    }
}
