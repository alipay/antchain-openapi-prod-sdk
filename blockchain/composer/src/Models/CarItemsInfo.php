<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CarItemsInfo extends Model
{
    // 品牌名称
    /**
     * @example XXX
     *
     * @var string
     */
    public $brandName;

    // 车架号
    /**
     * @example XXX
     *
     * @var string
     */
    public $vin;

    // 发动机号
    /**
     * @example XXX
     *
     * @var string
     */
    public $engineNo;

    // 注册日期
    /**
     * @example XXX
     *
     * @var string
     */
    public $registerDate;

    // 车辆型号
    /**
     * @example XXX
     *
     * @var string
     */
    public $modelCode;
    protected $_name = [
        'brandName'    => 'brand_name',
        'vin'          => 'vin',
        'engineNo'     => 'engine_no',
        'registerDate' => 'register_date',
        'modelCode'    => 'model_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
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
     * @return CarItemsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
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
