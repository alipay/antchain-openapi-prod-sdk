<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class MultiCurrencyMoney extends Model {
    protected $_name = [
        'cent' => 'cent',
        'currencyValue' => 'currency_value',
    ];
    public function validate() {
        Model::validateRequired('cent', $this->cent, true);
        Model::validateRequired('currencyValue', $this->currencyValue, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->cent) {
            $res['cent'] = $this->cent;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MultiCurrencyMoney
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cent'])){
            $model->cent = $map['cent'];
        }
        if(isset($map['currency_value'])){
            $model->currencyValue = $map['currency_value'];
        }
        return $model;
    }
    // 金额，以分为单位
    /**
     * @example 
     * @var int
     */
    public $cent;

    // 支付宝体系内一般存储币种值
    /**
     * @example 156
     * @var string
     */
    public $currencyValue;

}
