<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CarItemsInfo extends Model
{
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

    // 品牌车型
    /**
     * @example XXX
     *
     * @var string
     */
    public $modelCode;

    // 营运性质
    /**
     * @example XXX
     *
     * @var string
     */
    public $useNatureCode;
    protected $_name = [
        'vin'           => 'vin',
        'engineNo'      => 'engine_no',
        'registerDate'  => 'register_date',
        'modelCode'     => 'model_code',
        'useNatureCode' => 'use_nature_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
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

        return $model;
    }
}
